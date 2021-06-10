package org.vulcan.light.designpattern.creational.builder.definition.object;

/**
 * @author Sam Lu
 * @date 2021/4/29
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildPart();
    }

}
