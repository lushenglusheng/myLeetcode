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
				System.out.println(t.val);
				t = t.right;
			}
		}
	}

	public static void main(String[] args) {

		//1.Construct Binary Tree from Preorder and Inorder Traversal
		//给定一棵二叉树的前序遍历和中序遍历顺序，构建此二叉树
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
	//给定一棵二叉树的中序遍历和后序遍历，构建此二叉树
	//与第1问类似，只需从后往前遍历后序遍历结果，并调换一下递归顺序即可
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
	//给定一棵二叉树的前序遍历和中序遍历，构建此二叉树
	//前序遍历结果
	//    第一个元素即为根节点
	//    若当前元素有左节点，则下一元素即为其左节点
	//    若当前元素仅有右节点，则下一元素即为其右节点
	//    若当前元素有左右节点，则其左子树遍历结束后，下一元素即为其右节点
	//中序遍历结果
	//    根节点左边的元素全部都为其左子树节点，右边的元素全部都为其右子树节点
	//        此二叉树中的各棵子树，在某个下标范围内，在中序遍历结果中都有此结构
	//考虑使用递归，重构此二叉树
	//    按照前序遍历的顺序，选择当前节点作为当前根节点
	//    递归参数：
	//        当前根节点root
	//        当前根节点在中序遍历结果里面的下标rootIndex
	//			    使用HashMap存储节点值与中序遍历结果下标的映射关系
	//        当前根节点的左右子树全部节点在中序遍历结果里面的下标范围start -- end
	//    从前序遍历的第一个元素根节点开始递归
	//    若start<rootIndex，则当前根节点存在左节点，前序遍历的下一元素为其左节点，递归其左节点
	//    若rootIndex+1<end，则当前根节点存在右节点，前序遍历的下一元素为其右节点，递归其右节点
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
