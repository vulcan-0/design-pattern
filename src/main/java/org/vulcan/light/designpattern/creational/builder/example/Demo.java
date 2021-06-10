package org.vulcan.light.designpattern.creational.builder.example;

import java.awt.*;

/**
 * 建造者模式示例
 *
 * @author Sam Lu
 * @date 2021/6/10
 * @see java.lang.StringBuilder#append(String) （非同步）
 * @see java.lang.StringBuffer#append(String) （同步）
 * @see java.nio.ByteBuffer#put(byte) （还有Char­Buffer、Short­Buffer、Int­Buffer、Long­Buffer、Float­Buffer和Double­Buffer）
 * @see javax.swing.GroupLayout.Group#addComponent(Component)
 * @see java.lang.Appendable
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
