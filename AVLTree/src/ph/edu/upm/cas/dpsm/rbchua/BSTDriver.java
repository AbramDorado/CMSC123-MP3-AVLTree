package ph.edu.upm.cas.dpsm.rbchua;

public class BSTDriver {

	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new AVLTree<Integer>();

		bst.insert(35);
		bst.insert(48);
		bst.insert(14);
		bst.insert(4);
		bst.insert(15);
		bst.insert(56);
		bst.insert(13);
		bst.insert(65);// case1 insert
		bst.insert(25);
		bst.insert(2);
		bst.insert(20);// case4 insert
		bst.insert(55);

		bst.delete(65);
		bst.delete(14);// case1.3 delete

		bst.delete(25);
		bst.delete(20);// case1.1 delete

		bst.insert(1);
		bst.delete(13);
		bst.delete(15);// case1.2 delete

		bst.insert(3);
		bst.insert(5);
		bst.delete(1);// case2.1 delete

		bst.insert(6);
		bst.delete(3);
		bst.delete(2);// case2.2 delete

		bst.delete(56);
		bst.insert(100);
		bst.insert(60);
		bst.delete(48);// case2.3 delete
		System.out.println("bst AVL:");
		System.out.println("Preorder: " + bst.preorder());
		System.out.println("Inorder: " + bst.inorder());
		System.out.println("Postorder: " + bst.postorder());
		System.out.println("Level order: " + bst.levelorder());

		BinarySearchTree<Integer> bst1 = new AVLTree<Integer>();

		bst1.insert(50);
		bst1.insert(25);
		bst1.insert(40);// case 3 insert

		bst1.insert(60);
		bst1.insert(70);// case 4 insert

		System.out.println("\nbst1 AVL:");
		System.out.println("Preorder: " + bst1.preorder());
		System.out.println("Inorder: " + bst1.inorder());
		System.out.println("Postorder: " + bst1.postorder());
		System.out.println("Level order: " + bst1.levelorder());

	}

}
