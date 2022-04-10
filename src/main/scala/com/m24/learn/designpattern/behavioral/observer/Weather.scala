package com.m24.learn.designpattern.behavioral.observer

import scala.collection.mutable

class Weather {
  val observers= mutable.ListBuffer[WeatherObserver]()
  var currentWeather: WeatherType = WeatherType.SUNNY

  def addObserver(ob: WeatherObserver): Unit = {
    observers.append(ob)
  }

  def removeObserver(ob: WeatherObserver): Unit = {
    val index = observers.indexOf(ob)
    if (index != -1) {
      observers.remove(index)
    }
  }

  def changing(weather: WeatherType): Unit = {
    currentWeather = weather
    notifyObservers()
  }

  def notifyObservers(): Unit = {
    observers.foreach { ob =>
      ob.update(currentWeather)
    }
  }
}
