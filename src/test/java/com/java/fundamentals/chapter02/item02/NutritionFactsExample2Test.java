package com.java.fundamentals.chapter02.item02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NutritionFactsExample2Test {
    @Test
    @DisplayName("Should return calories as 3500")
    void getCalories() {
        NutritionFactsExample2 nutritionFacts = new NutritionFactsExample2();

//        Returns 0 meaning the object created will allow you to access the field before its assigned a value.
        assertThat(nutritionFacts.calories).isEqualTo(3500); // Comment this line to look at the next problem below.

        nutritionFacts.setCalories(3500);
        nutritionFacts.setCalories(7000); // the nutritionFacts Object allows mutability. E.g. painful for Thread Safety cases.

        assertThat(nutritionFacts.calories).isEqualTo(3500);
    }
}
