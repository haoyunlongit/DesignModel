package 建造型模式.factory.abstractFactory;

import 建造型模式.factory.product.IPhone;

public interface IFactory {
    IPhone createPhone();

    IWatch createWatch();

    IComputor createComputor();
}
