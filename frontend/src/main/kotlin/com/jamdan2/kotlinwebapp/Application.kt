package com.jamdan2.kotlinwebapp

import react.*
import react.dom.*

class Application : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div {
            h1 {
                +"Hello, world!"
            }
            p {
                +"This is a webapp made using Kotlin."
            }
        }
    }
}

fun RBuilder.application() = child(Application::class) {}
