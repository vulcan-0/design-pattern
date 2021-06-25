package org.vulcan.light.designpattern.behavioural.iterator.example;

/**
 * @author Sam Lu
 * @date 2021/6/25
 */
public interface ProfileIterator {

    /**
     * 是否存在下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return
     */
    Profile getNext();

    /**
     * 重设游标
     */
    void reset();

}
