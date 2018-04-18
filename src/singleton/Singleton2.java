package singleton;

/**
 * 懒汉式
 是否 Lazy 初始化：是
 是否多线程安全：是
 *
 */
public class Singleton2 {

    private static Singleton2 singleton2;

    public Singleton2() {
    }

    public synchronized static Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
