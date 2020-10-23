package com.java.fundamentals.chapter02.item01;

public class FirstObject {

    private final String value;
    /**
     * Here you are forced to only pass a value on this constructor.
     * However, you don't have the flexibility to state the intent
     * of what the value will do within this constructor.
     * */
    public FirstObject(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
