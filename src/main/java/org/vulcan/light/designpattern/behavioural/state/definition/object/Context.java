package org.vulcan.light.designpattern.behavioural.state.definition.object;

/**
 * @author Sam Lu
 * @date 2021/7/1
 */
public class Context {

    private State state;

    public void request() {
        state.handle();
    }

    public void setState(State state) {
        this.state = state;
    }

}
