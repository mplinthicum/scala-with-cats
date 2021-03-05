package introduction.printable

trait Printable[A] {
  def format(value: A): String
}

object PrintableInstances {
  implicit val printableString: Printable[String] = (value: String) => value

  implicit val printableInt: Printable[Int] = (value: Int) => value.toString

  implicit val printableCat: Printable[Cat] = (value: Cat) =>
    s"${value.name} is a ${value.age} year-old ${value.color} cat."
}

object Printable {
  def format[A](value: A)(implicit p: Printable[A]): String = p.format(value)

  def print[A](value: A)(implicit p: Printable[A]): Unit = println(format(value))
}

final case class Cat(name: String, age: Int, color: String)

object PrintableSyntax {
  implicit class PrintableOps[A](value: A) {
    def format(implicit p: Printable[A]): String = p.format(value)

    def print(implicit p: Printable[A]): Unit = println(format(p))
  }
}
