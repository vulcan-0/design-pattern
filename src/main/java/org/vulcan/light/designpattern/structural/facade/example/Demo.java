package org.vulcan.light.designpattern.structural.facade.example;

import java.io.File;

/**
 * @author Sam Lu
 * @date 2021/6/18
 */
public class Demo {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }

}
