package com.example.poobank.Compte

import java.util.Date

class Retrait(number:Int,dateOperation:Date,mt:Double):Operation(number,dateOperation,mt)  {
     override fun toString():String{
         return """
             un Retrait
                 |code est : $number
                 |la date est : $dateOperation
                 |le montant est : $mt
         """.trimIndent()
     }
}