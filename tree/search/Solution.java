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
	
	//���������ӡ
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
	
	//ǰ�������ӡ
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
	
	//������ȱ�����ӡ
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
		//����һ����ֵn����һ���ж����ֲ�ͬ�Ķ�������������Դ洢��ֵ1��n
		/*int n = 19;
		int result = numTrees2(n);
		System.out.println(result);*/
		
		//2.Unique Binary Search Trees II
		//����һ����ֵn��������Դ洢��ֵ1��n�����в�ͬ�Ķ��������
		/*int n = 3;
		List<TreeNode> result = generateTrees(n);
		for(TreeNode t : result) {
			printPreorder(t);
			System.out.println();
		}*/
		
		//3.Validate Binary Search Tree
		//����һ�ö���������֤���Ƿ�Ϊ����������
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
		//����һ�����飬��Ԫ�ذ��������У�����ת����һ�ø߶�ƽ�������
		/*int[] arr = {0, 1, 2, 3, 4, 5};
		TreeNode result = sortedArrayToBST(arr);
		printBFS(result);*/
		
		//5.Convert Sorted List to Binary Search Tree
		//����һ��������Ԫ�ذ��������У�����ת����һ�ø߶�ƽ�������
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
	//����һ��������Ԫ�ذ��������У�����ת����һ�ø߶�ƽ�������
	//�ݹ�
	//	ȡ�����м�ֵ��Ϊ��ǰ���ڵ�
	//	�ݹ�������������������ݹ��Ҳ�������������
	//	�������������˳�����¶��Ϲ���������
	//		ʹ��һ����ǰָ��curr������ListNode����˳��Ϊ���������������˳��
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
	//����һ�����飬��Ԫ�ذ��������У�����ת����һ�ø߶�ƽ�������
	//�ݹ�
	//	ȡ�����м�ֵ��Ϊ��ǰ���ڵ�
	//	�ݹ�������鹹�����������ݹ��Ҳ����鹹��������
	//	���¶��Ϲ���������
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
	//����һ�ö���������֤���Ƿ�Ϊ����������
	//�ݹ飬�������������
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
	//����һ����ֵn��������Դ洢��ֵ1��n�����в�ͬ�Ķ��������
	//�ݹ飬�������Ϲ�������������
	//	��1��n��ѡ��i��Ϊ��ǰ���ڵ�
	//	����1��(i-1)���Թ��ɵ�����������l
	//	����(i+1)��n���Թ��ɵ�����������r
	//	����l�ͼ���r�е�Ԫ��������ԣ��ֱ���Ϊi��������������Ϊ��ͬ�Ĺ��췽��
	//	������������ͨ���ظ��������裬�ֱ�ݹ����1��(i-1)��(i+1)��n�õ�
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
	//����һ����ֵn����һ���ж����ֲ�ͬ�Ķ�������������Դ洢��ֵ1��n
	//����ֵ1��n��ѡ����ֵi����Ϊ����������ĸ��ڵ�
	//	����ֵ1��(i-1)λ��i���������У���ֵ(i+1)��nλ��i����������
	//	�������Ĳ�ͬ���������������������Ĳ�ͬ�������������Ļ�����Ϊ��ǰ���ڵ�i�Ĳ�ͬ����������
	//	�Դ����ƣ�����������Ĳ�ͬ���������������ɵõ��ܵĲ�ͬ����������
	//solution1����̬�滮
	//	���Ǻ���G(n)����ʾӵ����ֵ1��n�Ķ���������Ĳ�ͬ����������
	//	����G(0)==G(1)==1
	//	���Ǻ���F(i,n) 1<=i<=n����ʾ����ֵiΪ���ڵ㣬ӵ����ֵ1��n�Ķ���������Ĳ�ͬ����������
	//	��F(i,n)��iΪ���ڵ㣬������������(i-1)���ڵ㣬����������(n-i)���ڵ�
	//	��G(n) = F(1, n) + F(2, n) + ... + F(n, n)
	//	��F(i, n) = G(i-1) * G(n-i)
	//	��ˣ�G(n) = G(0) * G(n-1) + G(1) * G(n-2) + ... + G(n-1) * G(0)
	//solution2���ݹ�
	//	����ֵ1��n��ѡ����ֵi��Ϊ���ڵ�
	//	�ֱ����i�������������������ж����ֲ�ͬ�Ĺ�������
	//		ʹ�õݹ���㣬���������ұ߽�Ϊ����
	//	���ҽ��֮����Ϊi��Ϊ���ڵ�ʱ�Ĳ�ͬ����������
	//ע������ֵ1��n��ѡ����ֵi��Ϊ����������ĸ��ڵ�ʱ�����ڶԳ��ԣ�ѡ��ԳƵ㣬��ѡ��1��n���䲻ͬ������������ͬ
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
