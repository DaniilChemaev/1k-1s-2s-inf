public class Node {

    private String info;
    private Node left, right;

    public Node(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}





