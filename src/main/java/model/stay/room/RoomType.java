package model.stay.room;

import model.charge.staycharge.BasicStayCharge;
import model.charge.staycharge.BasicStayChargeSpecial;
import model.charge.staycharge.BasicStayChargeStandard;

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
