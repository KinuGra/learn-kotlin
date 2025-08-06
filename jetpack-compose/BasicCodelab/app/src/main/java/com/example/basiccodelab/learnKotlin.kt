package com.example.basiccodelab

var hoge: Int = 100

// クラスの定義
class Test() {
    var name: String = ""
    fun total(japanese: Int, math: Int) {
        println("total method: " + (japanese + math))
    }
}

fun main() {
    // 標準出力
    println(hoge)
    println("Hello, world")
    println(add(3))

    // 変数
    var variable_a = 10
    val value = 10 // val cannot be reassigned
    println(variable_a)

    // 配列
    var names: List<String> = listOf("Yamada", "Suzuki", "Tanaka")
    for (i in names) println(i)
    val numbers: Array<Any> = arrayOf(3.14, 10.2, 5, 4.111111111)
    for (i in 0..numbers.size-1) println(numbers[i])
    names += "Nishikawa"
    println(names)

    // if, for
    for (i in 10 downTo 0 step 2) {
        if(i == 6 && true) println("i == 6 && true")
        else {
            println(i)
        }
    }

    // class
    var a1 = Test()
    a1.name = "Mary"
    a1.total(30, 20)
    val a2 = Test()
    a2.name = "Taro"
    println("a1: ${a1.name}, a2: ${a2.name}")
}

// 関数
fun add(a: Int, b: Int = 5): Int {
    return a + b
}