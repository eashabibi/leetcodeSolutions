class MyLinkedList {
    class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }
    int size=0;
    Node dummyNode;
    public MyLinkedList() {
        dummyNode=new Node(-1);
        size=0;
        
    }
    
    public int get(int index) {
        if(index>=size){
            return -1;
        }
        Node currNode=dummyNode;
        for(int i=0;i<=index;i++){
            currNode=currNode.next;
        }
        return currNode.val;
    }
    
    public void addAtHead(int val) {
        Node node=new Node(val);
        node.next=dummyNode.next;
        dummyNode.next=node;
        size++;
    }
    
    public void addAtTail(int val) {
        Node node=new Node(val);
        Node currNode=dummyNode;
        for(int i=0;i<size;i++){
            currNode=currNode.next;

        }
        currNode.next=node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size)
        return;
        Node node=new Node(val);
        Node currNode=dummyNode;
        for(int i=0;i<index;i++){
            currNode=currNode.next;
        }
        node.next=currNode.next;
        currNode.next=node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size){
            return ;
        }
        Node currNode=dummyNode;
        for(int i=0;i<index;i++){
            currNode=currNode.next;
        }
        currNode.next=currNode.next.next;
        size--;

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
