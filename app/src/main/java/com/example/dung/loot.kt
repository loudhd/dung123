package com.example.dung

enum class lootTye{
    POTION, RING,ARMOR
}
class loot(val name: String,val tye: lootTye,val value: Double) {
    override fun toString(): String {
        return "$name is $tye and is worth $value"

    }
}