package org.vulcan.light.designpattern.behavioural.mediator.example;

import javax.swing.*;

/**
 * @author Sam Lu
 * @date 2021/7/2
 */
public interface Mediator {

    /**
     * 添加新节点
     *
     * @param note
     */
    void addNewNote(Note note);

    /**
     * 移除节点
     */
    void deleteNote();

    /**
     * 从list中获取信息
     *
     * @param note
     */
    void getInfoFromList(Note note);

    /**
     * 保存变更
     */
    void saveChanges();

    /**
     * 标记节点
     */
    void markNote();

    /**
     * 清空
     */
    void clear();

    /**
     * 发送给过滤器
     *
     * @param listModel
     */
    void sendToFilter(ListModel listModel);

    /**
     * 设置元素列表
     *
     * @param listModel
     */
    void setElementsList(ListModel listModel);

    /**
     * 注册组件
     *
     * @param component
     */
    void registerComponent(Component component);

    /**
     * 隐藏元素
     *
     * @param flag
     */
    void hideElements(boolean flag);

    /**
     * 创建GUI
     */
    void createGUI();

}
