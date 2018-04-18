package List;

/**
 * Created by Tao on 2018/3/26.
 */
public class MyGenericParadigm<E> {

    public E name;

    public MyGenericParadigm(E name) {
        this.name = name;
    }

    public MyGenericParadigm() {
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public static void main(String[] args) {
        MyGenericParadigm<Integer> myGenericParadigm = new MyGenericParadigm();
        myGenericParadigm.setName(1);
        Integer name = myGenericParadigm.getName();


    }
}
