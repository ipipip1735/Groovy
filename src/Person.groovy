class Person {
    String name
    int age

    Person(String name, int age) {
        this.name = name
        this.age = age
    }
    def ck = {
        println name
    } //this引用Person

    class Inner{
        def iner = { this } //this引用内部类Inner
    }

    void showInner() {
        Inner inner = new Inner()
        println(inner.iner())
    }

    @Override
    String toString() {
        "age is $age, name is $name"
    }
}
