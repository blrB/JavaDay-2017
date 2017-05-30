package by.bkug.jd.kodewars

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.Arrays

class FoldArrayTest {
    @Test fun test1() {
        val input = intArrayOf(-9, 9, -8, 8, 66, 23)
        val expected = intArrayOf(14, 75, 0)
        eq(expected, foldArray(input, 1))
    }

    @Test fun test2() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val expected = intArrayOf(15)
        eq(expected, foldArray(input, 3))
    }

    @Test fun test3() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val expected = intArrayOf(9, 6)
        eq(expected, foldArray(input, 2))
    }

    @Test fun test4() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val expected = intArrayOf(6, 6, 3)
        eq(expected, foldArray(input, 1))
    }

    private fun eq(expecteds: IntArray, actuals: IntArray) {
        assertEquals(Arrays.toString(expecteds), Arrays.toString(actuals))
    }
}
