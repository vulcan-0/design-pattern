package org.vulcan.light.designpattern.structural.decorator.example;

import java.util.Collection;

/**
 * 装饰器模式示例
 *
 * @author Sam Lu
 * @date 2021/6/17
 * @see java.io.InputStream
 * @see java.io.OutputStream
 * @see java.io.Reader
 * @see java.io.Writer
 * @see java.util.Collections#checkedCollection(Collection, Class)
 * @see java.util.Collections#synchronizedCollection(Collection)
 * @see java.util.Collections#unmodifiableCollection(Collection)
 * @see javax.servlet.http.HttpServletRequestWrapper
 * @see javax.servlet.http.HttpServletResponseWrapper
 */
public class Demo {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }

}
