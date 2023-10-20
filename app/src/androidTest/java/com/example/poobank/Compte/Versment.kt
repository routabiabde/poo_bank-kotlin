package com.example.poobank.Compte

import java.util.Date

class Versment(number:Int, dateOperation: Date, mt:Double):Operation(number,dateOperation,mt)  {
    override fun toString():String{
        return """
             un Versment
                 |code est : $number
                 |la date est : $dateOperation
                 |le montant est : $mt
         """.trimIndent()
    }
}