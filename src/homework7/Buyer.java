package homework7;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Buyer extends Thread implements IBuyer, IUseBasket {
    private static final int ENUM_ELEMENTS_COUNT = 16;
    private static final int MAX_GOODS_COUNT = 4;
    private static final int MAX_OPERATION_TIME = 2001;
    private static final int MIN_OPERATION_TIME = 500;
    private final Set<Good> choose = new HashSet<>();
    private int sumGodsInBasket = 0;
    private final String name;

    public Buyer() {
        int namePosition = ThreadLocalRandom.current().nextInt(ENUM_ELEMENTS_COUNT);
        name = Name.values()[namePosition].getName();
    }

    @Override
    public void enterToMarket() {
        System.out.println(name + " enter into the Store!");
    }

    @Override
    public void chooseGoods() {
        try {
            int countOfGoods = ThreadLocalRandom.current().nextInt(MAX_GOODS_COUNT) + 1;
            while (choose.size() < countOfGoods) {
                int goodNumber = ThreadLocalRandom.current().nextInt(ENUM_ELEMENTS_COUNT);
                choose.add(Good.values()[goodNumber]);
            }

            Thread.sleep(getOperationTime());

            System.out.println(name + " choose goods");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void goOut() {
        System.out.println(name + " left the Store after spending " + sumGodsInBasket);
    }

    @Override
    public void takeBasket() {
        try {
            Thread.sleep(getOperationTime());

            System.out.println(name + " took the basket!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void putGoodsToBasket() {
        choose.forEach(good -> {
            try {
                Thread.sleep(getOperationTime());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int cost = Store.getGoods().get(good);
            sumGodsInBasket += cost;
            System.out.println(name + " put the " + good.getString() + " in the basket which cost " + cost);
        });
    }

    @Override
    public void run() {
        enterToMarket();
        takeBasket();
        chooseGoods();
        putGoodsToBasket();
        goOut();
    }

    private int getOperationTime() {
        return ThreadLocalRandom.current().nextInt(MIN_OPERATION_TIME, MAX_OPERATION_TIME);
    }
}
