package org.vulcan.light.designpattern.behavioural.command.example;

/**
 * @author Sam Lu
 * @date 2021/6/23
 */
public abstract class Command {

    protected Editor editor;
    protected String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    /**
     * 执行命令
     *
     * @return
     */
    public abstract boolean execute();

}
