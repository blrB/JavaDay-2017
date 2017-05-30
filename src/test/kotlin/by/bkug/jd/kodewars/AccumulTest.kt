package by.bkug.jd.kodewars

import org.junit.Assert.assertEquals
import org.junit.Test

class AccumulTest {
    @Test fun test0() {
        assertEquals("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu", accum("ZpglnRxqenU"))
    }

    @Test fun test1() {
        assertEquals("N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb", accum("NyffsGeyylB"))
    }

    @Test fun test2() {
        assertEquals("M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu", accum("MjtkuBovqrU"))
    }

    @Test fun test3() {
        assertEquals("H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc", accum("HbideVbxncC"))
    }

    @Test fun test4() {
        assertEquals("E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm", accum("EvidjUnokmM"))
    }
}