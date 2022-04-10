package com.m24.learn.designpattern.behavioral.strategy.oo

trait SortStrategy {
    def sort[T](dateset: List[T])(implicit ord: Ordering[T]): List[T]
}

class BubbleSortStrategy extends SortStrategy {
    override def sort[T](dataset: List[T])(implicit ord: Ordering[T]): List[T] = {
        println("sorting using bubble sort")
        dataset.sorted
    }
}

class QuickSortStrategy extends SortStrategy {
    override def sort[T](dataset: List[T])(implicit ord: Ordering[T]): List[T] = {
        println("sort with quick")
        dataset.sorted
    }
}
