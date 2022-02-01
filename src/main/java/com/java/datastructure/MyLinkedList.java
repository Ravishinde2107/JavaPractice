package com.java.datastructure;

public class MyLinkedList {
    Node head=null;
    class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
        }
    }

    public MyLinkedList insert(int data){
        Node newNode = new Node(data);
        newNode.next=null;

        if(this.head == null){
            this.head = newNode;
        }else{
            Node lastNode = this.head;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
            }
            lastNode.next=newNode;
        }
        return this;
    }

    public MyLinkedList deleteByKey(int data){
        Node currNode = this.head;
        Node prev = null;

            if(currNode!= null && currNode.data==data){ // if head found
                this.head=currNode.next;
                System.out.println(" Deleted "+ this.head.data+"->");
                return this;
            }else{ // middle
                while(currNode!= null && currNode.data!=data){
                    prev = currNode;
                    currNode=currNode.next;
                }
                if(currNode!= null){
                    prev.next=currNode.next;
                    System.out.println(" Deleted "+ currNode.data+"->");
                    return  this;
                }
                if(currNode== null){
                    System.out.println("No data Found");
                }
            }
            return this;
    }

    public MyLinkedList reverse(){
        Node pointer = this.head;
        Node previous = null,current=null;

        while(pointer!=null){
            current=pointer;
            pointer=pointer.next;
            current.next=previous;
            previous=current;
            this.head=current;
        }
        return this;
    }

    public MyLinkedList reverseByGroup(int groupSize){
        Node pointer = this.head;
        Node previous = null,current=null;
        int point = 1;
        while(pointer!=null){
            if (point/groupSize==0L) {
                current = pointer;
                pointer = pointer.next;
                current.next = previous;
                previous = current;
                this.head = current;
            }else{
                pointer = pointer.next;
                previous =previous.next;
                current=current.next;
                this.head=current;

            }
        }
        return this;
    }

    public void printMyLinkedList(){
        System.out.println("----------------------------");
        Node last = this.head;
        while(last!=null){
            System.out.println(" "+ last.data+"->");
            last=last.next;
        }
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(1);

        list.insert(10);

        list.printMyLinkedList();
        list.deleteByKey(4);
        list.printMyLinkedList();
        list.deleteByKey(3);
        list.printMyLinkedList();
        System.out.println("-----------Reverse-----------------");
        list.reverse();
        list.printMyLinkedList();
        System.out.println("-----------Reverse By Group-----------------");
        list.reverseByGroup(3);
        list.printMyLinkedList();

    }
}
