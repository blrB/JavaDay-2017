package by.bkug.jd.kodewars

/**
 * Description:
 * Take 2 strings s1 and s2 including only letters from a to z.
 * Return a new sorted string, the longest possible, containing distinct letters,
 * - each taken only once - coming from s1 or s2.
 *
 * Examples:
 *
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq"
 * longest(a, b) -> "abcdefklmopqwxy"
 *
 * a = "abcdefghijklmnopqrstuvwxyz"
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */
fun longest(s1: String, s2: String): String {
    return String((s1 + s2).toCharArray().distinct().sorted().toCharArray())
}