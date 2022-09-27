
public class Test {
	
	
	

	public static void main(String[] args) {
		BuildTree meinBaum = new BuildTree();
				meinBaum.root.insert(42);
				meinBaum.root.insert(9);
				meinBaum.root.insert(8);
				meinBaum.root.insert(14);
				meinBaum.root.insert(90);
				meinBaum.root.insert(222);
				meinBaum.root.insert(596);
				meinBaum.root.insert(98);
	//			System.out.println(meinBaum.root.count());
				meinBaum.root.VLR();
				
//		ArrayQueue queue = new ArrayQueue();
//		ArrayQueue queue2 = new ArrayQueue();
//		
//		queue.enqueue(10);
//		
//		queue2.enqueue(3);
//		queue2.enqueue(5);
//		
//		
//	    queue.merge(queue2);
//	    while(queue.empty()==false) {
//	    	System.out.println(queue.front());
//	    	queue.dequeue();
//	    }
//		
		
//		
//		queue.enqueue(4);
//		queue.enqueue(5);
//		queue.dequeue();
//		System.out.println(queue.front());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayStack stack = new ArrayStack();
//		ArrayStack stack2 = new ArrayStack();
//		
//
//		stack.push(12);
//		stack.push(13);
//		stack.push(14);
//		stack.push(100);
//		
//		stack2.push(33);
//		stack2.push(10);
//		stack2.push(88);
//		
//		ArrayStack stackMerged = stack.append(stack2);
//		while(stackMerged.empty()==false) {
//			System.out.println(stackMerged.top());
//			stackMerged.pop();
//		}

//		ArrayStack stackCopy = stack.copy();

//		System.out.println(stackCopy.top());

//		
//		ListenElement element1 = new ListenElement(4);
//		ListenElement element2 = new ListenElement(42);
//		Queue myQueue = new Queue(3);
//		myQueue.enqueue(6);
//		System.out.println("Größe: " + myQueue.getGroesse());
//
//		try {
//			myQueue.dequeue();
//		} catch (Exception e) {
//
//			System.out.println("Die ist leer!");
//		}
//
//		System.out.println("Größe: " + myQueue.getGroesse());

	}
}
/*
 * try { stack.top(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.pop(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * System.out.println("Größe: " + stack.getGroesse()); try { stack.pop(); }
 * catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.pop(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.top(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * /* Liste liste = new Liste(3); liste.add(5); liste.add(7); liste.add(999);
 * liste.add(1001); System.out.println(liste);
 * System.out.println(liste.getGroesse());
 */
