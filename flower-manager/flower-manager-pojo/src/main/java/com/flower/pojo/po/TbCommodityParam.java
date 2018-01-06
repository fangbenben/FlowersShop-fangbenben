package com.flower.pojo.po;

import java.util.Date;

public class TbCommodityParam {
    private String id;

    private String commCateId;

    private Date createtime;

    private Date updatetime;

    private String paramData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCommCateId() {
        return commCateId;
    }

    public void setCommCateId(String commCateId) {
        this.commCateId = commCateId == null ? null : commCateId.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}