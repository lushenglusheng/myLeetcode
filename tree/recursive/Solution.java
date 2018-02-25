package tree.recursive;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode next;
		TreeNode(int x) { 
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

		//1.Minimum Depth of Binary Tree
		//给定一棵二叉树，求其最小深度
		/*TreeNode root = new TreeNode(0);
		TreeNode t1 = new TreeNode(0);
		TreeNode t2 = new TreeNode(0);
		TreeNode t3 = new TreeNode(0);
		TreeNode t4 = new TreeNode(0);
		TreeNode t5 = new TreeNode(0);
		TreeNode t6 = new TreeNode(0);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		int result = minDepth(root);
		System.out.println(result);*/
		
		//2.Maximum Depth of Binary Tree
		//给定一棵二叉树，求其最大深度
		/*TreeNode root = new TreeNode(0);
		TreeNode t1 = new TreeNode(0);
		TreeNode t2 = new TreeNode(0);
		TreeNode t3 = new TreeNode(0);
		TreeNode t4 = new TreeNode(0);
		TreeNode t5 = new TreeNode(0);
		TreeNode t6 = new TreeNode(0);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		int result = maxDepth(root);
		System.out.println(result);*/
		
		//3.Path Sum
		//给定一棵二叉树和值sum，判断二叉树中是否存在一条路径，此路径上的节点值总和等于sum
		/*TreeNode root = new TreeNode(5);
		TreeNode t1 = new TreeNode(4);
		TreeNode t2 = new TreeNode(8);
		TreeNode t3 = new TreeNode(11);
		TreeNode t4 = new TreeNode(13);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(7);
		TreeNode t7 = new TreeNode(2);
		TreeNode t8 = new TreeNode(1);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		t5.right = t8;
		int sum = 22;
		boolean result = hasPathSum(root, sum);
		System.out.println(result);*/
		
		//4.Path Sum II
		//给定一棵二叉树和值sum，找出所有根-叶路径求和值等于sum的路径
		/*TreeNode root = new TreeNode(5);
		TreeNode t1 = new TreeNode(4);
		TreeNode t2 = new TreeNode(8);
		TreeNode t3 = new TreeNode(11);
		TreeNode t4 = new TreeNode(13);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(7);
		TreeNode t7 = new TreeNode(2);
		TreeNode t8 = new TreeNode(5);
		TreeNode t9 = new TreeNode(1);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		t5.left = t8;
		t5.right = t9;
		int sum = 22;
		List<List<Integer>> result = pathSum(root, sum);
		System.out.println(result);*/
		
		//5.Binary Tree Maximum Path Sum
		//给定一棵二叉树，求其最大路径和，路径定义为从树中任意起始节点到任意结束节点的任意路径
		/*TreeNode root = new TreeNode(5);
		TreeNode t1 = new TreeNode(4);
		TreeNode t2 = new TreeNode(8);
		TreeNode t3 = new TreeNode(11);
		TreeNode t4 = new TreeNode(13);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(7);
		TreeNode t7 = new TreeNode(2);
		TreeNode t8 = new TreeNode(5);
		TreeNode t9 = new TreeNode(1);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		t5.left = t8;
		t5.right = t9;
		int result  = maxPathSum(root);
		System.out.println(result);*/
		
		//6.Populating Next Right Pointers in Each Node
		//给定一棵完全二叉树（所有叶子节点处于同一高度，所有非叶节点都拥有左右节点）
		//给每个节点新建一个指针，从本节点指向其同等级的右边节点，若无则指向null
		
		//7.Sum Root to Leaf Numbers
		//给定一棵二叉树，各个节点值都为0-9，每一条根-叶路径都代表一个数字，求所有根-叶路径数字的和
		TreeNode root = new TreeNode(1);
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(4);
		TreeNode t4 = new TreeNode(5);
		TreeNode t5 = new TreeNode(6);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t2.left = t4;
		t2.right = t5;
		int result = sumNumbers(root);
		System.out.println(result);
	}
	
	//2017-12-26
	//7.Sum Root to Leaf Numbers
	//给定一棵二叉树，各个节点值都为0-9，每一条根-叶路径都代表一个数字，求所有根-叶路径数字的和
	//根到当前节点的路径值 = 当前节点前面路径值*10 + 当前节点值
	//递归
	//	若当前节点为null，则返回0
	//	若当前节点为叶子节点，则返回叶子节点前面路径值*10 + 叶子节点值
	//	否则递归左右子节点
	public static int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }
	private static int sumNumbers(TreeNode root, int value) {
		
		if(root==null) return 0;
		
		value = value*10 + root.val;
		
		if(root.left==null && root.right==null) return value;
		
		return sumNumbers(root.left, value) + sumNumbers(root.right, value);
	}
	
	//2017-12-24
	//6.Populating Next Right Pointers in Each Node
	//给定一棵完全二叉树（所有叶子节点处于同一高度，所有非叶节点都拥有左右节点）
	//给每个节点新建一个指针，从本节点指向其同等级的右边节点，若无则指向null
	//递归，遍历二叉树
	//	若当前根节点有左右子节点，则连接其左右子节点
	//		若当前根节点有next节点，则连接当前根节点的右节点和当前根节点的next节点的左节点
	//	递归当前根节点的左右子节点
    public static void connect(TreeNode root) {

    	if(root == null) return;
    	
    	if(root.left != null) {
    		root.left.next = root.right;
    		if(root.next != null) {
    			root.right.next = root.next.left;
    		}
    	}
    	
    	connect(root.left);
    	connect(root.right);
    }
	
	//2017-11-7
	//5.Binary Tree Maximum Path Sum
	//给定一棵二叉树，求其最大路径和，路径定义为从树中任意起始节点到任意结束节点的任意路径
	//递归，遍历二叉树
	//函数返回值定义
	//	从本节点到其子节点的最大路径和
	//	此返回值提供给父节点，用于计算父节点到其子节点的最大路径和，以及以父节点为最高点的最大路径和
	//从某节点到其子节点的最大路径和 = 本节点值 + Max（左子树返回值， 右子树返回值， 0）
	//以某节点为最高点的最大路径和 = 本节点值 + 左子树的最大路径和（若大于0） + 右子树的最大路径和（若大于0）
	static int maxPath = Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	maxPathSumRe(root);
    	return maxPath;
    }
    public static int maxPathSumRe(TreeNode root) {
    	
    	if(root == null) {
    		return 0;
    	}
    	
    	int left = maxPathSumRe(root.left);
    	int right = maxPathSumRe(root.right);
    	
    	int currMax = root.val + Math.max(left, 0) + Math.max(right, 0);
    	
    	if(maxPath < currMax) {
    		maxPath = currMax;
    	}
    	
        return root.val + Math.max(left, Math.max(right, 0));
    }
	
	//2017-11-3
	//4.Path Sum II
	//给定一棵二叉树和值sum，找出所有根-叶路径求和值等于sum的路径
	//递归
	//	深度优先搜索，遍历所有根-叶路径
	//	将当前节点添加到当前路径中
	//	当遍历到叶子节点时，若当前路径满足条件，则将当前路径添加到结果路径中
	//	最后从当前路径中剔除当前节点，方法返回父节点，继续遍历
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> result  = new LinkedList<List<Integer>>();
    	List<Integer> currentResult  = new LinkedList<Integer>();
    	pathSum(root, sum, currentResult, result);
    	return result;
    }
    private static void pathSum(TreeNode root, int sum, List<Integer> currentResult, List<List<Integer>> result) {
    	
    	if(root == null) {
    		return;
    	}
    	
    	currentResult.add(root.val);
    	sum = sum - root.val;
    	
    	if(root.left == null && root.right == null && sum == 0) {
    		result.add(new LinkedList<Integer>(currentResult));
    		currentResult.remove(currentResult.size() - 1);
    		return;
    	}
    	
    	pathSum(root.left, sum, currentResult, result);
    	pathSum(root.right, sum, currentResult, result);
    	
    	currentResult.remove(currentResult.size() - 1);
    }
	
	//2017-10-31
	//3.Path Sum
	//给定一棵二叉树和值sum，判断二叉树中是否存在一条路径，此路径上的节点值总和等于sum
	//递归
	//若当前节点的左右子树都为空，即已遍历到叶子节点，并且此路径求和值等于sum，则return true
	//否则递归此节点的左右子树
    public static boolean hasPathSum(TreeNode root, int sum) {
    	
    	if(root == null) return false;
    	
    	sum = sum - root.val;
    	
    	if(root.left == null && root.right == null && sum == 0) {
    		return true;
    	}
    	
    	return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
	
	//2017-10-28
	//2.Maximum Depth of Binary Tree
	//给定一棵二叉树，求其最大深度
	//递归
	//	若当前根节点空，则返回0
	//	分别求解左右子树的最小深度left、right
	//	返回Math.max(left, right) + 1
	//	自下而上统计最小深度
    public static int maxDepth(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	
    	int left = maxDepth(root.left);
    	int right = maxDepth(root.right);
    	
   		return Math.max(left, right) + 1;
    }
    
	//2017-10-28
	//1.Minimum Depth of Binary Tree
	//给定一棵二叉树，求其最小深度
	//递归
	//	若当前根节点空，则返回0
	//	分别求解左右子树的最小深度left、right
	//	若左右子树都非空，则返回Math.min(left, right) + 1
	//	否则返回Math.max(left, right) + 1
	//	自下而上统计最小深度
    public static int minDepth(TreeNode root) {
        
    	if(root == null) {
    		return 0;
    	}
    	
    	int left = minDepth(root.left);
    	int right = minDepth(root.right);
    	
    	if(left!=0 && right!=0) {
    		return Math.min(left, right) + 1;
    	} else {
    		return Math.max(left, right) + 1;
    	}
    }
	
}
