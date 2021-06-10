package org.vulcan.light.designpattern.creational.builder.definition.object;

/**
 * @author Sam Lu
 * @date 2021/4/29
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public Builder buildPart() {
        product.setPart("Built Part");
        return this;
    }

    public Product getResult() {
        return product;
    }

}
