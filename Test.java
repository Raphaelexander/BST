class Test{
    static void Go() {
        
        Node root = null;

        root = NameTree.insert(root, "Kami");
        root = NameTree.insert(root, "Hillary");
        root = NameTree.insert(root, "Alexander");
        root = NameTree.insert(root, "Isaac");
        root = NameTree.insert(root, "Quinten");
        root = NameTree.insert(root, "Lillian");
        root = NameTree.insert(root, "Zach");

        System.out.print("Name Tree in order: ");
        NameTree.inOrder(root);
        System.out.print("\nName tree pre order: ");
        NameTree.preOrder(root);
        System.out.print("\nName Tree post order: ");
        NameTree.postOrder(root);
    }
    

}