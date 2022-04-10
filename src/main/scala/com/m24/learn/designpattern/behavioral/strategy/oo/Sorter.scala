package com.m24.learn.designpattern.behavioral.strategy.oo

class Sorter(strategy: SortStrategy) {
    def sort[T](dataset: List[T])(implicit  ord: Ordering[T]): List[T] = {
        strategy.sort(dataset)
    }
}
