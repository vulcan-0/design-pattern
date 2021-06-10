package org.vulcan.light.designpattern.creational.builder.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/10
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.construct(builder);
        System.out.println(((ConcreteBuilder) builder).getResult().getPart());
    }

}
