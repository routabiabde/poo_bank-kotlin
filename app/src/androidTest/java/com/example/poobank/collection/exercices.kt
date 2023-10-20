package com.example.poobank.collection

class Etudiant (
    var name:String,
    var code:Int,
    var sex:String,
    var adresse:String,
    var age:Int
) {
    override fun toString(): String {
          return "nom : $name ; code : $code ; sexe : $sex ; adresse : $adresse ; age : $age;"
    }
}

fun main() {
    var etudiants = arrayListOf<Etudiant>(
        Etudiant("Abde", 1, "M", "safi block 89", 18),
        Etudiant("mehdi", 1, "M", "safi block 89", 20),
        Etudiant("othman afan", 1, "F", "safi block 89", 19),
        Etudiant("sara", 1, "F", "safi block 89", 22),
        Etudiant("imane", 1, "F", "safi block 89", 22),
        Etudiant("aziza", 1, "F", "safi block 89", 20),
        Etudiant("Anas", 1, "M", "safi block 89", 21),
    )

    fun afficherList() {
        for (i in etudiants) {
            println(i)
        }
    }

    fun sortedListByage(list: ArrayList<Etudiant>) {

        var sortedListByage = list.sortedBy {
            it.age
        }

    for (i in sortedListByage) {
        println("$i  ")
    }
}
    fun groupedListedBySex(list:ArrayList<Etudiant>){
    var groupedListedBySex = list.groupBy { it.sex }
    for (i in groupedListedBySex!!){
        println("$i  ")
    }
 }
    fun listDesFemme(list:ArrayList<Etudiant>): List<Etudiant>? {
//        println("list des femme")
        var listDesFemme = list.groupBy { it.sex }.get("F")
        for (i in listDesFemme!!){
            println("$i  ")
        }
        return listDesFemme
    }
    fun listDesHomme(list:ArrayList<Etudiant>): List<Etudiant>? {
//    println("list des homme")
    var listDesHomme = list.groupBy { it.sex }.get("M")
    for (j in listDesHomme!!){
        println("$j  ")
    }
     return listDesHomme

    }
    fun premierGarcon(list:ArrayList<Etudiant>):String{
       return etudiants.first{ it.sex == "M"}.name

    }
    fun modifierGarcon(list:ArrayList<Etudiant>,newNome:String){
      list[0].sex == newNome
    }
    fun  listNomEtudiant(list:ArrayList<Etudiant>){
        var listNomes = arrayListOf<String>()
        for (i in 0..list.size-1){
            listNomes.add(list[i].name)
        }
        println(listNomes)
    }
    fun suprimerSexe(list:ArrayList<Etudiant>,S:String){
     list.removeIf { it.sex == S }
    }
    fun  revresedList(list:ArrayList<Etudiant>){
        var reversedList  = list.reversed()
        for (i in reversedList){
            println(i)
        }
    }
    fun clearList(list:ArrayList<Etudiant>){
        list.clear()
    }
    println("Question 3")
    sortedListByage(etudiants)
    println("Question 4")
    groupedListedBySex(etudiants)
    println("Question 5")
    println("1- list des femme")
    listDesFemme(etudiants)
    println("2 - list des homme")
    listDesHomme(etudiants)
    println("Question 6")
    println(premierGarcon(etudiants))
    println("Question 7")
    modifierGarcon(etudiants,"taha")
    println("Question 8")
    listNomEtudiant(etudiants)
    println("Question 9")
    suprimerSexe(etudiants,"F")
    afficherList()







}