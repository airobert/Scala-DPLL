import scala.collection.mutable

import scala.io.Source

object DPLLtest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(118); 
  println("Welcome to the Scala worksheet");$skip(50); val res$0 = 
  List((8,Some(false)),(9,Some(false)),(10,None));System.out.println("""res0: List[(Int, Option[Boolean])] = """ + $show(res$0));$skip(13); 
  print("x");$skip(257); 
/*
   val ass = constructList(length)
  
   def constructList(length: Int): List[(Int, Option[Boolean])] = {
    if (length > 0)
      (length, None) :: constructList(length - 1)
    else List()
  }
  */
  
  val m = mutable.Map.empty[Int, Option[Boolean]];System.out.println("""m  : scala.collection.mutable.Map[Int,Option[Boolean]] = """ + $show(m ));$skip(21); 
  m(1) = Some(false);$skip(10); val res$1 = 
  
  m(1);System.out.println("""res1: Option[Boolean] = """ + $show(res$1));$skip(20); val res$2 = 
  List(List(1,2,3));System.out.println("""res2: List[List[Int]] = """ + $show(res$2));$skip(19); 
  val cnf = List();System.out.println("""cnf  : List[Nothing] = """ + $show(cnf ));$skip(11); val res$3 = 
  "123"(1);System.out.println("""res3: Char = """ + $show(res$3));$skip(24); val res$4 = 
  List("1","2","3").max;System.out.println("""res4: String = """ + $show(res$4));$skip(57); 
  
  val model = mutable.Map.empty[Int, Option[Boolean]];System.out.println("""model  : scala.collection.mutable.Map[Int,Option[Boolean]] = """ + $show(model ));$skip(17); val res$5 = 
  0::List(1,2,3);System.out.println("""res5: List[Int] = """ + $show(res$5))}
}
