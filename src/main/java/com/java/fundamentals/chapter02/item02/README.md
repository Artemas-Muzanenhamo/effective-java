# Consider a builder when faced with a constructor with many parameters

- Telescoping constructor pattern (`NutritionFactsExample1.java`) - does not scale well!
    - unreadable, prone to errors and hard to debug.

- Java Bean pattern (`NutritionFactsExample2.java`)
    - Invariance cannot be maintained.
    - Maintaining thread safety of the Class is difficult.

- Builder pattern - safe and readable
    - Parameter validation can be done during object construction.
    - Can have multiple varargs parameters.
    - Builder pattern in flexible.
    - Builder whose parameters have been set makes a fine Abstract Factory.
