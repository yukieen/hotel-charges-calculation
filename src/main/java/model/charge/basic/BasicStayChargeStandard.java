package model.charge.basic;

import model.guest.NumberOfGuestType;
import model.guest.stay.date.SeasonType;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yukieen on 2015/07/03.
 */
public class BasicStayChargeStandard implements BasicStayCharge {

    final Map<SeasonType, Map<NumberOfGuestType, Integer>> charges;

    public BasicStayChargeStandard() {
        Map<NumberOfGuestType, Integer> offMap = new HashMap<>();
        offMap.put(NumberOfGuestType.One, 11880);
        offMap.put(NumberOfGuestType.Two, 11880);
        offMap.put(NumberOfGuestType.Three, 11880);
        offMap.put(NumberOfGuestType.MoreThanFour, 11880);

        Map<NumberOfGuestType, Integer> calmMap = new HashMap<>();
        calmMap.put(NumberOfGuestType.One, 0);
        calmMap.put(NumberOfGuestType.Two, 17280);
        calmMap.put(NumberOfGuestType.Three, 15120);
        calmMap.put(NumberOfGuestType.MoreThanFour, 14040);

        Map<NumberOfGuestType, Integer> busyMap = new HashMap<>();
        busyMap.put(NumberOfGuestType.One, 0);
        busyMap.put(NumberOfGuestType.Two, 20520);
        busyMap.put(NumberOfGuestType.Three, 18360);
        busyMap.put(NumberOfGuestType.MoreThanFour, 17280);

        Map<NumberOfGuestType, Integer> peakMap = new HashMap<>();
        peakMap.put(NumberOfGuestType.One, 0);
        peakMap.put(NumberOfGuestType.Two, 21600);
        peakMap.put(NumberOfGuestType.Three, 19440);
        peakMap.put(NumberOfGuestType.MoreThanFour, 18360);

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
