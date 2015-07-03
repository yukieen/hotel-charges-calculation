package model.stay;

import model.stay.date.LengthOfStay;

/**
 * Created by yukieen on 2015/07/03.
 */
public class Stay {
    final LengthOfStay lengthOfStay;

    public Stay(LengthOfStay lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public LengthOfStay getLengthOfStay() {
        return lengthOfStay;
    }

};