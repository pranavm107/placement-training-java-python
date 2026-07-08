public class linkedlist {

    static void insetEnd(int data){

    }temp.next=newNode;
   
    static void insertPosition(int data,int position){
        Node newNode = new Node(data);
        Node temp=head;
        for(int i=1;i<position-1;i++){
            temp=temp.next;
        }

        newNode.next=temp.next;
        temp.next=newNode;

    }
}