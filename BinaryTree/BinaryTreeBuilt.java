public class BinaryTreeBuilt {

    static class Node {
        int val;
        Node left = null;
        Node right = null;

        Node(int val) {
            this.val = val;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public Node createTree(Integer nodes[]){
            idx++;
            if(nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = createTree(nodes);
            newNode.right = createTree(nodes);

            return newNode;
        }

        public void printSkewedTree(Node root) {
            while (root != null) {
                System.out.print(root.val + " ");
                root = (root.left != null) ? root.left : root.right; // Move to the available child
            }
        }
        
    }

    public static void main(String[] args) {
        Integer nodes[] = {1,2,-1,4,5,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.createTree(nodes);
        System.out.println(root.val);
        // tree.printSkewedTree(root);
    }
}