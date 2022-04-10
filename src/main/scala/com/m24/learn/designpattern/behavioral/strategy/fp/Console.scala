package com.m24.learn.designpattern.behavioral.strategy.fp

object Console extends App {
    val list = List(5, 4, 3, 2, 1);
    list.sorted

    val sorter = new Sorter(SortStrategy.bubbleSortStrategy[Int])
    val sortedList = sorter.sort(list)
    println(sortedList)
}
