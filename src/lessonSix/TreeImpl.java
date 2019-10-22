package lessonSix;

public class TreeImpl implements Tree {

    private Node root;

    @Override
    public Node find(int id) {
        Node current = root;
        while (current.id != id) {
            if (id < current.id) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        if (current == null) {
            return null;
        }
        return current;
    }

    @Override
    public void insert(int id) {
        Node node = new Node();
        node.id = id;
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.id) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    // Симметричный обход
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            root.display();         //посещение узла
            inOrder(root.rightChild);
        }
    }

    // Прямой обход
    void preOrder(Node root) {
        if (root != null) {
            root.display();         //посещение узла
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    // Обратный обход
    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            root.display();         //посещение узла
        }
    }

    @Override
    public Node min() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last; //самый левый лист
    }

    @Override
    public Node max() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    @Override
    public boolean delete(int key) {
        Node current = root;
        Node parent = root;

        boolean isLeftChild = true;

        while (current.id != key) {
            parent = current;
            if (key < current.id) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        }
        //если нету потомков
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        }
        //если нету левого потомка, то узел заменяется правым поддеревом
        else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        }
        //если нету правого потомка, то узел заменяется левым поддеревом
        else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        }
        //если есть два потомка
        else {
//            Node successor = getSuccessor(current);
            Node successor = getSuccessorBasedOnMin(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return true;
    }

    private Node getSuccessor(Node node) {
        Node successorParent = node;
        Node successor = node;
        Node current = node.rightChild;
        while (current != null) {
//            minTemp(current);
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != node.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }
        return successor;
    }

    /**
     * Another experimental method
     */

    //    getSuccessor based on localMin method:
    private Node getSuccessorBasedOnMin(Node node) {
        Node successor = localMinAndItsParent(node)[0];
        Node successorParent = localMinAndItsParent(node)[1];
        if (successor != node.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }
        return successor;
    }

    /**
     * Experimental method
     */
    Node[] localMinAndItsParent(Node subRoot) {
        Node[] MinAndItsParent = {null, subRoot};
        Node current = subRoot;
        while (current != null) {
            MinAndItsParent[1] = MinAndItsParent[0];
            MinAndItsParent[0] = current;
            current = current.leftChild;
        }
        return MinAndItsParent; //самый левый лист
    }
}
