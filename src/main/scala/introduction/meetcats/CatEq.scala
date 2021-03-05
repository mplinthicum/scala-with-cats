package introduction.meetcats

import cats._
import cats.syntax.eq._
import introduction.printable.Cat

object CatEq {
  implicit val catEq: Eq[Cat] = Eq.instance[Cat] { (cat1, cat2) =>
    cat1.name === cat2.name &&
    cat1.age === cat2.age &&
    cat1.color === cat2.color
  }
}
