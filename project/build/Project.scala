import sbt._

class HwlogProject(info: ProjectInfo) extends DefaultProject(info) with IdeaPlugin {

  val scalatest = "org.scalatest" % "scalatest" % "1.0.1" % "test" intransitive()
  val specs = "org.specs" % "specs" % "1.4.3" % "test" intransitive()
  
}
