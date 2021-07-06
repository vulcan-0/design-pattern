package org.vulcan.light.designpattern.behavioural.memento.example;

/**
 * @author Sam Lu
 * @date 2021/7/6
 */
public class Memento {

    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }

}
