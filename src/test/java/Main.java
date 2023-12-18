public class Main {

    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("Hello1");
        arrayList.add("Hello2");
        arrayList.add("Hello3");
        arrayList.add("Hello4");
        arrayList.add("Hello5");
//        arrayList.removeAt(4);
        arrayList.remove("Hello1");
        arrayList.printArrayList();
//        System.out.println(arrayList.get(0));
    }

}
