package _grammar._08sealed;

/**
 * ClassName: Person
 * Description:
 通过密封的类和接口来限制超类的使用，密封的类和接口限制其它可能继承或实现它们的其它类或接口。
 具体使用：
 - 使用修饰符`sealed`，可以将一个类声明为密封类。密封的类使用保留关键字`permits`列出可以直接扩展（即extends）它的类。
 - `sealed` 修饰的类的机制具有传递性，它的子类必须使用指定的关键字进行修饰，且只能是 `final`、`sealed`、`non-sealed` 三者之一。
 */
//Person是一个密封类，可以被指定的子类所继承。非指定的类不能继承Person类
public sealed class Person permits Student,Teacher,Worker{
}

//要求指定的子类必须是final、sealed、non-sealed三者之一
final class Student extends Person{} //Student类不能被继承了。

sealed class Teacher extends Person permits SeniorTeacher{} //Teacher类只能被指定的子类继承

non-sealed class SeniorTeacher extends Teacher{
}

non-sealed class Worker extends Person{}  //Worker类在继承时，没有任何限制

class WatchWorker extends Worker{}

//class Farmer extends Person{}
