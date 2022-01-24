import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource {
    @GetMapping("/")
    fun stuff(): String = "abc"
}