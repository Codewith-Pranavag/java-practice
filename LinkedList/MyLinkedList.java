//this is to update the github streak streak

class MyLinkedList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            next=null;
        }
    }
    ListNode head;
    ListNode tail;

    public MyLinkedList() {
        head=null;
        tail=null;
        
    }

    public int get(int index) {
        int i=0;
        ListNode temp=head;
        while(temp!=null){
            if(index==i){
                return temp.val;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        ListNode newnode=new ListNode(val);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    
    public void addAtTail(int val) {
        ListNode newnode=new ListNode(val);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);
            return;
        }
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(index>size) return;
        if(size==index){
            addAtTail(val);
            return;
        }
        ListNode newnode=new ListNode(val);
        int i=0;
        temp=head;
        while(i!=index-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    
    public void deleteAtIndex(int index) {
        if(head==null){
            return;
        }
        if(index==0){
            head=head.next;
            if(head==null){
                tail=null;
            }
            return;
        }
        ListNode prev=head;

        int i=0;
        while(prev.next!=null && i<index-1){
            prev=prev.next;
            i++;
        }
        if(prev.next==null) return;
        if(prev.next==tail){
            tail=prev;
        }
        prev.next=prev.next.next;
    }
}
