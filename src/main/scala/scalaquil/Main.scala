package scalaquil
import jquil.QVM
import jquil.g;
import jquil.Program;

object Main extends App{

  def wavefunction (p: Program) : String = {
    val qvm = new QVM()
    val jlist = new java.util.LinkedList[Integer]()
    
    return QVM.wavefunction(p,  jlist)
  }

  var p : Program = new Program(g.H(0), g.CNOT(0, 1))
  println(wavefunction(p))

}
