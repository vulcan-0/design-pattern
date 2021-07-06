package org.vulcan.light.designpattern.behavioural.memento.example;

import java.awt.*;

/**
 * 备忘录模式示例代码
 *
 * @author Sam Lu
 * @date 2021/7/6
 * @see java.io.Serializable 的实现都可以模拟备忘录。
 * @see javax.faces.component.StateHolder 的实现。
 */
public class Demo {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }

}
