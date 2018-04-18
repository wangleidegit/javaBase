package singleton;

/**
 * 懒汉式
 是否 Lazy 初始化：是
 是否多线程安全：否

 *
 */
public class Singleton1 {

    private static Singleton1 singleton1;

    public Singleton1() {
    }

    public static Singleton1 getInstance(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
