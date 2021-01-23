package com.bookstore.enity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Record {

    private int orderid;
    private String good;
    private String buyer;
    private String seller;

    @JsonFormat(pattern = "yy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    private Date createtime;

    private int number;;
    private int consum;
    private String status;
    private String opera;
    private String remarks;

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getConsum() {
        return consum;
    }

    public void setConsum(int consum) {
        this.consum = consum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpera() {
        return opera;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Record{" +
                "orderid=" + orderid +
                ", good='" + good + '\'' +
                ", buyer='" + buyer + '\'' +
                ", seller='" + seller + '\'' +
                ", createtime=" + createtime +
                ", number=" + number +
                ", consum=" + consum +
                ", status='" + status + '\'' +
                ", opera='" + opera + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
