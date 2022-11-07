public class CandyCount {
    public static void main(String[] args) {
        double money = 12.4;
        double price = 1.2;
        int caddies = 0;
        if  (money > 0 && price >= 0) {
            while (money - price >= 0)
            {
                caddies = caddies + 1;
                money = money - price;
            }
        }
        System.out.println(caddies);
    }    
}