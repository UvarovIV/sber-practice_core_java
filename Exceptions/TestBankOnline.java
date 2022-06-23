package Exceptions;

public class TestBankOnline {
    public static void main(String[] args) {
        BankOnline bankOnline = new BankOnline();
        String cardNumber = "4276 1200 3215 6573";
        
        bankOnline.send(null, null);

        bankOnline.send(cardNumber, null);

        bankOnline.send(null, 200.0);

        bankOnline.send(cardNumber, 100_000.0);

        bankOnline.send(cardNumber, -100_000.0);

        cardNumber = "4276 1200 3215 657";

        bankOnline.send(cardNumber, 2_000.0);

        cardNumber = "4276 1200 3215 657a";

        bankOnline.send(cardNumber, 2_000.0);

        cardNumber = "1111 1111 1111 1111";

        bankOnline.send(cardNumber, 2_000.0);

        cardNumber = "4276 1200 3215 6573";

        bankOnline.send(cardNumber, 2_000.0);
    }
}
