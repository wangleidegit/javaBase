package List;

/**
 * Created by Tao on 2018/3/26.
 */
public class MyList{

    private Object[] elementData;

    private int size = 0;

    private static final int DEFAULTCAPACITY = 10;

    public MyList(int initialCapacity){
        if(initialCapacity > 0){
            elementData = new Object[initialCapacity];
        }else{
            throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
        }
    }

    public MyList(){
        this(10);
    }

    public void add(Object object){
        if(size >= elementData.length){
            //扩容
            Object[] newObject = new Object[size * 2 + 1];
            System.arraycopy(elementData, 0, newObject, 0, elementData.length);
            elementData = newObject;
        }
        elementData[size++] = object;
    }

    public void add(int index, Object object){
        if(index >= size){
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }
        if(size >= elementData.length){
            //扩容
            Object[] newObject = new Object[size * 2 + 1];
            System.arraycopy(elementData, 0, newObject, 0, elementData.length);
            elementData = newObject;
        }

        System.arraycopy(elementData, index , elementData, index + 1, size - index);
        elementData[index] = object;
        size++;
    }

    public Object get(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }
        return elementData[index];
    }

    public Boolean isEmpty(){
        return size == 0;
    }

    public void remove(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }
        System.arraycopy(elementData, index, elementData, index - 1, size - index);
        elementData[size--] = null;
    }

    public void remove(Object object){
        for (int i = 0; i < size; i++){
            if(get(i).equals(object)){
                remove(i);
            }
        }
    }

    /**
     * 设置索引对应的元素
     * @param index
     * @param object
     * @return
     */
    public Object set(int index, Object object){
        if(index >= size){
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }
        Object elementDatum = elementData[index];
        elementData[index] = object;
        return elementDatum;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.remove(1);
        myList.add(1,"ceshi");
        Object o = myList.get(1);

        System.out.println(o);
    }
}
