package model.stay.room;

import model.stay.date.StayDate;
import model.stay.guest.Guests;

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

    boolean canStay() {
        return date.canStay(guests);
    }
}
