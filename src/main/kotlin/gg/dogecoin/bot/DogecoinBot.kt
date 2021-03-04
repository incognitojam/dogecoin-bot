package gg.dogecoin.bot

import io.github.cdimascio.dotenv.dotenv

val dotenv = dotenv()
val CLIENT_ID: String = dotenv["CLIENT_ID"]

fun main() {
    println("Hello, world! Client ID: $CLIENT_ID")
}
