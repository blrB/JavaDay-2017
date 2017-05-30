package by.bkug.jd.kodewars

import org.junit.Assert.assertEquals
import org.junit.Test

class LongestTest {
    @Test fun test1() {
        assertEquals("aehrsty", longest("aretheyhere", "yestheyarehere"))
    }

    @Test fun test2() {
        assertEquals("abcdefghilnoprstu", longest("loopingisfunbutdangerous", "lessdangerousthancoding"))
    }

    @Test fun test3() {
        assertEquals("acefghilmnoprstuy", longest("inmanylanguages", "theresapairoffunctions"))
    }
}