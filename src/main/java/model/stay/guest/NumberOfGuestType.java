package model.stay.guest;

import java.util.Objects;

/**
 * Created by yukieen on 2015/07/03.
 */
public enum NumberOfGuestType {
    One(1),
    Two(2),
    Three(3),
    MoreThanFour(4);

    private final Integer number;

    NumberOfGuestType(Integer number) {
        this.number = number;
    }

    public boolean equals(Integer number) {
        return Objects.equals(this.number, number);
    }
}
