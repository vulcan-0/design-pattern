package org.vulcan.light.designpattern.structural.decorator.example;

/**
 * @author Sam Lu
 * @date 2021/6/17
 */
public class DataSourceDecorator implements DataSource {

    private DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }

}
