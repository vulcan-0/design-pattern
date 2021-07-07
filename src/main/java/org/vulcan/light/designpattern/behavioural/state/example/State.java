package org.vulcan.light.designpattern.behavioural.state.example;

/**
 * @author Sam Lu
 * @date 2021/7/7
 */
public abstract class State {

    Player player;

    /**
     * Context passes itself through the state constructor. This may help a
     * state to fetch some useful context data if needed.
     */
    State(Player player) {
        this.player = player;
    }

    /**
     * 关闭
     *
     * @return
     */
    public abstract String onLock();

    /**
     * 播放
     *
     * @return
     */
    public abstract String onPlay();

    /**
     * 下一首
     *
     * @return
     */
    public abstract String onNext();

    /**
     * 上一首
     *
     * @return
     */
    public abstract String onPrevious();

}
