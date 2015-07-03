package model.stay.guest;

/**
 * Created by yukieen on 2015/07/03.
 */
public class Guest {
    final Age age;
    final Meal meal;
    final Bedding bedding;

    public Guest(Age age, Meal meal, Bedding bedding) {
        this.age = age;
        this.meal = meal;
        this.bedding = bedding;
    }
}
