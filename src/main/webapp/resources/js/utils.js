function isJson(data) {
    return data.match("^\{(.+:.+,*){1,}\}$");
}

function setCenter(panel) {
    var width = panel.width();
    panel.css("position", "absolute");
    panel.css("margin-left", -width / 2);
    panel.css("left", "50%");
}

function setFocus(target) {
    setTimeout(function() {
        $(target).focus();
    }, 100);
}

function initResize(id, browserWidth, heigh) {
    if($.browser.msie) {
        browserWidth +=30; 
    }
    if($(window).width() < browserWidth)
    {
        height = heigh || 80;
        var northdiv = $(id).find('div[region="north"]');
        northdiv.css("height", height);
        northdiv.find('div').each(function() {
            $(this).css("height", height-10);
        });
        $(id).find('div[region="center"]').parent().css("top", height);
    }
}
