package smarthealth

import sbt._
import sbt.Keys._

object Publish {
  lazy val settings = Seq(
    publishTo := Some(Resolver.sftp("SmartHealth", "54.243.190.12", "maven/")
        .as("jenkins", Path.userHome / ".ssh" / "devsh.pem"))
  )
}
