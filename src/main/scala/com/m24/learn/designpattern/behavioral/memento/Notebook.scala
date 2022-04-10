package com.m24.learn.designpattern.behavioral.memento

class Notebook {
  private var content = new StringBuffer

  def getMemento: NotebookMemento = {
    NoteBookMementoInternal(content.toString)
  }

  def setMemento(memento: NotebookMemento): Unit = memento match {
    case NoteBookMementoInternal(state) => content = new StringBuffer(state)
    case _ => throw new IllegalArgumentException
  }

  def write(words: String): Unit = {
    content.append(words)
  }

  def show(): Unit = {
    println(content)
  }

  private case class NoteBookMementoInternal(str: String) extends NotebookMemento
}
