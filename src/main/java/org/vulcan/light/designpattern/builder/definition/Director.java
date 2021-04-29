package org.vulcan.light.designpattern.builder.definition;

/**
 * @author Sam Lu
 * @date 2021/4/29
 */
public class Director {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        builder.buildPart();
        System.out.println(((ConcreteBuilder) builder).getResult().getPart());
    }

}
