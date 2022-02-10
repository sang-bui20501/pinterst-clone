package backend.service.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HttpController {
    @GetMapping("abc")
    fun stuff(): String = "abc"
}