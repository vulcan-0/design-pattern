package org.vulcan.light.designpattern.structural.bridge.example;

/**
 * @author Sam Lu
 * @date 2021/6/11
 */
public class Demo {

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Test with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.channelUp();
        basicRemote.volumeUp();
        basicRemote.volumeUp();
        basicRemote.volumeDown();
        device.printStatus();

        System.out.println("Test with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.mute();
        advancedRemote.power();
        device.printStatus();
    }

}
