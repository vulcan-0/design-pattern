package org.vulcan.light.designpattern.creational.builder.definition;

/**
 * @author Sam Lu
 * @date 2021/4/29
 */
public interface Builder {

    /**
     * 构建部件
     *
     * @return
     */
    Builder buildPart();

    /**
     * 获取产品
     *
     * @return
     */
    Product getResult();

}
