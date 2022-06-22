package OOP_part1.Task5;

public class PizzaOrder {
    private String title;
    public enum Size {
        SMALL,
        MEDIUM,
        BIG
    }
    private Size size;
    private boolean sauce;
    private String adress;
    private boolean orderAccepted = false;

    public PizzaOrder(String title, Size size, boolean sauce, String adress){
        this.title = title;
        
        if (size == Size.SMALL){
            this.size = Size.SMALL;
        } else if (size == Size.MEDIUM){
            this.size = Size.MEDIUM;
        } else if (size == Size.BIG) {
            this.size = Size.BIG;
        }

        this.sauce = sauce;
        this.adress = adress;
    }

    public void order(){
        if (orderAccepted){
            System.out.println("Заказ уже принят");
            return;
        }

        orderAccepted = true;

        String pizzaSize;
        if (size == Size.SMALL){
            pizzaSize = "Маленькая";
        } else if (size == Size.MEDIUM){
            pizzaSize = "Средняя";
        } else {
            pizzaSize = "Большая";
        }

        String sauceAvailability;
        if (sauce){
            sauceAvailability = "с соусом";
        } else {
            sauceAvailability = "без соуса";
        }

        System.out.println("Заказ принят. " + pizzaSize + " пицца <<" + title + ">> " + sauceAvailability + " на адрес " + adress);
    }

    public void cancel(){
        if (orderAccepted){
            orderAccepted = false;
            System.out.println("Заказ отменён");
        } else {
            System.out.println("Заказ не был принят");
        }
    }

    public String getTitle() {
        return title;
    }

    public Size getSize() {
        return size;
    }

    public boolean isSauce() {
        return sauce;
    }

    public String getAdress() {
        return adress;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSize(Size size) {
        if (size == Size.SMALL){
            this.size = Size.SMALL;
        } else if (size == Size.MEDIUM){
            this.size = Size.MEDIUM;
        } else if (size == Size.BIG) {
            this.size = Size.BIG;
        }
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return String.format("Название пиццы: %s, Размер пиццы: %s, Соус заказан: %s, Заказ принят: %s, Адрес: %s", title, size, sauce, orderAccepted, adress);
    }
}
