import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Gigasecond {
    val date : LocalDateTime

    constructor(date : LocalDate): this(LocalDateTime.of(date, LocalTime.of(0, 0, 0)))
    constructor(datetime : LocalDateTime) {
        this.date = datetime.plusSeconds(1_000_000_000)
    }
}
