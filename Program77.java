package tree;

public class Program77 {
	public static void main(String[] args) {


		Node root1 = AddNode(1);

		root1.left = AddNode(2);
		root1.left.left = AddNode(4);
		root1.left.left.left = AddNode(8);
		root1.left.left.right = AddNode(9);
		root1.left.right = AddNode(5);
		root1.right = AddNode(3);
		root1.right.left = AddNode(6);
		root1.right.right = AddNode(7);
		root1.right.right.left = AddNode(10);
		root1.right.right.right = AddNode(11);
		
		Node root2 = AddNode(1);
		root2.left = AddNode(2);
		root2.right = AddNode(3);
		root2.left.left = AddNode(4);
		root2.right.right = AddNode(5);
		root2.left.left.left = AddNode(6);
		root2.right.right.right = AddNode(7);


		
		// --- Runtime ---
		long startTime = System.currentTimeMillis();
		
		// --- Start ---
		Program77 p55 = new Program77();
		p55.linkSameLevel(root1);
		
		// --- Runtime ---
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("Runtime " + elapsedTime);
		
	    // --- Memory ---
	    Runtime runtime = Runtime.getRuntime();
	    runtime.gc();
	    long memory = runtime.totalMemory() - runtime.freeMemory();
	    System.out.println("Used Memory " + memory + " bytes");
	    System.out.println("Used Memory " + (memory/1024L) + " kbytes");
	    System.out.println("Used Memory " + (memory/(1024L*1024L)) + " mbytes");
	
	    // --- Print ---
		Node current = root1.left.left.left; // root1.left.left.left; // root2.left.left.left;
		StringBuilder sb = new StringBuilder();
		sb.append("\n" + current.value + "->");
		while (current.level != null) {
			sb.append(current.level.value + "->");
			current = current.level;
		}
		System.out.println(sb);
	}

	private static Node AddNode(int data) {
		Node node = new Node();
		node.value = data;
		node.left = null;
		node.right = null;
		node.level = null; // !!! NULL
		return (node);
	}

	Node firstnc(Node p) {
		Node temp = p.level;
		while (temp != null) {
			if (temp.left != null) return temp.left;
			if (temp.right != null) return temp.right;
			temp = temp.level;
		}
		return null;
	}
	
	void linkSameLevel(Node n) {
		
		if (n == null) return;

		if (n.level != null)
			linkSameLevel(n.level);

		if (n.left != null) {
			if (n.right != null) {
				n.left.level = n.right;
				n.right.level = firstnc(n);
			} else
				n.left.level = firstnc(n);
			linkSameLevel(n.left);
		} else if (n.right != null) {
			n.right.level = firstnc(n);
			linkSameLevel(n.right);
		} else
			linkSameLevel(firstnc(n));
	}
}