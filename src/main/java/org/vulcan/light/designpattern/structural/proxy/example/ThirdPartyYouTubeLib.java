package org.vulcan.light.designpattern.structural.proxy.example;

import java.util.HashMap;

/**
 * @author Sam Lu
 * @date 2021/6/22
 */
public interface ThirdPartyYouTubeLib {

    /**
     * 最受欢迎的视频
     *
     * @return
     */
    HashMap<String, Video> popularVideos();

    /**
     * 获取视频
     *
     * @param videoId
     * @return
     */
    Video getVideo(String videoId);

}
