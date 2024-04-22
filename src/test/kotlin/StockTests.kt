import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class Tests {

    private val now = LocalDate.parse("2024-04-22")

    @Test
    fun `add item to stock`() {
        val stock = listOf<Item>()
        assertEquals(
            listOf<Item>(),
            stock
        )

        val newStock = stock + Item("banana", now.minusDays(1), 42u)
        assertEquals(
            listOf(Item("banana", now.minusDays(1), 42u)),
            newStock
        )
    }

    @Test
    fun `print empty stock list`() {
        val stock = listOf<Item>()
        val expected = listOf("22 de abril de 2024")

        assertEquals(expected, stock.printout(now))
    }

    @Test
    fun `print non-empty stock list`() {
        val stock = listOf<Item>(
            Item("banana", now.minusDays(1), 42u),
            Item("kumquat", now.plusDays(1), 23u),
        )
        val expected = listOf(
            "22 de abril de 2024",
            "banana, -1, 42",
            "kumquat, 1, 23"
        )

        assertEquals(expected, stock.printout(now))
    }
}