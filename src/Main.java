//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(123, "кофе", 268, "чай и кофе");
        Product product2 = new Product(456, "сыр", 156, "молочные продукты");
        Product product3 = new Product(265, "аленка", 350, "конфеты");
        Product product4 = new Product(123, "кофе", 268, "чай и кофе");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));
        System.out.println(product1.equals(product4));
        System.out.println(product2.equals(product3));
        System.out.println(product2.equals(product4));
        System.out.println(product3.equals(product4));
        Product[] products = {product1, product2, product3, product4};
        Order order1 = new Order("Татьяна", new Product[]{product1});
        Order order2 = new Order("Иван", new Product[]{product2});
        Order order3 = new Order("Татьяна", new Product[]{product1});
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order1.equals(order2));
        System.out.println(order1.equals(order3));
        System.out.println(order2.equals(order3));
    }
}


