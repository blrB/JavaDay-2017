package by.bkug.jd.kodewars

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class TortoiseTest {
    @Test fun test1() {
        assertArrayEquals(intArrayOf(0, 32, 18), race(720, 850, 70))
    }

    @Test fun test2() {
        assertArrayEquals(intArrayOf(3, 21, 49), race(80, 91, 37))
    }

    @Test fun test3() {
        assertArrayEquals(intArrayOf(2, 0, 0), race(80, 100, 40))
    }
}