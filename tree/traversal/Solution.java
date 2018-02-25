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
	
	//���������ӡ
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
		//������ǰ�����
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
		//�������������
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
		//�������������
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
		//�������ȼ����������ϵ��£���������
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
		//�������ȼ����������µ��ϣ���������
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
		//�������ȼ����������ϵ��£�Z����
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
		//����һ������������������������Ԫ�ص�λ�ñ������ˣ��ָ�ԭ��������������ȷ˳��
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
		//�������ö��������ж��������Ƿ���ͬ
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
		//����һ�ö��������ж����Ƿ����ҶԳ�
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
		//����һ�ö��������ж����Ƿ�Ϊ�߶�ƽ��Ķ������������нڵ�����������߶Ȳ����1
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
		//����һ�ö�����������ǰ�����ת��Ϊһ��ֻ����������������
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
		//����һ�ö���������ÿ���ڵ��½�һ��ָ�룬�ӱ��ڵ�ָ����ͬ�ȼ����ұ߽ڵ㣬������ָ��null
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
	//����һ�ö���������ÿ���ڵ��½�һ��ָ�룬�ӱ��ڵ�ָ����ͬ�ȼ����ұ߽ڵ㣬������ָ��null
	//�ӵڶ��㿪ʼ
	//ʹ��rootָ�룬root=root.next���������ұ�����һ��ڵ�
	//ʹ��firstָ�룬��¼�˲�����߽ڵ�
	//ʹ��currָ�룬����rootָ�룬��������ƴ�Ӵ˲�ڵ�
	//�˲�ƴ�ӽ�����rootָ��˲�����߽ڵ㣬����ƴ����һ��ڵ�
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
	//����һ�ö�����������ǰ�������˳��ת��Ϊһ��ֻ����������������
	//�ݹ飬�������󣬺������
	//�Ӻ���ǰƴ������
	//ʹ��preָ�������ĵ�һ���ڵ�root
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
	//����һ�ö��������ж����Ƿ�Ϊ�߶�ƽ��Ķ������������нڵ�����������߶Ȳ����1
	//�ݹ����ÿ���ڵ�����������ĸ߶�
	//	�������գ��򷵻�0
	//	���������ĸ߶Ȳ����1���򷵻�-1����ʱӦһֱ����-1���˳��ݹ飬����false
	//	���������ĸ߶Ȳ�С�ڵ���1���򷵻�Math.max(leftHeight, rightHeight) + 1����Ϊ�˽ڵ�ĸ߶ȣ����ظ��丸�ڵ�
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
	//����һ�ö��������ж����Ƿ����ҶԳ�
	//�ݹ�
	//	����Գƽڵ�p��q
	//	�����ڵ�ͬʱΪnull���򷵻�true
	//	�����ڵ�ֻ��һ��Ϊnull���򷵻�false
	//	�����ڵ�ֵ���ȣ��򷵻�false
	//return �ݹ�(p.left, q.right) && �ݹ�(p.right, q.left);
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
	//�������ö��������ж��������Ƿ���ͬ
	//�ݹ飬ǰ��������ö�����
	//	�����ڵ�ͬʱΪnull���򷵻�true
	//	�����ڵ�ֻ��һ��Ϊnull���򷵻�false
	//	�����ڵ�ֵ���ȣ��򷵻�false
	//return(�ݹ����ڵ����ڵ� && �ݹ����ڵ���ҽڵ�);
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
    	if(p==null && q==null) return true;
    	
    	if(p==null || q==null) return false;
    	
    	if(p.val != q.val) return false;
    	
    	return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
	
	//2017-7-29
	//7.Recover Binary Search Tree
	//����һ������������������������Ԫ�ص�λ�ñ������ˣ��ָ�ԭ��������������ȷ˳��
	//�����������������
	//	ʹ��pre��currָ���¼������ʶ�����������ֵ
	//	��pre.val>curr.val������ִ���
	//		��һ�γ��ִ�����ʹ��errorT1=pre;	errorT2=curr;��¼������ֵĵط�
	//		�����еڶ��δ�����֣���errorT2=curr;���´�����ֵĵط�����������
	//��󽻻�errorT1��errorT2��������Ľڵ�ֵ
	//����ֻ��һ�δ�����֣���Ϊǰ�����ڵ�λ�ó���
	//�������δ�����֣���Ϊ��һ�δ����pre�͵ڶ��δ����curr���ڵ�λ�ó���
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
	//�������ȼ����������ϵ��£�Z���Σ������ң����ҵ��󣬽��棩
	//��4.Binary Tree Level Order Traversal����
	//�ڱ���ÿ���ȼ��Ľڵ�ʱ�����淴����ӷ��ʵĽڵ�ֵ
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
	//�������ȼ����������µ��ϣ���������
	//��4.Binary Tree Level Order Traversal����
	//���򱣴������鼴��
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		
		LinkedList<List<Integer>> listL = new LinkedList<List<Integer>>();
    	
    	if(root == null) return listL;
    	
    	List<Integer> listI;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	
    	queue.offer(root);
    	
    	int currNum;
    	
    	while(!queue.isEmpty()) {
    		
    		currNum = queue.size();//��ǰ�ȼ��Ľڵ����
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
	//�������ȼ����������ϵ��£���������
	//ѭ��ʵ��
	//ʹ�ö��б���ڵ�˳�򣬸��ڵ�root�������
	//	��ȡ���г���currNum=queue.size();��Ϊ��ǰ�ȼ��Ľڵ����
	//	���δӶ���ͷȡ��currNum���ڵ�
	//		���ʸýڵ�ֵ
	//		��ڵ㲻���������У��ҽڵ㲻����������
	//���в��գ�����������һ�ȼ��ڵ�
	//
	//�ݹ�ʵ�֣�����˳��δ�����ȼ�������
	//�ݹ鷽������������������listL����ǰ�ڵ�root����ǰ�ڵ�ȼ�level
	//	���ȼ�level����listL����ӵ�еĵȼ���������listL������µĵȼ�����
	//	���ʵ�ǰ�ڵ�rootֵ��������listL�е���Ӧ�ĵȼ�������
	//	��ڵ㲻������õݹ飬�ҽڵ㲻������õݹ飬����level+1
    public List<List<Integer>> levelOrder(TreeNode root) {
        
    	/*ѭ��ʵ��
    	List<List<Integer>> listL = new LinkedList<List<Integer>>();
    	
    	if(root == null) return listL;
    	
    	List<Integer> listI;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	
    	queue.offer(root);
    	
    	int currNum;
    	
    	while(!queue.isEmpty()) {
    		
    		currNum = queue.size();//��ǰ�ȼ��Ľڵ����
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
    	
    	//�ݹ�ʵ��
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
	//�������������
	//ʹ��ѭ��������ʹ��ջ����ڵ�˳��
	//�������������������ҽڵ����˳���ǰ���������˳��
	//�Ӹ��ڵ㿪ʼ����
	//	����ǰ���ڵ㲻�գ�����ʸ��ڵ�ֵ���������ڵ�ѹջ��Ȼ��ʹ���ҽڵ���Ϊ��ǰ���ڵ㣬��������
	//	����ǰ���ڵ�Ϊ�գ��򵯳�ջ���ڵ㣬Ȼ��ʹ��ջ���ڵ����ڵ���Ϊ��ǰ���ڵ㣬��������
	//����ջ���ҵ�ǰ���ڵ�Ϊ��ʱ����������
	//�˷���˳�����˳�򣬼�Ϊ�������
	//����ʵ����˳��δ���������������˳��
	//	���Խ����ʸýڵ�ֵ�������滻Ϊ���ýڵ�ѹ����һ����ջ�У����ջ���ʽڵ�ֵ
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
	//�������������
	//ʹ��ѭ��������ʹ��ջ����ڵ�˳��
	//�Ӹ��ڵ㿪ʼ����
	//	����ǰ���ڵ㲻�գ��򽫸��ڵ�ѹջ��Ȼ��ʹ����ڵ���Ϊ��ǰ���ڵ㣬��������
	//	����ǰ���ڵ�Ϊ�գ��򵯳�ջ���ڵ㣬���ʸ�ջ���ڵ�ֵ��Ȼ��ʹ�ø�ջ���ڵ���ҽڵ���Ϊ��ǰ���ڵ㣬��������
	//����ջ���ҵ�ǰ���ڵ�Ϊ��ʱ����������
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
	//������ǰ�����
	//ʹ��ѭ��������ʹ��ջ����ڵ�˳��
	//�Ӹ��ڵ㿪ʼ����
	//	����ǰ���ڵ㲻�գ�����ʸ��ڵ�ֵ���������ڵ�ѹջ��Ȼ��ʹ����ڵ���Ϊ��ǰ���ڵ㣬��������
	//	����ǰ���ڵ�Ϊ�գ��򵯳�ջ���ڵ㣬Ȼ��ʹ��ջ���ڵ���ҽڵ���Ϊ��ǰ���ڵ㣬��������
	//����ջ���ҵ�ǰ���ڵ�Ϊ��ʱ����������
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
