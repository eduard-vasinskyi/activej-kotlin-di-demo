package me.evasinskyi

import io.activej.inject.annotation.ProvidesIntoSet
import io.activej.inject.module.AbstractModule

class KotlinModule : AbstractModule() {

    @ProvidesIntoSet
    fun kotlinHej(): Hej {
        return Hej("Kotlin")
    }
}