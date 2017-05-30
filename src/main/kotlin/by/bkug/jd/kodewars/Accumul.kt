package by.bkug.jd.kodewars

/**
 * This time no story, no theory. The examples below show you how to write function accum:
 * Examples:
 *
 * Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
 * Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
 *
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */
fun accum(s: String): String {
    var result = ""
    s.forEachIndexed {  i, c ->
        val separate = if (i == 0) "" else "-"
        result += separate + c.toString().repeat(i + 1).toLowerCase().capitalize()
    }
    return result
}