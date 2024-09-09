package mid_2.collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cart {

    Map<Product, Integer> cart = new HashMap<>();

    public void add(Product p, int q) {
        cart.put(p, cart.getOrDefault(p, 0) + q);
    }

    public void minus(Product p, int q) {
        if (cart.containsKey(p)) {
            int restQuantity = cart.get(p) - q;
            if (restQuantity <= 0) {
                cart.remove(p);
                return;
            }
            cart.put(p, cart.get(p) - q);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Entry<Product, Integer> e : cart.entrySet()) {
            System.out.println("상품: " + e.getKey() + " 수량: " + e.getValue());
        }
    }
}
