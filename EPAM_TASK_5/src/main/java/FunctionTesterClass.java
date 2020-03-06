import java.util.Scanner;

public class FunctionTesterClass {

    protected void tester(Scanner scannerObject){
        SinglyLinkedList<Integer> singlyLinkedListObject = new SinglyLinkedList<>();
        singlyLinkedListObject.insert(1);
        singlyLinkedListObject.insert(2);
        singlyLinkedListObject.insert(3);
        singlyLinkedListObject.insert(4);
        singlyLinkedListObject.remove(2);
        singlyLinkedListObject.remove(0);
        System.out.println("size of the list = "+singlyLinkedListObject.size());
        System.out.println(singlyLinkedListObject.getElementAt(1));
        singlyLinkedListObject.display();
    }
}
