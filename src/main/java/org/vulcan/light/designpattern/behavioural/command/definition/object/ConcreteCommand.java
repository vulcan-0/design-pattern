package org.vulcan.light.designpattern.behavioural.command.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/27
 */
public class ConcreteCommand implements Command {

    private Receiver receiver = new Receiver();

    @Override
    public void execute() {
        System.out.println("Execute ConcreteCommand.");
        receiver.action();
    }

}
