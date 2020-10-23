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

class Example {
    public static void main(String[] args) {
//        SecondObject secondObject = new SecondObject(); <-- The Constructor would be private so this line would be invalid
        SecondObject secondObject = SecondObject.from("Hello World");

//        Will print out our value we passed in the object --> "Hello World"
        System.out.println(secondObject.getValue());
    }
}
