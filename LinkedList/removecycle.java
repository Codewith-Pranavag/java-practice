public class solutions{
  public void removecycle(){
    //checking if cycle exist;
    Node slow=head;
    Node fast=head;
    boolean cycleexist=false;
    while(fast.next!=null && fast!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow==fast){
        cycleexit=true;
      }
    }
    if(!cycleexit) return;
    //finding cyclic node;
    slow=head;
    Node prev=null;
    while(slow!=fast){
      prev=fast;
      slow=slow.next;
      fast=fast.next;
    }
    //removing cycle;
    prev.next=null;
}
