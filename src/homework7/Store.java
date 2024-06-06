package homework7;

import java.util.HashMap;

import static homework7.Good.*;

public class Store {
    private static HashMap<Good, Integer> goods;

    public static HashMap<Good, Integer> getGoods() {
        if (goods == null) {
            initGoods();
        }
        return goods;
    }

    private static void initGoods() {
        goods = new HashMap<>();
        goods.put(BACKPACK, 14);
        goods.put(WATERMELON, 8);
        goods.put(COFFEE, 2);
        goods.put(BRUSH, 4);
        goods.put(LAPTOP, 20);
        goods.put(NOTEBOOK, 5);
        goods.put(HEADPHONES, 18);
        goods.put(SUNGLASSES, 6);
        goods.put(UMBRELLA, 5);
        goods.put(SNEAKERS, 7);
        goods.put(WATCH, 100);
        goods.put(CAMERA, 17);
        goods.put(SHAMPOO, 1);
        goods.put(TOOTHPASTE, 1);
        goods.put(CHOCOLATE, 1);
        goods.put(T_SHIRT, 3);
    }
}
