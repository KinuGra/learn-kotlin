package com.example.basiccodelab

var hoge: Int = 100

// クラスの定義
class Test() {
    var name: String = ""
    fun total(japanese: Int, math: Int) {
        println("total method: " + (japanese + math))
    }
}

class Person(val name: String, var age: Int)

// 親クラス
open class Animal { // openで継承を許可
    open fun sound1() {
        println("Animal sound1")
    }
    open fun sound2() {
        println("Animal sound2")
    }
}
// Animalクラスを継承した子クラス
class Dog: Animal() {
    override fun sound2() { // 親クラスのメソッドをオーバーライド
        println("Hello")
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

    // インスタンス生成
    val person = Person("Alice", 20)
    println(person.name + person.age)
    val dog = Dog()
    dog.sound1()
    dog.sound2()
}

// 関数
fun add(a: Int, b: Int = 5): Int {
    return a + b
}