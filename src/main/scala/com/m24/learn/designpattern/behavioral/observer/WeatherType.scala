package com.m24.learn.designpattern.behavioral.observer

trait WeatherType

object WeatherType {
  case object SUNNY extends WeatherType
  case object RAINY extends WeatherType
  case object COLD extends WeatherType
}