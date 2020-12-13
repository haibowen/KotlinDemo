package com.example.mylayoutdemo

fun main() {
    var kotlinTest = KotlinTest()
    doKotlinTest(kotlinTest)
    doKotlinTestRun(kotlinTest)
    doKotlinTestWith(kotlinTest)
    doKotlinTestWithReturn(null)
    doKotlinTestRunList(kotlinTest)
    doKotlinTestRunMap(kotlinTest)

    "".test()
    doTest()
    testLambda()
}

class KotlinTest {
    var a: Int = 0;
    var b: Int = 0;
    fun add() = a + b
}

fun doKotlinTest(kotlinTest: KotlinTest) {
    kotlinTest.a = 2
    kotlinTest.b = 4
    println(
        kotlinTest.add()
    )
}

fun doKotlinTestRun(kotlinTest: KotlinTest) {

    var result = kotlinTest.run {
        a = 1
        b = 2
        add()
    }

    println(result)

}


fun doKotlinTestWith(kotlinTest: KotlinTest?) {
    var result = with(kotlinTest) {
        this?.a = 1
        this?.b = 9
        this?.add()
    }
    println(result)


}

fun doKotlinTestWithReturn(kotlinTest: KotlinTest?) {
    var result = with(kotlinTest) {
        if (this == null) return
        a = 1
        b = 2
        add()
    }
    println(result)
    println("hello world")


}

fun doKotlinTestRunReturn(kotlinTest: KotlinTest?) {
    var result = kotlinTest?.run {
        a = 2
        b = 4
        add()


    }
    println(result)
    println("hello world")


}

fun doKotlinTestRunList(kotlinTest: KotlinTest?) {
    val list = listOf<String>("ite", "apple", "mac", "show", "nokic")
    for (str in list) {
        str?.let {
            println(it)
        }
    }
}

fun doKotlinTestRunMap(kotlinTest: KotlinTest?) {
    var map = mapOf<String, String>("first" to "11", "second" to "22")
    for (sr in map) {
        sr.let {
            println(it.value)
        }
    }

}
//注意kotlin中的return

//kotlin列可以定义扩展函数


fun String.test() {

    println("这是自定义的扩展函数")
}

fun doTest() {
    var list = listOf<String>("apple", "banban", "banner", "watermollo")

    var demo = list.maxBy { it.length }
    println(demo)
}

fun testLambda() {
    var list = listOf<String>("apple", "banban", "banner", "watermollo")
    val lamda: (String) -> Int = { fruit: String ->
        fruit.length
    }
    var result: String? = list.maxBy(lamda)
    println(result)

}