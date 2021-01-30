package 建造型模式.factory.product;

enum Brand {
    APPLE,
    XIAOMI,
    HUAWEI
}

public interface IPhone {
    void call();
    void sendMessage();
    void network();
}
