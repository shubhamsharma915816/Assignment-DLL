public class MainClass {
    public static void main(String args[]){
        DoublyLinkList<Integer> dll=new DoublyLinkList<>();
        System.out.println("# Insert 1 Front");
        dll.insertAtFirst(1);
        dll.traverse();

        System.out.println("# Insert 2 Front");
        dll.insertAtFirst(2);
        dll.traverse();

        System.out.println("# Insert 3 Front");
        dll.insertAtFirst(3);
        dll.traverse();

        System.out.println("# Insert 4 Last");
        dll.insertAtLast(4);
        dll.traverse();


        System.out.println("# Insert 4 Last Index 0");
        dll.insertAtIndex(5,0);
        dll.traverse();

        System.out.println("# Insert 6 Last Index 3");
        dll.insertAtIndex(6,3);;
        dll.traverse();

        System.out.println("Removing from index 4");
        dll.deleteAtIndex(4);
        dll.traverse();

        System.out.println("deleting element at index 1");
        dll.deleteAtIndex(1);
        dll.traverse();

        System.out.println("deleting First Element");
        dll.deleteFirst();
        dll.traverse();

        System.out.println("deleting Last Element");
        dll.deleteLast();
        dll.traverse();

        System.out.println("deleting Last Element");
        dll.deleteLast();
        dll.traverse();

        System.out.println("deleting Last Element");
        dll.deleteLast();
        dll.traverse();


    }
}