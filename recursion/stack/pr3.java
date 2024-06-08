package recursion.stack;
class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        this.next=null;

    }
}

class Stack{
    public Node head;
    public Stack(){
        this.head=null;
    }

    public void push(int data){
        Node temp=this.head;
        this.head=new Node(data);
        this.head.next=temp;
    }

    public Integer pop(){
        if(this.head==null)return null;
        Node temp=this.head;
        this.head=this.head.next;
        return temp.data;
    }
    public Integer peek(){
        if(this.head==null)return null;
        return this.head.data;
    }

}
public class pr3 {
    public static void main(String[] args){
        System.out.println("aaa");
        Stack st = new Stack();
        st.push(8);
    st.push(3);
    st.push(1);
    st.push(2);

    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st.pop());
     }
}
