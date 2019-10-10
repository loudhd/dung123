package com.example.dung

open class Enemy (val name: String, var hitPoints: Int, var lives :Int){
   open  fun  takeDamage(damage : Int){
        val reaminingHitPoints = hitPoints - damage
        if (reaminingHitPoints> 0) {
            hitPoints = reaminingHitPoints
            println("$name took $damage points of damage, and has $hitPoints left")
        }else {
            lives -= 1
            if (lives>0){
                println("$name lost a life")
            }else{
                println("No lives left,$name is dead")
            }

        }

    }

    override fun toString(): String {
        return "Name: $name, Hitpoints: $hitPoints, Lives: $lives"
    }
}