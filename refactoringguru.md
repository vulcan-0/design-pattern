# 设计模式

| 模式名称 | 类别 | 意图 | 模式结构 | 示例 |
|----|----|----|----|----|
| 工厂方法模式 | 创建型模式 | 工厂方法模式是一种创建型设计模式，其在父类中提供一个创建对象的方法，允许子类决定实例化对象的类型。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/creational/FactoryMethod.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/creational/FactoryMethod_demo.png"> |
| 模板方法模式 | 行为型模式 | 模板方法模式是一种行为设计模式，它在超类中定义了一个算法的框架，允许子类在不修改结构的情况下重写算法的特定步骤。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/TemplateMethod.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/TemplateMethod_demo.png"> |

- 工厂方法模式是模板方法模式的一种特殊形式。同时，工厂方法可以作为一个大型模板方法中的一个步骤。

| 模式名称 | 类别 | 意图 | 模式结构 | 示例 |
|----|----|----|----|----|
| 抽象工厂模式 | 创建型模式 | 抽象工厂模式是一种创建型设计模式，它能创建一系列相关的对象，而无需指定其具体类。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/creational/AbstractFactory.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/creational/AbstractFactory_demo.png"> |
| 建造者模式 | 创建型模式 | 建造者模式是一种创建型设计模式，使你能够分步骤创建复杂对象。该模式允许你使用相同的创建代码生成不同类型和形式的对象。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/creational/Builder.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/creational/Builder_demo.png"> |
| 原型模式 | 创建型模式 | 原型模式是一种创建型设计模式，使你能够复制已有对象，而又无需使代码依赖它们所属的类。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/creational/Prototype.png"><img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/creational/Prototype_Registry.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/creational/Prototype_demo.png"> |
| 单例模式 | 创建型模式 | 单例模式是一种创建型设计模式，让你能够保证一个类只有一个实例，并提供一个访问该实例的全局节点。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/creational/Singleton.png"> | |


| 模式名称 | 类别 | 意图 | 模式结构 | 示例 |
|----|----|----|----|----|
| 装饰模式 | 结构型模式 | 装饰模式是一种结构型设计模式，允许你通过将对象放入包含行为的特殊封装对象中来为原对象绑定新的行为。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Decorator.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Decorator_demo.png"> |
| 代理模式 | 结构型模式 | 代理模式是一种结构型设计模式，让你能够提供对象的替代品或其占位符。代理控制着对于原对象的访问， 并允许在将请求提交给对象前后进行一些处理。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Proxy.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Proxy_demo.png"> |
| 适配器模式 | 结构型模式 | 适配器模式是一种结构型设计模式，它能使接口不兼容的对象能够相互合作。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Adapter.png"><img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Adapter_class.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Adapter_demo.png"> |
| 桥接模式 | 结构型模式 | 桥接模式是一种结构型设计模式，可将一个大类或一系列紧密相关的类拆分为抽象和实现两个独立的层次结构，从而能在开发时分别使用。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Bridge.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Bridge_demo.png"> |

- 装饰和代理有着相似的结构，但是其意图却非常不同。这两个模式的构建都基于组合原则，也就是说一个对象应该将部分工作委派给另一个对象。两者之间的不同之处在于代理通常自行管理其服务对象的生命周期，而装饰的生成则总是由客户端进行控制。
- 适配器能为被封装对象提供不同的接口， 代理模式能为对象提供相同的接口， 装饰则能为对象提供加强的接口。
- 桥接模式通常会于开发前期进行设计，使你能够将程序的各个部分独立开来以便开发。另一方面，适配器模式通常在已有程序中使用， 让相互不兼容的类能很好地合作。

| 模式名称 | 类别 | 意图 | 模式结构 | 示例 |
|----|----|----|----|----|
| 外观模式 | 结构型模式 | 外观模式是一种结构型设计模式，能为程序库、框架或其他复杂类提供一个简单的接口。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Facade.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Facade_demo.png"> |
| 组合模式 | 结构型模式 | 组合模式是一种结构型设计模式，你可以使用它将对象组合成树状结构，并且能像使用独立对象一样使用它们。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Composite.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Composite_demo.png"> |
| 享元模式 | 结构型模式 | 享元模式是一种结构型设计模式，它摒弃了在每个对象中保存所有数据的方式，通过共享多个对象所共有的相同状态，让你能在有限的内存容量中载入更多对象。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Flyweight.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/structural/Flyweight_demo.png"> |


| 模式名称 | 类别 | 意图 | 模式结构 | 示例 |
|----|----|----|----|----|
| 状态模式 | 行为型模式 | 状态模式是一种行为设计模式，让你能在一个对象的内部状态变化时改变其行为，使其看上去就像改变了自身所属的类一样。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/State.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/State_demo.png"> |
| 策略模式 | 行为型模式 | 策略模式是一种行为设计模式，它能让你定义一系列算法，并将每种算法分别放入独立的类中以使算法的对象能够相互替换。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Strategy.png"> | |
| 命令模式 | 行为型模式 | 命令模式是一种行为设计模式，它可将请求转换为一个包含与请求相关的所有信息的独立对象。该转换让你能根据不同的请求将方法参数化、延迟请求执行或将其放入队列中，且能实现可撤销操作。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Command.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Command_demo.png"> |
| 备忘录模式 | 行为型模式 | 备忘录模式是一种行为设计模式，允许在不暴露对象实现细节的情况下保存和恢复对象之前的状态。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Memento.png"><img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Memento2.png"><img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Memento3.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Memento_demo.png"> |


| 模式名称 | 类别 | 意图 | 模式结构 | 示例 |
|----|----|----|----|----|
| 迭代器模式 | 行为型模式 | 迭代器模式是一种行为设计模式，让你能在不暴露集合底层表现形式（列表、栈和树等）的情况下遍历集合中所有的元素。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Iterator.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Iterator_demo.png"> |
| 责任链模式 | 行为型模式 | 责任链模式是一种行为设计模式，允许你将请求沿着处理者链进行发送。收到请求后，每个处理者均可对请求进行处理，或将其传递给链上的下个处理者。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/ChainOfResponsibility.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/ChainOfResponsibility_demo.png"> |
| 中介者模式 | 行为型模式 | 中介者模式是一种行为设计模式，能让你减少对象之间混乱无序的依赖关系。该模式会限制对象之间的直接交互，迫使它们通过一个中介者对象进行合作。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Mediator.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Mediator_demo.png"> |
| 观察者模式 | 行为型模式 | 观察者模式是一种行为设计模式，允许你定义一种订阅机制，可在对象事件发生时通知多个“观察”该对象的其他对象。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Observer.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Observer_demo.png"> |
| 访问者模式 | 行为型模式 | 访问者模式是一种行为设计模式，它能将算法与其所作用的对象隔离开来。 | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Visitor.png"> | <img src="https://github.com/vulcan-0/design-pattern/blob/master/resources/refactoringguru/behavioral/Visitor_demo.png"> |

## 参考资料
- [Refactoring.Guru](https://refactoringguru.cn/design-patterns/java)