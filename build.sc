import mill._, scalalib._

object backend extends ScalaModule {
  def scalaVersion = "3.4.2"
  def ivyDeps = Agg(
    ivy"com.augustnagro::magnum::1.2.0",
  )
}
