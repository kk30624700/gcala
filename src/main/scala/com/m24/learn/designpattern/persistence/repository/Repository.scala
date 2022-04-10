package com.m24.learn.designpattern.persistence.repository

import scala.collection.mutable

trait Repository[T, ID] {
  def save(entity: T): Unit
  def delete(entity: T): Unit
  def deleteById(id: ID): Unit
  def findById(id: ID): Option[T]
  def findAll(spec: Specification[T] = null): List[T]
}

trait AccountRepository extends Repository[Account, Int]

class AccountRepositoryInMemory extends AccountRepository {

  val repository: mutable.HashMap[Int, Account] = new mutable.HashMap[Int, Account]()

  override def save(entity: Account): Unit = {
    repository.put(entity.id, entity)
  }

  override def delete(entity: Account): Unit = {
    repository.remove(entity.id)
  }

  override def deleteById(id: Int): Unit = {
    repository.remove(id)
  }

  override def findById(id: Int): Option[Account] = {
    repository.get(id)
  }

  override def findAll(spec: Specification[Account] = null): List[Account] = {
    if (spec == null) repository.values.toList
    else repository.values.filter(x => spec.specified(x)).toList
  }
}


class AccountRepositoryInDatabase extends AccountRepository {

  override def save(entity: Account): Unit = {

    val upsert =
      s"""INSERT INTO table_account (id, name, age) VALUES(${entity.id}, ${entity.name}, ${entity.age})
         |ON DUPLICATE KEY UPDATE name=${entity.name}, age=${entity.age}"""
    execute(upsert)
  }

  override def delete(entity: Account): Unit = {
    val del = s"""DELETE FROM table_account WHERE id = ${entity.id}"""
    execute(del)

  }

  override def deleteById(id: Int): Unit = {
    val del = s"""DELETE FROM table_account WHERE id = $id"""
    execute(del)
  }

  override def findById(id: Int): Option[Account] = {
    val sql = s"""SELECT id, name, age FROM table_account WHERE id = $id"""
    val result = query(sql)
    Some(Account(id, "dummy", 0))
  }

  override def findAll(spec: Specification[Account] = null): List[Account] = {
    val sql = s"""SELECT id, name, age FROM table_account WHERE ${spec.toSqlClauses()}"""
    val result = query(sql)
    List(Account(1, "dummy", 0))
  }

  private def query(sql: String): List[List[String]] = Nil

  private def execute(sql: String): Unit = {}

}
