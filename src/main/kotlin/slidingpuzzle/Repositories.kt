package slidingpuzzle

import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@Repository
interface StageMasterRepository : JpaRepository<StageMaster, Long> {
    @Query(value = "select * from stage_master where cells_count = :cellsCount order by rand() limit 1", nativeQuery = true)
    fun findOneByCellsCount(@Param("cellsCount") cellsCount: Int): StageMaster?
}

@Repository
interface StageCellsRepository : JpaRepository<StageCells, Long> {
    @Query(value = "select * from stage_cells where stage_id = :stageId", nativeQuery = true)
    fun getStage(@Param("stageId") stageId: Long): List<StageCells>
}
