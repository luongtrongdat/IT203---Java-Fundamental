package ktdg.ss16;

import java.util.*;

interface IRepository<T> {
    boolean add(T item);
    boolean removeById(String id);
    T findById(String id);
    List<T> findAll();
}

abstract class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateFinalPrice();

    public void displayInfo() {
        System.out.printf("Ma: %-5s | Ten: %-15s | Gia goc: %,10.0f", id, name, price);
    }
}

public class KTDG_ss16 {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        repo.add(new ElectronicProduct("E001", "Laptop Dell", 15000000, 24));
        repo.add(new ElectronicProduct("E002", "Tivi Sony", 8000000, 12));
        repo.add(new FoodProduct("F001", "Banh Pizza", 150000, 10));
        repo.add(new FoodProduct("F002", "Sua tuoi", 30000, 5));

        do {
            System.out.println("\n===== MENU QUAN LY SAN PHAM =====");
            System.out.println("1. Hien thi toan bo danh sach san pham");
            System.out.println("2. Tim san pham theo ID");
            System.out.println("3. Sap xep danh sach theo gia tang dan");
            System.out.println("4. Thong ke so luong san pham theo loai");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Chon chuc nang: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lua chon khong hop le, vui long nhap so.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\n--- DANH SACH SAN PHAM ---");
                    List<Product> allProducts = repo.findAll();
                    for (Product p : allProducts) {
                        p.displayInfo();
                        System.out.printf(" | Thanh tien: %,10.0f\n", p.calculateFinalPrice());
                    }
                    break;
                case 2:
                    System.out.println("\n--- TIM KIEM SAN PHAM THEO ID ---");
                    System.out.print("Nhap ID san pham can tim: ");
                    String searchId = sc.nextLine();
                    Product found = repo.findById(searchId);
                    if (found != null) {
                        System.out.println("Tim thay san pham:");
                        found.displayInfo();
                        System.out.printf(" | Thanh tien: %,10.0f\n", found.calculateFinalPrice());
                    } else {
                        System.out.println("Khong tim thay san pham voi ID: " + searchId);
                    }
                    break;
                case 3:
                    System.out.println("\n--- DANH SACH SAP XEP THEO GIA TANG DAN ---");
                    List<Product> sortedProducts = repo.findAll();
                    sortedProducts.sort(Comparator.comparingDouble(Product::getPrice));
                    for (Product p : sortedProducts) {
                        p.displayInfo();
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("\n--- THONG KE SO LUONG ---");
                    Map<String, Integer> stats = new HashMap<>();
                    for (Product p : repo.findAll()) {
                        String productType = p instanceof ElectronicProduct ? "Electronic" : "Food";
                        stats.put(productType, stats.getOrDefault(productType, 0) + 1);
                    }
                    for (Map.Entry<String, Integer> entry : stats.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
