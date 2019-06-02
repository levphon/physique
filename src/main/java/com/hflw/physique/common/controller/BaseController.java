package com.hflw.physique.common.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hflw.physique.common.core.web.PageR;
import com.hflw.physique.common.core.web.Pagination;
import com.hflw.physique.common.core.web.PureR;
import com.hflw.physique.common.core.web.TableSupport;
import com.hflw.physique.common.utils.DateUtils;
import com.hflw.physique.common.utils.ServletUtils;
import com.hflw.physique.common.utils.StringUtils;
import com.hflw.physique.common.utils.sql.SqlUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.beans.PropertyEditorSupport;
import java.util.Date;
import java.util.List;

@RestController
public class BaseController {

    /**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(DateUtils.parseDate(text));
            }
        });
    }

    /**
     * 设置请求分页数据
     */
    protected void startPage() {
        Pagination pagination = TableSupport.buildPageRequest();
        Integer pageNum = pagination.getPageNum();
        Integer pageSize = pagination.getPageSize();
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize)) {
            String orderBy = SqlUtils.escapeOrderBySql(pagination.getOrderBy());
            PageHelper.startPage(pageNum, pageSize, orderBy);
        }
    }

    /**
     * 获取request
     */
    public HttpServletRequest getRequest() {
        return ServletUtils.getRequest();
    }

    /**
     * 获取response
     */
    public HttpServletResponse getResponse() {
        return ServletUtils.getResponse();
    }

    /**
     * 获取session
     */
    public HttpSession getSession() {
        return getRequest().getSession();
    }

    /**
     * 响应请求分页数据
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    protected PageR getDataTable(List<?> list) {
        PageR rspData = new PageR();
        rspData.setCode(0);
        rspData.setRows(list);
        rspData.setTotal(new PageInfo(list).getTotal());
        return rspData;
    }

    /**
     * 响应返回结果
     *
     * @param rows 影响行数
     * @return 操作结果
     */
    protected PureR toAjax(int rows) {
        return rows > 0 ? success() : error();
    }

    /**
     * 响应返回结果
     *
     * @param result 结果
     * @return 操作结果
     */
    protected PureR toAjax(boolean result) {
        return result ? success() : error();
    }

    /**
     * 返回成功
     */
    public PureR success() {
        return PureR.success();
    }

    /**
     * 返回失败消息
     */
    public PureR error() {
        return PureR.error();
    }

    /**
     * 返回成功消息
     */
    public PureR success(String message) {
        return PureR.success(message);
    }

    /**
     * 返回失败消息
     */
    public PureR error(String message) {
        return PureR.error(message);
    }

    /**
     * 返回错误码消息
     */
    public PureR error(PureR.Type type, String message) {
        return new PureR(type, message);
    }

    /**
     * 页面跳转
     */
    public String redirect(String url) {
        return StringUtils.format("redirect:{}", url);
    }
}
