//This script is created by Steven Frausto in DePaul University

//A reminder of what is a tree structure...

class tree {
  class node {
    private node left_;
    private node right_;
    private String data_;

    node(String newData) {
      data_ = newData;
    }

    public node getLeft(){
    return(left_);
    }
    

    public node getRight(){
      return(right_);
    }
    
    public void setLeft(node newLeft){
      left_ = newLeft;
    }

    public void setRight(node newRight){
      right_ = newRight;
    }
        
    public String getData(){
      return(data_);
    }
  }

  private node root_ = null;

  public tree (){
    root_ = new node("D");

    root_.setLeft(new node("B"));

    root_.getLeft().setLeft(new node("A"));
    root_.getLeft().setRight(new node("C"));

    root_.setRight(new node("F"));

    root_.getRight().setLeft(new node("E"));
    root_.getRight().setRight(new node("G"));

  }

  protected void prefix(node node){
    if (node == null) return;
    

    System.out.print(node.getData() + " ");

    prefix(node.getLeft());
    prefix(node.getRight());
  }

  protected void postfix(node node){
    if (node == null) return;
    

    prefix(node.getLeft());
    prefix(node.getRight());
    
    System.out.print(node.getData() + " ");
  }


  public void printPrefix(){
    prefix(root_);
    System.out.println("\n");
  }

  public void printPostfix(){
    postfix(root_);
    System.out.println("\n");
  }

  public static void main (String[] args) {
    tree tree = new tree();

    tree.printPrefix();

    tree.printPostfix();
  }
}
