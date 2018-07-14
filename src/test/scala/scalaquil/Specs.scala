package scalaquil

import jquil.g;
import jquil.Program;

import org.specs2.mutable._

class Specs extends SpecificationWithJUnit {

  "the code" should {
    "work" in {
      Main.wavefunction(new Program(g.H(0), g.CNOT(0, 1))) == "0.71|00> + 0.71|11>"
    }
  }
}
