package slidingpuzzle

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class GameController(private val stageMasterRepository: StageMasterRepository, private val stageCellsRepository: StageCellsRepository) {

  @GetMapping("/")
  fun game(@RequestParam(value = "n", required = false, defaultValue = "5") n : Int, model: Model): String {
    model.addAttribute("flexSize", 100/(1..n).toList().size)

    val master = stageMasterRepository.findOneByCellsCount(n)
    if (master == null)
      return "redirect:/"

    val (id, cellsCount) = master
    model.addAttribute("cells", stageCellsRepository.getStage(id).windowed(size = n, step = n))
    return "game"
  }
}
