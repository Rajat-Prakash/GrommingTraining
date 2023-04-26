package org.example.CommandDesignPattern.ConcreteCommand;

import org.example.CommandDesignPattern.Command;
import org.example.CommandDesignPattern.Receiver.Light;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOn();
    }
}
