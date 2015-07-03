package model.stay;

import model.stay.bedding.Bedding;
import model.stay.date.StayDate;
import model.stay.guest.Guest;
import model.stay.meals.Meals;
import model.stay.room.RoomType;

/**
 * Created by yukieen on 2015/07/03.
 */
public class Stay {
    final StayDate date;
    final RoomType roomType;
    final Meals meals;
    final Bedding bedding;
    final Guest guest;

    public Stay(StayDate date, RoomType roomType, Meals meals, Bedding bedding, Guest guest) {
        this.date = date;
        this.roomType = roomType;
        this.meals = meals;
        this.bedding = bedding;
        this.guest = guest;
    }
};