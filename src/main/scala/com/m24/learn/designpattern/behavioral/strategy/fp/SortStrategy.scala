package com.m24.learn.designpattern.behavioral.strategy.fp

object SortStrategy{
    type Type[U] = List[U] => List[U]

    def bubbleSortStrategy[U](dataset: List[U]) (implicit ord: Ordering[U]): List[U] ={
        println("sort in bubble")
        dataset.sorted
    }

    def quickSortStrategy[U](dataset: List[U]) (implicit ord: Ordering[U]): List[U] = {
        println("sorting using quick sort")
        dataset.sorted
    }

}
