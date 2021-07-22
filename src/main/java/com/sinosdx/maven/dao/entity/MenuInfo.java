package com.sinosdx.maven.dao.entity;

import java.io.Serializable;

/**
 * 菜单表(MenuInfo)实体类
 *
 * @author makejava
 * @since 2021-03-04 15:28:23
 */
public class MenuInfo implements Serializable {
    private static final long serialVersionUID = 370684539576114809L;
    /**
     * 序号
     */
    private Integer id;
    /**
     * 菜单ID
     */
    private Long menuId;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 所属菜单id
     */
    private Long toMenuId;
    /**
     * 所属菜单名称
     */
    private String toMenuName;
    /**
     * 菜单有效状态（0：无效，1：有效）
     */
    private String menuState;
    /**
     * 创建人
     */
    private String creater;
    /**
     * 修改人
     */
    private String modifier;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String modifyTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Long getToMenuId() {
        return toMenuId;
    }

    public void setToMenuId(Long toMenuId) {
        this.toMenuId = toMenuId;
    }

    public String getToMenuName() {
        return toMenuName;
    }

    public void setToMenuName(String toMenuName) {
        this.toMenuName = toMenuName;
    }

    public String getMenuState() {
        return menuState;
    }

    public void setMenuState(String menuState) {
        this.menuState = menuState;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

}
