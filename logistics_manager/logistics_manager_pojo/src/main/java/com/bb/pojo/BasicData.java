package com.bb.pojo;

public class BasicData {
    private Integer baseId;

    private Integer parentId;

    private String baseName;

    private String baseDesc;

    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName == null ? null : baseName.trim();
    }

    public String getBaseDesc() {
        return baseDesc;
    }

    public void setBaseDesc(String baseDesc) {
        this.baseDesc = baseDesc == null ? null : baseDesc.trim();
    }
}