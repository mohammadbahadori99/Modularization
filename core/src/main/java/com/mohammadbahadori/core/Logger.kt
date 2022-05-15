package com.mohammadbahadori.core

class Logger(private val tag: String, private val isDebug: Boolean) {

    fun log(msg: String) {
        if (!isDebug) {

        } else {
            printLogD(tag, msg)
        }
    }

    companion object Factory {
        fun buildDebug(tag: String):Logger{
            return Logger(tag,true)
        }

        fun buildRelease(tag: String):Logger{
            return Logger(tag,false)
        }
    }
}

fun printLogD(tag: String, msg: String) {
    println("$tag: $msg")
}

