
import scala.io.Source
object Main extends App {
  
  println("---- solving ----")
  val solver = new DPLLSolver("test.cnf")
  //solver.initAssignment(9)
  //print(solver.model(3))
  //print(solver.CNF(0))
  //solver.printCNF
  //print(solver.maxInt)
  //print(solver.model(1))
  //print(solver.satisfy)
  if (solver.solve(solver.length) == true) {solver.printModel; print("\nSAT")} else print ("UNSAT")
  
}
