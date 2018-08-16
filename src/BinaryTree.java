import java.util.Scanner;

public class BinaryTree {

	BinaryTreeNode root = null;

	int noOfNodes = 0;

	class BinaryTreeNode {
		int data;
		BinaryTreeNode left;
		BinaryTreeNode right;

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public BinaryTreeNode getLeft() {
			return left;
		}

		public void setLeft(BinaryTreeNode left) {
			this.left = left;
		}

		public BinaryTreeNode getRight() {
			return right;
		}

		public void setRight(BinaryTreeNode right) {
			this.right = right;
		}

		public BinaryTreeNode() {
			data = 0;
			left = null;
			right = null;
		}

		public BinaryTreeNode(int elem) {
			data = elem;
			left = null;
			right = null;
		}

	}

	public void display(BinaryTreeNode node) {

		// BinaryTreeNode temp = node;
		if (node != null) {
			{
				System.out.println(node.data);
				display(node.left);
				display(node.right);
			}
		}
		return;

	}

	public int size(BinaryTreeNode node) {
		if (node == null) {
			return 0;
		}

		return (1 + size(node.left) + size(node.right));
	}

	public int height(BinaryTreeNode node) {

		return (1 + Math.max(height(node.left), height(node.right)));
	}

	public int getData(BinaryTreeNode node) {
		return node.getData();
	}

	public boolean insertNode(int element) {
		BinaryTreeNode temp = new BinaryTreeNode(element);
		BinaryTreeNode current = root;
		if (root == null) {
			root = temp;
		} else {
			while (true) {

				if (current.data > element) {
					if (current.left == null) {
						current.left = temp;
						break;
					} else {
						current = current.left;
						continue;
					}
				} else if (current.data < element) {
					if (current.right == null) {
						current.right = temp;
						break;
					} else {
						current = current.right;
						continue;
					}
				} else if (current.data == element) {
					return false;
				}
			}

		}
		return true;

	}

	// public BinaryTreeNode deleteNode(BinaryTreeNode root,BinaryTreeNode node
	// ) {
	//
	// if (root == null) {
	// return node;
	// } else {
	//
	// if (root.data > node.data) {
	// if (root.left != null)
	// root.left = deleteNode(root.left, node);
	// } else if (root.data < node.data) {
	// if (root.right != null)
	// root.right = deleteNode(root.right, node);
	// } else
	// {
	// if(root.left == null)
	// root = root.right;
	// else if(root.right==null)
	// root = root.left;
	// else
	// {
	// root.data = getValue(root.left);
	// root.left = deleteNode(root.left, root);
	// }
	// }
	//
	//
	// }
	// return root;
	// }
	//
	// public int getValue(BinaryTreeNode node)
	// {
	// while(node.right !=null)
	// {
	// node = node.right;
	// }
	// return node.data;
	// }
	public void delete(int toDelete) {
		root = delete(root, toDelete);
	}

	private BinaryTreeNode delete(BinaryTreeNode p, int toDelete) {
		if (p == null)
			throw new RuntimeException("cannot delete.");
		else if (p.data > toDelete)
			p.left = delete(p.left, toDelete);
		else if (p.data < toDelete)
			p.right = delete(p.right, toDelete);
		else {
			if (p.left == null)
				return p.right;
			else if (p.right == null)
				return p.left;
			else {
				// get data from the rightmost node in the left subtree
				p.data = retrieveData(p.left);
				// delete the rightmost node in the left subtree
				p.left = delete(p.left, p.data);
			}
		}
		return p;
	}

	private int retrieveData(BinaryTreeNode p) {
		while (p.right != null)
			p = p.right;

		return p.data;
	}

	public boolean searchNode(BinaryTreeNode node) {

		BinaryTreeNode current = root;
		if (root == null) {
			return false;
		} else {
			while (true) {
				if (current.data > node.data) {
					current = current.right;
				} else if (current.data == node.data) {
					return true;
				} else if (current.data < node.data) {
					current = current.left;
				} else {
					break;
				}

			}

		}
		return false;

	}

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
		boolean flag = false;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the choice :");
			System.out.println("1: Display the elements in pre-order");
			System.out.println("2: Insert new element.");
			System.out.println("3: Delete existing element.");
			System.out.println("4: Size of the Tree.");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				bt.display(bt.root);

				break;
			case 2:
				System.out.println("Enter the new element to be inserted: ");
				int element = sc.nextInt();
				if (bt.insertNode(element)) {
					System.out.println("Element inserted into the BTree.");
				} else {
					System.out.println("Element already exists in the BTree.");
				}
				System.out.println("Elements of the Binary tree in preorder are:");
				bt.display(bt.root);
				break;
			case 3:
				System.out.println("Enter the element to be deleted: ");
				BinaryTreeNode deleteNode = bt.new BinaryTreeNode(sc.nextInt());

				System.out.println("Element deleted");

				System.out.println("Elements of the Binary tree in preorder are:");
				bt.display(bt.root);
				break;
			case 4:
				System.out.println("The size of the BTree is :");
				System.out.println(bt.size(bt.root));
				break;
			}
			System.out.println("Do you want to continue ?(Y/N)");
			flag = sc.next().equalsIgnoreCase("Y") ? true : false;

		} while (flag);

	}

}