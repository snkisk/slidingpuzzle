package slidingpuzzle

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class GameController {

  @GetMapping("/")
  fun game(model: Model): String {
    return "game"
  }
}
