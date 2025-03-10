class NameTree {

    static Node insert(Node root, String key) {

        if (root == null) { //if the tree is empty, create new node with inputted key
            return new Node(key);
        }

        if(root.key.equals(key)) { //if input key already exists, return that node
            return root;
        }

        if(key.charAt(0) < root.key.charAt(0)) { //otherwise, find if first letter of name is less than root, then put it at the left
            root.left = insert(root.left, key);
        } else { //if first letter is greater than root, put it in the right
            root.right = insert(root.right, key);
        }
        
        return root;
    }

      static void inOrder(Node root){ //in order traversal
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.key + ", ");
            inOrder(root.right);
        }
    }
    
    static void preOrder(Node node) { //sorts BST by pre order
        if (node != null) {
            System.out.print(node.key + ", ");
            preOrder(node.left);  
            preOrder(node.right); 
        } 
    }
    
    static void postOrder(Node node){ // sorts BST by post order
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + ", ");
        }
    }
}