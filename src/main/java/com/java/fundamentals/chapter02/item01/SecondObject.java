package com.java.fundamentals.chapter02.item01;

public class SecondObject {
    private final String value;

    private SecondObject(String value) {
        this.value = value;
    }

    /**
     * Here you have the flexibility of naming your static method to show
     * intent of what you are doing. In this case, here we are creating
     * a SecondObject from a String value.
     * */
    public static SecondObject from(String value) {
        return new SecondObject(value);
    }

    public String getValue() {
        return value;
    }
}
