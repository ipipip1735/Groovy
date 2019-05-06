/**
 * 参数可以有默认值
 */
//def cl = { int a, String b = "bbb", boolean c ->
//    println(a)
//    println(b)
//    println(c)
//}
//cl(12, "aaa", false)
//cl(12, false)








/**
 * 函数可以省略小括号
 */
//def fn(int age, Closure cl) {
//    cl(age)
//}
//
////方式一
//def closure = { println("age is $it") }
//fn(12, closure) //使用小括号
//fn 12, closure //省略小括号
//
////方式二：闭包外置
//fn(12) { println("age is $it") } //使用小括号
//fn 12, {println("age is $it")}  //省略小括号







/**
 * with方法
 */

Person person = ["kkkk", 11] as Person
println(person)

Person p = person.with(true) {
    age = 55
    name = 'bob'
}
println(person)
