package day45_Exceptions.PhoneTask;

public final class Samsung extends phone {

            public Samsung(String model, double price) {
                super("Samsung", model, "South Korea", price);
            }

            public void freeze() {
                System.out.println(brand + " " + model + " is freezing");
            }

        }


