package org.vulcan.light.designpattern.behavioural.observer.example;

/**
 * 观察者模式示例代码
 *
 * @author Sam Lu
 * @date 2021/7/7
 * @see java.util.Observer
 * @see java.util.Observable
 * @see java.util.EventListener
 * @see javax.servlet.http.HttpSessionBindingListener
 * @see javax.servlet.http.HttpSessionAttributeListener
 * @see javax.faces.event.PhaseListener
 */
public class Demo {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
