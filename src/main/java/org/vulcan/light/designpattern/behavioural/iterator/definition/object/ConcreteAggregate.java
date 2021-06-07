package org.vulcan.light.designpattern.behavioural.iterator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/7
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private T[] data;

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(data);
    }

    public void setData(T[] data) {
        this.data = data;
    }

}
