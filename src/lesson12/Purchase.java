package lesson12;

public class Purchase {
    private String product;  // Название товара
    private int qty;         // Количество

    // Конструктор
    public Purchase(String product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    // Геттеры
    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }
}
