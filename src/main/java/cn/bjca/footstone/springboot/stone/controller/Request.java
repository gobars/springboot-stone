package cn.bjca.footstone.springboot.stone.controller;

public class Request {
     String keyPairId;

     int keyPairVersion;

     String transId;

     String appId;

     String keyId;

     int keyVersion;


     String iv = "MTIzNDU2NzgxMjM0NTY3OA==";

     String padding = "PKCS7Padding";

     String plainText;

     public String getKeyPairId() {
          return keyPairId;
     }

     public void setKeyPairId(String keyPairId) {
          this.keyPairId = keyPairId;
     }

     public int getKeyPairVersion() {
          return keyPairVersion;
     }

     public void setKeyPairVersion(int keyPairVersion) {
          this.keyPairVersion = keyPairVersion;
     }

     public String getTransId() {
          return transId;
     }

     public void setTransId(String transId) {
          this.transId = transId;
     }

     public String getAppId() {
          return appId;
     }

     public void setAppId(String appId) {
          this.appId = appId;
     }

     public String getKeyId() {
          return keyId;
     }

     public void setKeyId(String keyId) {
          this.keyId = keyId;
     }

     public int getKeyVersion() {
          return keyVersion;
     }

     public void setKeyVersion(int keyVersion) {
          this.keyVersion = keyVersion;
     }

     public String getIv() {
          return iv;
     }

     public void setIv(String iv) {
          this.iv = iv;
     }

     public String getPadding() {
          return padding;
     }

     public void setPadding(String padding) {
          this.padding = padding;
     }

     public String getPlainText() {
          return plainText;
     }

     public void setPlainText(String plainText) {
          this.plainText = plainText;
     }
}
