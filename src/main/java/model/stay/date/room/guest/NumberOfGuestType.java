package model.stay.date.room.guest;

/**
 * Created by yukieen on 2015/07/04.
 */
public enum NumberOfGuestType {
    One(1, 2160),
    Two(2, 2160),
    Three(3, 1080),
    MoreThanFour(4, 0);

    private final int number;
    private final NumberOfGuestCharge charge;

    NumberOfGuestType(int number, int charge) {
        this.number = number;
        this.charge = new NumberOfGuestCharge(charge);
    }

    public boolean equals(int number) {
        return this.number == number;
    }

    public NumberOfGuestCharge getCharge() {
        return charge;
    }
}
