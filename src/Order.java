import java.util.Arrays;
import java.util.Objects;

public class Order {
    public String customer;
    public Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Покупатель " + customer + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        if (this.customer == null && order.customer == null) {
            return true;
        }
        if (this.customer == null || order.customer == null) {
            return false;
        }
        if (!this.customer.equals(order.customer)) {
            return false;
        }
        if (this.basket == order.basket) {
            return true;
        }
        if (this.basket == null || order.basket == null) {
            return false;
        }
        if (this.basket.length != order.basket.length) {
            return false;
        }
        for (int i = 0; i < this.basket.length; i++) {
            if (this.basket[i] == null && order.basket[i] == null) {
                continue;
            }
            if (this.basket[i] == null || order.basket[i] == null) {
                return false;
            }
            if (!this.basket[i].equals(order.basket[i])) {
                return false;
            }
        }
        return true;
    }
}

