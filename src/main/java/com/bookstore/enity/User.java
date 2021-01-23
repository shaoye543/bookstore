package com.bookstore.enity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

//普通客户
public class User {

    private String account;             //账号
    private String password;            //密码
    private String nickname;            //昵称
    private String email;               //邮箱
    private String address;             //收货地址
    private String tel;                 //联系电话
    private String portrait;             //头像图片地址
    @JsonFormat(pattern = "yy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    private Date createtime;       //创建时间

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", portrait='" + portrait + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
