package com.bookstore.enity;

public class Book {

    private int bookid;
    private String bookname;
    private float price;             //单价
    private int stock;               //库存
    private String author;           //作者
    private int pressid;            //出版社
    private int categoryid;         //类别
    private String picture;          //图片地址
    private String remarks;          //备注

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPressid() {
        return pressid;
    }

    public void setPressid(int pressid) {
        this.pressid = pressid;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", author='" + author + '\'' +
                ", pressid='" + pressid + '\'' +
                ", categoryid='" + categoryid + '\'' +
                ", picture='" + picture + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
