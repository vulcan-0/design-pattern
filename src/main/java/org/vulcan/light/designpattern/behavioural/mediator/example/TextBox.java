package org.vulcan.light.designpattern.behavioural.mediator.example;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @author Sam Lu
 * @date 2021/7/5
 */
public class TextBox extends JTextArea implements Component {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }

}
