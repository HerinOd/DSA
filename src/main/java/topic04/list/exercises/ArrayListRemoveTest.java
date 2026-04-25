package topic04.list.exercises;

import topic04.list.examples.ArrayList;

public class ArrayListRemoveTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < arrayList.getMaxSize(); i++) {
            arrayList.getItems()[i] = i + 1;
            arrayList.setLength(arrayList.getLength() + 1);
        }
        System.out.println("String: " + arrayList);
        System.out.println();
        remove(3, arrayList);
        System.out.println("New String: " + arrayList);
    }

    public static void remove(int pos, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            for (int i = pos - 1; i < arrayList.getLength() - 1; i++) {
                arrayList.getItems()[i] = arrayList.getItems()[i + 1];
            }
            arrayList.setLength(arrayList.getLength() - 1);
        }
    }
}
