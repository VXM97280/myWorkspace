/*
 * Java program to implement singly Linkedlist
 */

import java.util.Scanner;

class Node{
    protected int data;
    protected Node link;

    /* Constructor */
    public Node(){
        link = null;
        data = 0;
    }

    /* Constructor */
    public Node(int d, Node n){
        data = d;
        link = n;
    }

    /* Function to set link to next Node */
    public void setLink(Node n){
        link = n;
    }

    /* Function to set data in current Node */
    public void setData(int d){
        data = d;
    }

    /* Function to get link to next Node */
    public Node getLink(){
        return link;
    }

    /* Function to get data from current Node */
    public int getData(){
        return data;
    }

}

/* Class Linkedlist */
class linkedList{
    protected Node start;
    protected Node end;
    public int size;

    /* Constructor */
    public linkedList(){
        start = null;
        end = null;
        size = 0;
    }

    /* Function to check if the list is empty */
    public boolean isEmpty() {
        return start == null;
    }

    /* Function to get size of the list */
    public int getSize(){
        return size;
    }

    /* Function to insert element at the beginning */
    public void insertAtStart(int val){
        Node nptr = new Node(val, null);
        size++;
        if(start == null){
            start = nptr;
            end = start;
        }else{
            nptr.setLink(start);
            start = nptr;
        }

    }

    /* Function to insert an element at the end */
    public void insertAtEnd(int val){
        Node nptr = new Node(val, null);
        size++;
        if(start == null){
            start = nptr;
            end = start;
        }else{
            end.setLink(nptr);
            end = nptr;
        }
    }

    /* Function to insert an element at position */
    public void insertAtPosition(int val, int pos){
        Node nptr = new Node(val, null);
        Node ptr = start;
        pos = pos - 1;
        for(int i = 1; i < size; i++){
            if(i == pos){
                Node tmp = ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }

    /* Function to delete an element at position */
    public void deleteAtPos(int pos){
        if(pos == 1){
            start = start.getLink();
            size--;
            return;
        }
        if(pos == size){
            Node s = start;
            Node t = start;
            while (s!=end){
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size--;
            return;
        }
        Node ptr = start;
        pos = pos - 1;
        for(int i = 1; i < size - 1;i++){
            if (i == pos)
            {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size--;
    }

    /* Function to display elements */
    public void display(){
        System.out.println("\nSingly Linked list = ");
        if(size == 0){
            System.out.println("empty\n");
            return;
        }
        if(start.getLink() == null){
            System.out.println(start.getData());
            return;
        }
        Node ptr = start;
        System.out.println(start.getData()+ "->");
        ptr = start.getLink();
        while(ptr.getLink() != null){
            System.out.println(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.println(ptr.getData()+ "->");
    }

}

/* Class single linked list */
public class SinglyLinkedList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /* creating object of class Linkedlist */
        linkedList list = new linkedList();
        System.out.println("singly Linked List Test\n");
        char ch;
        /* perform list operations */
        do {
            System.out.println("\n Singly linked list operations");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at postion");
            System.out.println("5. Check Empty");
            System.out.println("6. get Size");
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Enter Integer element to insert");
                    list.insertAtStart(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter integer element to insert at end ");
                    list.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter integer element to insert at position");
                    int num = sc.nextInt();
                    System.out.println("Enter Position");
                    int pos = sc.nextInt();
                    if (pos <= 1 || pos > list.getSize())
                        System.out.println("Invalid Position");
                    else
                        list.insertAtPosition(num, pos);
                    break;
                case 4:
                    System.out.println("Delete at position");
                    int p = sc.nextInt();
                    if (p < 1 || p > list.getSize())
                        System.out.println("Invalid Position\n");
                    else
                        list.deleteAtPos(p);
                    break;
                case 5:
                    System.out.println("Empty status = " + list.isEmpty());
                    break;
                case 6:
                    System.out.println("size = " + list.getSize() + " \n");
                    break;
                default:
                    System.out.println("Wrong Entry \n");
                    break;
            }
            /*Display list*/
            System.out.println("\n Do you want to continue (Type y 0r n) \n");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        }



    }


