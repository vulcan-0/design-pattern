package org.vulcan.light.designpattern.behavioural.state.example;

/**
 * 状态模式示例代码
 *
 * @author Sam Lu
 * @date 2021/7/7
 * @see javax.faces.lifecycle.LifeCycle#execute()
 */
public class Demo {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }

}
