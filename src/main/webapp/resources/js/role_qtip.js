function RoleQtip(_targets, _url, _height) {
    if (_height == undefined){
        _height = 180;
    }
    var options = {
        content : "查看权限",
        position : {
            corner : {
                target : 'rightMiddle',
                tooltip : 'leftMiddle'
            },
            adjust : {
                x : 10
            }
        },
        hide : {
            delay : 200,//将程序的执行暂停一段时间(毫秒)
            fixed : true
        },
        style : {
            name : 'green',
            border : 1,
            'cursor' : 'pointer'
        },
        api : {
            onRender : function(event) {
                var _parent = this;
                var content = this.elements.content;
                var id = $(this.elements.target.get(0).parentNode).attr("node-id");
                var _x = 75, _y = 14;
                content.qtip({
                    content : "<div id='"+ id+ "'class='pagination-loading qtip_privilege_con' style='overFlow:auto;width:180px;height:"+_height+"px'></div>",
                    position : {
                        corner : {
                            target : 'center',
                            tooltip : 'topMiddle'
                        },
                        adjust : {
                            x : _x,
                            y : _y
                        }
                    },
                    show : {
                        when : "click"
                    },
                    hide : {
                        delay : 100,
                        fixed : true
                    },
                    style : {
                        'cursor' : 'pointer'
                    },
                    api : {
                        beforeShow : function(event) {
                            var treeContainer = this.elements.content
                            .find("div:first-child");
                            treeContainer.empty();

                        },
                        onShow : function(event) {
                            var offset = _parent.elements.content.offset();
                            var parentHeight = _parent.elements.content.outerHeight();
                            var parentWidth = _parent.elements.content.outerWidth();
							
							//设置权限窗口的垂直位置
                            if ((offset.top + parentHeight + _height) > $(document.body).height()) {
                                this.options.position.adjust.y = -(parentHeight + _height - 20);
                                this.updatePosition(event, true);
                            }
                            
                            if ((offset.left + parentWidth + 150) > $(document.body).width()) {
                                this.options.position.adjust.x = -(parentWidth + 40);
                                this.updatePosition(event, true);
                            }

                            var treeContainer = this.elements.content.find("div:first-child");
                            var roleId = treeContainer.attr("id");
                            treeContainer
                            .tree({
                                url : _url+ roleId,
                                method : "get",
                                animate : true,
                                onLoadSuccess : function(
                                    node, data) {
                                    $(this).removeClass("pagination-loading");
                                    if (data == null|| data.length == 0) {
                                        $(this).append("<span style='position: relative; top: "+_height/2+"; left: 30'>该角色尚未分配权限！</span>");
                                    }
                                }
                            });
                        },
                        onHide : function(event) {
                        	_parent.hide();
                        }
                    }
                });
            },
            beforeShow : function(event){
            	_targets.each(function() {
            		$(this).qtip("hide");
            	}
            	);
            },
            onHide: function(event) {
            	this.elements.content.qtip("hide");
            }
        }
    };
	
    _targets.qtip(options);
}