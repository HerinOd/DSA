package topic04.list.exercises;

import topic04.list.examples.SLList;

import java.util.Scanner;

public class SLListSearchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLList linkedList = new SLList();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i, "" + (10 + i));
        }
        System.out.println("Linked List: " + linkedList);
        System.out.print("Search: ");
        String searchData = input.nextLine();
        System.out.println("Position: " + linkedList.search(searchData));
    }
}
