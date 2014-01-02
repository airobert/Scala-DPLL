import scala.collection.mutable

import scala.io.Source

object DPLLtest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  List((8,Some(false)),(9,Some(false)),(10,None)) //> res0: List[(Int, Option[Boolean])] = List((8,Some(false)), (9,Some(false)), 
                                                  //| (10,None))
  print("x")                                      //> x
/*
   val ass = constructList(length)
  
   def constructList(length: Int): List[(Int, Option[Boolean])] = {
    if (length > 0)
      (length, None) :: constructList(length - 1)
    else List()
  }
  */
  
  val m = mutable.Map.empty[Int, Option[Boolean]] //> m  : scala.collection.mutable.Map[Int,Option[Boolean]] = Map()
  m(1) = Some(false)
  
  m(1)                                            //> res1: Option[Boolean] = Some(false)
  List(List(1,2,3))                               //> res2: List[List[Int]] = List(List(1, 2, 3))
  val cnf = List()                                //> cnf  : List[Nothing] = List()
  "123"(1)                                        //> res3: Char = 2
  List("1","2","3").max                           //> res4: String = 3
  
  val model = mutable.Map.empty[Int, Option[Boolean]]
                                                  //> model  : scala.collection.mutable.Map[Int,Option[Boolean]] = Map()
  0::List(1,2,3)                                  //> res5: List[Int] = List(0, 1, 2, 3)
}