//package com.github.uryyyyyyy.samples.scalaz
//
//import scalaz.std.list._ // type class instances for Option
//import scalaz.std.option._ // type class instances for List
//import scalaz.syntax.bind._ // syntax for the Bind type class (and its parents)
//
//object Sample1 {
//	val moke:Option[Int] = Apply[Option].apply2(some(1), some(2))((a, b) => a + b)
//	val moke2:Option[List[Int]] = Traverse[List].traverse(List(1, 2, 3))(i => some(i))
//
//	val moke3:List[Int] = List(List(1)).join
//	val moke4:List[Int] = List(true, false).ifM(List(0, 1), List(2, 3))
//
//	List(1,2,3) >> List(1,2,3)
//
//
//}
//
//trait FoldLeft[F[_]] {
//	def foldLeft[A, B](xs: F[A], b: B, f: (B, A) => B): B
//}
//object FoldLeft {
//	implicit val FoldLeftList: FoldLeft[List] = new FoldLeft[List] {
//		def foldLeft[A, B](xs: List[A], b: B, f: (B, A) => B) = xs.foldLeft(b)(f)
//	}
//}