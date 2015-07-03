package model.stay.date;

import model.stay.date.room.Rooms;

import java.time.LocalDate;

/**
 * Created by yukieen on 2015/07/03.
 */
public class StayDate {
    final LocalDate value;
    final SeasonType seasonType;
    final Rooms rooms;

    public StayDate(LocalDate value, SeasonType seasonType, Rooms rooms) {
        this.value = value;
        this.seasonType = seasonType;
        this.rooms = rooms;
    }

    public LocalDate getValue() {
        return value;
    }

    public SeasonType getSeasonType() {
        return seasonType;
    }

    public Rooms getRooms() {
        return rooms;
    }
}
