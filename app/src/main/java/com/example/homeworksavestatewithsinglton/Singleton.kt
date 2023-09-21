package com.example.homeworksavestatewithsinglton

object NumberHolder {
    var numberOfClicks:Int = 0

    fun addNumber() {
        numberOfClicks += 1
    }
}
