/**
    This class implements a binary search tree whose
    nodes hold objects that implement the Comparable
    interface.
*/
public class BinarySearchTree
{   
    private Node root;

    /**
        Constructs an empty tree.
    */
    public BinarySearchTree()
    {   
        root = null;
    }
    
    /**
        Inserts a new node into the tree.
        @param obj the object to insert
    */
    public void add(Comparable<Object> obj) 
    {   
        Node newNode = new Node();
        newNode.data = obj;
        newNode.left = null;
        newNode.right = null;

        if(root == null)
            root = newNode;
        else
            root.addNode(newNode);
    }

    /**
        Tries to find an object in the tree.
        @param obj the object to find
        @return true if the object is contained in the tree
    */
    public boolean find(Comparable<Object> obj)
    {
        Node target = root;
        while(target != null)
        {
            int diff = obj.compareTo(target.data);
            if(diff == 0)
                return true;
            else if(diff < 0)
                target = target.left;
            else
                target = target.right;
        }
        return false;
    }
    
    /**
        Tries to remove an object from the tree. Does nothing
        if the object is not contained in the tree.
        @param obj the object to remove
    */
    public void remove(Comparable<Object> obj)
    {
        if(!find(obj)) return;

        Node target = root;
        Node parent = null;
        boolean opComplete = false;

        while(!opComplete)
        {
            int diff = obj.compareTo(target.data);
            if(diff == 0)
            {
                Node newChild;
                if(parent == null)
                    root = newChild;
                if(target.left == null && target.right == null)
                    target = null;
                else if(target.left == null ^ target.right == null)
            } else
            {
                parent = target;
                if(diff < 0)
                    target = target.left;
                else
                    target = target.right;
            }
        }
    }
    
    /**
        Prints the contents of the tree in sorted order.
    */
    public void print()
    {   
        
    }   

    /**
        Prints a node and all of its descendants in sorted order.
        @param parent the root of the subtree to print
    */
    private static void print(Node parent)
    {   
        
    }

    /**
        A node of a tree stores a data item and references
        to the left and right child nodes.
    */
    static class Node
    {   
        public Comparable<Object> data;
        public Node left;
        public Node right;

        /**
            Inserts a new node as a descendant of this node.
            @param newNode the node to insert
        */
        public void addNode(Node newNode)
        {   
            int diff = newNode.data.compareTo(data);

            if(diff < 0)
            {
                if(left == null)
                    left = newNode;
                else
                    left.addNode(newNode);
            } else if(diff > 0)
            {
                if(right == null)
                    right = newNode;
                else
                    right.addNode(newNode);
            }
        }
    }
}



