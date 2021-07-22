package com.sinosdx.maven.dao.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色菜单表(RoleMenu)实体类
 *
 * @author makejava
 * @since 2021-03-04 13:43:14
 */
public class RoleMenu implements Serializable {
    private static final long serialVersionUID = 900492063859721119L;
    /**
     * ID
     */
    private Long id;
    /**
     * 角色ID
     */
    private Object roleId;
    /**
     * 菜单ID
     */
    private Long menuId;
    /**
     * 状态（0：无效，1有效）
     */
    private String status;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 修改人
     */
    private String modifier;
    /**
     * 创建时间
     */
    private Date creatorDate;
    /**
     * 修改时间
     */
    private Date updateDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object getRoleId() {
        return roleId;
    }

    public void setRoleId(Object roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getCreatorDate() {
        return creatorDate;
    }

    public void setCreatorDate(Date creatorDate) {
        this.creatorDate = creatorDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
