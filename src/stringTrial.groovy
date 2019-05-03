//定义变量
//def one = 1
//println "one";



////定义函数
//def two() {
//    println("\$one is $one")
//}
//two()


//字符串表达式
//println("${def a = 1; def b = 2; a + b}")


//def one = 1
//println("\$one is $one")



//使用单引号
//def a = 'aa$a/a\\(.)'
//println(a)


//使用双引号
//def a = 'aa$a/a\\(.)'
//println(a)



//使用三引号
//def k = "3k"
//def triangle = '''ad ${k}
//cd'''

//屏蔽尾部换行符
//def triangle = '''\
//\
//\
//aa\
//便便\
//cc\
//'''
//println(triangle)



//使用六引号
def k = "3k"
def triangle = """${k}
\
\
aa\
cc\
"""
println(triangle)


//使用定界符
//def fooPattern = /.*foo.*/
//assert fooPattern == '.*foo.*'

//def k = /a
//c d/
//println(k)



//使用$定界符（普通定界符无法转义$，使用双$来转义$）
//def c = 44
//def k = $/$$c is $c/$
//println(k)

