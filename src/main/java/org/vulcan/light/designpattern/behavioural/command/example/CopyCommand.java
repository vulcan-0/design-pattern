package org.vulcan.light.designpattern.behavioural.command.example;

/**
 * @author Sam Lu
 * @date 2021/6/24
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }

}
