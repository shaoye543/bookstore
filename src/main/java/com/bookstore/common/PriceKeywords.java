package com.bookstore.common;

public enum PriceKeywords {

    DEFAULT(0, "全部价格"),
    LESS_TEN(1, "10元以下"),
    TEN_TO_TWENTY(2, "10-20元"),
    TWENTY_TO_FIFTY(3, "20-50元"),
    FIFTY_TO_HUNDRED(4, "50-100元"),
    MORE_HUNDRED(5, "100元以上");

    private final int id;
    private final String value;

    PriceKeywords(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public static int getIdByValue(String value) {
        for (PriceKeywords selectKeywords : PriceKeywords.values())
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
