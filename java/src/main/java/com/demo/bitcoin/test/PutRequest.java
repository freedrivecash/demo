package com.demo.bitcoin.test;

import java.io.Serializable;

/**
 * @Author: KongXK
 * @Description:
 * @Date:Create：in 2020-07-27 15:14
 * @Modified By：
 */
public class PutRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String user_addr;
    private String dapp_addr;
    private String metadata;
    private String data;
    private String drive_id;
    private String timestamp;
    private String user_signature;

    public String getUser_addr() {
        return user_addr;
    }

    public void setUser_addr(String user_addr) {
        this.user_addr = user_addr;
    }

    public String getDapp_addr() {
        return dapp_addr;
    }

    public void setDapp_addr(String dapp_addr) {
        this.dapp_addr = dapp_addr;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDrive_id() {
        return drive_id;
    }

    public void setDrive_id(String drive_id) {
        this.drive_id = drive_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUser_signature() {
        return user_signature;
    }

    public void setUser_signature(String user_signature) {
        this.user_signature = user_signature;
    }
}
