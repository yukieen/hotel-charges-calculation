package model.stay.guest;

import model.stay.date.StayDate;

/**
 * Created by yukieen on 2015/07/03.
 */
public class Guest {
    final Age age;
    final Meal meal;
    final Bedding bedding;

    public Guest(Age age, Meal meal, Bedding bedding) {
        this.age = age;
        this.meal = meal;
        this.bedding = bedding;
    }

    boolean isKid(StayDate date) {
        return age.value <= 6 && date.getValue().getMonthValue() <= 3;
    }

    boolean isElementarySchoolStudent(StayDate date) {
        return (age.value >= 6 && date.getValue().getMonthValue() >= 4)
                || (age.value <= 12 && date.getValue().getMonthValue() <= 3);
    }
}
