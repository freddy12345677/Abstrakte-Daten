
public class ArrayStack {

	private int[] stack;
	private int tos;

	public ArrayStack() {
		stack = new int[100];
		tos = -1;
	}

	public void push(int x) {
		if (tos < 99) {
			tos++;
			stack[tos] = x;
		}
	}

	public void pop() {
		if (!empty())
			tos--;
	}

	public boolean empty() {

		return (tos == -1);

	}

	public int top() {
		if (!empty())
			return stack[tos];
		else
			return -99;
	}

	public ArrayStack copy() {

		ArrayStack stackCopyyy = new ArrayStack();
		ArrayStack stackTmp = new ArrayStack();

		while (empty() == false) {

			stackTmp.push(top());
			pop();
			System.out.println("stacktmp");

		}
		System.out.println("copy 1  complete");
		while (stackTmp.empty() == false) {
			stackCopyyy.push(stackTmp.top());
			push(stackTmp.top());
			stackTmp.pop();
			System.out.println("stack2");
		}
		System.out.println("copy2 complete");
		return stackCopyyy;
	}
	
	
	public ArrayStack append(ArrayStack stack2) {
		ArrayStack stackTmp = new ArrayStack();
		while(stack2.empty() == false) {
			stackTmp.push(stack2.top());
			stack2.pop();
			System.out.println("hinzugefügt");
			
			
			
			
		}while(stackTmp.empty() == false) {
			push(stackTmp.top());
			stack2.push(stackTmp.top());
			stackTmp.pop();
			System.out.println("merged");
		}
		
		return this;
	}

}
