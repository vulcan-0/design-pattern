package org.vulcan.light.designpattern.behavioural.memento.example;

import java.awt.*;

/**
 * @author Sam Lu
 * @date 2021/7/6
 */
public class ColorCommand implements Command {

    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }

}
