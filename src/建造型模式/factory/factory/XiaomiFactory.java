package 建造型模式.factory.factory;

import 建造型模式.factory.product.IPhone;
import 建造型模式.factory.product.XiaomiPhone;

public class XiaomiFactory implements IFactory {
    @Override
    public IPhone createProduct() {
        return new XiaomiPhone();
    }
}
