package org.vulcan.light.designpattern.behavioural.mediator.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author Sam Lu
 * @date 2021/7/5
 */
public class DeleteButton extends JButton implements Component {

    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }

}
