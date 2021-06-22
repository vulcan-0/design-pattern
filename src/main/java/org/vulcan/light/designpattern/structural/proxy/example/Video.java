package org.vulcan.light.designpattern.structural.proxy.example;

/**
 * @author Sam Lu
 * @date 2021/6/22
 */
public class Video {

    String id;
    String title;
    String data;

    public Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }

}
