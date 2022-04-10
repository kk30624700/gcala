package com.m24.learn.designpattern.behavioral.observer

trait WeatherObserver {
  def update(currentWeather: WeatherType)
}

class Boy extends WeatherObserver {
  override def update(currentWeather: WeatherType): Unit = currentWeather match {
    case WeatherType.SUNNY => println("it is sunny. i can to to play football")
    case WeatherType.RAINY => println("it is rainy. i can play video games at home")
    case WeatherType.COLD => println("it is cold. it is a nice for sleeping")
  }
}

class Girl extends WeatherObserver {
  override def update(currentWeather: WeatherType): Unit = currentWeather match {
    case WeatherType.SUNNY => println("It is sunny. I can go shopping.")
    case WeatherType.RAINY => println("It is rainy. I should take an umbrella and go shopping.")
    case WeatherType.COLD => println("It is cold. I should go to buy some clothes.")
  }
}
