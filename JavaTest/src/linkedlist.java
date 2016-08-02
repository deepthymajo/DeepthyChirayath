import java.util.LinkedList;

class linkedlist {
     public static void main(String args[]) {

         /* Linked List Declaration */
         LinkedList<String> linkedlist = new LinkedList<String>();

         /*add(String Element) is used for adding 
          * the elements to the linked list*/
         linkedlist.add("Item 01");
         linkedlist.add("Item 02");
         linkedlist.add("Item 03");
         linkedlist.add("Item 04");
         linkedlist.add("Item 05");

         /*Display Linked List Content*/
         System.out.println("Linked List Content: " +linkedlist);

         /*Add First and Last Element*/
         linkedlist.addFirst("First Item");
         linkedlist.addLast("Last Item");
         System.out.println("LinkedList Content after addition: " +linkedlist);

         /*This is how to get and set Values*/
         Object firstvar = linkedlist.get(0);
         System.out.println("First element: " +firstvar);
         linkedlist.set(0, "Changed first item");
         Object firstvar2 = linkedlist.get(0);
         System.out.println("First element after update by set method: " +firstvar2);

         /*Remove first and last element*/
         linkedlist.removeFirst();
         linkedlist.removeLast();
         System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

         /* Add to a Position and remove from a position*/
         linkedlist.add(0, "Newly added item");
         linkedlist.remove(2);
         System.out.println("Final Content: " +linkedlist); 
     }
}


