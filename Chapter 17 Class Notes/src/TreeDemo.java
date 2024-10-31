/**
   This class demonstrates the tree class.
*/

public class TreeDemo
{
   public static void main(String[] args)
   {
      Tree t1 = new Tree("Anne");
      Tree t2 = new Tree("Peter");
      t1.addSubtree(t2);
      Tree t3 = new Tree("Zara");
      t1.addSubtree(t3);
      Tree t4 = new Tree("Savannah");
      t2.addSubtree(t4);
      System.out.println("Size: " + t1.size());
      BinaryTree b1 = new BinaryTree("A");
      BinaryTree b2 = new BinaryTree("B", null, b1);
      BinaryTree b3 = new BinaryTree("C", null, b2);

      BinaryTree b5 = new BinaryTree("e");
      BinaryTree b6 = new BinaryTree("f", b5, null);
      BinaryTree b7 = new BinaryTree("g", b6, null);
      BinaryTree root = new BinaryTree("D", b7, b3);
      System.out.println("Nodes with one child (should be 4): " + root.countNodesWithOneChild());
   }
}
