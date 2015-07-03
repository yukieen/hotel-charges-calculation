package model.stay.guest;

import model.stay.date.StayDate;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by yukieen on 2015/07/03.
 */
public class Guests {
    final List<Guest> values;

    public Guests(List<Guest> values) {
        this.values = values;
    }

    NumberOfGuestType getNumberOfGuestType(StayDate date) {
        // 幼児だけで宿泊すると０人になるけど実際なさげなので無視
        long number = values.stream()
                .filter(guest -> !guest.isKid(date))
                .count();

        return Stream.of(NumberOfGuestType.values())
                .filter(type -> type.equals(Long.valueOf(number).intValue()))
                .findFirst()
                .orElse(NumberOfGuestType.MoreThanFour);
    }
}
