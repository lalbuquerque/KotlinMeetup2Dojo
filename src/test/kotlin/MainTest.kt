
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test


class MainTest {

    @Test
    fun inputAmount100() {
        val result = calculateWithdraw(100)
        assertEquals(listOf(100), result)
    }

    @Test
    fun inputAmount200() {
        val result = calculateWithdraw(200)
        assertEquals(listOf(100, 100), result)
    }

    @Test
    fun inputAmount150() {
        val result = calculateWithdraw(150)
        assertEquals(listOf(100, 50), result)
    }

    @Test
    fun inputAmount10() {
        val result = calculateWithdraw(10)
        assertEquals(listOf(10), result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun inputAmount1() {
        calculateWithdraw(1)
    }

    @Test(expected = IllegalArgumentException::class)
    fun inputAmount11() {
        calculateWithdraw(11)
    }

    @Test
    fun inputAmount30() {
        val result = calculateWithdraw(30)
        assertEquals(listOf(20, 10), result)
    }

    @Test
    fun inputAmount180() {
        val result = calculateWithdraw(180)
        assertEquals(listOf(100, 50, 20, 10), result)
    }
    @Test
    fun inputAmount8() {
        val result = calculateWithdraw(8)
        assertEquals(listOf(2, 2, 2, 2), result)
    }

    @Test
    fun inputAmount4() {
        val result = calculateWithdraw(4)
        assertEquals(listOf(2, 2), result)
    }

    @Test
    fun inputAmount7() {
        val result = calculateWithdraw(7)
        assertEquals(listOf(5, 2), result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun inputAmount0() {
        val result = calculateWithdraw(0)
        assertEquals(emptyList<Int>(), result)
    }


    @Test(expected = IllegalArgumentException::class)
    fun inputAmount_1() {
        calculateWithdraw(-1)
    }

}