package com.example.pearsonFive.java8Optional;

public class OptionalNote {

    /**
     *
     *
     * Value of optional objects, will not be directly accessed, without putting in place the checks for empty;
     * or null options. These methods detail checks pre accessing an optional method.
     *
     *
     *  BEFORE OPTIONAL CLASS
     * Scenario: Retrieving and Using a Value
     * Without Null Handling
     * java
     * Copy code
     * String location = getLocation(); // May return null
     * System.out.println(location.toUpperCase()); // Throws NullPointerException if location is null
     * If getLocation() returned null, this code would throw a NullPointerException.
     *
     * With Manual Null Checks
     * To avoid exceptions, developers manually checked for null:
     *
     * java
     * Copy code
     * String location = getLocation(); // May return null
     * if (location != null) {
     *     System.out.println(location.toUpperCase());
     * } else {
     *     System.out.println("Location is not available.");
     * }
     * While this works, it introduces boilerplate code (repeated null checks), increases verbosity,
     * and is error-prone. Forgetting to check for null even once can lead to a runtime exception.
     *
     * Scenario: Returning a Default Value
     * Using Ternary or Conditional Statements
     * java
     * Copy code
     * String location = getLocation(); // May return null
     * location = (location != null) ? location : "Default Location";
     * System.out.println(location.toUpperCase());
     *
     *
     * WITH OPTIONAL
     * How Optional Prevents Null Checks
     * 1. Creating an Optional
     * The Optional class explicitly handles the presence or absence of a value:
     *
     * java
     * Copy code
     * Optional<String> location = Optional.ofNullable(getLocation());
     * If getLocation() returns a non-null value, the Optional will hold the value.
     * If it returns null, the Optional will be empty (Optional.empty).
     * 2. Accessing the Value Safely
     * Check if Value Exists:
     * Instead of manually checking for null, use Optional.isPresent() or modern alternatives:
     *
     * java
     * Copy code
     * location.ifPresent(loc -> System.out.println(loc.toUpperCase()));
     * This prints the value if present.
     * If the value is absent, nothing happens—avoiding exceptions.
     * 3. Provide a Default Value:
     * java
     * Copy code
     * String finalLocation = location.orElse("Default Location");
     * System.out.println(finalLocation.toUpperCase());
     * If the value is absent, orElse provides a default value.
     * This eliminates the need for conditional or ternary statements.
     * 4. Transform the Value:
     * Use map() to safely transform the value only if it's present:
     *
     * java
     * Copy code
     * Optional<Integer> length = location.map(String::length);
     * System.out.println(length.orElse(0)); // Prints 0 if location is absent
     *
     * 1. The Optional class is used to prevent null checks and null pointer exceptions
     *
     * 2.The Optional object is a single value container that either contains a value or not (it is then regarded
     * as empty)
     *
     * 3. To create optional objects, static methods below are used/invoked on the Optional class
     * Static methods of the optional class:
     * of(), ofNullable(), empty():These static methods are all use for the purpose of creating optional objects
     *
     * 4. To extract values from the optional object, instance methods are invoked on the optional objects.
     *
     *
     *
     *Instance methods of the optiuonal object
     * ispresent() and get()
     * isPresent() is a boolean method that carries out a check on an optional object to see if a value
     * is present in it or not. After the boolean check with isPrresent(), the get(), can then
     * be used to access the value if present
     *
     * orElse(), orElseGet(), orElseThrow():
     * use to create a default value or an exception for an optional object when it's
     * empty or null in value. However, the
     * value contained in the optional object will be returned if a value is present. This will be
     * instead of the default value.
     *
     * ifPresent()
     * ifPresent(), accepts lamda as it's argument. The statement in the lambda function will onl,y execute if there
     * is a value present in the optional object contains a value. Else, it will return no statement to the console
     * if the optional object is empty o of null value
     *
     * filter()
     *
     *
     *
     * When you call filter on an Optional, the method takes a predicate (a function that returns a boolean) as an argument.
     * Inside this predicate, x represents the value contained in the Optional at that moment. Here's a step-by-step breakdown:
     *
     * The Optional Contains a Value: When you create the Optional:
     *
     * java
     * Copy code
     * Optional<String> ts = Optional.ofNullable("Independence");
     * The Optional ts contains the string "Independence".
     *
     * Invoking filter:
     *
     * java
     * Copy code
     * ts.filter((x) -> x.equals("Independence"))
     * Here, the filter method is invoked on the Optional.
     * The lambda expression (x) -> x.equals("Independence") is a function that takes a single argument x.
     * Assignment of x:
     *
     * When the filter method runs, it checks if the Optional contains a value. Since ts contains "Independence",
     * the filter method internally extracts this value and passes it to the lambda.
     * In this context, x is assigned the value of "Independence" (the value contained in the Optional)
     * when the lambda is invoked.
     * Execution of the Predicate:
     *
     * Inside the lambda, x now holds the value "Independence".
     * The line x.equals("Independence") checks if x (which is "Independence") is equal to "Independence".
     * Since they are equal, the predicate returns true.
     * Continuation:
     *
     * Since the predicate returns true, the Optional remains non-empty, and the ifPresent method can
     * then execute its lambda, printing the value of x.
     * Summary
     * The assignment of Independence to x happens implicitly when the lambda is invoked during the
     * filter method's execution. The filter method extracts the contained value from the Optional
     * and uses it as the argument for the predicate function. So, you don’t see an explicit assignment
     * in the code; it happens as part of the method invocation process.
     *
     * Optional<String> ts = Optional.ofNullable("Independence");
     * ts.filter((x) -> x.equals("Nigeria")).ifPresent((x) -> System.out.println(x));
     * Initial State: The Optional<String> ts is initialized with the value "Independence". So, ts contains
     * that string.
     *
     * Filter Operation: The filter method checks the condition provided in the
     * lambda (x) -> x.equals("Nigeria"). Since "Independence" is not equal to "Nigeria",
     * the filter condition evaluates to false.
     *
     * Result of Filter: Because the filter condition is false, the Optional effectively becomes empty.
     * In Java's Optional, if the filter fails, it returns an empty Optional.
     *
     * ifPresent: Since the Optional is now empty, the ifPresent method does not execute its action,
     * resulting in no output.
     *
     * So, the key point is that the filter operation can cause the Optional to return
     * empty based on the condition you provide. It doesn't mean that the original value is lost; rather,
     * the filtered result does not satisfy the condition, leading to an empty Optional.
     *
     * The map method in optional, provides a way to transform value in optional from one type to another.
     *
     *
     * Filter() vs get()
     * t is safe to say that filter() in the Optional class operates similarly to get() in the sense that it
     * accesses the value contained within the Optional object. However, there are important differences between
     * how get() and filter() work:
     *
     * get() retrieves the actual value from the Optional, and if the Optional is empty, it throws a NoSuchElementException.
     *
     * filter() applies a predicate (a boolean condition) to the value inside the Optional.
     * If the predicate evaluates to true, the Optional remains unchanged and retains its value.
     * If the predicate evaluates to false, the Optional becomes empty (Optional.empty).
     * */

}


