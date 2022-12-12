package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Banan", "żółty owoc tropikalny", 2.50, "fruits");
        Product product2 = new Product("Cebula", "doprowadzi Cię do łez", 1.25, "vegetables");
        Product product3 = new Product("Lays", "prosto z pieca", 4.0, "czipsy");
        Calculate calculate = new Calculate();
        product1.getInfo();
        System.out.printf("Koszt produktu brutto: %.2f%n", calculate.grossCalculating(product1));
        product2.getInfo();
        System.out.printf("Koszt produktu brutto: %.2f%n", calculate.grossCalculating(product2));
        product3.getInfo();
        System.out.printf("Koszt produktu brutto: %.2f%n", calculate.grossCalculating(product3));
    }
}
