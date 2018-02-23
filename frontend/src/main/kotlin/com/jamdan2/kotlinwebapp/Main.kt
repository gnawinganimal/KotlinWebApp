package com.jamdan2.kotlinwebapp

import kotlinext.js.*
import kotlin.browser.*
import react.dom.*

fun main(args: Array<String>) {
    requireAll(require.context("/", true, js("/\\.css$/")))
    window.onload = {
        render(document.getElementById("root")!!) {
            application()
        }
        println("Hello, world!")
    }
}
