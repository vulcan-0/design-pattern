# 抽象工厂模式

## 意图

提供一个接口以创建一系列相关或相互依赖的对象，而无需指定他们具体的类。

## 动机

比较经典的例子是，一套用户图形界面工具包，会包含创建Window、ScrollBar等组件的功能。
不同的操作系统提供了不同的界面风格，如何让客户端只使用一套代码，创建出能在不同平台上运行的用户图形界面？抽象工厂模式能很好地解决这个问题。
如下面的类图，我们抽象出统一的工厂接口和产品接口，不同的操作系统可以实现不同的工厂类和产品类，而客户端则只需关注接口，无需关注实现。

![plantuml1](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://github.com/vulcan-0/design-pattern/blob/master/src/main/java/org/vulcan/light/designpattern/creational/abstractfactory/plantuml1.puml)

## 结构

## 实现