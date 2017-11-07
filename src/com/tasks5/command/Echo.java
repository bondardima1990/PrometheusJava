package com.tasks5.command;

public class Echo implements Command {

    String string;

    public Echo(String string) {
        this.string = string;
    }

    @Override
    public void execute() {
        System.out.println(string);
    }
}