package com.ysk3a.websocketrealtimechatsample2

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller


@Controller
class GreetingController {

    @MessageMapping("/greet")
    @SendTo("/topic/greetings")
    fun greeting(messageDto: MessageDto): GreetingDto {
        Thread.sleep(2000)
        return GreetingDto("Hello, ${messageDto.name}")
    }
}