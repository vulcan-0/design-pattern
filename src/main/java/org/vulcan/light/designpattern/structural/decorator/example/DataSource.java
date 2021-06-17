package org.vulcan.light.designpattern.structural.decorator.example;

/**
 * @author Sam Lu
 * @date 2021/6/17
 */
public interface DataSource {

    /**
     * 写入数据
     *
     * @param data
     */
    void writeData(String data);

    /**
     * 读取数据
     *
     * @return
     */
    String readData();

}
