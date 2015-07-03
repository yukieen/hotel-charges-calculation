package model.guest.stay;

import model.guest.Guests;
import model.guest.NumberOfGuestType;
import model.guest.stay.date.SeasonType;

/**
 * Created by yukieen on 2015/07/03.
 */
public class Stay {
    final Guests guests;

    public Stay(Guests guests) {
        this.guests = guests;
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
