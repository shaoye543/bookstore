package com.bookstore.enity;


//出版社实体类
public class Press {

    private int pressid;
    private String pressname;    //出版社名称
    private String tel;          //联系电话
    private String address;      //出版社地址

    public int getPressid() {
        return pressid;
    }

    public void setPressid(int pressid) {
        this.pressid = pressid;
    }

    public String getPressname() {
        return pressname;
    }

    public void setPressname(String pressname) {
        this.pressname = pressname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Press{" +
                "pressid=" + pressid +
                ", pressname='" + pressname + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
