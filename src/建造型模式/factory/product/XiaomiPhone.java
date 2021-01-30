package 建造型模式.factory.product;

import 建造型模式.factory.product.IPhone;

public class XiaomiPhone implements IPhone {
    @Override
    public void call() {
        System.out.println("~~~~~ user xiaomi phone call");
    }

    @Override
    public void sendMessage() {

    }

    @Override
    public void network() {

    }
}
