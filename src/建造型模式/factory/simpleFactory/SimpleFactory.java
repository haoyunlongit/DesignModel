package 建造型模式.factory.simpleFactory;

import 建造型模式.factory.product.*;

public class SimpleFactory {
    IPhone createPhone(Brand brand) {
        switch (brand) {
            case APPLE:
                return new ApplePhone();
            case HUAWEI:
                return new HuaWeiPhone();
            case XIAOMI:
                return new XiaomiPhone();
            default:
                throw new IllegalArgumentException("不被支持的类型");

        }
    }

}
