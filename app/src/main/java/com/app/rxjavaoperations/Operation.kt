package com.app.rxjavaoperations

sealed class Operation {
    class Add(val x: Int, val y: Int) : Operation()
    class Substract(val x: Int, val y: Int) : Operation()
    class Multiply(val x: Int, val y: Int) : Operation()
    class Divide(val x: Int, val y: Int) : Operation()
}