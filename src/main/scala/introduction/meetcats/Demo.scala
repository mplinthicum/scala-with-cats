package introduction.meetcats

import cats._
import cats.syntax.show._
import cats.syntax.eq._
import CatShow._
import CatEq._
import introduction.printable.Cat

/**
 * Before cats 2.2.0 you'd need to also import cats.instances.int._ to
 * use Show for ints. Now standard library types are available in the
 * implicit scope.
 *
 * https://github.com/typelevel/cats/releases/tag/v2.2.0
 */
case object Demo extends App {
  val showInt: Show[Int] = Show.apply[Int]

  val intAsString: String = showInt.show(123)
  println(intAsString)

  println(123.show)
}

case object DemoCatShow extends App {
  val fish: Cat = Cat("Fish", 1, "calico")
  println(fish.show)

  val showCat: Show[Cat] = Show.apply[Cat]
  println(showCat.show(fish))
}

case object DemoCatEq extends App {
  val cat1 = Cat("Garfield",   38,"orangeandblack")
  val cat2 = Cat("Heathcliff", 33,"orangeandblack")

  println(cat1 === cat2)
  println(cat1 =!= cat2)

  val optionCat1 = Option(cat1)
  val optionCat2 = Option.empty[Cat]
  println(optionCat1 === optionCat2)
  println(optionCat1 === optionCat1)
  println(optionCat1 =!= optionCat2)
}
