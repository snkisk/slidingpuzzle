package slidingpuzzle

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class GameController {

  @GetMapping("/")
  fun game(@RequestParam(value = "n", required = false, defaultValue = "5") n : Int, model: Model): String {
    val cells: Array<Array<String>> = Array(n, {Array(n, {""})})
    cells[0][n-1] = "goal"
    cells[n-2][0] = "block"
    cells[n-1][0] = "start"
    model.addAttribute("cells", cells)
    model.addAttribute("flexSize", 100/(1..n).toList().size)
    return "game"
  }
}
