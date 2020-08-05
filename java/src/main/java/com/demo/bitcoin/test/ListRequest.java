package com.demo.bitcoin.test;

import java.io.Serializable;

/**
 * @Author: KongXK
 * @Description:
 * @Date:Create：in 2020-07-27 15:14
 * @Modified By：
 */
public class ListRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String protocol;
    private String addr;
    private String dapp_addr;
    private String page;
    private String detail;
    private String timestamp;
    private String dapp_signature;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getDapp_addr() {
        return dapp_addr;
    }

    public void setDapp_addr(String dapp_addr) {
        this.dapp_addr = dapp_addr;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDapp_signature() {
        return dapp_signature;
    }

    public void setDapp_signature(String dapp_signature) {
        this.dapp_signature = dapp_signature;
    }
}
