package com.example.mylayoutdemo

import android.content.ContentProviderOperation

fun main() {

    println("hello")

    var list: List<String> = listOf("appleshow", "pear", "bannashowshossho")
    var sr = list.findMax {
        it.length
    }
    println(sr)
    var button = Button()
    button.setOnclickListener {

    }

    //函数类型
    var s: Int
    var b: String
    var d: Button
    var e: (String, Int) -> String
    var f: (Int, String) -> Int


    var num1 = 10
    var num2 = 30
    var sout1 = num1AndNum2N(num1, num2, ::plus)
    var sout2 = num1AndNum2N(num1, num2, ::delete)
    println(sout1)
    println(sout2)

    var sout3: Int = num1AndNum2N(num1, num2, fun(num1: Int, num2: Int): Int {
        return num1 + num2
    })

    var result = num1AndNum2N(num1, num2) { a, b ->
        a + b
    }
    println(result.toString() + "这是测试")


}

fun num1AndNum2N(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {

    return operation(num1, num2)

}

fun plus(num1: Int, num2: Int): Int {
    return num1 + num2

}

fun delete(num1: Int, num2: Int): Int {

    return num1 - num2
}


fun <T, R : Comparable<R>> List<T>.findMax(block: (T) -> R): T? {
    if (isEmpty()) return null
    var maxElement: T = get(0)
    var maxValue: R = block(maxElement)
    for (element: T in this) {
        var value: R = block(element)
        if (value > maxValue) {
            maxElement = element
            maxValue = value
        }
    }
    return maxElement

}
