# 抽象工厂模式

## 意图

提供一个接口以创建一系列相关或相互依赖的对象，而无需指定他们具体的类。

## 动机

比较经典的例子是，一套用户图形界面工具包，会包含创建Window、ScrollBar等组件的功能。
不同的操作系统提供了不同的界面风格，如何让客户端只使用一套代码，创建出能在不同平台上运行的用户图形界面？抽象工厂模式能很好地解决这个问题。
如下面的类图，我们抽象出统一的工厂接口和产品接口，针对不同的操作系统可以实现不同的工厂类和产品类，而客户端则只需关注接口，无需关注实现。

![plantuml1](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/vulcan-0/design-pattern/master/src/main/java/org/vulcan/light/designpattern/creational/abstractfactory/plantuml1.puml)

**客户端如何获得具体的工厂对象？**

> 在Spring应用中，一般使用依赖注入的方式注入具体的对象。
> 我们可以使用配置或配置+反射的方式指定工厂对象，如此，客户端和具体的实现就彻底解耦了。

## 结构

由上面的例子可以导出抽象工厂模式的一般结构：

![plantuml2](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/vulcan-0/design-pattern/master/src/main/java/org/vulcan/light/designpattern/creational/abstractfactory/plantuml2.puml)

## 思考

**抽象工厂模式是如何符合SOLID原则和迪米特法则的？**

- 一般来讲，一个工厂类负责创建一类相关的产品，一个产品类封装一种产品的功能，这种将产品进行归类、封装的方法是符合单一职责原则的。
- 抽象工厂模式对增加产品簇是开放的，对增加产品类型却是封闭的。这里的开放封闭是相对的，如果需要扩展的是产品簇，则符合开闭原则；
如果需要扩展的是产品类型，则不符合开闭原则，当然可以通过一定的调整让其能够方便扩展产品类型（下文继续讨论）。
- 不涉及里式替换原则。
- 不同的产品接口是相互隔离的，符合接口隔离原则。
- 符合依赖倒置原则，如果不对产品进行抽象，工厂类将依赖于具体的产品类。抽象工厂模式对产品进行了接口的抽象，高层类（工厂类）不依赖于低层类（产品类），它们共同依赖于接口。
- 不涉及迪米特法则。

上面提到的是相对而言的，符不符合SOLID原则和迪米特法则，跟具体的编码密切相关，使用了任何模式的代码都会因为编码的不当而让具体的代码不符合面向对象设计的基本原则。

## 优缺点

**优点**

- 分离了具体的类：客户端只操作接口，与具体的实现解耦。
- 使得产品系列易于交换：通过简单配置，即可调整不同的产品系列。
- 有利于产品的一致性：很容易能够保证一个应用一次只使用一个系列的产品，从而保证产品的一致性。

**缺点**

- 难以支持新种类的产品。

## 相关模式

- 一般会将工厂类实现为单例。
- 使用工厂方法模式：AbstractFactory仅声明一个接口，创建产品由具体的产品类实现。

```java
public interface AbstractProduct {
}
public interface AbstractFactory {
    AbstractProduct createProduct();
}
public class ConcreteProductA implements AbstractProduct, AbstractFactory {
    @Override 
    public AbstractProduct createProduct() {
        return new ConcreteProductA();
    }
}
```

- 使用原型模式：

## Java中的抽象工厂