package org.vulcan.light.designpattern.structural.facade.example;

import java.io.File;

/**
 * @author Sam Lu
 * @date 2021/6/18
 */
public class AudioMixer {

    public File fix(VideoFile result) {
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }

}
