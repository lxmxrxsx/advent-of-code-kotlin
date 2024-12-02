package y2024.d1

import br.com.le.y2024.Day1
import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals

class Day1Test {

    private val day1: Day1 = Day1()

    @Test
    fun `run part 1`() {
        val res = day1.part1(input())
        assertEquals(1889772, res)
    }

    @Test
    fun `run part 2`() {
        val res = day1.part2(input())
        assertEquals(23228917, res)
    }

    private fun input(): List<String> {
        val filePath = "src/test/resources/day1_input.txt"
        return File(filePath).readLines()
    }

}