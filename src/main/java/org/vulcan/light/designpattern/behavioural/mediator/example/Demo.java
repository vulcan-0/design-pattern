package org.vulcan.light.designpattern.behavioural.mediator.example;

import javax.swing.*;

/**
 * 中介者模式示例代码
 *
 * @author Sam Lu
 * @date 2021/7/5
 * @see java.util.Timer（所有schedule­XXX()方法）
 * @see java.util.concurrent.Executor#execute(Runnable)
 * @see java.util.concurrent.ExecutorService（invoke­XXX()和submit­()方法）
 * @see java.util.concurrent.ScheduledExecutorService（所有schedule­XXX()方法）
 * @see java.lang.reflect.Method#invoke(Object, Object...)
 */
public class Demo {

    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }

}
