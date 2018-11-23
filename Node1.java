
class Node1 {
    int data;
    Node next;

    Node1(int newData) {
        this.data = newData;
        next = null;
    }

public Node1(int newData, Node newNext){
        data=newData;
        next=newNext;

}

//Getters & Setters
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setData(int newData){
        data=newData;
    }
    public void setNext(Node newNode){
        next=newNode;
    }

}

