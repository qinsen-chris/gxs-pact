package com.gclfax.modules.pact.vo;

import java.io.Serializable;

/**
 * Create by qinsen on 2018/04/28
 */
public class PactRequestVo implements Serializable{
    private static final long serialVersionUID = 7802335362608115448L;

    /** 平台标识 */
    private String platform;
    /** 合同模板版本号 */
    private Long pactVersionId;
    /** 业务类型 "bidId"\"investId"\"o2mBidId" */
    private String pactFlag;
     /** 业务主键 */
    private Long businessId;
    /** 转让标投资Id */
    private Long investId;
    /** 文件生成日期 */
    private String fileDate;


    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Long getPactVersionId() {
        return pactVersionId;
    }

    public void setPactVersionId(Long pactVersionId) {
        this.pactVersionId = pactVersionId;
    }

    public String getPactFlag() {
        return pactFlag;
    }

    public void setPactFlag(String pactFlag) {
        this.pactFlag = pactFlag;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Long getInvestId() {
        return investId;
    }

    public void setInvestId(Long investId) {
        this.investId = investId;
    }

    public String getFileDate() {
        return fileDate;
    }

    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }
}
