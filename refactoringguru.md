# 设计模式

| 模式名称 | 类别 | 意图 | 模式结构 | 示例 |
|----|----|----|----|----|
| 工厂方法模式 | 创建型模式 | 工厂方法模式是一种创建型设计模式，其在父类中提供一个创建对象的方法，允许子类决定实例化对象的类型。 | <img src="./resources/refactoringguru/creational/FactoryMethod.png"> | <img src="./resources/refactoringguru/creational/FactoryMethod_demo.png"> |
| 模板方法模式 | 行为型模式 | 模板方法模式是一种行为设计模式，它在超类中定义了一个算法的框架，允许子类在不修改结构的情况下重写算法的特定步骤。 | <img src="./resources/refactoringguru/behavioral/TemplateMethod.png"> | <img src="./resources/refactoringguru/behavioral/TemplateMethod_demo.png"> |

- 工厂方法模式是模板方法模式的一种特殊形式。同时，工厂方法可以作为一个大型模板方法中的一个步骤。

| 模式名称 | 类别 | 意图 | 模式结构 | 示例 |
|----|----|----|----|----|
| 抽象工厂模式 | 创建型模式 | 抽象工厂模式是一种创建型设计模式，它能创建一系列相关的对象，而无需指定其具体类。 | <img src="./resources/refactoringguru/creational/AbstractFactory.png"> | <img src="./resources/refactoringguru/creational/AbstractFactory_demo.png"> |
| 建造者模式 | 创建型模式 | 建造者模式是一种创建型设计模式，使你能够分步骤创建复杂对象。该模式允许你使用相同的创建代码生成不同类型和形式的对象。 | <img src="./resources/refactoringguru/creational/Builder.png"> | <img src="./resources/refactoringguru/creational/Builder_demo.png"> |
| 原型模式 | 创建型模式 | 原型模式是一种创建型设计模式，使你能够复制已有对象，而又无需使代码依赖它们所属的类。 | <img src="./resources/refactoringguru/creational/Prototype.png"><img src="./resources/refactoringguru/creational/Prototype_Registry.png"> | <img src="./resources/refactoringguru/creational/Prototype_demo.png"> |
| 单例模式 | 创建型模式 | 单例模式是一种创建型设计模式，让你能够保证一个类只有一个实例，并提供一个访问该实例的全局节点。 | <img src="./resources/refactoringguru/creational/Singleton.png"> | |

| 模式名称 | 类别 | 意图 | 模式结构 | 示例 |
|----|----|----|----|----|
| 装饰模式 | 结构型模式 | 装饰模式是一种结构型设计模式，允许你通过将对象放入包含行为的特殊封装对象中来为原对象绑定新的行为。 | <img src="./resources/refactoringguru/structural/Decorator.png"> | <img src="./resources/refactoringguru/structural/Decorator_demo.png"> |
| 代理模式 | 结构型模式 | 代理模式是一种结构型设计模式，让你能够提供对象的替代品或其占位符。代理控制着对于原对象的访问， 并允许在将请求提交给对象前后进行一些处理。 | <img src="./resources/refactoringguru/structural/Proxy.png"> | <img src="./resources/refactoringguru/structural/Proxy_demo.png"> |

- 装饰和代理有着相似的结构，但是其意图却非常不同。这两个模式的构建都基于组合原则，也就是说一个对象应该将部分工作委派给另一个对象。两者之间的不同之处在于代理通常自行管理其服务对象的生命周期，而装饰的生成则总是由客户端进行控制。

| 模式名称 | 类别 | 意图 | 模式结构 | 示例 |
|----|----|----|----|----|
| 适配器模式 | 结构型模式 | 适配器模式是一种结构型设计模式，它能使接口不兼容的对象能够相互合作。 | <img src="./resources/refactoringguru/structural/Adapter.png"><img src="./resources/refactoringguru/structural/Adapter_class.png"> | <img src="./resources/refactoringguru/structural/Adapter_demo.png"> |
| 桥接模式 | 结构型模式 | 桥接模式是一种结构型设计模式，可将一个大类或一系列紧密相关的类拆分为抽象和实现两个独立的层次结构，从而能在开发时分别使用。 | <img src="./resources/refactoringguru/structural/Bridge.png"> | <img src="./resources/refactoringguru/structural/Bridge_demo.png"> |

- 桥接模式通常会于开发前期进行设计，使你能够将程序的各个部分独立开来以便开发。另一方面，适配器模式通常在已有程序中使用， 让相互不兼容的类能很好地合作。

| 模式名称 | 类别 | 意图 | 模式结构 | 示例 |
|----|----|----|----|----|
| 外观模式 | 结构型模式 | 外观模式是一种结构型设计模式，能为程序库、框架或其他复杂类提供一个简单的接口。 | <img src="./resources/refactoringguru/structural/Facade.png"> | <img src="./resources/refactoringguru/structural/Facade_demo.png"> |
| 组合模式 | 结构型模式 | 组合模式是一种结构型设计模式，你可以使用它将对象组合成树状结构，并且能像使用独立对象一样使用它们。 | <img src="./resources/refactoringguru/structural/Composite.png"> | <img src="./resources/refactoringguru/structural/Composite_demo.png"> |
| 享元模式 | 结构型模式 | 享元模式是一种结构型设计模式，它摒弃了在每个对象中保存所有数据的方式，通过共享多个对象所共有的相同状态，让你能在有限的内存容量中载入更多对象。 | <img src="./resources/refactoringguru/structural/Flyweight.png"> | <img src="./resources/refactoringguru/structural/Flyweight_demo.png"> |