package org.vulcan.light.designpattern.behavioural.iterator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/7
 */
public class Client {

    public static void main(String[] args) {
        String[] arr = new String[]{"1", "2", "3"};
        Aggregate<String> aggregate = new ConcreteAggregate();
        ((ConcreteAggregate<String>) aggregate).setData(arr);

        Iterator<String> iterator = aggregate.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
        System.out.println("============");
        iterator.first();
        for (; !iterator.isDone(); iterator.next()) {
            System.out.println(iterator.currentItem());
        }
    }

}
