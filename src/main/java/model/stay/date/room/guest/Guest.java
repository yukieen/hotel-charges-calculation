package model.stay.date.room.guest;

import model.stay.date.StayDate;

/**
 * Created by yukieen on 2015/07/03.
 */
class Guest {
    final Age age;
    final Meals meals;
    final Bedding bedding;

    public Guest(Age age, Meals meals, Bedding bedding) {
        this.age = age;
        this.meals = meals;
        this.bedding = bedding;
    }

    public boolean isChild(StayDate date) {
        return age.value <= 6 && date.getValue().getMonthValue() <= 3;
    }

    public boolean isElementarySchoolStudent(StayDate date) {
        return (age.value >= 6 && date.getValue().getMonthValue() >= 4)
                || (age.value <= 12 && date.getValue().getMonthValue() <= 3);
    }
}
