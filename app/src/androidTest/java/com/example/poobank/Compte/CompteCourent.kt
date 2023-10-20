package com.example.poobank.Compte

class CompteCourent(code:Int,solde:Double,var decouvrement:Double) : Compte(code,solde) {
    override fun retire(mt: Double) {
       if (mt < solde + decouvrement){
           solde -= mt
       }
    }

}