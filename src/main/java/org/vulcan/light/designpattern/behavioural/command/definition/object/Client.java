package org.vulcan.light.designpattern.behavioural.command.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/27
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command command = new ConcreteCommand();
        invoker.invoke(command);
    }

}
