package model.stay.room;

import model.charge.basic.BasicStayCharge;
import model.charge.basic.BasicStayChargeSpecial;
import model.charge.basic.BasicStayChargeStandard;

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
