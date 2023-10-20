package com.example.poobank.Compte

import java.util.Date

open class Compte(
    var code:Int,
    var solde:Double,
    var  operations : ArrayList<Operation> = arrayListOf<Operation>()
) {
    open fun verser(mt:Double){
        solde += mt
    }
    open fun retire(mt:Double){
        if (mt < solde){
            solde -= mt
        }
        operations.add(Retrait(operations.size +1 , Date(),mt))
    }
    open fun versemnt(mt:Double ,c: Compte){
        this.retire(mt)
        c.verser(mt)
        operations.add(Versment(operations.size +1 , Date(),mt))


    }
    fun totalversment():Double{
        var totalVersment=0.0
        for (i in operations){
            if (i is Versment){
                totalVersment += i.mt
            }
        }
        return totalVersment
    } fun totalRetrait():Double{
        var totalRetrait=0.0
        for (i in operations){
            if (i is Retrait){
                totalRetrait += i.mt
            }                                                                      
        }
        return totalRetrait
    }

    fun afficherOperation(){
        for (i in operations){
            println(i.toString())
            }
        }

    override fun toString():String{
        return """
          comte
            le code est : $code
            le solde est : $solde
      """.trimIndent()
    }
    }


//    open fun consulterSold() :Double{
//        return  solde *= 1+taux/100;
//    }


fun main() {
    var c1 = Compte(1,1111.0)
    var c2 = Compte(2,2222.0)
    var c3 = Compte(3,3333.0)
    var banque = Banque()
    c1.versemnt(222.0,c2)
    c1.verser(23123.0)
    c1.retire(1323.0)
    banque.ajouter(c1)
    banque.ajouter(c2)
    banque.ajouter(c3)
//    println(banque.supprimer(c3.code))
//     println(banque.indiceDe(c3.code))
//    banque.afficheComptes()
    c1.afficherOperation()
}