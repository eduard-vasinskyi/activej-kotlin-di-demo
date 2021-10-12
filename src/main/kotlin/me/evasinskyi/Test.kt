package me.evasinskyi

import io.activej.inject.annotation.Inject

class Test @Inject constructor(val set: Set<Hej>) {
    override fun toString(): String {
        return "Test(set=$set)"
    }
}