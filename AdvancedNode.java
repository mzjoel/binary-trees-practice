public class AdvancedNode extends Node {
    //Constructor calls the node constructor as parents
    public AdvancedNode(int data){
        super(data);
    }

    public void setLeft(Node node){
        if(this.left == null){
            this.left = node;
        }
    }

    public void setRight(Node node){
        if(this.right == null){
            this.right = node;
        }
    }

    public Node getLeft(){
        return this.left;

    }

    public Node getRight(){
        return this.right;
    }

    public void setData(int data){
        this.value = data;
    }

    public int getData(){
        return this.value;
    }

    public void print(){
        printTree(this);
    }

    private void printTree(Node node){
        if(node != null){
            printTree(node.left);
            System.out.println(node.value);
            printTree(node.right);
        }
    }
}

