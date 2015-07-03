package model.stay.date;

/**
 * Created by yukieen on 2015/07/03.
 */
public enum SeasonType {
    Peak(6480),
    Busy(5400),
    Calm(2160),
    Off(0),
    Close(0);

    private SeasonCharge charge;

    SeasonType(int charge) {
        this.charge = new SeasonCharge(charge);
    }

    public SeasonCharge getCharge() {
        return charge;
    }
}
