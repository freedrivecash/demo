package com.demo.bitcoin.test;


import cn.hutool.crypto.SecureUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import com.rong.dto.AuthRequest;
import com.rong.dto.GetRequest;
import com.rong.dto.ListRequest;
import com.rong.dto.PutRequest;
import org.bitcoinj.core.DumpedPrivateKey;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.MainNetParams;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: KongXK
 * @Description:
 * @Date:Create：in 2020-07-29 13:40
 * @Modified By：
 */
public class Demo {

    public static void main(String[] args) {
        getDriveInfo();
//        get();
//        put();
//        list();
//        authEnd();
//        auth();
    }


    public static void list() {
        try {
            String address = "1Be66cbFmECR3SYJ43XmD9dos2KWDE6aqD";
            String privateKey = "L3eVnyeP98aQr5StpB5P7LMYU8QCZD8hE48oCzcwUx8FX8N3eu3s";
            String timeStamp = String.valueOf(System.currentTimeMillis());
            ListRequest listRequest = new ListRequest();
            listRequest.setDapp_addr(address);
            listRequest.setAddr(address);
            listRequest.setPage("0");
            listRequest.setProtocol("0");
            listRequest.setDetail("1");
            listRequest.setTimestamp(timeStamp);
            StringBuilder signData = new StringBuilder();
            signData.append("/api/list").append(listRequest.getProtocol()).append(listRequest.getAddr()).append(listRequest.getDapp_addr())
                    .append(listRequest.getPage()).append(listRequest.getDetail()).append(listRequest.getTimestamp());
            listRequest.setDapp_signature(signMsg(SecureUtil.sha256(signData.toString()), privateKey));
            System.out.println("交易返回：" + HttpUtil.post("http://127.0.0.1:9311/api/list", JSONObject.toJSONString(listRequest)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void get() {
        try {
            String address = "1Be66cbFmECR3SYJ43XmD9dos2KWDE6aqD";
            String privateKey = "L3eVnyeP98aQr5StpB5P7LMYU8QCZD8hE48oCzcwUx8FX8N3eu3s";
            String timeStamp = String.valueOf(System.currentTimeMillis());
            GetRequest getRequest = new GetRequest();
            getRequest.setDapp_addr(address);
            getRequest.setDrive_id("b4465b6a7480256469fa6fcfc36e7db87b74098a42a028714601358cc048a122");
            getRequest.setPrev(100);
            getRequest.setNext(100);
            getRequest.setTimestamp(timeStamp);
            StringBuffer signData = new StringBuffer();
            signData.append("/api/get").append(getRequest.getDapp_addr()).append(getRequest.getDrive_id())
                    .append(getRequest.getPrev()).append(getRequest.getNext()).append(getRequest.getTimestamp());
            getRequest.setDapp_signature(signMsg(SecureUtil.sha256(signData.toString()), privateKey));
            System.out.println("交易返回：" + HttpUtil.post("http://127.0.0.1:9311/api/get", JSONObject.toJSONString(getRequest)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void put() {
        try {
            String address = "1Be66cbFmECR3SYJ43XmD9dos2KWDE6aqD";
            String privateKey = "L3eVnyeP98aQr5StpB5P7LMYU8QCZD8hE48oCzcwUx8FX8N3eu3s";
            String timeStamp = String.valueOf(System.currentTimeMillis());
            PutRequest putRequest = new PutRequest();
            putRequest.setUser_addr(address);
            putRequest.setDapp_addr(address);
            putRequest.setDrive_id("8c77fca198f352b78e51fdda87e960b9aea3d600cd22da80bb94aaeeae06a752");
            putRequest.setMetadata("383838389898");
            putRequest.setData("585858581212");
            putRequest.setTimestamp(timeStamp);
            StringBuffer signData = new StringBuffer();
            signData.append("/api/put").append(putRequest.getUser_addr()).append(putRequest.getDapp_addr()).append(putRequest.getMetadata())
                    .append(putRequest.getData()).append(putRequest.getDrive_id()).append(putRequest.getTimestamp());
            putRequest.setUser_signature(signMsg(SecureUtil.sha256(signData.toString()), privateKey));
            System.out.println("交易返回：" + HttpUtil.post("http://127.0.0.1:9311/api/put", JSONObject.toJSONString(putRequest)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void authEnd() {
        try {
            String address = "1Be66cbFmECR3SYJ43XmD9dos2KWDE6aqD";
            String privateKey = "L3eVnyeP98aQr5StpB5P7LMYU8QCZD8hE48oCzcwUx8FX8N3eu3s";
            String timeStamp = String.valueOf(System.currentTimeMillis());
            AuthRequest authRequest = new AuthRequest();
            authRequest.setUser_addr(address);
            authRequest.setDapp_addr(address);
            authRequest.setDrive_id("182a7aac999e4715c0b0e5382e8f199650f23e10e06ca1463e78c2abe8700894");
            List<String> admins = new ArrayList<>();
            admins.add("0");
            authRequest.setAdmin(admins);
            List<String> members = new ArrayList<>();
            members.add("0");
            authRequest.setMember(admins);
            authRequest.setTimestamp(timeStamp);
            StringBuilder signData = new StringBuilder();
            signData.append("/api/auth").append(authRequest.getUser_addr()).append(authRequest.getDapp_addr()).append(authRequest.getDrive_id())
                    .append(String.join("", authRequest.getAdmin())).append(String.join("", authRequest.getMember())).append(authRequest.getTimestamp());
            authRequest.setUser_signature(signMsg(SecureUtil.sha256(signData.toString()), privateKey));
            System.out.println("交易返回：" + HttpUtil.post("http://127.0.0.1:9311/api/auth", JSONObject.toJSONString(authRequest)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void auth() {
        try {
            String address = "1NHZ16FwBzrM7R34HSJvjRdBEa5PycN5c7";
            String privateKey = "L5e11vhXdTjE9j1jAC6dxXGSEVqR3yNQYtmJCraEkrzsJcnu4FMu";
            String timeStamp = String.valueOf(System.currentTimeMillis());
            AuthRequest authRequest = new AuthRequest();
            authRequest.setUser_addr(address);
            authRequest.setDapp_addr(address);
            authRequest.setDrive_id("6cb85e7ba37c1065f6c8756f66362d14f2a84eee917a7191b19c49e502ec7e67");
            List<String> admins = new ArrayList<>();
            admins.add("1FJ6wEZisaR4UuWH8mQ6bTDdhXf2e4ePKD");
            authRequest.setAdmin(admins);
            List<String> members = new ArrayList<>();
            members.add("1x4e7FFYybdAd9KoLQP3PGNRcoqDR1Lbg");
            authRequest.setMember(members);
            authRequest.setTimestamp(timeStamp);
            StringBuilder signData = new StringBuilder();
            signData.append("/api/auth").append(authRequest.getUser_addr()).append(authRequest.getDapp_addr()).append(authRequest.getDrive_id())
                    .append(String.join("", authRequest.getAdmin())).append(String.join("", authRequest.getMember())).append(authRequest.getTimestamp());
            authRequest.setUser_signature(signMsg(SecureUtil.sha256(signData.toString()), privateKey));
            System.out.println("交易返回：" + HttpUtil.post("http://127.0.0.1:9311/api/auth", JSONObject.toJSONString(authRequest)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getDriveInfo() {
        try {
            String address = "1Be66cbFmECR3SYJ43XmD9dos2KWDE6aqD";
            String privateKey = "L3eVnyeP98aQr5StpB5P7LMYU8QCZD8hE48oCzcwUx8FX8N3eu3s";
            String timeStamp = String.valueOf(System.currentTimeMillis());
            GetRequest getRequest = new GetRequest();
            getRequest.setDapp_addr(address);
            getRequest.setDrive_id("f6df33cbf22626bd6912c347bb617e6d347a0e8cd7df02524d035cb9da2cf229");
            getRequest.setTimestamp(timeStamp);
            StringBuffer signData = new StringBuffer();
            signData.append("/api/get_drive_info").append(getRequest.getDapp_addr()).append(getRequest.getDrive_id()).append(getRequest.getTimestamp());
            getRequest.setDapp_signature(signMsg(SecureUtil.sha256(signData.toString()), privateKey));
            System.out.println("交易返回：" + HttpUtil.post("http://127.0.0.1:9311/api/get_drive_info", JSONObject.toJSONString(getRequest)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String signMsg(String msg, String privateKey) {
        NetworkParameters networkParameters = MainNetParams.get();
        DumpedPrivateKey priKey = DumpedPrivateKey.fromBase58(networkParameters, privateKey);
        ECKey ecKey = priKey.getKey();
        return ecKey.signMessage(msg);
    }
}
