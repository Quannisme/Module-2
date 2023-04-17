package ss10.java.BT.bai1;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elementsData[];

    MyList() {
        elementsData = new Object[DEFAULT_CAPACITY];
    }

    MyList(int capacity) {
        elementsData = new Object[capacity];
    }

    void ensureCapacity(int minCapacity) {
        if (minCapacity >= elementsData.length) {
            E[] newArr = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(elementsData, 0, newArr, 0, size);
            elementsData = newArr;
        }
    }

    void add(int index, E elements) {
        ensureCapacity(size + 1);
        System.arraycopy(elementsData, index, elementsData, index + 1,
                size - index);
        elementsData[index] = elements;
        size++;
    }

    E elementsData(int index) {
        return (E) elementsData[index];
    }

    E remove(int index) {
        E oldValue = elementsData(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementsData, index + 1, elementsData, index,
                    numMoved);

        }
        elementsData[--size] = null;
        return oldValue;
    }

    int size() {
        return this.size;
    }

    // E clone()
    E get(int index) {
        return elementsData(index);
    }

    boolean add(E o) {
        ensureCapacity(size + 1);
        elementsData[size++] = o;
        return true;
    }

    void clear() {
        for (int i = 0; i < size; i++) {
            elementsData[i] = null;
        }
        size = 0;
    }

    int indexOf(E e) {
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (elementsData[i] == e) {

                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (e.equals(elementsData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    boolean contain(E e) {
        return indexOf(e) >= 0;
    }

    Object clonee() {
        MyList<E> clone = new MyList<>();
        System.arraycopy(elementsData, 0, clone.elementsData, 0, size);
        clone.size = size;
        return clone;
    }
}
