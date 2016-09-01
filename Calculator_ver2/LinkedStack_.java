
public class LinkedStack_ {
	private StackNode_ top2;

	public boolean isEmpty() {
		return (top2 == null);
	}

	public void push_(int item_) {
		StackNode_ newNode2 = new StackNode_();
		newNode2.data2 = item_;
		newNode2.link2 = top2;
		top2 = newNode2;
	}
	
	public int pop_() {
		if (isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		} else {
			int item_ = top2.data2;
			top2 = top2.link2;
			return item_;
		}
	}
}
