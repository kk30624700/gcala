package com.m24.learn.designpattern.behavioral.memento

import scala.collection.mutable

object Console extends App {
  val mementoStack = mutable.Stack[NotebookMemento]()

  val notebook = new Notebook

  notebook.write("I have a dream... ")
  mementoStack.push(notebook.getMemento)
  notebook.show()

  notebook.write("I have a dream that one day ")
  mementoStack.push(notebook.getMemento)
  notebook.show()

  notebook.write("black boys and black girls will be able to join hands ")
  mementoStack.push(notebook.getMemento)
  notebook.show()

  notebook.write("with white boys and white girls as sisters and brothers.")
  mementoStack.push(notebook.getMemento)
  notebook.show()

  notebook.setMemento(mementoStack.pop())
  notebook.show()

  notebook.setMemento(mementoStack.pop())
  notebook.show()

  notebook.setMemento(mementoStack.pop())
  notebook.show()

  notebook.setMemento(mementoStack.pop())
  notebook.show()
}
