package org.vulcan.light.designpattern.structural.flyweight.example;

import javax.swing.*;
import java.awt.*;

/**
 * 享元模式示例
 *
 * @author Sam Lu
 * @date 2021/6/21
 * @see java.lang.Byte#valueOf(byte)
 * @see java.lang.Short#valueOf(short)
 * @see java.lang.Integer#valueOf(int)
 * @see java.lang.Long#valueOf(long)
 * @see java.lang.Boolean#valueOf(boolean)
 * @see java.lang.Character#valueOf(char)
 * @see java.math.BigDecimal#valueOf(double)
 */
public class Demo {

    private static int CANVAS_SIZE = 500;
    private static int TREES_TO_DRAW = 1000000;
    private static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.paintTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.paintTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

}
