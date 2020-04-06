package slidingpuzzle

import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@Repository
interface StageCellsRepository : JpaRepository<StageCells, Long> {
    @Query(value = "select * from stage_cells where stage_id = :stageId", nativeQuery = true)
    fun getStage(@Param("stageId") stageId: Int): List<StageCells>
}