package com.java.fundamentals.chapter02.item01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstObjectTest {

    @Test
    @DisplayName("Should create an object with value Hello World")
    void shouldCreateAnObjectUsingConstructor() {
        FirstObject firstObject = new FirstObject("Hello World");

        assertThat(firstObject)
                .isNotNull()
                .extracting("value")
                .isEqualTo("Hello World");
    }
}
