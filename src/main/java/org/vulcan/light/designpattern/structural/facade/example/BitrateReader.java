package org.vulcan.light.designpattern.structural.facade.example;

/**
 * @author Sam Lu
 * @date 2021/6/18
 */
public class BitrateReader {

    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file..., codec: "
                + codec.getClass().getSimpleName());
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file..., codec: "
                + codec.getClass().getSimpleName());
        return buffer;
    }

}
