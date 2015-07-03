package model.stay.date;

import java.time.LocalDate;

/**
 * Created by yukieen on 2015/07/03.
 */
public class StayDate {
    final LocalDate value;
    final SeasonType seasonType;

    public StayDate(LocalDate value, SeasonType seasonType) {
        this.value = value;
        this.seasonType = seasonType;
    }

    public LocalDate getValue() {
        return value;
    }

    public SeasonType getSeasonType() {
        return seasonType;
    }
}
