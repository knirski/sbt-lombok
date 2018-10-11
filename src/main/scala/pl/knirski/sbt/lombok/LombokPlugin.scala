package pl.knirski.sbt.lombok

import sbt._
import Keys._

object LombokPlugin extends AutoPlugin {

  override def requires = empty

  override def trigger = allRequirements

  override lazy val projectSettings = Seq(commands += helloCommand)

  lazy val helloCommand =
    Command.command("hello") { state: State =>
      println("Hi!")
      state
    }

}
