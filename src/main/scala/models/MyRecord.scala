package models.nested
//case class MyRecord(x: String, y: Int, z: Boolean, s: Short, a: Byte, b: Float, c: Long, d: Double, e: Any, f: AnyRef, g: Object, h: Char, i: Null,  k: Unit, j: Nothing)
//case class MyRecord(x: Float, y: Double)

//case class MyRecord(a: Byte, b: Short, c: Int, d: Long, e: Float, f: Double, g: Char, h: String, i: Boolean)
case class rec(x: Int)
//case class MyRecord(x: Option[List[Int]])
//case class MyRecord(x: List[List[String]])
//case class MyRecord(x: Option[Int], y: Int)
case class MyRecord(myRecord: List[rec], y: Int)

object Foo {
  val bar = "carrot"
}
