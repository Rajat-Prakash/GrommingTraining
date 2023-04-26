package org.example.CommandDesignPattern;

import org.example.CommandDesignPattern.ConcreteCommand.LightOffCommand;
import org.example.CommandDesignPattern.ConcreteCommand.LightOnCommand;
import org.example.CommandDesignPattern.Invoker.RemoteControl;
import org.example.CommandDesignPattern.Receiver.Light;

public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton(); // Light is on
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton(); // Light is off
    }
}
