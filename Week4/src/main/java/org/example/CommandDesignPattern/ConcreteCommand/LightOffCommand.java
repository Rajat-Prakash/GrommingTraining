package org.example.CommandDesignPattern.ConcreteCommand;

import org.example.CommandDesignPattern.Command;
import org.example.CommandDesignPattern.Receiver.Light;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOff();
    }
}
