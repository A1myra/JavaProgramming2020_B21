package day50_Polymorphism.phoneTask;

public class Samsung extends phone implements AndroidApps {
    public Samsung(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);

        if (price > 1200) {
            throw new RuntimeException("Invalid Price, Samsung's price cannot be more than 1200 ");
        }
    }
    @Override
    public void downloadApp() {
        System.out.println("Downloading app from"+appStoreName);
    }

    @Override
    public void text() {
        System.out.println("Samsung is texting");
    }

    @Override
    public void call() {
        System.out.println("Samsung is calling");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price + '\''+
                "OS="+OS+
                '}';
    }
}
