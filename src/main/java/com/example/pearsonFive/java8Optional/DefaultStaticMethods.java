package com.example.pearsonFive.java8Optional;

public class DefaultStaticMethods {

    /***
     * SUMMARY:  PRESENCE OR ABSENSE OF IMPLEMENTATION. 2. CAN BE OVERRIDDEN, OVERRIDING IS OPTIONAL, CANNOT BE NOT 3.
     * INVOCATION:WITH INSTANCE OF IMPLEMENTING CLASS, DIRECTLY ON THE INTERFACE NAME
     * The default method of an interface, is so called, due to its default/automatic availability
     * (without the need to override as in the case of abstract methods) to all implementing classes of the interface
     * where it (the default method) is declared.
     *
     *
     * CHATGPT
     * A. DEFINITION
     *1. A default method in an interface is a method with a body (implementation)
     * 2.It is automatically available to all implementing classes without requiring the class to override it (impl class
     * will only need to invoke it in this case).
     * 3.However, implementing classes have the option to override the default method if they want to provide their own implementation
     *
     *B. Creating an Interface Demonstrating Abstract, Default, and Static Methods
     * Here’s an example interface and a demonstration of how to declare and invoke abstract, default, and static methods:
     *
     * Interface Declaration
     * java
     * Copy code
     * interface ExampleInterface {
     *     // Abstract method: must be implemented by implementing classes
     *     void abstractMethod();
     *
     *     // Default method: has an implementation and can be overridden by implementing classes
     *     default void defaultMethod() {
     *         System.out.println("This is the default method in the interface.");
     *     }
     *
     *     // Static method: has an implementation and cannot be overridden or called on an instance
     *     static void staticMethod() {
     *         System.out.println("This is the static method in the interface.");
     *     }
     * }
     * Implementing Class
     * java
     * Copy code
     * class ExampleClass implements ExampleInterface {
     *
     *     // Implementing the abstract method
     *     @Override
     *     public void abstractMethod() {
     *         System.out.println("Implemented abstract method in the class.");
     *     }
     *
     *     // Optionally overriding the default method
     *     @Override
     *     public void defaultMethod() {
     *         System.out.println("Overridden default method in the class.");
     *     }
     * }
     * Main Class
     * java
     * Copy code
     * public class InterfaceDemo {
     *     public static void main(String[] args) {
     *         ExampleClass example = new ExampleClass();
     *
     *         // Calling the abstract method (implemented in the class)
     *         example.abstractMethod(); // Output: Implemented abstract method in the class.
     *
     *         // Calling the default method (can call the overridden version if present)
     *         example.defaultMethod(); // Output: Overridden default method in the class.
     *
     *         // Calling the static method (directly from the interface)
     *         ExampleInterface.staticMethod(); // Output: This is the static method in the interface.
     *     }
     * }
     *
     * C. Summary of Method Types in Interfaces
     * Abstract Methods:
     *
     * Must be implemented by the implementing class.
     * Declared without a body.
     * Called on an instance of the implementing class
     * Example: void abstractMethod();
     * Default Methods:
     *
     * Have a default implementation.
     * Can be overridden by the implementing class.
     * Called on an instance of the implementing class
     * Example:
     * java
     * Copy code
     * default void defaultMethod() {
     *     System.out.println("Default implementation.");
     * }
     * Static Methods:
     *
     * Have an implementation but are not tied to any instance.
     * Called using the interface name.
     * Cannot be overridden.
     * Example:
     * java
     * Copy code
     * static void staticMethod() {
     *     System.out.println("Static method in the interface.");
     * }
     *
     *
     * ****/
}
