package org.vulcan.light.designpattern.behavioural.iterator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/7
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private int index;
    private T[] data;

    public ConcreteIterator(T[] data) {
        this.data = data;
    }

    @Override
    public T first() {
        if (data != null) {
            index = 0;
            return data[index];
        }
        return null;
    }

    @Override
    public T next() {
        if (data != null && index < data.length) {
            return data[index++];
        }
        return null;
    }

    @Override
    public boolean isDone() {
        if (data != null) {
            return index == data.length;
        }
        return true;
    }

    @Override
    public T currentItem() {
        return data[index];
    }

}
