package com.zhihuishu.design.结构型模式.代理模式;

/**
 * 二、适用性
 * 当要为一个复杂子系统提供一个简单接口时。子系统往往因为不断演化而变得越来越 复杂。大多
 * 数模式使用时都会产生更多更小的类。这使得子系统更具可重用性，也更容 易对子系统进行定
 * 制，但这也给那些不需要定制子系统的用户带来一些使用上的困难。 Facade可以提供一个简单的
 * 缺省视图，这一视图对大多数用户来说已经足够，而那些需 要更多的可定制性的用户可以越过
 * facade层。
 * 客户程序与抽象类的实现部分之间存在着很大的依赖性。引入facade将这个子系统与客 户以及其
 * 他的子系统分离，可以提高子系统的独立性和可移植性。
 * 当需要构建一个层次结构的子系统时，使用facade模式定义子系统中每层的入口点。 如果子系统
 * 之间是相互依赖的，你可以让它们仅通过facade进行通讯，从而简化了它们 之间的依赖关系。
 * 三、参与者
 * Facade 知道哪些子系统类负责处理请求。 将客户的请求代理给适当的子系统对象。
 * Subsystemclasses 实现子系统的功能。 处理由Facade对象指派的任务。 没有facade的任何相关
 * 信息；即没有指向facade的指针。
 */
public class Test {
    public static void main(String[] args) {
        Subject proxySubject = new ProxySubject();
        proxySubject.action();
    }
}
