/*
Target:
To repeat the standard class ArrayList

Requirements to functionality:
get(int index)
add(T obj)
boolean remove(T obj)
boolean removeAt(int index)
int size()
void clear()
*/

public class MyArrayList {
    private String[] arraylist;
    private int number_of_elements = 0;
    public MyArrayList() {
        this.arraylist = new String[10];
    }

    public boolean add(String new_element){
        try {
            arraylist[number_of_elements] = new_element;
            number_of_elements++;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }
    public String get(int index){
        if (index < number_of_elements){
            return arraylist[index];
        }
        else {
            return "Element does not exist";
        }
    }

    public void removeAt(int item_id){
        String[] newArrayList = new String[arraylist.length];

        if (item_id >= 0) System.arraycopy(arraylist, 0, newArrayList, 0, item_id);

        if (number_of_elements - item_id >= 0)
            System.arraycopy(arraylist, item_id + 1, newArrayList, item_id, number_of_elements - item_id);

        number_of_elements --;
        arraylist = newArrayList;

    }

    public void printArrayList(){
        for(int i = 0; i < number_of_elements; i++){
            System.out.println(arraylist[i]);
        }
    }

    public void remove(String rem_elem){
        int index_to_remove = 0;
        boolean element_found = false;
        for(String element:arraylist){
            if (rem_elem.equals(element)){
                element_found = true;
                break;
            }
            index_to_remove++;
        }
        if(element_found) {
            removeAt(index_to_remove);
        }
    }

    public int size(){
        return this.number_of_elements;
    }
    public void clear(){
        try {
            this.arraylist = new String[arraylist.length];
            this.number_of_elements = 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
