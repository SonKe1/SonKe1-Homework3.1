public class BonusMilesService {
    public int calculate(int cost) {
        int price = cost;
        int bonus = 20;
        int mile = price / bonus;
        return mile;

    }

}
