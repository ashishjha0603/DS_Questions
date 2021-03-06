class GFG 
{  
      

static class Node  
{ 
    int data; 
    Node next; 
}; 
  

static Node push(Node head_ref, int new_data) 
{ 

    Node new_node = new Node(); 
 
    new_node.data = new_data; 
  

    new_node.next = (head_ref); 
  
    (head_ref) = new_node; 
    return head_ref; 
} 
  

static double avgOfNodes(Node head) 
{ 
   
    if (head == null) 
        return -1; 
  
    int count = 0; 
    int sum = 0; 
    double avg = 0.0; 
  
    Node current = head;
    while (current != null) 
    { 
        count++; 
        sum += current.data; 
        current = current.next; 
    } 
  

    avg = (double)sum / count; 
  
    return avg; 
} 
  

public static void main(String args[]) 
{ 
    Node head = null; 
   
    head=push(head, 7); 
    head=push(head, 6); 
    head=push(head, 8); 
    head=push(head, 4); 
    head=push(head, 1); 
  
    System.out.println("Average of nodes = " + avgOfNodes(head)); 
} 
} 
