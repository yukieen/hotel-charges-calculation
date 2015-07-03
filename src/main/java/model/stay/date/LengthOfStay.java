package model.stay.date;

import java.util.List;

/**
 * Created by yukieen on 2015/07/04.
 */
public class LengthOfStay {
    List<StayDate> values;

    public LengthOfStay(List<StayDate> values) {
        this.values = values;
    }

    public List<StayDate> getValues() {
        return values;
    }
}
