package linkedlist;

//Node class representing an inventory item
class ItemNode {
	
	String itemName;
	 int itemId;
	 int quantity;
	 double price;
	 ItemNode next;

	 public ItemNode(String itemName, int itemId, int quantity, double price) {
	     this.itemName = itemName;
	     this.itemId = itemId;
	     this.quantity = quantity;
	     this.price = price;
	     this.next = null;
	 }
}



class InventoryList {
		private ItemNode head;


		 // Add item at beginning
		 public void addAtBeginning(ItemNode item) {
		     item.next = head;
		     head = item;
		 }

 
		 
		// Add item at end
		 public void addAtEnd(ItemNode item) {
		     if (head == null) {
		         head = item;
		         return;
		     }
		     ItemNode temp = head;
		     while (temp.next != null) {
		         temp = temp.next;
		     }
		     temp.next = item;
		 }

		 

		 // Add item at a specific position
		 public void addAtPosition(int position, ItemNode item) {
		     if (position <= 1 || head == null) {
		         addAtBeginning(item);
		         return;
		     }
		     ItemNode temp = head;
		     for (int i = 1; temp.next != null && i < position - 1; i++) {
		         temp = temp.next;
		     }
		     item.next = temp.next;
		     temp.next = item;
		 }

		 

		 // Remove item by Item ID
		 public void removeByItemId(int itemId) {
		     if (head == null) return;

		     if (head.itemId == itemId) {
		         head = head.next;
		         return;
		     }

		     ItemNode temp = head;
		     while (temp.next != null && temp.next.itemId != itemId) {
		         temp = temp.next;
		     }

		     if (temp.next != null) {
		         temp.next = temp.next.next;
		     }
		 }

		 

		 // Update quantity by Item ID
		 public void updateQuantity(int itemId, int newQuantity) {
		     ItemNode temp = head;
		     while (temp != null) {
		         if (temp.itemId == itemId) {
		             temp.quantity = newQuantity;
		             return;
		         }
		         temp = temp.next;
		     }
		 }

		 

		 // Search by Item ID
		 public void searchByItemId(int itemId) {
		     ItemNode temp = head;
		     while (temp != null) {
		         if (temp.itemId == itemId) {
		             displayItem(temp);
		             return;
		         }
		         temp = temp.next;
		     }
		     System.out.println("Item not found.");
		 }

 
		 
		// Search by Item Name
		 public void searchByItemName(String itemName) {
		     ItemNode temp = head;
		     while (temp != null) {
		         if (temp.itemName.equalsIgnoreCase(itemName)) {
		             displayItem(temp);
		             return;
		         }
		         temp = temp.next;
		     }
		     System.out.println("Item not found.");
		 }

		 
		 
		 // Display a single item
		 private void displayItem(ItemNode item) {
		     System.out.println("Item Name: " + item.itemName + ", ID: " + item.itemId +
		             ", Quantity: " + item.quantity + ", Price: " + item.price);
		 }
		 
		 

		 // Display all items
		 public void displayAll() {
		     ItemNode temp = head;
		     while (temp != null) {
		         displayItem(temp);
		         temp = temp.next;
		     }
		 }

		 

		 // Calculate total inventory value
		 public void calculateTotalValue() {
		     double total = 0;
		     ItemNode temp = head;
		     while (temp != null) {
		         total += temp.price * temp.quantity;
		         temp = temp.next;
		     }
		     System.out.println("Total Inventory Value: ₹" + total);
		 }

		 
		 
		 // Sort by Item Name 
		 public void sortByName(boolean ascending) {
		     head = mergeSort(head, "name", ascending);
		 }
		 

		 // Sort by Price 
		 public void sortByPrice(boolean ascending) {
		     head = mergeSort(head, "price", ascending);
		 }


		 
		 // Merge sort for linked list
		 private ItemNode mergeSort(ItemNode node, String sortBy, boolean ascending) {
		     if (node == null || node.next == null) return node;

		     ItemNode middle = getMiddle(node);
		     ItemNode nextOfMiddle = middle.next;
		     middle.next = null;

		     ItemNode left = mergeSort(node, sortBy, ascending);
		     ItemNode right = mergeSort(nextOfMiddle, sortBy, ascending);

		     return sortedMerge(left, right, sortBy, ascending);
		 }

 
		 
		 private ItemNode sortedMerge(ItemNode a, ItemNode b, String sortBy, boolean ascending) {
		     if (a == null) return b;
		     if (b == null) return a;

		     boolean condition;
		     if (sortBy.equals("name")) {
		         condition = ascending ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
		                               : a.itemName.compareToIgnoreCase(b.itemName) > 0;
		     } 
		     else {
		      
		    	 condition = ascending ? a.price <= b.price
		                               : a.price > b.price;
		     }

		     if (condition) {
		         a.next = sortedMerge(a.next, b, sortBy, ascending);
		         return a;
		     } 
		     else {
		         b.next = sortedMerge(a, b.next, sortBy, ascending);
		         return b;
		     }
		 }

 
		 private ItemNode getMiddle(ItemNode node) {
		     if (node == null) return node;
		     ItemNode slow = node, fast = node.next;
		     while (fast != null && fast.next != null) {
		         slow = slow.next;
		         fast = fast.next.next;
		     }
		     return slow;
		 }
}



public class InventoryManagement {

    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();

        inventory.addAtEnd(new ItemNode("Laptop", 101, 10, 50000));
        inventory.addAtBeginning(new ItemNode("Mouse", 102, 50, 500));
        inventory.addAtPosition(2, new ItemNode("Keyboard", 103, 30, 1500));

        System.out.println("All Items:");
        inventory.displayAll();

        System.out.println("\nTotal Value:");
        inventory.calculateTotalValue();

        System.out.println("\nSearch by Item ID:");
        inventory.searchByItemId(103);

        System.out.println("\nSort by Price Descending:");
        inventory.sortByPrice(false);
        inventory.displayAll();

        System.out.println("\nUpdate Quantity of Laptop:");
        inventory.updateQuantity(101, 15);
        inventory.displayAll();

        System.out.println("\nRemove Item with ID 102:");
        inventory.removeByItemId(102);
        inventory.displayAll();
    }

}
