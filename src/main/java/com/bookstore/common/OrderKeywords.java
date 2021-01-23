package com.bookstore.common;

public enum OrderKeywords {

    DEFAULT(0, "综合排序"),
    SALES_TOP(1, "销售最高"),
    PRICE_TOP(2, "价格最高"),
    PRICE_DOWN(3, "价格最低"),
    NEW_PUT(4, "最新上架");

    private final int id;
    private final String value;

    OrderKeywords(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public static int getIdByValue(String value) {
        for (OrderKeywords selectKeywords : OrderKeywords.values())
            if (value.equals(selectKeywords.getValue()))
                return selectKeywords.id;
        return DEFAULT.id;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
