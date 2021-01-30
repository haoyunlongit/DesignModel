package 建造型模式.factory.factory;

import 建造型模式.factory.product.ApplePhone;
import 建造型模式.factory.product.IPhone;

public class AppleFactory implements IFactory {
    @Override
    public IPhone createProduct() {
        return new ApplePhone();
    }
}
