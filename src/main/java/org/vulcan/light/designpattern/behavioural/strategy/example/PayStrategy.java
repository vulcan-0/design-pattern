package org.vulcan.light.designpattern.behavioural.strategy.example;

/**
 * @author Sam Lu
 * @date 2021/7/7
 */
public interface PayStrategy {

    /**
     * 支付
     *
     * @param paymentAmount
     * @return
     */
    boolean pay(int paymentAmount);

    /**
     * 收集支付详情
     */
    void collectPaymentDetails();

}
