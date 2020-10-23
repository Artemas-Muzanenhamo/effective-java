package com.java.fundamentals.chapter02.item01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SecondObjectTest {

    @Test
    @DisplayName("Should create an object with value Hello World")
    void createObjectWithStaticFactoryMethod() {
        SecondObject secondObject = SecondObject.from("Hello World");

        assertThat(secondObject)
                .isNotNull()
                .extracting("value")
                .isEqualTo("Hello World");
    }
}
