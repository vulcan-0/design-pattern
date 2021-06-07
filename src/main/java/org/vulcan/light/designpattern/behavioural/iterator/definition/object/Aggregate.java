package org.vulcan.light.designpattern.behavioural.iterator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/7
 */
public interface Aggregate<T> {

    /**
     * 创建迭代器
     *
     * @return
     */
    Iterator<T> createIterator();

}
