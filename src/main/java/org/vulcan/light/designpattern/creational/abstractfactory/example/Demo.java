package org.vulcan.light.designpattern.creational.abstractfactory.example;

/**
 * 抽象工厂模式示例
 *
 * @author Sam Lu
 * @date 2021/6/8
 * @see javax.xml.parsers.DocumentBuilderFactory#newInstance()
 * @see javax.xml.transform.TransformerFactory#newInstance()
 * @see javax.xml.xpath.XPathFactory#newInstance()
 */
public class Demo {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSGUIFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsGUIFactory();
            app = new Application(factory);
        }
        return app;
    }

}
