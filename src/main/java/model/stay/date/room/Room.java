package model.stay.date.room;

import model.stay.date.room.guest.Guests;
/**
 * Created by yukieen on 2015/07/03.
 */
public class Room {
    final RoomType type;
    final Guests guests;

    public Room(RoomType type, Guests guests) {
        this.type = type;
        this.guests = guests;
    }

    public RoomType getType() {
        return type;
    }

    public Guests getGuests() {
        return guests;
    }
}
