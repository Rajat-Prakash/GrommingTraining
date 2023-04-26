package org.example.StateDesignPattern;

import org.example.StateDesignPattern.ConcreteState.Accounting;
import org.example.StateDesignPattern.ConcreteState.Management;
import org.example.StateDesignPattern.ConcreteState.Sales;

public class Context {
    private static State state;

    public void setAccountingState() {
        state = new Accounting();
    }
    public void setSalesState() {
        state = new Sales();
    }
    public void setManagementState() {
        state = new Management();
    }
    public void open() {
        state.open();
    }
    public void close() {
        state.close();
    }
    public void log() {
        state.log();
    }
    public void update() {
        state.update();
    }
}
