package org.vulcan.light.designpattern.behavioural.mediator.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author Sam Lu
 * @date 2021/7/5
 */
public class AddButton extends JButton implements Component {

    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }

}
