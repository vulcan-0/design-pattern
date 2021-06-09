package org.vulcan.light.designpattern.creational.factorymethod.example;

/**
 * 工厂方法模式示例
 *
 * @author Sam Lu
 * @date 2021/6/9
 * @see java.util.Calendar#getInstance()
 * @see java.util.ResourceBundle#getBundle(String)
 * @see java.text.NumberFormat#getInstance()
 * @see java.nio.charset.Charset#forName(String)
 * @see java.net.URLStreamHandlerFactory#createURLStreamHandler(String)
 * @see java.util.EnumSet#of(Enum)
 * @see javax.xml.bind.JAXBContext#createMarshaller()
 */
public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (!System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
