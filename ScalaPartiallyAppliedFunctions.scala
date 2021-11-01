object ScalaPartiallyAppliedFunctions extends App {

    // Function definition
    def addString(a: String, b: String, c: String): String = {
        a + " " + b + " " + c
    }
    println(addString("We", "are", "Scala !"))

    // Replace the some arguments with underscores
    val partiallyApplied = addString("We", _: String, "Scala !")
    println(partiallyApplied("are"))

    // Replace the argument with underscore
    val allPartiallyApplied = addString _
    println(allPartiallyApplied("We", "are", "Scala !"))
}


// =====================================
//            Output Sample
// =====================================
// $ scalac ScalaPartiallyAppliedFunctions.scala 
// $ scala ScalaPartiallyAppliedFunctions
// We are Scala !
// We are Scala !
// We are Scala !
