abstract class Test {
    abstract void m1();
    abstract void m2();
    void m3(){}
}

abstract class Child extends Test {
    void m1(){}
    //void m2(){}
}