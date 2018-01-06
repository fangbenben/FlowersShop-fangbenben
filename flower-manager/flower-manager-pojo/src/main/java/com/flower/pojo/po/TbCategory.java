package com.flower.pojo.po;

public class TbCategory {
    private String id;

    private String name;

    private Integer status;

    private String kandId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getKandId() {
        return kandId;
    }

    public void setKandId(String kandId) {
        this.kandId = kandId == null ? null : kandId.trim();
    }
}