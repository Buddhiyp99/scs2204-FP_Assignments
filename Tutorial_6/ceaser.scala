object ceaser extends App {
    val alphabet = 'A' to 'Z'

    val shift = (scala.io.StdIn.readLine("shift by: ").toInt + alphabet.size)%alphabet.size
    val input = scala.io.StdIn.readLine("user input: ")

    val output=input.map((ch:Char)=>{
        val index=alphabet.indexOf(ch.toUpper)

        if (index == -1){
            ch
        }
        else{
            alphabet((index+shift)%alphabet.size)
        }

    })

    print(output)

}