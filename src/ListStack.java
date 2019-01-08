public class ListStack implements MyStack {

  private MyNode head = null;

  public boolean isEmpty() {
    return head == null;
  }

  public void push(int element) {
    head = new MyNode(element, head);
  }

  public int pop() {
    int topElement = head.element;
    head = head.next;
    return topElement;
  }

  private class MyNode {
    public int element;
    public MyNode next;

    public MyNode(int element, MyNode next) {
      this.element = element;
      this.next = next;
    }
  }
}
