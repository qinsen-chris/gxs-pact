package com.gclfax.modules.pact.entity;

public class PactDictRelationEntity {
    private Long id;

    private Long pactVersionId;

    private Long pactDictId;

    private String resultType;

    private Boolean isMust;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPactVersionId() {
        return pactVersionId;
    }

    public void setPactVersionId(Long pactVersionId) {
        this.pactVersionId = pactVersionId;
    }

    public Long getPactDictId() {
        return pactDictId;
    }

    public void setPactDictId(Long pactDictId) {
        this.pactDictId = pactDictId;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType == null ? null : resultType.trim();
    }

    public Boolean getIsMust() {
        return isMust;
    }

    public void setIsMust(Boolean isMust) {
        this.isMust = isMust;
    }
}