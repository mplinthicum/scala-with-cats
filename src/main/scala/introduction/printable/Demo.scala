package introduction.printable

import PrintableInstances._
import Printable._
import PrintableSyntax._

case object Demo extends App {
  val cat = Cat("Fish", 2, "calico")

  print(cat)
}

case object DemoPrintableSyntax extends App {
  val cat = Cat("Fish", 2, "calico")

  cat.print
}
