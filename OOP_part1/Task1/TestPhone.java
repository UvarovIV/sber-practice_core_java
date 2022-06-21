package OOP_part1.Task1;

public class TestPhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("+7 (921) 144-79-99", "Samsung Galaxy A10", 630);
        Phone phone2 = new Phone("+7 (921) 134-99-79", "Samsung Galaxy A11");
        Phone phone3 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println(phone2.getNumber());

        phone1.receiveCall("Игорь");
        phone3.receiveCall("Михаил", "+7 (953) 328-48-94");

        Phone.sendMessage();
    }
}

