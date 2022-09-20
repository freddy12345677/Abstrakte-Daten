
public class Test {

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
		ArrayStack stackTmp = new ArrayStack();
		

		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(100);

		ArrayStack stackCopy = stack.copy();

		System.out.println(stackCopy.top());

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
