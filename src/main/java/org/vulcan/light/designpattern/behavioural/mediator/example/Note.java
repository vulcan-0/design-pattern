package org.vulcan.light.designpattern.behavioural.mediator.example;

/**
 * @author Sam Lu
 * @date 2021/7/2
 */
public class Note {

    private String name;
    private String text;

    public Note() {
        name = "New note";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return name;
    }

}
