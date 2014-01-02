import scala.collection.mutable
import scala.io.Source
class DPLLSolver(name: String) {
  val source = scala.io.Source.fromFile(name)
  val lines = source.mkString.split("\n")
  source.close
  //print(lines(0).split(" ")(0))
  val CNF = stringToCNF(lines.toList)
  val length = maxInt
  val model = mutable.Map.empty[Int, Option[Boolean]]
		  
  def initAssignment(length: Int): Unit = {
    if (length > 0) {
      model(length) = None;
      model(-1*length) = None;
      initAssignment(length - 1)
    }
  }
  
  initAssignment(length)
  

  def setTrue(index: Int) = {
    model(index) = Some(true)
    model(-1*index) = Some(false)
  }

  def setFalse(index: Int) = {
    model(index) = Some(false)
    model(-1*index) = Some(true)
  }

  
  def stringToCNF(lines: List[String]): List[List[Int]] = {
    if (lines == List()) List()
    else if(lines(0)(0) == 'c'){stringToCNF(lines.tail)}
    else (lines(0).split(" ").toList map (_.toInt) filter (0 !=)) :: stringToCNF(lines.tail)
  }

  
  def printCNF() : Unit = {
    CNF map (x => {x map {y => print(y + " ")}; print("\n")})
  }
  
  def maxInt () :Int= {
    val m = (CNF map {x => x.max}).max
    val n = -1* (CNF map {x => x.min}).min
    if(m > n) m else n
  }
  
  def satisfy(): Boolean = {
    CNF.foldRight(true)((x , acc) => acc && x.foldRight(false)((y, acc) => acc || (model(y) == Some(true))))
  }
  
  //DPLL algorithm
  def solve(index: Int): Boolean = {
    if(index == 0) satisfy else{
      //try set index to true first, then false
      this.setTrue(index)
      
      if (solve(index -1)) true 
      else{
        this.setFalse(index)
        solve(index-1)
      }
    }
  }
  
  def printModel(){
    Range(1,length+1,1) map (x => (print(x), print(" "), println(model(x)==Some(true)))) 
  }
  
}