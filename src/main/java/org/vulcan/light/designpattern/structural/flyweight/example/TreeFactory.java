package org.vulcan.light.designpattern.structural.flyweight.example;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sam Lu
 * @date 2021/6/18
 */
public class TreeFactory {

    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }

}
