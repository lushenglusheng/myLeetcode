package tree.search;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import tree.search.Solution.TreeNode;

public class Solution {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
			val = x;
		}
	}
	public static class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) {
			 val = x;
		 }
	}
	
	//中序遍历打印
	private static void printInorder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode t = root;
		while(!stack.isEmpty() || t!=null) {
			if(t != null) {
				stack.push(t);
				t = t.left;
			} else {
				t = stack.pop();
				System.out.print(t.val + " ");
				t = t.right;
			}
		}
	}
	
	//前序遍历打印
	private static void printPreorder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode t = root;
		while(!stack.isEmpty() || t!=null) {
			if(t != null) {
				System.out.print(t.val + " ");
				stack.push(t);
				t = t.left;
			} else {
				t = stack.pop();
				t = t.right;
			}
		}
	}
	
	//广度优先遍历打印
	private static void printBFS(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while(!q.isEmpty()) {
			TreeNode curr = q.remove();
			System.out.print(curr.val + " ");
			if(curr.left != null) {
				q.offer(curr.left);
			}
			if(curr.right != null) {
				q.offer(curr.right);
			}
		}
	}

	public static void main(String[] args) {
		
		//1.Unique Binary Search Trees
		//给定一个数值n，求一共有多少种不同的二叉查找树，可以存储数值1到n
		/*int n = 19;
		int result = numTrees2(n);
		System.out.println(result);*/
		
		//2.Unique Binary Search Trees II
		//给定一个数值n，求出可以存储数值1到n的所有不同的二叉查找树
		/*int n = 3;
		List<TreeNode> result = generateTrees(n);
		for(TreeNode t : result) {
			printPreorder(t);
			System.out.println();
		}*/
		
		//3.Validate Binary Search Tree
		//给定一棵二叉树，验证其是否为二叉搜索树
		/*TreeNode root = new TreeNode(0);
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		//root.right = t1;
		//t1.right = t2;
		//t2.right = t3;
		//t3.right = t4;
		//t4.right = t5;
		boolean result = isValidBST(root);
		System.out.println(result);*/
		
		//4.Convert Sorted Array to Binary Search Tree
		//给定一个数组，其元素按升序排列，将其转换成一棵高度平衡二叉树
		/*int[] arr = {0, 1, 2, 3, 4, 5};
		TreeNode result = sortedArrayToBST(arr);
		printBFS(result);*/
		
		//5.Convert Sorted List to Binary Search Tree
		//给定一个链表，其元素按升序排列，将其转换成一棵高度平衡二叉树
		/*ListNode head = new ListNode(0);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		TreeNode result = sortedListToBST(head);
		printBFS(result);*/
	}
	
	//2017-10-28
	//5.Convert Sorted List to Binary Search Tree
	//给定一个链表，其元素按升序排列，将其转换成一棵高度平衡二叉树
	//递归
	//	取链表中间值作为当前根节点
	//	递归左侧链表构建左子树，递归右侧链表构建右子树
	//	按照中序遍历的顺序，自下而上构建二叉树
	//		使用一个当前指针curr，遍历ListNode，其顺序即为二叉树中序遍历的顺序
	static ListNode curr = null;
    public static TreeNode sortedListToBST(ListNode head) {
    	
    	if(head == null) {
    		return null;
    	} else if(head.next == null) {
    		return new TreeNode(head.val);
    	}
    	
    	int size = 0;
    	curr = head;
    	while(curr.next != null) {
    		size++;
    		curr = curr.next;
    	}
    	
    	curr = head;
    	
    	return sortedListToBST(0, size);
    }
	private static TreeNode sortedListToBST(int start, int end) {
		
		if(start > end) {
			return null;
		}
		
		int mid = (start + end) / 2;
		
		TreeNode left = sortedListToBST(start, mid-1);
		
		TreeNode root = new TreeNode(curr.val);
		curr = curr.next;
		
		TreeNode right = sortedListToBST(mid+1, end);
		
		root.left = left;
		root.right = right;
		
		return root;
	}
    
	//2017-10-27
	//4.Convert Sorted Array to Binary Search Tree
	//给定一个数组，其元素按升序排列，将其转换成一棵高度平衡二叉树
	//递归
	//	取数组中间值作为当前根节点
	//	递归左侧数组构建左子树，递归右侧数组构建右子树
	//	自下而上构建二叉树
    public static TreeNode sortedArrayToBST(int[] arr) {
        
    	int len = arr.length;
    	
    	if(len == 0) {
    		return null;
    	}
    	
    	return sortedArrayToBST(0, len-1, arr);
    }
    private static TreeNode sortedArrayToBST(int start, int end, int[] arr) {
    	
    	if(start == end) {
    		return new TreeNode(arr[start]);
    	} else if(start > end) {
    		return null;
    	}
    	
    	int mid =(start + end) / 2;
    	
    	TreeNode left = sortedArrayToBST(start, mid-1, arr);
    	TreeNode right = sortedArrayToBST(mid+1, end, arr);
    	
    	TreeNode root = new TreeNode(arr[mid]);
    	root.left = left;
    	root.right = right;
    	
    	return root;
    }
	
	//2017-10-26
	//3.Validate Binary Search Tree
	//给定一棵二叉树，验证其是否为二叉搜索树
	//递归，中序遍历二叉树
	static long pre = -2147483649L;
    public static boolean isValidBST(TreeNode root) {
    	
    	if(root == null) {
    		return true;
    	}
    	
    	boolean left = isValidBST(root.left);

    	if(root.val <= pre) {
    		return false;
    	} else {
    		pre = root.val;
    	}
    	
    	boolean right = isValidBST(root.right);
    	
        return left && right;
    }
	
	//2017-10-26
	//2.Unique Binary Search Trees II
	//给定一个数值n，求出可以存储数值1到n的所有不同的二叉查找树
	//递归，从下往上构建二叉搜索树
	//	从1到n中选则i作为当前根节点
	//	计算1到(i-1)可以构成的左子树集合l
	//	计算(i+1)到n可以构成的右子树集合r
	//	集合l和集合r中的元素两两配对，分别作为i的左右子树，即为不同的构造方法
	//	左右子树可以通过重复上述步骤，分别递归计算1到(i-1)和(i+1)到n得到
    public static List<TreeNode> generateTrees(int n) {
    	
    	if(n == 0) {
    		return new LinkedList<TreeNode>();
    	}
    	
        return generateTrees(1, n);
    }
    private static List<TreeNode> generateTrees(int start, int end) {
    	
    	List<TreeNode> result = new LinkedList<TreeNode>();

    	if(start > end) {
    		result.add(null);
    		return result;
    	}
    	
    	for(int i=start; i<=end; i++) {
    		
    		List<TreeNode> left = generateTrees(start, i-1);
    		List<TreeNode> right = generateTrees(i+1, end);
    		
    		for(TreeNode l : left) {
    			for(TreeNode r : right) {
    				TreeNode root = new TreeNode(i);
    				root.left = l;
    				root.right = r;
    				result.add(root);
    			}
    		}
    	}
    	
    	return result;
    }
	
	//2017-10-6
	//1.Unique Binary Search Trees
	//给定一个数值n，求一共有多少种不同的二叉查找树，可以存储数值1到n
	//从数值1到n中选择数值i，作为二叉查找树的根节点
	//	则数值1到(i-1)位于i的左子树中，数值(i+1)到n位于i的右子树中
	//	左子树的不同构建方法数，与右子树的不同构建方法数，的积，即为当前根节点i的不同构建方法数
	//	以此类推，求出各子树的不同构建方法数，即可得到总的不同构建方法数
	//solution1：动态规划
	//	考虑函数G(n)，表示拥有数值1到n的二叉查找树的不同构建方法数
	//	其中G(0)==G(1)==1
	//	考虑函数F(i,n) 1<=i<=n，表示以数值i为根节点，拥有数值1到n的二叉查找树的不同构建方法数
	//	而F(i,n)以i为根节点，其左子树共有(i-1)个节点，右子树共有(n-i)个节点
	//	则G(n) = F(1, n) + F(2, n) + ... + F(n, n)
	//	则F(i, n) = G(i-1) * G(n-i)
	//	因此，G(n) = G(0) * G(n-1) + G(1) * G(n-2) + ... + G(n-1) * G(0)
	//solution2：递归
	//	从数值1到n中选择数值i作为根节点
	//	分别计算i的左子树和右子树各有多少种不同的构建方法
	//		使用递归计算，并传入左右边界为参数
	//	左右结果之积即为i作为根节点时的不同构建方法数
	//注：从数值1到n中选择数值i作为二叉查找树的根节点时，由于对称性，选择对称点，如选择1或n，其不同构建方法数相同
	public static int numTrees2(int n) {
		
		int[] G = new int[n+1];
		G[0] = 1;
		G[1] = 1;
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<i; j++) {
				G[i] += G[j] * G[i-j-1];
			}
		}
		
		return G[n];
	}
    public static int numTrees(int n) {
    	
    	int halfLen = n / 2;
		int end = halfLen;
    	
    	int result = 0;
    	int countLeft = 0;
    	int countRight = 0;
    	
    	for(int i=1; i<=end; i++) {
    		countLeft = numTreesLeft(1, i);
    		countRight = numTreesRight(i, n);
    		result += countLeft * countRight * 2;
    	}
    	
    	if(n % 2 == 1) {
			countLeft = numTreesLeft(1, end+1);
			result += countLeft * countLeft;
		}
    	
        return result;
    }
    private static int numTreesLeft(int left, int curr) {
    	
    	int len = curr - left;
    	
    	if(len <= 1) {
    		return 1;
    	} else {
    		
    		int halfLen = len / 2;
    		int end = left + halfLen - 1;
    		
    		int right = curr - 1;
    		
    		int result = 0;
        	int countLeft = 0;
        	int countRight = 0;
    		
    		for(int i=left; i<=end; i++) {
    			countLeft = numTreesLeft(left, i);
        		countRight = numTreesRight(i, right);
        		result += countLeft * countRight * 2;
    		}
    		
    		if(len % 2 == 1) {
    			countLeft = numTreesLeft(left, end+1);
    			result += countLeft * countLeft;
    		}
    		
    		return result;
    	}
    }
    private static int numTreesRight(int curr, int right) {
    	
    	int len = right - curr;
    	
    	if(len <= 1) {
    		return 1;
    	} else {
    		
    		int halfLen = len / 2;
    		int start = right - halfLen + 1;
    		
    		int left = curr + 1;
    		
    		int result = 0;
        	int countLeft = 0;
        	int countRight = 0;
    		
    		for(int i=start; i<=right; i++) {
    			countLeft = numTreesLeft(left, i);
        		countRight = numTreesRight(i, right);
        		result += countLeft * countRight * 2;
    		}
    		
    		if(len % 2 == 1) {
    			countRight = numTreesRight(start-1, right);
    			result += countRight * countRight;
    		}
    		
    		return result;
    	}
    }
    
}
