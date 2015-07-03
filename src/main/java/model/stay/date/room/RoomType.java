package model.stay.date.room;

/**
 * Created by yukieen on 2015/07/03.
 */
public enum RoomType {
    Standard(15120),
    Special(11880);

    private BaseCharge charge;

    RoomType(int charge) {
        this.charge = new BaseCharge(charge);
    }

    public BaseCharge getCharge() {
        return charge;
    }
}
