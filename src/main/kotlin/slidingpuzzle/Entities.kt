package slidingpuzzle

import java.time.LocalDateTime
import javax.persistence.*
import java.io.Serializable;

@Entity
data class StageMaster(
    @Id
    @GeneratedValue
    val id: Long,
    val cellsCount: Int
)

@Entity
data class StageCells(
    @EmbeddedId
    val stageCellsId: StageCellsId,
    val type: Int
)

@Embeddable
data class StageCellsId(
    val stageId: Int,
    val cellId: Int
): Serializable