
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class insertarray {
    static Node head=null;
    static void insert(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    static void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        insert(10);
        insert(22);
        insert(12);
        insert(07);
        display();
    }
}

