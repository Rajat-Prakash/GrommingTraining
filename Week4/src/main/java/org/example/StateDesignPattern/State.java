package org.example.StateDesignPattern;

public interface State {
    public void open();
    public void close();
    public void log();
    public void update();
}
