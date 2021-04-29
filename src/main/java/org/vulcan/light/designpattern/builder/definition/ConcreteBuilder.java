package org.vulcan.light.designpattern.builder.definition;

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

    @Override
    public Product getResult() {
        return product;
    }

}
