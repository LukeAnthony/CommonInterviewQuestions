package questions.zerotoone.binarytree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TreeNode<T> {
  
  private T data;
  private TreeNode<T> leftChild;
  private TreeNode<T> rightChild;

  public TreeNode(T data){
    this.data = data;
  }
  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public TreeNode<T> getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(TreeNode<T> leftChild) {
    this.leftChild = leftChild;
  }

  public TreeNode<T> getRightChild() {
    return rightChild;
  }

  public void setRightChild(TreeNode<T> rightChild) {
    this.rightChild = rightChild;
  }
  
  public static void main(String[] a){
    TreeNode<String> root = new TreeNode<String>("root");
    TreeNode<String> leftChild = new TreeNode<String>("left child");
    TreeNode<String> rightChild = new TreeNode<String>("right child");
    TreeNode<String> leftGrandChild = new TreeNode<String>("left grandchild");
    root.setLeftChild(leftChild);root.setRightChild(rightChild);
    leftChild.setLeftChild(leftGrandChild);
    Queue<TreeNode> queue = new LinkedBlockingQueue<>();
    String message = "left grandchild";
    queue.add(root);
    while(!queue.isEmpty()){
      TreeNode<String> nextOnQueue = queue.remove();
      if(!nextOnQueue.getData().equals(message)){
        if(nextOnQueue.getLeftChild()==null);else queue.add(nextOnQueue.getLeftChild());
        if(nextOnQueue.getRightChild()==null);else queue.add(nextOnQueue.getRightChild());
      }
      System.out.println(nextOnQueue.getData().equals(message));
    }
    
 
    
    
  }
}
