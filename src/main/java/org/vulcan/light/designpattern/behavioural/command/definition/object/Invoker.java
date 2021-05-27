package org.vulcan.light.designpattern.behavioural.command.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/27
 */
public class Invoker {

    public void invoke(Command command) {
        command.execute();
    }

}
