package org.example.PrototypePattern;

public interface Prototype extends Cloneable {
    Prototype clone();
    int getId();
    void setId(int id);
}
