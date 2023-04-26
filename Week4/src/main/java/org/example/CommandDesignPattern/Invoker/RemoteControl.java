package org.example.CommandDesignPattern.Invoker;

import org.example.CommandDesignPattern.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
