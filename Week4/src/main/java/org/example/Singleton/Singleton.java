package org.example.Singleton;

import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable,Cloneable {
    private static Singleton instance;

    // private constructor to prevent external instantiation
    private Singleton() {
        // throw an exception if someone tries to create a second instance
        if (instance != null) {
            throw new IllegalStateException("Singleton instance already created.");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // override the readResolve method to prevent deserialization from creating a new instance
    @Serial
    protected Object readResolve() {
        return getInstance();
    }

    // override the clone method to prevent cloning of the Singleton instance
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone Singleton instance.");
    }
}

