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

		//1.Minimum Depth of Binary Tree
		//����һ�ö�������������С���
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
		//����һ�ö�����������������
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
		//����һ�ö�������ֵsum���ж϶��������Ƿ����һ��·������·���ϵĽڵ�ֵ�ܺ͵���sum
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
		//����һ�ö�������ֵsum���ҳ����и�-Ҷ·�����ֵ����sum��·��
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
		//����һ�ö��������������·���ͣ�·������Ϊ������������ʼ�ڵ㵽��������ڵ������·��
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
		//����һ����ȫ������������Ҷ�ӽڵ㴦��ͬһ�߶ȣ����з�Ҷ�ڵ㶼ӵ�����ҽڵ㣩
		//��ÿ���ڵ��½�һ��ָ�룬�ӱ��ڵ�ָ����ͬ�ȼ����ұ߽ڵ㣬������ָ��null
		
		//7.Sum Root to Leaf Numbers
		//����һ�ö������������ڵ�ֵ��Ϊ0-9��ÿһ����-Ҷ·��������һ�����֣������и�-Ҷ·�����ֵĺ�
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
	//����һ�ö������������ڵ�ֵ��Ϊ0-9��ÿһ����-Ҷ·��������һ�����֣������и�-Ҷ·�����ֵĺ�
	//������ǰ�ڵ��·��ֵ = ��ǰ�ڵ�ǰ��·��ֵ*10 + ��ǰ�ڵ�ֵ
	//�ݹ�
	//	����ǰ�ڵ�Ϊnull���򷵻�0
	//	����ǰ�ڵ�ΪҶ�ӽڵ㣬�򷵻�Ҷ�ӽڵ�ǰ��·��ֵ*10 + Ҷ�ӽڵ�ֵ
	//	����ݹ������ӽڵ�
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
	//����һ����ȫ������������Ҷ�ӽڵ㴦��ͬһ�߶ȣ����з�Ҷ�ڵ㶼ӵ�����ҽڵ㣩
	//��ÿ���ڵ��½�һ��ָ�룬�ӱ��ڵ�ָ����ͬ�ȼ����ұ߽ڵ㣬������ָ��null
	//�ݹ飬����������
	//	����ǰ���ڵ��������ӽڵ㣬�������������ӽڵ�
	//		����ǰ���ڵ���next�ڵ㣬�����ӵ�ǰ���ڵ���ҽڵ�͵�ǰ���ڵ��next�ڵ����ڵ�
	//	�ݹ鵱ǰ���ڵ�������ӽڵ�
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
	//����һ�ö��������������·���ͣ�·������Ϊ������������ʼ�ڵ㵽��������ڵ������·��
	//�ݹ飬����������
	//��������ֵ����
	//	�ӱ��ڵ㵽���ӽڵ�����·����
	//	�˷���ֵ�ṩ�����ڵ㣬���ڼ��㸸�ڵ㵽���ӽڵ�����·���ͣ��Լ��Ը��ڵ�Ϊ��ߵ�����·����
	//��ĳ�ڵ㵽���ӽڵ�����·���� = ���ڵ�ֵ + Max������������ֵ�� ����������ֵ�� 0��
	//��ĳ�ڵ�Ϊ��ߵ�����·���� = ���ڵ�ֵ + �����������·���ͣ�������0�� + �����������·���ͣ�������0��
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
	//����һ�ö�������ֵsum���ҳ����и�-Ҷ·�����ֵ����sum��·��
	//�ݹ�
	//	��������������������и�-Ҷ·��
	//	����ǰ�ڵ���ӵ���ǰ·����
	//	��������Ҷ�ӽڵ�ʱ������ǰ·�������������򽫵�ǰ·����ӵ����·����
	//	���ӵ�ǰ·�����޳���ǰ�ڵ㣬�������ظ��ڵ㣬��������
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
	//����һ�ö�������ֵsum���ж϶��������Ƿ����һ��·������·���ϵĽڵ�ֵ�ܺ͵���sum
	//�ݹ�
	//����ǰ�ڵ������������Ϊ�գ����ѱ�����Ҷ�ӽڵ㣬���Ҵ�·�����ֵ����sum����return true
	//����ݹ�˽ڵ����������
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
	//����һ�ö�����������������
	//�ݹ�
	//	����ǰ���ڵ�գ��򷵻�0
	//	�ֱ����������������С���left��right
	//	����Math.max(left, right) + 1
	//	���¶���ͳ����С���
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
	//����һ�ö�������������С���
	//�ݹ�
	//	����ǰ���ڵ�գ��򷵻�0
	//	�ֱ����������������С���left��right
	//	�������������ǿգ��򷵻�Math.min(left, right) + 1
	//	���򷵻�Math.max(left, right) + 1
	//	���¶���ͳ����С���
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
