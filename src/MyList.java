import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private Object[] element;
    private final static int DEFAULT_CAPACITY = 10;

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        this.element = new Object[size];
    }

    public void ensureCapacity(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element,newSize);
    }
    public void add (E e){
        if (size >= element.length){
            ensureCapacity();
        }
        element[size] = e;
        size++;
    }
    public void add(int index,E e){
        if (size >= element.length){
            ensureCapacity();
        }
        if (index >= size){
            element[size] = e;
            size++;
        }else {
            element[size] = element[size];
            for (int i = size + 1; i > index; i--){
                element[i] = element[i-1];
            }
            element[index] = e;
            size++;
        }
    }

    public int indexOf(E e){
        for (int i = 0; i<size;i++){
            if (element[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    public boolean contain(E e){
        for (int i = 0; i<size;i++){
            if (element[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return this.size;
    }

    public void print(){
        for (int i =0; i<size;i++){
            System.out.println("Element " + i + ": " + element[i]);
        }
    }

    public E remove(int index){
        for (int i = index; i<size; i++){
            element[i] = element[i+1];
        }
        size--;
        return (E) element[index];
    }

    public E get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);

        }
        return (E) element[index];
    }

    public E clone(){
        Object[] array = element;
        return (E) array;
    }

    public void clear(){
        while (size!=0){
            remove(size);
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int i =0; i<size;i++){
            str += "Element " + i + ": " + element[i] + "\n";
        }
        return str;
    }
}
