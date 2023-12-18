import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    void add() {
        MyArrayList arrayList = new MyArrayList();
        boolean response = arrayList.add("Hello");
        assertTrue(response);
    }

    @Test
    void get() {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("Hello");
        String expected = "Hello";
        String response = arrayList.get(0);
        assertEquals(expected, response);
    }

    @Test
    void removeAt() {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("Hello1");
        arrayList.add("Hello2");
        arrayList.add("Hello3");
        arrayList.removeAt(2);
        int expected = 2;
        int response = arrayList.size();
        assertEquals(expected, response);
    }

    @Test
    void remove() {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("Hello1");
        arrayList.add("Hello2");
        arrayList.add("Hello3");
        arrayList.add("Hello4");
        arrayList.add("Hello5");
        arrayList.remove("Hello1");
        int expected = 4;
        int response = arrayList.size();
        assertEquals(expected, response);
    }

    @Test
    void size() {
        MyArrayList arrayList = new MyArrayList();
        for(int i = 0; i < 5;i++){
            arrayList.add("Hello");
        }
        int expected = 5;
        int response = arrayList.size();
        assertEquals(expected, response);
    }

    @Test
    void clear() {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("Hello");
        arrayList.clear();
        String expected = "Element does not exist";
        String response = arrayList.get(0);
        assertEquals(expected, response);
    }
}