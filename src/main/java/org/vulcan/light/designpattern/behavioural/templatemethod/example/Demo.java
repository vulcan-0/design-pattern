package org.vulcan.light.designpattern.behavioural.templatemethod.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 模板方法模式示例代码
 *
 * @author Sam Lu
 * @date 2021/7/8
 * @see java.io.InputStream 所有非抽象方法
 * @see java.io.OutputStream 所有非抽象方法
 * @see java.io.Reader 所有非抽象方法
 * @see java.io.Writer 所有非抽象方法
 * @see java.util.AbstractList 所有非抽象方法
 * @see java.util.AbstractSet 所有非抽象方法
 * @see java.util.AbstractMap 所有非抽象方法
 * @see javax.servlet.http.HttpServlet 所有默认发送HTTP[405]错误响应的do­XXX()方法
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }

}
