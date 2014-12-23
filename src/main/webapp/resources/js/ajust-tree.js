function AdjustTree(_treeId, _url, _saveURL, _submitBtnId, reloadValue, validateUrl, validateMessage) {
	var _this = this;

	var records = null;
	var readjustList = [];

	var Item = function(id, parentId, lastSiblingId, nextSiblingId) {
		this.id = id;
		this.parentId = parentId;
		this.lastSiblingId = lastSiblingId || 0;
		this.nextSiblingId = nextSiblingId || 0;
	};

	function retrieveRecord(records, id) {
		var record = null;
		for (var i = 0; i < records.length; i++) {
			if (records[i].id == id) {
				return records[i];
			} else if (records[i].children != null) {
				record = retrieveRecord(records[i].children, id);
				if (record != null)
					return record;
			}
		}
		return null;
	};

	function removeLastItem(id) {
		if (readjustList.length > 0) {
			for (var i = 0; i < readjustList.length; i++) {
				if (readjustList[i].id == id) {
					readjustList.splice(i, 1);
				}
			}
		}
	};

	function retrieveItem(id) {
		if (readjustList.length > 0) {
			for (var i = 0; i < readjustList.length; i++) {
				if (readjustList[i].id == id) {
					return readjustList[i];
				}
			}
		}
		return null;
	}

	function doDrop(target, source, point) {
		var record = retrieveRecord(records, source.id);
		removeLastItem(record.id);
		var targetId = $(target).attr("node-id");
		if (point == "append") {
			readjustList.push(new Item(record.id, parseInt(targetId)));
		} else {
			var targetRecord = retrieveRecord(records, targetId);
			var newParentId = targetRecord.parentId;
			var item = retrieveItem(targetRecord.id);
			if (item != null) {
				newParentId = item.parentId;
			}
			if (point == "top") {
				readjustList.push(new Item(record.id, newParentId, "", targetRecord.id));
			} else {
				readjustList.push(new Item(record.id, newParentId, targetRecord.id));
			}
		}

		$(".adjust").linkbutton("enable");
	}

	function initTree() {
		$(_treeId).tree({
			url : _url,
			dnd : true,
			checkbox : false,
			animate : true,
			method : "get",
			onLoadSuccess : function(node, data) {
				if (records == null) {
					records = data;
				}
			},
			onDrop : function(target, source, point) {

				if (validateUrl != null) {
					$.ajax({
						type : "POST",
						dataType : "json",
						contentType : "application/json;charset=UTF-8",
						url : validateUrl + "?id=" + source.id,
						success : function(result, textStatus) {
							if (result.success) {
								doDrop(target, source, point);
							} else {
								$.messager.alert("提示", validateMessage);
								initTree();
							}
						},
						error : function(xhr, textStatus, error) {
							$.messager.alert("提示", xhr.responseText);
							initTree();
						}
					});
				} else {
					doDrop(target, source, point);
				}
			}
		});
	}

	$(function() {
		initTree();
	});

	$(_submitBtnId)[0].onclick = function() {
		if (readjustList.length > 0) {
			$("body").mask("正在努力保存中，请稍候...");
			$.ajax({
				type : "POST",
				dataType : "json",
				contentType : "application/json;charset=UTF-8",
				url : _saveURL,
				data : $.toJSON(readjustList),
				success : function(result, textStatus) {
					$("body").unmask();
					reloadValue = reloadValue || -1;
					parent.reload();
					$.messager.alert(result.title, result.msg, "info", function() {
						parent.closeDialog();
					});
				},
				error : function(xhr, textStatus, error) {
					$("body").unmask();
					parent.closeDialog();
					$.messager.alert("提示", xhr.responseText);
				}
			});

		} else {
			parent.closeDialog();
		}
	}
}