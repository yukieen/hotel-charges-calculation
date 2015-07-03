package model.stay.date.room.guest;

import model.stay.date.StayDate;

import java.util.List;

/**
 * Created by yukieen on 2015/07/04.
 */
public class Guests {
    final List<Guest> values;

    public Guests(List<Guest> values, StayDate date) {
        this.values = values;
    }

    public List<Guest> getValues() {
        return values;
    }

    public Integer count(StayDate date) {
        long count = values.stream()
                .filter(guest -> !guest.isChild(date))
                .count();
        return Long.valueOf(count).intValue();
    }

}
