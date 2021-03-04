package gg.dogecoin.bot

import dev.kord.core.Kord
import dev.kord.core.entity.ReactionEmoji
import dev.kord.core.event.message.MessageCreateEvent
import dev.kord.core.on
import io.github.cdimascio.dotenv.dotenv
import kotlinx.coroutines.delay

val dotenv = dotenv()

suspend fun main() {
    val client = Kord(dotenv.get("CLIENT_TOKEN"))
    val pingPong = ReactionEmoji.Unicode("\uD83C\uDFD3")

    client.on<MessageCreateEvent> {
        val author = message.author?.id?.asString ?: return@on
        if (author != "127086959033188352") return@on
        if (message.content != "ping") return@on

        val response = message.channel.createMessage("Pong!")
        response.addReaction(pingPong)

        delay(5000)
        message.delete()
        response.delete()
    }

    client.login {
        watching("for scammers")
    }
}
