package model.stay.date;

import model.stay.guest.Guests;
import model.stay.guest.NumberOfGuestType;

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

    public boolean canStay(Guests guests) {
        if (seasonType.equals(SeasonType.Disable)) {
            return false;
        }

        if (guests.getNumberOfGuestType(this).equals(NumberOfGuestType.One) && !seasonType.equals(SeasonType.Off)) {
            return false;
        }

        if (guests.hasWithoutMeals(this) && !seasonType.equals(SeasonType.Off)) {
            return false;
        }

        return true;
    }
}
