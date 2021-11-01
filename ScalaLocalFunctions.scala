object ScalaLocalFunctions extends App {
    
    // Define function
    def calcFunc(n: Int): Int = {
        // Define local function
        def addFunc(a: Int, b: Int) = a + b

        addFunc(1, n) + addFunc(2, n)
    }

    // Define function (Local function names can be used)
    def addFunc(n: Int): Int = {
        n + n
    }

    // calcFunc function is processed
    println(calcFunc(1))

    // addFunc function is processed (not a local function)
    println(addFunc(1))
}


// =====================================
//            Output Sample
// =====================================
// $ scalac ScalaLocalFunctions.scala 
// $ scala ScalaLocalFunctions
// 5
// 2
