class Person {
    String name
    def ck = { this } //this引用Person

    class Inner{
        def iner = { this } //this引用内部类Inner
    }

    void showInner() {
        Inner inner = new Inner()
        println(inner.iner())
    }
}
