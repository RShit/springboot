package com.example.springboot.dto;

import java.util.Date;

public class VocabListDTO {
    private Long vocabListId;
    private Long tenantId;
    private String name;
    private Long dictId;
    private String status;
    private String remark;
    private Date updateTime;
    private Long updateUserId;

    public Long getVocabListId() {
        return vocabListId;
    }

    public void setVocabListId(Long vocabListId) {
        this.vocabListId = vocabListId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDictId() {
        return dictId;
    }

    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }
}
