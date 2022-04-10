package com.m24.learn.designpattern.behavioral.strategy.oo

object Console extends App {
    val sorter = new Sorter(new QuickSortStrategy)
    val sortedList = sorter.sort(List(5, 4, 3, 2, 1))
    println(sortedList)
}
