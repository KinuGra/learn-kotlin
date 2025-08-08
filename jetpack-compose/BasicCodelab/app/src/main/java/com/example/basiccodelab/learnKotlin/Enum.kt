package com.example.basiccodelab.learnKotlin

enum class eColor(val id: Int, val jpName: String) {
    RED(10, "赤"),
    BLUE(200, "青"),
    WHITE(300, "白")
}

fun main() {
    println("${eColor.RED.id}, ${eColor.WHITE.jpName}")
    println(eColor.values().joinToString())
    println(eColor.entries.joinToString())
    println(eColor.entries)
}
