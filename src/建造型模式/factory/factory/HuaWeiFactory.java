package 建造型模式.factory.factory;

import 建造型模式.factory.product.HuaWeiPhone;
import 建造型模式.factory.product.IPhone;

public class HuaWeiFactory implements IFactory {
    @Override
    public IPhone createProduct() {
        return new HuaWeiPhone();
    }
}
