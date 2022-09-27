public class Element {
	static int maxdepth = 1;
	public int value;
	public Element left, right;
	public int depth = 1;

	Element(int n) {
		value = n;
		left = null;
		right = null;
	}

	public void insert(int value) {

		if (value >= this.value) {
			if (right == null) {

				right = new Element(value);
			} else {
				right.insert(value);
			}

		} else {
			if (left == null) {
				left = new Element(value);
			} else {
				left.insert(value);
			}
		}

	}

	public int depth(int depth) {

		if (left != null) {
			depth++;
			if (depth > maxdepth) {
				maxdepth++;
			}
			System.out.println("Lefttiefe: " + depth + " Maxtiefe: " + maxdepth);
			left.depth(depth);
			depth--;
		}
		if (right != null) {
			depth++;
			if (depth > maxdepth) {
				maxdepth++;
			}
			System.out.println("Righttiefe: " + depth + " Maxtiefe: " + maxdepth);
			right.depth(depth);
			depth--;
		}

		return maxdepth;
	}

	public void show() {
		System.out.println("" + value);
	}

	public int count() {

		if (left != null) {
			depth++;// wegen der Rekursion instanz muss das an dieser Zeile stehen sonst würde es
					// nie hchgzählt werden
			if (maxdepth < depth) {
				maxdepth = depth;
			}
			left.count();

		}
		if (right != null) {
			depth++;
			if (maxdepth < depth) {
				maxdepth = depth;
			}
			right.count();

		}
		depth--;
		return maxdepth;
	}

	public void VLR() {
		System.out.println(this.value);

		if (left != null) {
			left.VLR();
			

			

		}
		if (right != null) {
			right.VLR();
			//System.out.println(this.value);   nicht rein weil es sonst die WErte doppelt anzigen würden

			

		}
		

	}
}