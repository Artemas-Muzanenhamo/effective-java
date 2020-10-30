package com.java.fundamentals.chapter02.item02;

public class NutritionFactsExample1 {
    public final int servingsSize; // required
    public final int servings; // required
    public final int calories; // optional
    public final int fat; // optional
    public final int sodium; // optional
    public final int carbohydrate; // optional

    public NutritionFactsExample1(int servingsSize, int servings) {
        this(servingsSize, servings, 0);
    }

    public NutritionFactsExample1(int servingsSize, int servings, int calories) {
        this(servingsSize, servings, calories, 0);
    }

    public NutritionFactsExample1(int servingsSize, int servings, int calories, int fat) {
        this(servingsSize, servings, calories, fat, 0);
    }

    public NutritionFactsExample1(int servingsSize, int servings, int calories, int fat, int sodium) {
        this(servingsSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFactsExample1(int servingsSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingsSize = servingsSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
