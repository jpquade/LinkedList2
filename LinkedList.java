public class LinkedList{

    Node head;
    
    static class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void insert(LinkedList list, int data) {
        Node insertNode = new Node(data);
        
        if(list.head == null){
            list.head = insertNode;
        } else {
            Node lastNode = list.head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            
            lastNode.next = insertNode;

        }
    }

    public static void printList(LinkedList list){
        Node printNode = list.head;

        if(printNode == null){
            System.out.println("Empty list");
        } else {
            while(printNode != null){
                System.out.println(printNode.data);
                printNode = printNode.next;
            }
        }
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();

        // for(int i = 0; i < 10; i++){
        //     insert(list, i);
        // }
        
        printList(list);
    }
   
}