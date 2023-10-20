package com.example.poobank.Compte

open class ComteEpargne(code:Int,solde:Double,var taux:Int = 5) : Compte(code,solde)  {

    override fun retire(mt: Double) {
        super.retire(mt)
    }

    fun  calculInterets():Double{
      return  solde * 1+taux/100
    }


}