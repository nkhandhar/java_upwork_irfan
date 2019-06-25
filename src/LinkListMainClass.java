
/**
 * @author pc22
 *
 */
public class LinkListMainClass {
	
	public static void main(String[] args) {
		
		CustomLinkedList customLinkedList=new CustomLinkedList();
		
		customLinkedList = CustomLinkedList.add(customLinkedList, 1);
		customLinkedList = CustomLinkedList.add(customLinkedList, 8);
		customLinkedList = CustomLinkedList.add(customLinkedList, 55);
		customLinkedList = CustomLinkedList.add(customLinkedList, 56);
		customLinkedList = CustomLinkedList.add(customLinkedList, 2);
		customLinkedList = CustomLinkedList.add(customLinkedList, 5);
		customLinkedList = CustomLinkedList.add(customLinkedList, 7);
		
		CustomLinkedList.displayList(customLinkedList); 
		CustomLinkedList.remove(customLinkedList); 
		CustomLinkedList.displayList(customLinkedList); 
		CustomLinkedList.removeAll(customLinkedList, 55);
		CustomLinkedList.displayList(customLinkedList); 
		
		CustomLinkedList.removeAll(customLinkedList, 1); 
		CustomLinkedList.displayList(customLinkedList); 
		CustomLinkedList.remove(customLinkedList);
		CustomLinkedList.displayList(customLinkedList);
	}

}
