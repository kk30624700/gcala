package com.m24.learn.designpattern.behavioral.strategy.fp

class Sorter[T](strategy: SortStrategy.Type[T]) {
    def sort(dataset: List[T]) (implicit ord: Ordering[T]): List[T] = {
        strategy(dataset)
    }
}
