package org.vulcan.light.designpattern.behavioural.iterator.example;

/**
 * @author Sam Lu
 * @date 2021/6/25
 */
public interface SocialNetwork {

    /**
     * 创建Friends迭代器
     *
     * @param profileEmail
     * @return
     */
    ProfileIterator createFriendsIterator(String profileEmail);

    /**
     * 创建Coworker迭代器
     *
     * @param profileEmail
     * @return
     */
    ProfileIterator createCoworkersIterator(String profileEmail);

}
