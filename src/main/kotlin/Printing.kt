import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.time.temporal.ChronoUnit.DAYS

private val format: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)

public fun List<Item>.printout(now: LocalDate?): List<String> =
    //Header + items description
    listOf(format.format(now)) + this.map {
        it.toPrintout(now)

    }

private fun Item.toPrintout(now: LocalDate?): String =
    "$name, ${daysUntilSellBy(now)}, $quantity"

private fun Item.daysUntilSellBy(now: LocalDate?): Long = DAYS.between(now, this.sellByDate)
