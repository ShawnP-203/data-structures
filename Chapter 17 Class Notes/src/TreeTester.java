/**
   This program tests the binary search tree class.
*/
public class TreeTester
{ 
   public static void main(String[] args)
   {  
      BinarySearchTree t = new BinarySearchTree();
      t.add("D");
      t.add("B");
      t.add("A");
      t.add("C");
      t.add("F");
      t.add("E");
      t.add("I");
      t.add("G");
      t.add("H");
      t.add("J");
      t.remove("A"); // Removing leaf
      t.remove("B"); // Removing element with one child
      t.remove("F"); // Removing element with two children
      t.remove("D"); // Removing root
      t.print();
      System.out.println("Expected: C E G H I J");

      Tree tree = new Tree("A");
      Tree tree2 = new Tree("B");
      Tree tree3 = new Tree("C");
      Tree tree4 = new Tree("D");
      Tree tree5 = new Tree("e");
      tree4.addSubtree(tree5);
      tree.addSubtree(tree2);
      tree.addSubtree(tree3);
      tree.addSubtree(tree4);
      System.out.println("Leaves (should be 3): " +tree.leafCount());
   }
}

