package com.hflw.physique.framework.core.web;

import com.hflw.physique.framework.common.Constants;
import com.hflw.physique.framework.utils.ServletUtils;

public class TableSupport {

    /**
     * 封装分页对象
     */
    public static Pagination getPagination() {
        Pagination pageDomain = new Pagination();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(Constants.PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(Constants.PAGE_SIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(Constants.ORDER_BY_COLUMN));
        pageDomain.setIsAsc(ServletUtils.getParameter(Constants.IS_ASC));
        return pageDomain;
    }

    public static Pagination buildPageRequest() {
        return getPagination();
    }

}
