package org.vulcan.light.designpattern.structural.composite.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/18
 */
public interface Component {

    /**
     * 操作
     */
    void operation();

    /**
     * 添加子组件
     *
     * @param component
     */
    void add(Component component);

    /**
     * 移除子组件
     *
     * @param component
     */
    void remove(Component component);

    /**
     * 获取子组件
     *
     * @param index
     * @return
     */
    Component getChild(int index);

}
