package slidingpuzzle

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class StageMaster(
    @Id
    @GeneratedValue
    val id: Long,
    val cellsCount: Int
)

@Entity
data class StageCells(
    @Id
    @GeneratedValue
    val id: Long,
    val stageId: Int,
    val type: Int
)