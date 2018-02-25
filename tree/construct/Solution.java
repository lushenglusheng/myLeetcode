package tree.construct;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
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
				System.out.println(t.val);
				t = t.right;
			}
		}
	}

	public static void main(String[] args) {

		//1.Construct Binary Tree from Preorder and Inorder Traversal
		//����һ�ö�������ǰ��������������˳�򣬹����˶�����
		int[] preorder = {1,2,4,5,3,6,7};
		int[] inorder = {4,2,5,1,6,3,7};
		int[] postorder = {4,5,2,6,7,3,1};
		TreeNode result1 = buildTree1(preorder, inorder);
		printInorder(result1);
		TreeNode result2 = buildTree2(inorder, postorder);
		printInorder(result2);
	}
	
	//2017-10-3
	//2.Construct Binary Tree from Inorder and Postorder Traversal
	//����һ�ö���������������ͺ�������������˶�����
	//���1�����ƣ�ֻ��Ӻ���ǰ����������������������һ�µݹ�˳�򼴿�
	static int currIndex2 = 0;
	public static TreeNode buildTree2(int[] inorder, int[] postorder) {
		
		int len = postorder.length;
		if(len == 0) return null;
		
		currIndex2 = len;
		TreeNode root = new TreeNode(postorder[--currIndex2]);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(len);
		
		for(int i=0; i<len; i++) {
			map.put(inorder[i], i);
		}
		
		int rootIndex = map.get(root.val);
		buildTree2(root, 0, rootIndex, len, postorder, map);
		
        return root;
    }
	private static void buildTree2(TreeNode root, int start, int rootIndex, int end, int[] postorder, Map<Integer, Integer> map) {
		if(rootIndex+1 < end) {
			root.right = new TreeNode(postorder[--currIndex2]);
			buildTree2(root.right, rootIndex+1, map.get(root.right.val), end, postorder, map);
		}
		if(start < rootIndex) {
			root.left = new TreeNode(postorder[--currIndex2]);
			buildTree2(root.left, start, map.get(root.left.val), rootIndex, postorder, map);
		}
	}
	
	//2017-10-3
	//1.Construct Binary Tree from Preorder and Inorder Traversal
	//����һ�ö�������ǰ���������������������˶�����
	//ǰ��������
	//    ��һ��Ԫ�ؼ�Ϊ���ڵ�
	//    ����ǰԪ������ڵ㣬����һԪ�ؼ�Ϊ����ڵ�
	//    ����ǰԪ�ؽ����ҽڵ㣬����һԪ�ؼ�Ϊ���ҽڵ�
	//    ����ǰԪ�������ҽڵ㣬����������������������һԪ�ؼ�Ϊ���ҽڵ�
	//����������
	//    ���ڵ���ߵ�Ԫ��ȫ����Ϊ���������ڵ㣬�ұߵ�Ԫ��ȫ����Ϊ���������ڵ�
	//        �˶������еĸ�����������ĳ���±귶Χ�ڣ��������������ж��д˽ṹ
	//����ʹ�õݹ飬�ع��˶�����
	//    ����ǰ�������˳��ѡ��ǰ�ڵ���Ϊ��ǰ���ڵ�
	//    �ݹ������
	//        ��ǰ���ڵ�root
	//        ��ǰ���ڵ�������������������±�rootIndex
	//			    ʹ��HashMap�洢�ڵ�ֵ�������������±��ӳ���ϵ
	//        ��ǰ���ڵ����������ȫ���ڵ�������������������±귶Χstart -- end
	//    ��ǰ������ĵ�һ��Ԫ�ظ��ڵ㿪ʼ�ݹ�
	//    ��start<rootIndex����ǰ���ڵ������ڵ㣬ǰ���������һԪ��Ϊ����ڵ㣬�ݹ�����ڵ�
	//    ��rootIndex+1<end����ǰ���ڵ�����ҽڵ㣬ǰ���������һԪ��Ϊ���ҽڵ㣬�ݹ����ҽڵ�
	static int currIndex1 = 0;
	public static TreeNode buildTree1(int[] preorder, int[] inorder) {
		
		int len = preorder.length;
		if(len == 0) return null;
		
		TreeNode root = new TreeNode(preorder[currIndex1]);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(len);
		
		for(int i=0; i<len; i++) {
			map.put(inorder[i], i);
		}
		
		int rootIndex = map.get(root.val);
		buildTree1(root, 0, rootIndex, len, preorder, map);
		
        return root;
    }
	private static void buildTree1(TreeNode root, int start, int rootIndex, int end, int[] preorder, Map<Integer, Integer> map) {
		if(start < rootIndex) {
			root.left = new TreeNode(preorder[++currIndex1]);
			buildTree1(root.left, start, map.get(root.left.val), rootIndex, preorder, map);
		}
		if(rootIndex+1 < end) {
			root.right = new TreeNode(preorder[++currIndex1]);
			buildTree1(root.right, rootIndex+1, map.get(root.right.val), end, preorder, map);
		}
	}

}
