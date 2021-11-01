object ScalaMethods extends App {
    
    // Define function
    def multiFunc(n: Int): Int = {
        n * n
    }

    println(multiFunc(3))
}


// =====================================
//            Output Sample
// =====================================
// $ scalac ScalaMethods.scala 
// $ scala ScalaMethods
// 9
