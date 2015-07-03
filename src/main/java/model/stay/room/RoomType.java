package model.stay.room;

import model.stay.room.staycharge.BasicStayCharge;
import model.stay.room.staycharge.BasicStayChargeSpecial;
import model.stay.room.staycharge.BasicStayChargeStandard;

/**
 * Created by yukieen on 2015/07/03.
 */
public enum RoomType {
    Standard(new BasicStayChargeStandard()),
    Special(new BasicStayChargeSpecial());

    final BasicStayCharge basicStayCharge;

    RoomType(BasicStayCharge basicStayCharge) {
        this.basicStayCharge = basicStayCharge;
    }
}
