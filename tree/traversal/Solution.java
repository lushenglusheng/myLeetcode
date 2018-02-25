package tree.traversal;

import java.util.*;

import tree.traversal.Solution.TreeNode;

public class Solution {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode next;
		TreeNode(int x) { 
			val = x;
		}
	}
	
	//中序遍历打印
	private void printInorder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode t = root;
		while(!stack.isEmpty() || t!=null) {
			if(t != null) {
				stack.push(t);
				t = t.left;
			} else {
				t = stack.pop();
				System.out.println(t.val);
				t = t.right;
			}
		}
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		//1.Binary Tree Preorder Traversal
		//二叉树前序遍历
		/*TreeNode root = solution.new TreeNode(0);
		TreeNode t1 = solution.new TreeNode(1);
		TreeNode t2 = solution.new TreeNode(2);
		TreeNode t3 = solution.new TreeNode(3);
		TreeNode t4 = solution.new TreeNode(4);
		TreeNode t5 = solution.new TreeNode(5);
		TreeNode t6 = solution.new TreeNode(6);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t1.right = t4;
		t4.left = t5;
		t4.right = t6;
		List<Integer> result = solution.preorderTraversal(root);
		System.out.println("result: " + result);*/
		
		//2.Binary Tree Inorder Traversal
		//二叉树中序遍历
		/*TreeNode root = solution.new TreeNode(0);
		TreeNode t1 = solution.new TreeNode(1);
		TreeNode t2 = solution.new TreeNode(2);
		TreeNode t3 = solution.new TreeNode(3);
		TreeNode t4 = solution.new TreeNode(4);
		TreeNode t5 = solution.new TreeNode(5);
		TreeNode t6 = solution.new TreeNode(6);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t1.right = t4;
		t4.left = t5;
		t4.right = t6;
		List<Integer> result = solution.inorderTraversal(root);
		System.out.println("result: " + result);*/
		
		//3.Binary Tree Postorder Traversal
		//二叉树后序遍历
		/*TreeNode root = solution.new TreeNode(0);
		TreeNode t1 = solution.new TreeNode(1);
		TreeNode t2 = solution.new TreeNode(2);
		TreeNode t3 = solution.new TreeNode(3);
		TreeNode t4 = solution.new TreeNode(4);
		TreeNode t5 = solution.new TreeNode(5);
		TreeNode t6 = solution.new TreeNode(6);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t1.right = t4;
		t4.left = t5;
		t4.right = t6;
		List<Integer> result = solution.postorderTraversal(root);
		System.out.println("result: " + result);*/
		
		//4.Binary Tree Level Order Traversal
		//二叉树等级遍历，从上到下，从左往右
		/*TreeNode root = solution.new TreeNode(0);
		TreeNode t1 = solution.new TreeNode(1);
		TreeNode t2 = solution.new TreeNode(2);
		TreeNode t3 = solution.new TreeNode(3);
		TreeNode t4 = solution.new TreeNode(4);
		TreeNode t5 = solution.new TreeNode(5);
		TreeNode t6 = solution.new TreeNode(6);
		root.left = t1;
		t1.left = t2;
		t2.left = t3;
		t3.left = t4;
		t4.left = t5;
		t5.left = t6;
		List<List<Integer>> result = solution.levelOrder(root);
		System.out.println("result: " + result);*/
		
		//5.Binary Tree Level Order Traversal II
		//二叉树等级遍历，从下到上，从左往右
		/*TreeNode root = solution.new TreeNode(0);
		TreeNode t1 = solution.new TreeNode(1);
		TreeNode t2 = solution.new TreeNode(2);
		TreeNode t3 = solution.new TreeNode(3);
		TreeNode t4 = solution.new TreeNode(4);
		TreeNode t5 = solution.new TreeNode(5);
		TreeNode t6 = solution.new TreeNode(6);
		root.left = t1;
		t1.left = t2;
		t2.left = t3;
		t3.left = t4;
		t4.left = t5;
		t5.left = t6;
		List<List<Integer>> result = solution.levelOrderBottom(root);
		System.out.println("result: " + result);*/
		
		//6.Binary Tree Zigzag Level Order Traversal
		//二叉树等级遍历，从上到下，Z字形
		/*TreeNode root = solution.new TreeNode(0);
		TreeNode t1 = solution.new TreeNode(1);
		TreeNode t2 = solution.new TreeNode(2);
		TreeNode t3 = solution.new TreeNode(3);
		TreeNode t4 = solution.new TreeNode(4);
		TreeNode t5 = solution.new TreeNode(5);
		TreeNode t6 = solution.new TreeNode(6);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t1.right = t4;
		t4.left = t5;
		t4.right = t6;
		List<List<Integer>> result = solution.zigzagLevelOrder(root);
		System.out.println("result: " + result);*/
		
		//7.Recover Binary Search Tree
		//给定一个搜索二叉树，其中有两个元素的位置被交换了，恢复原搜索二叉树的正确顺序
		/*TreeNode root = solution.new TreeNode(11);
		TreeNode t1 = solution.new TreeNode(3);
		TreeNode t2 = solution.new TreeNode(15);
		TreeNode t3 = solution.new TreeNode(1);
		TreeNode t4 = solution.new TreeNode(19);//
		TreeNode t5 = solution.new TreeNode(13);
		TreeNode t6 = solution.new TreeNode(7);//
		TreeNode t7 = solution.new TreeNode(5);
		TreeNode t8 = solution.new TreeNode(9);
		TreeNode t9 = solution.new TreeNode(17);
		TreeNode t10 = solution.new TreeNode(21);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t1.right = t4;
		t4.left = t7;
		t4.right = t8;
		t2.left = t5;
		t2.right = t6;
		t6.left = t9;
		t6.right = t10;
		solution.printInorder(root);
		solution.recoverTree(root);
		solution.printInorder(root);*/
		
		//8.Same Tree
		//给定两棵二叉树，判定两棵树是否相同
		/*TreeNode root1 = solution.new TreeNode(0);
		TreeNode t11 = solution.new TreeNode(1);
		TreeNode t12 = solution.new TreeNode(2);
		TreeNode t13 = solution.new TreeNode(3);
		TreeNode t14 = solution.new TreeNode(4);
		TreeNode t15 = solution.new TreeNode(5);
		TreeNode t16 = solution.new TreeNode(6);
		root1.left = t11;
		root1.right = t12;
		t11.left = t13;
		t11.right = t14;
		t14.left = t15;
		t14.right = t16;
		TreeNode root2 = solution.new TreeNode(0);
		TreeNode t21 = solution.new TreeNode(1);
		TreeNode t22 = solution.new TreeNode(2);
		TreeNode t23 = solution.new TreeNode(3);
		TreeNode t24 = solution.new TreeNode(4);
		TreeNode t25 = solution.new TreeNode(5);
		TreeNode t26 = solution.new TreeNode(6);
		root2.left = t21;
		root2.right = t22;
		t21.left = t23;
		t21.right = t24;
		t24.left = t25;
		t24.right = t26;
		boolean result = solution.isSameTree(root1, root2);
		System.out.println("result: " + result);*/
		
		//9.Symmetric Tree
		//给定一棵二叉树，判定其是否左右对称
		/*TreeNode root = solution.new TreeNode(0);
		TreeNode t1 = solution.new TreeNode(1);
		TreeNode t2 = solution.new TreeNode(1);
		TreeNode t3 = solution.new TreeNode(2);
		TreeNode t4 = solution.new TreeNode(2);
		TreeNode t5 = solution.new TreeNode(3);
		TreeNode t6 = solution.new TreeNode(3);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t2.right = t4;
		t3.right = t5;
		t4.left = t6;
		boolean result = solution.isSymmetric(root);
		System.out.println("result: " + result);*/
		
		//10.Balanced Binary Tree
		//给定一棵二叉树，判断其是否为高度平衡的二叉树，即所有节点的两个子树高度差不超过1
		/*TreeNode root = solution.new TreeNode(0);
		TreeNode t1 = solution.new TreeNode(1);
		TreeNode t2 = solution.new TreeNode(2);
		TreeNode t3 = solution.new TreeNode(3);
		TreeNode t4 = solution.new TreeNode(4);
		TreeNode t5 = solution.new TreeNode(5);
		TreeNode t6 = solution.new TreeNode(6);
		TreeNode t7 = solution.new TreeNode(7);
		TreeNode t8 = solution.new TreeNode(8);
		TreeNode t9 = solution.new TreeNode(9);
		TreeNode t10 = solution.new TreeNode(10);
		TreeNode t11 = solution.new TreeNode(11);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t1.right = t4;
		t2.left = t5;
		t2.right = t6;
		t3.left = t7;
		t5.left = t8;
		t6.left = t9;
		t6.right = t10;
		t9.right = t11;
		boolean result = solution.isBalanced(root);
		System.out.println("result: " + result);*/
		
		//11.Flatten Binary Tree to	Linked List
		//给定一棵二叉树，按照前序遍历转化为一棵只有右子树的链表树
		/*TreeNode t1 = solution.new TreeNode(1);
		TreeNode t2 = solution.new TreeNode(2);
		TreeNode t3 = solution.new TreeNode(3);
		TreeNode t4 = solution.new TreeNode(4);
		TreeNode t5 = solution.new TreeNode(5);
		TreeNode t6 = solution.new TreeNode(6);
		TreeNode t7 = solution.new TreeNode(7);
		t1.left = t2;
		t1.right = t6;
		t2.left = t3;
		t2.right = t4;
		t4.left = t5;
		t6.left = t7;
		
		solution.flatten(t1);
		
		TreeNode test = solution.new TreeNode(0);
		test.right = t1;
		while(test.right != null) {
			test = test.right;
			System.out.println(test.val);
		}*/
		
		//12.Populating Next Right Pointers in Each Node II
		//给定一棵二叉树，给每个节点新建一个指针，从本节点指向其同等级的右边节点，若无则指向null
		/*ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		TreeNode t1 = solution.new TreeNode(1);list.add(t1);
		TreeNode t2 = solution.new TreeNode(2);list.add(t2);
		TreeNode t3 = solution.new TreeNode(3);list.add(t3);
		TreeNode t4 = solution.new TreeNode(4);list.add(t4);
		TreeNode t5 = solution.new TreeNode(5);list.add(t5);
		TreeNode t6 = solution.new TreeNode(6);list.add(t6);
		TreeNode t7 = solution.new TreeNode(7);list.add(t7);
		
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.right = t6;
		t4.left = t7;
		
		solution.connect(t1);
		
		for(TreeNode node : list) {
			if(node.next != null) {
				System.out.println(node.next.val);
			} else {
				System.out.println(node.next);
			}
		}*/
	}
	
	//2017-10-1
	//12.Populating Next Right Pointers in Each Node II
	//给定一棵二叉树，给每个节点新建一个指针，从本节点指向其同等级的右边节点，若无则指向null
	//从第二层开始
	//使用root指针，root=root.next，从左往右遍历上一层节点
	//使用first指针，记录此层最左边节点
	//使用curr指针，借助root指针，从左往右拼接此层节点
	//此层拼接结束，root指向此层最左边节点，继续拼接下一层节点
	public void connect(TreeNode root) {
		
		while(root != null) {
			
			TreeNode first = new TreeNode(0);
			TreeNode curr = first;
			
			while(root != null) {
				
				if(root.left != null) {
					curr.next = root.left;
					curr = curr.next;
				}
				if(root.right != null) {
					curr.next = root.right;
					curr = curr.next;
				}
				root = root.next;
			}
			root = first.next;
		}
	}
		
	//2017-9-9
	//11.Flatten Binary Tree to	Linked List
	//给定一棵二叉树，按照前序遍历的顺序转化为一棵只有右子树的链表树
	//递归，从右往左，后序遍历
	//从后往前拼接子树
	//使用pre指向新树的第一个节点root
	TreeNode pre = null;
    public void flatten(TreeNode root) {
        
    	if(root == null) {
    		return;
    	}
    	
    	flatten(root.right);
    	flatten(root.left);
    	
    	root.right = pre;
    	root.left = null;
    	pre = root;
    }
	
	//2017-9-7
	//10.Balanced Binary Tree
	//给定一棵二叉树，判断其是否为高度平衡的二叉树，即所有节点的两个子树高度差不超过1
	//递归计算每个节点的两个子树的高度
	//	若子树空，则返回0
	//	若两子树的高度差大于1，则返回-1，此时应一直返回-1，退出递归，返回false
	//	若两子树的高度差小于等于1，则返回Math.max(leftHeight, rightHeight) + 1，作为此节点的高度，返回给其父节点
	public boolean isBalanced(TreeNode root) {
		
		int height = height(root);
		
		if(height == -1) {
			return false;
		} else {
			return true;
		}
    }
	private int height(TreeNode node) {
		
		if(node == null) {
			return 0;
		}
		
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		
		if(leftHeight==-1 || rightHeight==-1) {
			return -1;
		}
		
		int abs = Math.abs(leftHeight - rightHeight);
		
		if(abs>1) {
			return -1;
		}
		
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
	//2017-7-31
	//9.Symmetric Tree
	//给定一棵二叉树，判定其是否左右对称
	//递归
	//	传入对称节点p、q
	//	若两节点同时为null，则返回true
	//	若两节点只有一个为null，则返回false
	//	若两节点值不等，则返回false
	//return 递归(p.left, q.right) && 递归(p.right, q.left);
    public boolean isSymmetric(TreeNode root) {
        
    	if(root == null) return true;
    	
    	return isSymmetric(root.left, root.right);
    }
    private boolean isSymmetric(TreeNode p, TreeNode q) {
    	
    	if(p==null && q==null) return true;
    	
    	if(p==null || q==null) return false;
    	
    	if(p.val != q.val) return false;
    	
    	return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }
	
	//2017-7-30
	//8.Same Tree
	//给定两棵二叉树，判定两棵树是否相同
	//递归，前序遍历两棵二叉树
	//	若两节点同时为null，则返回true
	//	若两节点只有一个为null，则返回false
	//	若两节点值不等，则返回false
	//return(递归两节点的左节点 && 递归两节点的右节点);
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
    	if(p==null && q==null) return true;
    	
    	if(p==null || q==null) return false;
    	
    	if(p.val != q.val) return false;
    	
    	return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
	
	//2017-7-29
	//7.Recover Binary Search Tree
	//给定一个二叉搜索树，其中有两个元素的位置被交换了，恢复原二叉搜索树的正确顺序
	//中序遍历二叉搜索树
	//	使用pre和curr指针记录中序访问二叉搜索树的值
	//	若pre.val>curr.val，则出现错误
	//		第一次出现错误，则使用errorT1=pre;	errorT2=curr;记录错误出现的地方
	//		若还有第二次错误出现，则errorT2=curr;更新错误出现的地方，结束遍历
	//最后交换errorT1和errorT2两处错误的节点值
	//即若只有一次错误出现，则为前后两节点位置出错
	//若有两次错误出现，则为第一次错误的pre和第二次错误的curr两节点位置出错
    public void recoverTree(TreeNode root) {
        
    	if(root == null) return;
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	
    	TreeNode t = null;
    	
    	TreeNode pre = null;
    	TreeNode curr = null;
    	TreeNode errorT1 = null;
    	TreeNode errorT2 = null;
    	t = root;
    	
    	while(!stack.isEmpty() || t!=null) {
    		if(t != null) {
    			stack.push(t);
    			t = t.left;
    			
    		} else {
    			t = stack.pop();
    			
    			pre = curr;
    			curr = t;
    			t = t.right;
    			
    			if(pre != null) {
    				if(pre.val>curr.val && errorT1!=null) {
    					System.out.println("pre= " + pre.val);
    					System.out.println("curr= " + curr.val);
    					errorT2 = curr;
    					break;
    				}
    				if(pre.val>curr.val && errorT1==null) {
    					System.out.println("pre= " + pre.val);
    					System.out.println("curr= " + curr.val);
    					errorT1 = pre;
    					errorT2 = curr;
    				}
    			}
    		}
    	}
    	
		int temp = errorT1.val;
		errorT1.val = errorT2.val;
		errorT2.val = temp;
    }

	//2017-7-27
	//6.Binary Tree Zigzag Level Order Traversal
	//二叉树等级遍历，从上到下，Z字形（从左到右，从右到左，交替）
	//与4.Binary Tree Level Order Traversal相似
	//在遍历每个等级的节点时，交替反序添加访问的节点值
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	
    	LinkedList<List<Integer>> listL = new LinkedList<List<Integer>>();
    	
    	if(root == null) return listL;
    	
    	LinkedList<Integer> listI;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	
    	queue.offer(root);
    	
    	int num;
    	boolean order = true;
    	
    	while(!queue.isEmpty()) {
    		listI = new LinkedList<Integer>();
    		num = queue.size();
    		
    		for(int i=0; i<num; i++) {
    			
    			root = queue.remove();
    			
    			if(order) {
    				listI.add(root.val);
	    		} else {
	    			listI.addFirst(root.val);
	    		}
    			if(root.left != null) {
    				queue.offer(root.left);
    			}
    			if(root.right != null) {
    				queue.offer(root.right);
    			}
    		}
    		listL.add(listI);
    		order = order?false:true;
    	}
    	return listL;
    }
	
	//2017-7-26
	//5.Binary Tree Level Order Traversal II
	//二叉树等级遍历，从下到上，从左往右
	//与4.Binary Tree Level Order Traversal相似
	//反序保存结果数组即可
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		
		LinkedList<List<Integer>> listL = new LinkedList<List<Integer>>();
    	
    	if(root == null) return listL;
    	
    	List<Integer> listI;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	
    	queue.offer(root);
    	
    	int currNum;
    	
    	while(!queue.isEmpty()) {
    		
    		currNum = queue.size();//当前等级的节点个数
    		listI = new LinkedList<Integer>();
    		
    		for(int i=0; i<currNum; i++) {
    			root = queue.remove();
    			listI.add(root.val);
    			
    			if(root.left != null) {
    				queue.offer(root.left);
    			}
    			if(root.right != null) {
    				queue.offer(root.right);
    			}
    		}
    		listL.addFirst(listI);
    	}
    	return listL;
    }
	
	//2017-7-26
	//4.Binary Tree Level Order Traversal
	//二叉树等级遍历，从上到下，从左往右
	//循环实现
	//使用队列保存节点顺序，根节点root加入队列
	//	获取队列长度currNum=queue.size();即为当前等级的节点个数
	//	依次从队列头取出currNum个节点
	//		访问该节点值
	//		左节点不空则加入队列，右节点不空则加入队列
	//队列不空，继续遍历下一等级节点
	//
	//递归实现（访问顺序未做到等级遍历）
	//递归方法参数，传入结果数组listL，当前节点root，当前节点等级level
	//	若等级level大于listL中所拥有的等级数，则在listL中添加新的等级数组
	//	访问当前节点root值，并加入listL中的相应的等级数组中
	//	左节点不空则调用递归，右节点不空则调用递归，其中level+1
    public List<List<Integer>> levelOrder(TreeNode root) {
        
    	/*循环实现
    	List<List<Integer>> listL = new LinkedList<List<Integer>>();
    	
    	if(root == null) return listL;
    	
    	List<Integer> listI;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	
    	queue.offer(root);
    	
    	int currNum;
    	
    	while(!queue.isEmpty()) {
    		
    		currNum = queue.size();//当前等级的节点个数
    		listI = new LinkedList<Integer>();
    		
    		for(int i=0; i<currNum; i++) {
    			root = queue.remove();
    			listI.add(root.val);
    			
    			if(root.left != null) {
    				queue.offer(root.left);
    			}
    			if(root.right != null) {
    				queue.offer(root.right);
    			}
    		}
    		listL.add(listI);
    	}
    	return listL;
    	*/
    	
    	//递归实现
    	List<List<Integer>> listL = new ArrayList<List<Integer>>();
    	
    	if(root == null) return listL;
    	
    	levelOrder(listL, root, 0);
    	
    	return listL;
    }
    private void levelOrder(List<List<Integer>> listL, TreeNode root, int level) {
    	if(level >= listL.size()) {
    		listL.add(new LinkedList<Integer>());
    	}
    	listL.get(level).add(root.val);
    	
    	if(root.left != null) {
    		levelOrder(listL, root.left, level+1);
    	}
    	if(root.right != null) {
    		levelOrder(listL, root.right, level+1);
    	}
    }
	
	//2017-7-25
	//3.Binary Tree Postorder Traversal
	//二叉树后序遍历
	//使用循环迭代，使用栈保存节点顺序
	//后续遍历，即交换左右节点访问顺序的前序遍历的逆顺序
	//从根节点开始迭代
	//	若当前根节点不空，则访问根节点值，并将根节点压栈，然后使用右节点作为当前根节点，继续迭代
	//	若当前根节点为空，则弹出栈顶节点，然后使用栈顶节点的左节点作为当前根节点，继续迭代
	//当空栈并且当前根节点为空时，迭代结束
	//此访问顺序的逆顺序，即为后序遍历
	//但真实访问顺序，未做到后序遍历访问顺序
	//	可以将访问该节点值操作，替换为将该节点压入另一个新栈中，最后弹栈访问节点值
    public List<Integer> postorderTraversal(TreeNode root) {
        
    	List<Integer> list = new LinkedList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	
    	TreeNode t = root;
    	
    	while(!stack.isEmpty() || t!=null) {
    		if(t != null) {
    			list.add(0, t.val);
    	    	stack.push(t);
    	    	t = t.right;
    	    	
    		} else {
    			t = stack.pop();
    			t = t.left;
    		}
    	}
    	return list;
    }
	
	//2017-7-25
	//2.Binary Tree Inorder Traversal
	//二叉树中序遍历
	//使用循环迭代，使用栈保存节点顺序
	//从根节点开始迭代
	//	若当前根节点不空，则将根节点压栈，然后使用左节点作为当前根节点，继续迭代
	//	若当前根节点为空，则弹出栈顶节点，访问该栈顶节点值，然后使用该栈顶节点的右节点作为当前根节点，继续迭代
	//当空栈并且当前根节点为空时，迭代结束
    public List<Integer> inorderTraversal(TreeNode root) {
        
    	List<Integer> list = new LinkedList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	
    	TreeNode t = root;
    	
    	while(!stack.isEmpty() || t!=null) {
    		if(t != null) {
    			stack.push(t);
    			t = t.left;
    			
    		} else {
    			t = stack.pop();
    			list.add(t.val);
    			t = t.right;
    		}
    	}
    	
    	return list;
    }
	
	//2017-7-25
	//1.Binary Tree Preorder Traversal
	//二叉树前序遍历
	//使用循环迭代，使用栈保存节点顺序
	//从根节点开始迭代
	//	若当前根节点不空，则访问根节点值，并将根节点压栈，然后使用左节点作为当前根节点，继续迭代
	//	若当前根节点为空，则弹出栈顶节点，然后使用栈顶节点的右节点作为当前根节点，继续迭代
	//当空栈并且当前根节点为空时，迭代结束
    public List<Integer> preorderTraversal(TreeNode root) {
    	
    	List<Integer> list = new LinkedList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	
    	TreeNode t = root;
    	
    	while(!stack.isEmpty() || t!=null) {
    		if(t != null) {
    			list.add(t.val);
    	    	stack.push(t);
    	    	t = t.left;
    	    	
    		} else {
    			t = stack.pop();
    			t = t.right;
    		}
    	}
    	return list;
    }
	
}
