package Faculdade_3_Semestre.MaterialDeEstudo

class RaçãoDeGato : Racao() {
    var paraCastrado: Boolean = true
    var ricaEmFerro: Boolean = true

    override fun desconto() {
        if (paraCastrado == true) {
            preco *= 0.85
        } else {
            preco *= 0.80
        }
    }
}