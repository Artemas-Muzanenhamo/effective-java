# Creating and Destroying Objects
  THIS chapter concerns creating and destroying objects: when and how to 
  create them, when and how to avoid creating them, how to ensure they 
  are destroyed in a timely manner, and how to manage any cleanup actions 
  that must precede their destruction.
  

The normal way for a class to allow a client to obtain an instance of itself is to pro- vide a public constructor. There is another technique that should be a part of every programmer’s toolkit. A class can provide a public static factory method, which is simply a static method that returns an instance of the class. Here’s a simple exam- ple from Boolean (the boxed primitive class for the primitive type boolean). This method translates a boolean primitive value into a Boolean object reference:

```java
public static Boolean valueOf(boolean b) {
       return b ? Boolean.TRUE : Boolean.FALSE;
}
```
A class can provide its clients with static factory methods instead of, or in addition to, constructors. Providing a static factory method instead of a public constructor has both advantages and disadvantages.

#### Advantages:

- One advantage of static factory methods is that, unlike constructors, they have names.
- A second advantage of static factory methods is that, unlike constructors, they are not required to create a new object each time they’re invoked.
- A third advantage of static factory methods is that, unlike constructors, they can return an object of any subtype of their return type.