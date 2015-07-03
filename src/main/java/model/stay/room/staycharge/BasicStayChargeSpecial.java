package model.stay.room.staycharge;

import model.stay.date.SeasonType;
import model.stay.guest.NumberOfGuestType;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yukieen on 2015/07/03.
 */
public class BasicStayChargeSpecial implements BasicStayCharge {

    final Map<SeasonType, Map<NumberOfGuestType, Integer>> charges;

    public BasicStayChargeSpecial() {
        Map<NumberOfGuestType, Integer> offMap = new HashMap<>();
        offMap.put(NumberOfGuestType.One, 15120);
        offMap.put(NumberOfGuestType.Two, 15120);
        offMap.put(NumberOfGuestType.Three, 15120);
        offMap.put(NumberOfGuestType.MoreThanFour, 15120);

        Map<NumberOfGuestType, Integer> calmMap = new HashMap<>();
        calmMap.put(NumberOfGuestType.One, 0);
        calmMap.put(NumberOfGuestType.Two, 20520);
        calmMap.put(NumberOfGuestType.Three, 18360);
        calmMap.put(NumberOfGuestType.MoreThanFour, 17280);

        Map<NumberOfGuestType, Integer> busyMap = new HashMap<>();
        busyMap.put(NumberOfGuestType.One, 0);
        busyMap.put(NumberOfGuestType.Two, 23760);
        busyMap.put(NumberOfGuestType.Three, 21600);
        busyMap.put(NumberOfGuestType.MoreThanFour, 20520);

        Map<NumberOfGuestType, Integer> peakMap = new HashMap<>();
        peakMap.put(NumberOfGuestType.One, 0);
        peakMap.put(NumberOfGuestType.Two, 24840);
        peakMap.put(NumberOfGuestType.Three, 22680);
        peakMap.put(NumberOfGuestType.MoreThanFour, 21600);

        charges = new HashMap<>();
        charges.put(SeasonType.Off, offMap);
        charges.put(SeasonType.Calm, calmMap);
        charges.put(SeasonType.Busy, busyMap);
        charges.put(SeasonType.Peak, peakMap);
    }

    @Override
    public Integer get(SeasonType seasonType, NumberOfGuestType numberOfGuestType) {
        return charges.get(seasonType).get(numberOfGuestType);
    }

}