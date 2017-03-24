/**
 * Created by Admin on 3/24/17.
 */
public class BinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> A = new BinaryTreeNode<Integer>(314);
        BinaryTreeNode<Integer> B = new BinaryTreeNode<Integer>(6);
        BinaryTreeNode<Integer> C = new BinaryTreeNode<Integer>(271);
        BinaryTreeNode<Integer> D = new BinaryTreeNode<Integer>(28);
        BinaryTreeNode<Integer> E = new BinaryTreeNode<Integer>(0);
        BinaryTreeNode<Integer> F = new BinaryTreeNode<Integer>(561);
        BinaryTreeNode<Integer> G = new BinaryTreeNode<Integer>(3);
        BinaryTreeNode<Integer> H = new BinaryTreeNode<Integer>(17);
        BinaryTreeNode<Integer> I = new BinaryTreeNode<Integer>(6);
        BinaryTreeNode<Integer> J = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> K = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> L = new BinaryTreeNode<Integer>(401);
        BinaryTreeNode<Integer> M = new BinaryTreeNode<Integer>(641);
        BinaryTreeNode<Integer> N = new BinaryTreeNode<Integer>(257);
        BinaryTreeNode<Integer> O = new BinaryTreeNode<Integer>(271);
        BinaryTreeNode<Integer> P = new BinaryTreeNode<Integer>(28);

        A.assignChildren(B, I);
        B.assignChildren(C, F);
        C.assignChildren(D, E);
        F.assignChildren(null, G);
        G.assignChildren(H, null);
        I.assignChildren(J, O);
        J.assignChildren(null, K);
        K.assignChildren(L, N);
        L.assignChildren(null, M);
        O.assignChildren(null, P);

        treeTraversalPreorder(A);
        treeTraversalInorder(A);
        treeTraversalPostorder(A);
    }

    public static class BinaryTreeNode<Integer> {
        public Integer data;
        public BinaryTreeNode<Integer> left, right;

        public BinaryTreeNode(Integer data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public void assignChildren(BinaryTreeNode<Integer> left, BinaryTreeNode<Integer> right) {
            this.left = left;
            this.right = right;
        }

    }

    public static void treeTraversalPreorder(BinaryTreeNode<Integer> root) {
        if (root != null) {
            // Preorder (root -> left -> right)
            System.out.println("Preorder: " + root.data);
            treeTraversalPreorder(root.left);
            treeTraversalPreorder(root.right);
        }
    }

    public static void treeTraversalInorder(BinaryTreeNode<Integer> root) {
        if (root != null) {
            // Inorder (left -> root -> right)
            treeTraversalInorder(root.left);
            System.out.println("Inorder: " + root.data);
            treeTraversalInorder(root.right);

        }
    }

    public static void treeTraversalPostorder(BinaryTreeNode<Integer> root) {
        if (root != null) {
            // Postorder (left -> right -> root)
            treeTraversalPostorder(root.left);
            treeTraversalPostorder(root.right);
            System.out.println("Postorder: " + root.data);
        }
    }
}
