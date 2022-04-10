package com.m24.learn.designpattern.persistence.dadtaaccessobject

import scala.collection.mutable

trait DaoBase[T] {
  def insert(obj: T): Unit
  def update(obj: T): Unit
  def findById(id: Int): Option[T]
}

trait StudentDao extends DaoBase[Student]

class InMemoryStudentDao extends StudentDao {
  val students = mutable.HashMap[Int, Student]()

  override def insert(obj: Student): Unit = {
    if (students.get(obj.id).isEmpty) {
      students.put(obj.id, obj)
    } else {
      throw new Exception("")
    }

  }

  override def update(obj: Student): Unit = {
    students.update(obj.id, obj)
  }

  override def findById(id: Int): Option[Student] = {
    students.get(id)
  }
}
