package model.stay.guest;

import model.stay.date.StayDate;

/**
 * Created by yukieen on 2015/07/03.
 */
public class Guest {
    final Age age;

    public Guest(Age age) {
        this.age = age;
    }

    public boolean isChild(StayDate date) {
        return age.value <= 6 && date.getValue().getMonthValue() <= 3;
    }

    public boolean isElementarySchoolStudent(StayDate date) {
        return (age.value >= 6 && date.getValue().getMonthValue() >= 4)
                || (age.value <= 12 && date.getValue().getMonthValue() <= 3);
    }
}
