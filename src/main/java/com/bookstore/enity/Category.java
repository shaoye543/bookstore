package com.bookstore.enity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Category {
    private int categoryid;
    private String category;
    private String creator;
    private String reviser;

    @JsonFormat(pattern = "yy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    private Date updatetime;

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getReviser() {
        return reviser;
    }

    public void setReviser(String reviser) {
        this.reviser = reviser;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryid=" + categoryid +
                ", category='" + category + '\'' +
                ", creator='" + creator + '\'' +
                ", reviser='" + reviser + '\'' +
                ", updatetime=" + updatetime +
                '}';
    }
}
