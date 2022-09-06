object caeserCipher{

val alphabet = 'A' to 'Z'

def encrypt():Any={
val scrtMsg = scala.io.StdIn.readLine("Secret Message: ")
val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size

val encryptedMsg = scrtMsg.map((c:Char) => {

val ch = alphabet.indexOf(c.toUpper)

if(ch == -1) {
c
}
else {
alphabet((ch + shift) % alphabet.size)
}
});

println(encryptedMsg);
}

def decrypt():Any={
val scrtMsg = scala.io.StdIn.readLine("Encrypted Message: ")
val shift = (alphabet.size - scala.io.StdIn.readLine("Reversed By: ").toInt) % alphabet.size

val decryptedMsg = scrtMsg.map((c:Char) => {

val ch = alphabet.indexOf(c.toUpper)

if(ch == -1) {
c
}
else {
alphabet((ch + shift) % alphabet.size)
}
});
println(decryptedMsg);
}

def main(args: Array[String]) = {

val x = scala.io.StdIn.readLine("1 encryption or 2 decryption : ").toInt

x match
case 1 => encrypt()
case 2 => decrypt()
case _ => println("Invalid input")


}


}




