object ScalaTailRecursionFunctions extends App {
    
    // Define function
    def sum(n: Int, acc: Int): Int = {
        if (n == 0) {
            acc
        } else {
            // Tail recursive
            sum(n - 1, acc + n)
        }
    }

    // Add from 1 to 10
    println(sum(10, 0))
}