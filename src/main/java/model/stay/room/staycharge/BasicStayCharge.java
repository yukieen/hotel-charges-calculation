package model.stay.room.staycharge;

import model.stay.date.SeasonType;
import model.stay.guest.NumberOfGuestType;

/**
 * Created by yukieen on 2015/07/03.
 */
public interface BasicStayCharge {
    Integer get(SeasonType seasonType, NumberOfGuestType numberOfGuestType);
}
