package com.tarunj.designpatterns.singleton;

public class DoubleCheckedSingleton {

    private static DoubleCheckedSingleton instance;

    // Private constructor to prevent instantiation
    private DoubleCheckedSingleton() {}

    // Public method with double check lock to get the instance
    public static DoubleCheckedSingleton getInstance() {
        // Check if instance is null
        if (instance == null) {
            // Thread safe
            synchronized (DoubleCheckedSingleton.class) {
                // Double check for consistency
                if(instance == null) {
                    // If null, create a new instance
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        // Return the instance (either newly created or existing)
        return instance;
    }
}
