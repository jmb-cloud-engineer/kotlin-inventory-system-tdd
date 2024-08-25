import java.time.LocalDate

data class Item(
    val name: String,
    val sellByDate: LocalDate,
    val quantity: UInt
)