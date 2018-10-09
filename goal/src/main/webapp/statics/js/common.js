var common = (function($){

    /**
     * 判断元素是否在数组中存在
     * @param obj 数组对象
     * @param val 给定元素
     * @author krin
     */
    arrayIndexOf = function(obj,val){
        for (var i = 0; i < obj.length; i++) {
            if (obj[i] == val) {
                return i;
            }
        }
        return -1;
    }

    return {
        'arrayIndexOf' : arrayIndexOf,
    };

})(jQuery);