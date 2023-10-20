package com.example.poobank.Compte

class Banque (
    var comptes :ArrayList<Compte> = arrayListOf<Compte>()
) {
        fun indiceDe(code:Int) :Int{
        for (i in comptes){
            if (i.code == code){
                return comptes.indexOf(i)

            }
        }
        return -1
    }

    fun ajouter(c:Compte){
        when (indiceDe(c.code)){
            -1 -> comptes.add(c)
            else -> "4 0 0 dans l'ajoute"
        }
    }
    fun supprimer(code:Int){
        var index = indiceDe(code)
        when (index){
            -1 -> true
            else -> comptes.removeAt(index)
        }
    }

    fun supprimerCompte(c:Compte){
        var index = indiceDe(c.code)
        when (index){
            -1 -> println("true")
            else -> {
                comptes.removeAt(index)
                println("flase")
            }

        }
    }

    fun nombreProduitsEnSolde(){
        var c =0


        for (p in comptes){
            if (p is ComteEpargne){
                c++
            }
        }
        println(c++)
    }
    fun afficheComptes(){
        for (i in comptes){
            println(i.toString())
        }
        println(comptes.size)
    }
}