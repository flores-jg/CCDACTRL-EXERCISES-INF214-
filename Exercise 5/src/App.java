public class App {
    public static void main(String[] args) throws Exception {
        Node A = new Node("FLORES");
        Node B = new Node("TENERIFE");
        Node C= new Node("LABON");
        Node D = new Node("PAGARIGAN");
        Node E = new Node("BANTO");
        Node F = new Node("BABLIS");
        Node G = new Node("CINCO");
        Node H = new Node("CALALANG");

        A.left = B;
        A.right = C;

        B.left = D;
        B.right = E;

        C.left = F;
        C.right = G;

        D.left = H;

        System.out.println("In-Order:");
        traverseInOrder(A);
        System.out.println();
        System.out.println("Post-Order:");
        traversePostOrder(A);
        System.out.println();
        System.out.println("Pre-Order:");
        traversePreOrder(A);
    }

     static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
