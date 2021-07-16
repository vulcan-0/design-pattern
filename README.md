## 设计的坏味道

当软件出现下面任何一种气味时，就表明软件正在腐化。
- 僵化性（Rigidity）：很难对系统进行改动，因为每个改动都会迫使许多对系统其他部分的其他改动。
- 脆弱性（Fragility）：对系统的改动会导致系统中和改动的地方在概念上无关的许多地方出现问题。
- 牢固性（Immobility）：很难解开系统的纠结，使之成为一些可在其他系统中重用的组件。
- 粘滞性（Viscosity）：做正确的事情比做错误的事情要困难。
- 不必要的复杂性（Needless Complexity）：设计中包含有不具任何直接好处的基础结构。
- 不必要的重复性（Needless Repetition）：设计中包含有重复的结构，而该重复的结构本可以使用单一的抽象进行统一。
- 晦涩性（Opacity）：很难阅读、理解。没有很好地表现出意图。

敏捷开发人员如何保持尽可能好的设计？
1. 要遵循敏捷实践去发现问题；
2. 要应用设计原则去诊断问题；
3. 要应用适当的设计模式去解决问题。

## 设计原则

下面这些面向对象设计的原则，有助于开发人员消除设计中的坏味道，并为当前的特性集构建出最好的设计。

> SOLID + 迪米特法则

### 单一职责原则（SRP，The Single Responsibility Principle）

就一个类而言，应该仅有一个引起它变化的原因。

### 开放——封闭原则（OCP，The Open-Close Principle）

软件实体（类、模块、函数等等）应该是可以扩展、但是不可修改的。

其特征在于：
- "对于扩展是开放的"：这意味着模块的行为是可以扩展的。当应用的需求改变时，我们可以对模块进行扩展，使其具有满足那些改变的新行为。换句话来说，我们可以改变模块的功能。
- "对于更改是封闭的"：对模块行为进行扩展时，不必改动模块的源代码或者二进制代码。模块的二进制执行版本，无论是可链接的库、DLL或者Java的jar文件，都无需改动。

做好上面两点的关键是抽象。

### Liskov替换原则（LSP，The Liskov Substitution Principle）

子类型（subtype）必须能够替换掉它们的基类型（base type）。

### 依赖倒置原则（DIP，The Dependency Inversion Principle）

- 高层模块不应该依赖于低层模块。二者都应该依赖于抽象。
- 抽象不应该依赖于细节。细节应该依赖于抽象。

### 接口隔离原则（ISP，The Interface Segregation Principle）

不应该强迫客户依赖于它们不用的方法。

### 迪米特法则（LOD，Law Of Demeter，The Least Knowledge Principle）

一个软件实体应当尽可能少的与其他实体发生相互作用。

## 设计模式

设计模式是软件设计中常见问题的典型解决方案。每个模式就像一张蓝图，你可以通过对其进行定制来解决代码中的特定设计问题。

设计模式的描述通常会包括以下部分：
- `意图`：简单描述问题和解决方案。
- `动机`：通过特定情境，进一步解释问题并说明模式是如何提供解决方案的。
- `结构`：展示模式的每个部分和它们之间的关系。
- `实现`：提供流行编程语言的代码， 让读者更好地理解模式背后的思想。

### 设计模式的分类

<table>
    <tr>
        <th rowspan="2"></th>
        <th rowspan="2"></th>
        <th colspan="9">目的</th>
    </tr>
    <tr>
        <td>创建型</td>
        <td>结构型</td>
        <td>行为型</td>
    </tr>
    <tr>
        <td rowspan="2">范围</td>
        <td>类</td>
        <td>工厂方法（Factory Method）</td>
        <td>适配器（Adapter）</td>
        <td>
            解析器（Interpreter）<br>
            模板方法（Template Method）
        </td>
    </tr>
    <tr>
        <td>对象</td>
        <td>
            抽象工厂（Abstract Factory）<br>
            建造者（Builder）<br>
            原型（Prototype）<br>
            单例（Singleton）
        </td>
        <td>
            适配器（Adapter）<br>
            桥接（Bridge）<br>
            组合（Composite）<br>
            装饰（Decorator）<br>
            外观（Facade）<br>
            享元（Flyweight）<br>
            代理（Proxy）
        </td>
        <td>
            责任链（Chain Of Responsibility）<br>
            命令（Command）<br>
            迭代器（Iterator）<br>
            中介者（Mediator）<br>
            备忘录（Memento）<br>
            观察者（Observer）<br>
            状态（State）<br>
            策略（Strategy）<br>
            访问者（Visitor）
        </td>
    </tr>
</table>

#### 按目的分类

根据设计模式的目的，可以将其分为创建型、结构型和行为型三种。

##### 创建型模式

创建型模式与对象的创建有关。

- 工厂方法（Factory Method）
- 抽象工厂（Abstract Factory）
- 建造者（Builder）
- 原型（Prototype）
- 单例（Singleton）

##### 结构型模式

结构型模式处理类或对象的组合。

- 适配器（Adapter）
- 桥接（Bridge）
- 组合（Composite）
- 装饰（Decorator）
- 外观（Facade）
- 享元（Flyweight）
- 代理（Proxy）

##### 行为型模式

行为型模式对类或对象怎样交互和怎样分配职责进行描述。

- 责任链（Chain Of Responsibility）
- 命令（Command）
- 迭代器（Iterator）
- 解析器（Interpreter）
- 中介者（Mediator）
- 备忘录（Memento）
- 观察者（Observer）
- 状态（State）
- 策略（Strategy）
- 模板方法（Template Method）
- 访问者（Visitor）

#### 按范围分类

范围指定模式主要是用于类，还是用于对象。
类模式处理类和子类之间的关系，这些关系通过继承建立，是静态的，在编译时就已经确定下来了。
对象模式处理对象间的关系，这些关系在运行时是可以发生变化的，更具动态性。
实际上，几乎所有的模式都会使用继承机制，所以"类模式"特指那些集中于处理类之间的关系的模式，而大部分模式都属于对象模式的范畴。

## 参考资料
- 《设计模式：可复用面向对象软件的基础》 —— 机械工业出版社.典藏版
- 《敏捷软件开发：原则、模式与实践》 —— 清华大学出版社
- [refactoringguru.cn](https://refactoringguru.cn/design-patterns)