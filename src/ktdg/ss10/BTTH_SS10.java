package ktdg.ss10;

interface IMixable {
    void mix();
}

abstract class Drink {
    protected String id;
    protected String name;
    protected double price;

    public Drink(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculatePrice();

    public void displayInfo() {
        System.out.println("Ma: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Gia goc: " + price);
    }
}

// 1. Class Coffee
class Coffee extends Drink {
    private boolean hasMilk;

    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice() {
        return hasMilk ? price + 5000 : price;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(hasMilk ? "Co sua" : "Đen da");
    }
}

// 2. Class FruitJuice
class FruitJuice extends Drink implements IMixable {
    private int discountPercent;

    public FruitJuice(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculatePrice() {
        return price - (price * discountPercent / 100.0);
    }

    @Override
    public void mix() {
        System.out.println("Dang ep trai cay tuoi...");
    }
}

public class BTTH_SS10 {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];

        drinks[0] = new Coffee("CF001", "Bac siu", 30000, true);
        drinks[1] = new FruitJuice("FJ001", "Nuoc cam", 40000,  10);
        drinks[2] = null;

        for (Drink drink : drinks) {
            if (drink != null) {
                drink.displayInfo();
                System.out.println("Thanh tien: " + drink.calculatePrice());
                if (drink instanceof IMixable) {
                    ((IMixable) drink).mix();
                }
                System.out.println("--------------------");
            }
        }
    }
}
