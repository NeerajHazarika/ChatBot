package com.project.alexia.utils

import com.project.alexia.utils.Constants.OPEN_GOOGLE
import com.project.alexia.utils.Constants.OPEN_SEARCH
import com.project.alexia.utils.Constants.OPEN_SEARCH_HAPPY
import com.project.alexia.utils.Constants.OPEN_SEARCH_SAD
import java.util.*

object BotResponse {

    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message = _message.lowercase(Locale.getDefault())

        return when {

            //Hello
            message.contains("hello") -> {
                when (random) {
                    0 -> "Hello there! Are you having a good day?"
                    1 -> "Hi! How's your day going?"
                    2 -> "Buongiorno! How's your day going?"
                    else -> "error" }
            }

            //How are you?
            message.contains("how are you") -> {
                when (random) {
                    0 -> "I'm doing fine, thanks!"
                    1 -> "I'm hungry..."
                    2 -> "Pretty good! How about you?"
                    else -> "error"
                }
            }

            //Open Google
            message.contains("open") && message.contains("google")-> {
                OPEN_GOOGLE
            }

            //Search on the internet
            message.contains("search")-> {
                OPEN_SEARCH
            }

            //How are you?
            message.contains("how are you") -> {
                when (random) {
                    0 -> "I'm doing fine, thanks!"
                    1 -> "I'm hungry..."
                    2 -> "Pretty good! How about you?"
                    else -> "error"
                }
            }

            //Search on the internet
            message.contains("search")-> {
                OPEN_SEARCH
            }

            //Song request
            message.contains("song") -> {
                when (random) {
                    0 -> "How are you feeling today ?"
                    1 -> "How was your day ?"
                    3 -> "How are you doing ?"
                    else -> "error"
                }
            }

            //Song request
            message.contains("happy") || message.contains("glad") ||
                    message.contains("LOL") || message.contains("excited") ||
                    message.contains("Amazing") || message.contains("good")-> {
                OPEN_SEARCH_HAPPY
            }

            //Song request
            message.contains("sad") -> {
                OPEN_SEARCH_SAD
            }

            //When the programme doesn't understand...
            else -> {
                when (random) {
                    0 -> "I don't understand..."
                    1 -> "Try asking me something different"
                    2 -> "Idk"
                    else -> "error"
                }
            }
        }
    }
}