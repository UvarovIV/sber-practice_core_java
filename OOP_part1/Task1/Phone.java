package OOP_part1.Task1;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
        weight = 0;
    }

    public Phone(){
        number = "Not Found";
        model = "Not Found";
        weight = 0;
    }

    public void receiveCall(String name){
        System.out.println("Звонит: " + name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Звонит: " + name);
        System.out.println("Номер: " + number);
    }

    public String getNumber(){
        return number;
    }

    public static void sendMessage(){
        String[] numbers = {"+7 (921) 144-78-93", "+7 (921) 144-78-94",
                            "+7 (921) 144-78-95", "+7 (921) 144-78-96",
                            "+7 (921) 144-88-91", "+7 (921) 144-98-92" };
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    
    @Override
    public String toString(){
        return String.format("Номер: %s, Модель: %s, Вес: %s", number, model, weight);
    }
}
