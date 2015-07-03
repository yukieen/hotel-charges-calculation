package model.stay.room;

import model.stay.date.SeasonType;
import model.stay.date.StayDate;
import model.stay.guest.Guests;
import model.stay.guest.NumberOfGuestType;

/**
 * Created by yukieen on 2015/07/03.
 */
public class Room {
    final RoomType type;
    final StayDate date;
    final Guests guests;

    public Room(RoomType type, StayDate date, Guests guests) {
        this.type = type;
        this.date = date;
        this.guests = guests;
    }

    boolean isStayable() {
        if (date.getSeasonType().equals(SeasonType.Disable)) {
            return false;
        }

        if (guests.getNumberOfGuestType(date).equals(NumberOfGuestType.One) && !date.getSeasonType().equals(SeasonType.Off)) {
            return false;
        }

        if (guests.hasWithoutMeals(date) && !date.getSeasonType().equals(SeasonType.Off)) {
            return false;
        }

        return true;
    }
}
