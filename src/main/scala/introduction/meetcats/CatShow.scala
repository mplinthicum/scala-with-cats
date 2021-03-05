package introduction.meetcats

import cats._
import introduction.printable.Cat

object CatShow {
  implicit val catShow: Show[Cat] = Show.show(cat =>
    s"${cat.name} is a ${cat.age} year-old ${cat.color} cat."
  )
}
