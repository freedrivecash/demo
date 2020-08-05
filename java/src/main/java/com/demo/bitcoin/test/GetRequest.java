package com.demo.bitcoin.test;

import java.io.Serializable;

/**
 * @Author: KongXK
 * @Description:
 * @Date:Create：in 2020-07-27 15:14
 * @Modified By：
 */
public class GetRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String dapp_addr;
    private String drive_id;
    private int prev;
    private int next;
    private String timestamp;
    private String dapp_signature;

    public String getDapp_addr() {
        return dapp_addr;
    }

    public void setDapp_addr(String dapp_addr) {
        this.dapp_addr = dapp_addr;
    }

    public String getDrive_id() {
        return drive_id;
    }

    public void setDrive_id(String drive_id) {
        this.drive_id = drive_id;
    }

    public int getPrev() {
        return prev;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
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
