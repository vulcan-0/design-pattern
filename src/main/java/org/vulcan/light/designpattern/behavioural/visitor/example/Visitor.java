package org.vulcan.light.designpattern.behavioural.visitor.example;

/**
 * @author Sam Lu
 * @date 2021/7/8
 */
public interface Visitor {

    /**
     * 访问点
     *
     * @param dot
     * @return
     */
    String visitDot(Dot dot);

    /**
     * 访问圆形
     *
     * @param circle
     * @return
     */
    String visitCircle(Circle circle);

    /**
     * 访问长方形
     *
     * @param rectangle
     * @return
     */
    String visitRectangle(Rectangle rectangle);

    /**
     * 访问组合图形
     *
     * @param compoundShape
     * @return
     */
    String visitCompoundGraphic(CompoundShape compoundShape);

}
