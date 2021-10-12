package me.evasinskyi

import io.activej.inject.annotation.Inject
import io.activej.inject.annotation.Provides
import io.activej.inject.module.Module
import io.activej.inject.module.Modules
import io.activej.launcher.Launcher

class MainLauncher : Launcher() {

    @Inject
    lateinit var testString: String

    @Provides
    fun testString(test: Test): String {
        return test.toString()
    }

    override fun getModule(): Module {
        return Modules.combine(JavaModule(), KotlinModule())
    }

    override fun run() {
        println(testString)
    }
}

fun main(args: Array<String>) {
    MainLauncher().launch(args)
}