package org.vulcan.light.designpattern.structural.flyweight.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam Lu
 * @date 2021/6/18
 */
public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>();

    public void paintTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }

}
