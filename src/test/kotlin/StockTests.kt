import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class StockTests {

    private val sellBy = LocalDate.parse("2024-04-22")

    @Test
    fun `add item to stock`() {
        val stock = listOf<Item>()
        assertEquals(
            listOf<Item>(),
            stock
        )

        val newStock = stock + Item("banana", sellBy.minusDays(1), 42u)
        assertEquals(
            listOf(Item("banana", sellBy.minusDays(1), 42u)),
            newStock
        )
    }
}