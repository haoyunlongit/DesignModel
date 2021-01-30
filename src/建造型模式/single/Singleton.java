package 建造型模式.single;

/**
 * 饿汉式
 */
public class Singleton {
    private static Singleton sInstance = null;

    public static Singleton getInstance() {
        if (sInstance != null) {
            return sInstance;
        }
        synchronized (Singleton.class) {
            if (sInstance != null) {
                return sInstance;
            }
            sInstance = new Singleton();
        }
        return sInstance;
    }

}
