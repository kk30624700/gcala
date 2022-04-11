package com.m24.learn.designpattern.structural.flyweight

import scala.collection.mutable

class TeaMaker {
    val teaPool = mutable.Map[Tea.Type, Tea]()

    def make(teaType: Tea.Type): Tea = {
        if (teaPool.isDefinedAt(teaType)) {
            teaPool.get(teaType).get
        } else {
            teaType match {
                case Tea.GreenTea =>
                    val tea = new GreenTea
                    teaPool.put(teaType, tea)
                    tea
                case Tea.UnsharedTea =>
                    new UnsharedTea()
            }
        }
    }

    def makeTeaInPool(teaType: Tea.Type, tea: Tea): Tea = {
        teaPool.put(teaType, tea)
        tea
    }
}
