package tree;

public class Program88 {
	public static void main(String[] args) {

/*          1
         /     \
        2       3
       /  \    /  \
      4    5  6    7
     / \          / \  
    8   9        10  11
*/
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
		
/*       1
        / \
       2   3
      /     \
     4       5
    /         \
   6           7
*/
		Node root2 = AddNode(1);
		root2.left = AddNode(2);
		root2.right = AddNode(3);
		root2.left.left = AddNode(4);
		root2.right.right = AddNode(5);
		root2.left.left.left = AddNode(6);
		root2.right.right.right = AddNode(7);

		
		Node root3 = AddNode(1);  // 0
		
		root3.left = AddNode(2);  // 1
		root3.right = AddNode(3);
		
		
		root3.left.left = AddNode(4);  // 2.1
		root3.left.right = AddNode(5);
		
		root3.right.left = AddNode(6); // 2.2
		root3.right.right = AddNode(7);
		
		
		root3.left.left.left = AddNode(8);  // 3.1
		root3.left.left.right = AddNode(9);
		
		root3.left.right.left = AddNode(10);  // 3.2
		root3.left.right.right = AddNode(11);
		
		root3.right.left.left = AddNode(12);  // 3.3
		root3.right.left.right = AddNode(13);
		
		root3.right.right.left = AddNode(14);  // 3.4
		root3.right.right.right = AddNode(15);
		
		
		
		root3.left.left.left.left = AddNode(16);  // 4.1
		root3.left.left.left.right = AddNode(17);
		
		root3.left.left.right.left = AddNode(18);  // 4.2
		root3.left.left.right.right = AddNode(19);
		
		root3.left.right.left.left = AddNode(20);  // 4.3
		root3.left.right.left.right = AddNode(21);
		
		root3.left.right.right.left = AddNode(22);  // 4.4
		root3.left.right.right.right = AddNode(23);
		
		root3.right.left.left.left = AddNode(24);   // 4.5
		root3.right.left.left.right = AddNode(25);
		
		root3.right.left.right.left = AddNode(26);  // 4.6
		root3.right.left.right.right = AddNode(27);
		
		root3.right.right.left.left = AddNode(28);  // 4.7
		root3.right.right.left.right = AddNode(29); 
		
		root3.right.right.right.left = AddNode(30);  // 4.8
		root3.right.right.right.right = AddNode(31);
		
		
		
		root3.left.left.left.left.left = AddNode(32);  // 5.1
		root3.left.left.left.left.right = AddNode(33); 
		
		root3.left.left.left.right.left = AddNode(34);  // 5.2
		root3.left.left.left.right.right = AddNode(35);
		
		root3.left.left.right.left.left = AddNode(36);    // 5.3
		root3.left.left.right.left.right = AddNode(37); 
		
		root3.left.left.right.right.left = AddNode(38);  // 5.4
		root3.left.left.right.right.right = AddNode(39);
		
		root3.left.right.left.left.left = AddNode(40);    // 5.5
		root3.left.right.left.left.right = AddNode(41); 
		
		root3.left.right.left.right.left = AddNode(42);  // 5.6
		root3.left.right.left.right.right = AddNode(43);
		
		root3.left.right.right.left.left = AddNode(44);   // 5.7
		root3.left.right.right.left.right = AddNode(45); 
		
		root3.left.right.right.right.left = AddNode(46);  // 5.8
		root3.left.right.right.right.right = AddNode(47);
		
		root3.right.left.left.left.left = AddNode(48);   // 5.9
		root3.right.left.left.left.right = AddNode(49);  
		
		root3.right.left.left.right.left = AddNode(50);  // 5.10
		root3.right.left.left.right.right = AddNode(51);
		
		root3.right.left.right.left.left = AddNode(52);   // 5.11
		root3.right.left.right.left.right = AddNode(53); 
		
		root3.right.left.right.right.left = AddNode(54);  // 5.12
		root3.right.left.right.right.right = AddNode(55);
		
		root3.right.right.left.left.left = AddNode(56);  // 5.13
		root3.right.right.left.left.right = AddNode(57); 
		
		root3.right.right.left.right.left = AddNode(58);  // 5.14
		root3.right.right.left.right.right = AddNode(59); 
		
		root3.right.right.right.left.left = AddNode(60);  // 5.15
		root3.right.right.right.left.right = AddNode(61); 
		
		root3.right.right.right.right.left = AddNode(62); // 5.16
		root3.right.right.right.right.right = AddNode(63);
		
		
		
		
		// --- Runtime ---
		long startTime = System.currentTimeMillis();
		
		// --- Start ---
		Program88 p55 = new Program88();
		p55.linkSameLevel(root3);
		
		// --- Runtime ---
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("\nRuntime " + elapsedTime);
		
	    // --- Memory ---
	    Runtime runtime = Runtime.getRuntime();
	    runtime.gc();
	    long memory = runtime.totalMemory() - runtime.freeMemory();
	    System.out.println("Used Memory " + memory + " bytes");
	    System.out.println("Used Memory " + (memory/1024L) + " kbytes");
	    System.out.println("Used Memory " + (memory/(1024L*1024L)) + " mbytes");
	
	    // --- Print ---
		Node current = root3.left.left.left.left.left; // root1.left.left.left; // root2.left.left.left;
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
		else System.out.println("n = " + n.value);

		if (n.level != null) linkSameLevel(n.level);

		if (n.left != null) {
			System.out.println("n.left = " + n.left.value);
			if (n.right != null) {
				System.out.println("n.right = " + n.right.value);
				n.left.level = n.right;
				System.out.println("n.left.level == " + n.left.level.value);
				n.right.level = firstnc(n);
			} else{
				n.left.level = firstnc(n);
				System.out.println("n.left.level == " + n.left.level.value);
			}
			linkSameLevel(n.left);
		} else if (n.right != null) {
			System.out.println("n.right = " + n.right.value);
			n.right.level = firstnc(n);
			linkSameLevel(n.right);
		} else
			linkSameLevel(firstnc(n));
	}
}