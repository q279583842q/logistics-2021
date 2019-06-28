package com.bb.pojo;

public class Menu {
    private Integer menuId;

    private Integer parentMenuId;

    private String menuName;

    private String menuDesc;

    private String menuLink;

    private String securityName;

    private String m1;

    private String m2;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc == null ? null : menuDesc.trim();
    }

    public String getMenuLink() {
        return menuLink;
    }

    public void setMenuLink(String menuLink) {
        this.menuLink = menuLink == null ? null : menuLink.trim();
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName == null ? null : securityName.trim();
    }

    public String getM1() {
        return m1;
    }

    public void setM1(String m1) {
        this.m1 = m1 == null ? null : m1.trim();
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2 == null ? null : m2.trim();
    }
}