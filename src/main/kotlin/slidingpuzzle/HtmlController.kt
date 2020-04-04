package slidingpuzzle

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class GameController {

  @GetMapping("/")
  fun game(@RequestParam n: Int, model: Model): String {
    model.addAttribute("cells", (1..n).toList())
    model.addAttribute("flexSize", 100/(1..n).toList().size)
    return "game"
  }
}
