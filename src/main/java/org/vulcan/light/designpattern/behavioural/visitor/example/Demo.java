package org.vulcan.light.designpattern.behavioural.visitor.example;

/**
 * 访问者模式示例代码
 *
 * @author Sam Lu
 * @date 2021/7/8
 * @see javax.lang.model.element.AnnotationValue 和 AnnotationValueVisitor
 * @see javax.lang.model.element.Element 和 ElementVisitor
 * @see javax.lang.model.type.TypeMirror 和 TypeVisitor
 * @see java.nio.file.FileVisitor 和 SimpleFileVisitor
 * @see javax.faces.component.visit.VisitContext 和 VisitCallback
 */
public class Demo {

    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }

}
