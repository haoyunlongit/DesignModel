package 建造型模式.single;

/**
 * 饿汉式
 */
public class SingleInstanceClass {
    private static SingleInstanceClass sInstance = new SingleInstanceClass();

    public static SingleInstanceClass getInstance() {
        return sInstance;
    }
}
