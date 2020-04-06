package slidingpuzzle

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import com.fasterxml.jackson.module.kotlin.*

@Controller
class GameController(private val stageCellsRepository: StageCellsRepository) {

  @GetMapping("/")
  fun game(@RequestParam(value = "n", required = false, defaultValue = "5") n : Int, model: Model): String {
    val cells: Array<Array<String>> = Array(n, {Array(n, {""})})
    cells[0][n-1] = "goal"
    cells[n-2][0] = "block"
    cells[n-1][0] = "start"
    model.addAttribute("cells", cells)
    model.addAttribute("flexSize", 100/(1..n).toList().size)
    model.addAttribute("stage", stageCellsRepository.getStage(1).windowed(size = 5, step = 5))


    // val json: Stage = stageRepository.findAll().random()["stage"];
    // val mapper = jacksonObjectMapper()
    // data class Columns(vararg values: String)
    // data class Rows(vararg values: Columns)
    // val state: Columns = mapper.readValue(json)

    // mapper.writeValueAsString(obj);

    return "game"
  }
}
