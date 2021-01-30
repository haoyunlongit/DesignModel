package 建造型模式.factory;

import 建造型模式.factory.factory.IFactory;
import 建造型模式.factory.factory.XiaomiFactory;
import 建造型模式.factory.product.IPhone;

public class FactoryTest {
    public static void main(String[] args) {
        IFactory factory = new XiaomiFactory();
        IPhone phone = factory.createProduct();
        phone.call();
    }
}
