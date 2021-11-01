object ScalaFunctionLiterals extends App {

    // Basic function literal
    var addLiteral = (x: Int) => x + 1
    println(addLiteral(10))

    // Function assignment
    addLiteral = (x: Int) => x + 9999
    println(addLiteral(10))

    // Int type abbreviation
    addLiteral = (x) => x + 1
    println(addLiteral(10))

    // Omission of brackets
    addLiteral = x => x + 1
    println(addLiteral(10))

    // Multiple processing in a function literal
    addLiteral = (x: Int) => {
        println("We")
        println("are")
        println("Scala !")
        x + 1
    }
    println(addLiteral(10))
}