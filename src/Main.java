public class Main {
    public static void main(String[] args) {
        int price = 15_600; //стоимость билета
        int mili = 20; // количество рублей для одной бонусной мили

        System.out.println("Колличество бонусных миль от стоимости билета:");
        System.out.println((price/mili) + (" бонусных(е) миль(и)"));
    }

}
