package com.tarunj.designpatterns.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    // Static block for initialization
    static {
        try {
            instance = new StaticBlockSingleton();
        }
        catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
