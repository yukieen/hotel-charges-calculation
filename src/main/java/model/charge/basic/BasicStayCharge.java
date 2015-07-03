package model.charge.basic;

import model.guest.NumberOfGuestType;
import model.guest.stay.date.SeasonType;

/**
 * Created by yukieen on 2015/07/03.
 */
public interface BasicStayCharge {
    Integer get(SeasonType seasonType, NumberOfGuestType numberOfGuestType);
}
