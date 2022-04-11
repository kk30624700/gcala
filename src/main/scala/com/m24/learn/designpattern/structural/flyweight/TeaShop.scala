package com.m24.learn.designpattern.structural.flyweight

import scala.collection.mutable

class TeaShop {
    private val orders = mutable.LinkedHashMap[Int, Tea]()

    private val maker = new TeaMaker()

    def takeOrder(table: Int, teaType: Tea.Type): Unit = {
        orders.put(table, maker.make(teaType))
    }

    def serve(): Unit = {
        orders.foreach {
            case (table, tea) => tea.serve(table)
        }
    }
}
