class CandyCount {

    public static void main(String[] args) {
        double realMoney = 12.4;
        double realPrice = 1.2;
        int entiesCandies = 0;

    while(realMoney > 0 && realPrice > 0) {
            entiesCandies += 1;
            realMoney = realMoney - realPrice;
        }
    System.out.println(entiesCandies);
    }
}