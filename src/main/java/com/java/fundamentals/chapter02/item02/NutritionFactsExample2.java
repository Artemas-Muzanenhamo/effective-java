package com.java.fundamentals.chapter02.item02;

public class NutritionFactsExample2 {
    public int servingsSize = -1; // required
    public int servings = -1; // required
    public int calories = 0; // optional
    public int fat = 0; // optional
    public int sodium = 0; // optional
    public int carbohydrate = 0; // optional

    public NutritionFactsExample2() { }

    public NutritionFactsExample2 setServingsSize(int servingsSize) {
        this.servingsSize = servingsSize;
        return this;
    }

    public NutritionFactsExample2 setServings(int servings) {
        this.servings = servings;
        return this;
    }

    public NutritionFactsExample2 setCalories(int calories) {
        this.calories = calories;
        return this;
    }

    public NutritionFactsExample2 setFat(int fat) {
        this.fat = fat;
        return this;
    }

    public NutritionFactsExample2 setSodium(int sodium) {
        this.sodium = sodium;
        return this;
    }

    public NutritionFactsExample2 setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
        return this;
    }
}
