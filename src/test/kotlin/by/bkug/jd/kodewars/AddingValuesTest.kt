package by.bkug.jd.kodewars

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import java.util.Arrays

class AddingValuesTest {
    @Test fun test1() {
        val arrayOfArrays = arrayOf(intArrayOf(1, 2, 3, 4, 5, 6), intArrayOf(7, 7, 7, 7, 7, 7))
        val expected = intArrayOf(8, 9, 10, 11, 12, 13)
        val result: IntArray = addingShifted(arrayOfArrays, 0)
        assertNotNull(result)
        assertEquals(Arrays.toString(expected), Arrays.toString(result))
    }

    @Test fun test2() {
        val arrayOfArrays = arrayOf(intArrayOf(1, 2, 3, 4, 5, 6), intArrayOf(7, 7, 7, 7, 7, 7))
        val expected = intArrayOf(1, 2, 3, 11, 12, 13, 7, 7, 7)
        val result = addingShifted(arrayOfArrays, 3)
        assertNotNull(result)
        assertEquals(Arrays.toString(expected), Arrays.toString(result))
    }

    @Test fun test3() {
        val arrayOfArrays = arrayOf(intArrayOf(1, 2, 3, 4, 5, 6), intArrayOf(7, 7, 7, -7, 7, 7), intArrayOf(1, 1, 1, 1,
            1, 1))
        val expected = intArrayOf(1, 2, 3, 11, 12, 13, -6, 8, 8, 1, 1, 1)
        val result = addingShifted(arrayOfArrays, 3)
        assertNotNull(result)
        assertEquals(Arrays.toString(expected), Arrays.toString(result))
    }
}