var taxaConversao : Float = 1.6094f
println("Introduza milhas")
var milhas : Short = readln().toShort()
var kms : Int = (milhas * taxaConversao).toInt()
println("$milhas milhas sao $kms kms")