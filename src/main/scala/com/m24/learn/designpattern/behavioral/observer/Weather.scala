package com.m24.learn.designpattern.behavioral.observer

import scala.collection.mutable

class Weather {
  val observer= mutable.ListBuffer[WeatherObserver]()
  var currentWeather: WeatherType = WeatherType.SUNNY


}
