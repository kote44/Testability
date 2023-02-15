public class BonusMilesService {
    public int calculate(int price) {
        int miles;
        int bonusmiles = 20; // стоимость бонусной мили.
        miles = price / bonusmiles; // количество бонусных миль за покупку билета.
        return miles;
    }


    }
