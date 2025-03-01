/**
 * BinarySearchTree
 */
public class BinarySearchTree {
  Node root;

  public void insert(Node node) {
    root = insertHelper(root, node);
  }

  private Node insertHelper(Node root, Node node) {
    int data = node.intData;

    if (root == null) {
      root = node;
      return root;
    } else if (data < root.intData) {
      root.left = insertHelper(root.left, node);
    } else if (data > root.intData) {
      root.right = insertHelper(root.right, node);
    }
    return root;
  }

  public void display() {
    displayHelper(root);
  }

  private void displayHelper(Node root) {
    if (root != null) {
      displayHelper(root.left);
      System.out.print(root.intData + " ");
      displayHelper(root.right);
    }
  }

  public boolean search(int data) {
    return searchHelper(root, data);
  }

  private boolean searchHelper(Node root, int data) {
    if (root == null) {
      return false;
    } else if (root.intData == data) {
      return true;
    } else if (root.intData > data) {
      return searchHelper(root.left, data);
    } else {
      return searchHelper(root.right, data);
    }
  }

  public void remove(int data) {
    if (search(data)) {
      root = removeHelper(root, data);
    } else {
      System.out.println(data + " : The data could not be found.");
    }
  }

  private Node removeHelper(Node root, int data) {
    if (root == null) {
      return root;
    } else if (data < root.intData) {
      root.left = removeHelper(root.left, data);
    } else if (data > root.intData) {
      root.right = removeHelper(root.right, data);
    } else { // Node found
      if (root.left == null && root.right == null) {
        return null;
      } else if (root.right != null) {
        root.intData = successor(root);
        root.right = removeHelper(root.right, root.intData);
      } else if (root.left != null) {
        root.intData = predecessor(root);
        root.left = removeHelper(root.left, root.intData);
      }
    }
    return root;
  }

  private int successor(Node root) {
    root = root.right;
    while (root.left != null) {
      root = root.left;
    }
    return root.intData;
  }

  private int predecessor(Node root) {
    root = root.left;
    while (root.right != null) {
      root = root.right;
    }
    return root.intData;
  }

  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(new Node(6));
    tree.insert(new Node(7));
    tree.insert(new Node(4));
    tree.insert(new Node(2));
    tree.insert(new Node(5));
    tree.insert(new Node(1));
    tree.insert(new Node(3));

    tree.remove(6);

    tree.display();
  }
}
