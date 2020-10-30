package com.java.fundamentals.chapter02.item02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NutritionFactsExample1Test {
    @Test
    @DisplayName("Should create an object with serving size as 2 and servings as 1")
    void testServingSizeAndServings() {
        NutritionFactsExample1 nutritionFacts = new NutritionFactsExample1(1, 2, 50, 500, 3, 450);

        // Imagine the object created didn't have tests 😏 or it contained even more parameters
        // Or it was both... It would be catastrophic for a mistake to happen in the constructor.
        assertThat(nutritionFacts.servingsSize).isEqualTo(2);
        assertThat(nutritionFacts.servings).isEqualTo(1);
        assertThat(nutritionFacts.calories).isEqualTo(500);
        assertThat(nutritionFacts.fat).isEqualTo(50);
        assertThat(nutritionFacts.sodium).isEqualTo(3);
        assertThat(nutritionFacts.carbohydrate).isEqualTo(450);
    }
}
