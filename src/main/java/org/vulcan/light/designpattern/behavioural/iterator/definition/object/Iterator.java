package org.vulcan.light.designpattern.behavioural.iterator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/7
 */
public interface Iterator<T> {

    /**
     * 第一个元素
     *
     * @return
     */
    T first();

    /**
     * 下一个元素
     *
     * @return
     */
    T next();

    /**
     * 遍历完成
     *
     * @return
     */
    boolean isDone();

    /**
     * 当前元素
     *
     * @return
     */
    T currentItem();

}
