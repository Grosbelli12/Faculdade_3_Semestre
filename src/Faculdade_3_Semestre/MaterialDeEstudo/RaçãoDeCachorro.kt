package Faculdade_3_Semestre.MaterialDeEstudo

  class RaçãoDeCachorro: Racao() {
    var fortalecimentoDePelos: Boolean = true
    var pedacosComCarne: Boolean = true

     override fun desconto() {
         if (pedacosComCarne == true){
             preco *= 0.95
         }else{
             preco *= 0.75
         }
}
  }