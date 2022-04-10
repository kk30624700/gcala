package com.m24.learn.designpattern.behavioral.observer

object Console extends App {
  val weather = new Weather()
  weather.addObserver(new Boy)
  weather.addObserver(new Girl)
  weather.changing(WeatherType.COLD)
  weather.changing(WeatherType.RAINY)
  weather.changing(WeatherType.SUNNY)
}
