package org.vulcan.light.designpattern.behavioural.state.definition.object;

/**
 * @author Sam Lu
 * @date 2021/7/1
 */
public class Demo {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.request();
        context.setState(new ConcreteStateB());
        context.request();
    }

}
