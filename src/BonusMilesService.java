public class BonusMilesService {
    public int calculate(int price) {
        int miles;
        int bonusMiles = 20; // стоимость бонусной мили.
        miles = price / bonusMiles; // количество бонусных миль за покупку билета.
        return miles;
    }


}
