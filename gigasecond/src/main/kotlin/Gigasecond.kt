import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Gigasecond {
    val date : LocalDateTime

    constructor(date : LocalDate) {
        var dateTime = LocalDateTime.of(date, LocalTime.of(0, 0, 0))
        this.date = dateTime.plusSeconds(1000000000)
    }
    constructor(datetime : LocalDateTime) {
        this.date = datetime.plusSeconds(1000000000)
    }
}
