
/**
 * @author pc22
 *
 */
public class CustomLinkedList {

	Node head;
	
	static class Node { 
		  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
	

	
	/**
	 * @param list
	 * @param data
	 * @return
	 */
	public static CustomLinkedList add(CustomLinkedList list, int data) 
    { 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // first time add node 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        return list; 
    } 
	
	
	 
    /**
     * @param list
     */
    public static void getFirst(CustomLinkedList list) 
    { 
        Node currNode = list.head; 
  
        if (currNode != null) { 
            System.out.print("first node is : "+currNode.data ); 
        } 
        else {
        	System.out.print("List is empty"); 
        }
    } 
	
    /**
     * @param list
     */
    public static void displayList(CustomLinkedList list) 
    { 
        Node currNode = list.head; 
  
        if(currNode == null) {
        	 System.out.print("\nList is empty "); 
        }
        else 
        {
        	 System.out.print("\nList: "); 
        	 // Display
             while (currNode != null) { 
                 System.out.print(currNode.data + " "); 
                 currNode = currNode.next; 
             } 
        }
        System.out.println("\n"); 
    } 
    
    /**
     * @param list
     * @param key
     * @return
     */
    public static CustomLinkedList removeAt(CustomLinkedList list, int key) 
    { 
        // Store head node 
        Node currNode = list.head, prev = null; 
  
        // The key is not present 
        if (currNode == null) { 
            System.out.println("List is empty"); 
            return list;
        } 
        
        // first node 
        if (currNode != null && currNode.data == key) { 
            list.head = currNode.next; // Changed head 
            System.out.println(key + " found and deleted"); 
            return list; 
        } 
        
        //for find other node
        while (currNode != null && currNode.data != key) { 
            // continue to next node 
            prev = currNode; 
            currNode = currNode.next; 
        } 
        
        //Find a node and delete
        if (currNode != null) { 
            // Unlink currNode from linked list 
            prev.next = currNode.next; 
            // Display the message 
            System.out.println(key + " found and deleted"); 
        } 
  
        return list; 
    } 
	
    /**
     * @param list
     * @param key
     * @return
     */
    public static CustomLinkedList remove(CustomLinkedList list) 
    { 
        // Store head node 
        Node currNode = list.head, prev = null; 
  
        
        // The key is not present 
        if (currNode == null) { 
            System.out.println("List is empty"); 
            return list;
        } 
        
        // first node 
        if (currNode != null && currNode.next == null) { 
            list.head = currNode.next; // Changed head 
            System.out.println(currNode.data + " found and deleted"); 
            return list; 
        } 
        
        //for find other node
        while (currNode != null) { 
             
            prev = currNode; 
            
            if(currNode.next == null ) {
            	removeAt(list, currNode.data);
                return list;
            }
         // continue to next node
            currNode = currNode.next; 
        } 
  
        return list; 
    } 
    
    
    /**
     * @param list
     * @param key
     * @return
     */
    public static CustomLinkedList removeAll(CustomLinkedList list, int key) 
    { 
        // Store head node 
        Node currNode = list.head; 
        
        // The key is not present 
        if (currNode == null) { 
            System.out.println("List id empty");
            return list;
        } 
        
        //for find other node
        while (currNode != null) { 
        	if(currNode.data > key) {
        		removeAt(list, currNode.data);
        	}
            // continue to next node 
            currNode = currNode.next; 
        } 
  
        return list; 
    } 
    
}
