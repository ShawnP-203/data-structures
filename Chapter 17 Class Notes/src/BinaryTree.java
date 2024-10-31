/**
    A binary tree in which each node has two children.
*/
public class BinaryTree
{
    private Node root;

    /**
        Constructs an empty tree.
    */
    public BinaryTree()
    {
        root = null;
    } 

    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public BinaryTree(Object rootData) 
    {
        root = new Node();
        root.data = rootData;
        root.left = null;
        root.right = null;
    }

    /**
        Constructs a binary tree.
        @param rootData the data for the root
        @param left the left subtree
        @param right the right subtree
    */
    public BinaryTree(Object rootData, BinaryTree left, BinaryTree right)
    {
        this(rootData);
        if(left != null)
            root.left = left.root;
        if(right != null)
            root.right = right.root;
    }
    
    static class Node
    {
        public Object data;
        public Node left;
        public Node right;
    }

    /**
        Returns the height of the subtree whose root is the given node.
        @param n a node or null
        @return the height of the subtree, or 0 if n is null
    */
    private static int height(Node n)
    {
        return n == null? 0:
            Math.max(height(n.left), height(n.right)) + 1;
    }

    /**
        Returns the height of this tree.
        @return the height
    */
    public int height()
    {
        return height(root);
    }

    /**
        Checks whether this tree is empty.
        @return true if this tree is empty
    */
    public boolean isEmpty()
    {
        return root == null;
    }

    /**
        Gets the data at the root of this tree.
        @return the root data
    */
    public Object data()
    {
        return root.data;
    }
    
    /**
        Gets the left subtree of this tree.
        @return the left child of the root
    */
    public BinaryTree left() 
    {
        BinaryTree subtree = new BinaryTree();
        subtree.root = root.left;
        return subtree;
    }

    /**
        Gets the right subtree of this tree.
        @return the right child of the root
    */
    public BinaryTree right() 
    { 
        BinaryTree subtree = new BinaryTree();
        subtree.root = root.right;
        return subtree;
    }

    public int countNodesWithOneChild()
    {
        return countNodesWithOneChild(root);
    }

    private static int countNodesWithOneChild(Node candidate)
    {
        if(candidate.left == null && candidate.right != null)
        {
            return countNodesWithOneChild(candidate.right) + 1;
        }
        else if (candidate.left != null && candidate.right == null){
            return countNodesWithOneChild(candidate.left) + 1;
        }
        else if (candidate.left != null && candidate.right != null)
        {
            return countNodesWithOneChild(candidate.left) + countNodesWithOneChild(candidate.right);
        }
        return 0;
    }
}
