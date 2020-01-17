package com.app.rxjavaoperations

fun main() {
    println("Addition :: " + execute(Operation.Add(1,3)))
    println("Substract :: " + execute(Operation.Substract(1,3)))
    println("Multiply :: " + execute(Operation.Multiply(1,3)))
    println("Divide :: " + execute(Operation.Divide(1,3)))

}

fun execute(operation: Operation): Int {
    return when (operation) {
        is Operation.Add -> {
            operation.x + operation.y
        }
        is Operation.Substract -> {
            operation.x - operation.y
        }
        is Operation.Multiply -> {
            operation.x * operation.y
        }
        is Operation.Divide -> {
            operation.x / operation.y
        }
    }
}