package com.sinosdx.maven.dao.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (HandleLog)实体类
 *
 * @author makejava
 * @since 2021-05-13 17:56:27
 */
public class HandleLog implements Serializable {
    private static final long serialVersionUID = 462917926479028848L;
    /**
     * 主键
     */
    private Integer id;

    private String url;

    private String webName;

    private String userId;

    private String userName;

    private Date createTime;

    private String appCode;

    private String portal;

    private Integer type;

    private String deptName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
