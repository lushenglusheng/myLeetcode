package linked;

import java.util.*;

public class Solution {
	
	private static class ListNode {
		int val;
		int key;
		ListNode next;
		ListNode pre;
		
		ListNode(int x) {
			val = x; 
		}
	}
	
	private static class RandomListNode {
		int label;
		RandomListNode next, random;
		
		RandomListNode(int x) {
			this.label = x;
		}
	}
	
	private static void printList(ListNode result) {
		System.out.print("result: ");
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		//1.Add Two Numbers
		//���������ǿ��������������Ǹ�������ÿ�����ֻ��Ÿ�λ��ֵ���ҷ����ţ���������������õ���������
		/*ListNode l11 = new ListNode(0);
		ListNode l12 = new ListNode(9);		l11.next = l12;
		ListNode l13 = new ListNode(9);		l12.next = l13;
		ListNode l21 = new ListNode(0);
		ListNode l22 = new ListNode(1);		l21.next = l22;
		ListNode result = addTwoNumbers(l11, l21);
		printList(result);*/
		
		//2.Reverse Linked List II
		//����һ����������m��n���������еĵ�m����n��Ԫ�ص���
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
		int m = 2;
		int n = 4;
		ListNode result = reverseBetween(l1, m, n);
		printList(result);*/
		
		//3.Partition List
		//����һ����������xֵ����������ֵС��x�Ľ���ƶ���ֵ���ڵ���x�Ľ��ǰ������������ԭ�ȵ����λ��
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);		l1.next = l2;
		ListNode l3 = new ListNode(-1);		l2.next = l3;
		ListNode l4 = new ListNode(5);		l3.next = l4;
		ListNode l5 = new ListNode(2);		l4.next = l5;
		ListNode l6 = new ListNode(1);		l5.next = l6;
		int x = 3;
		ListNode result = partition(l1, x);
		printList(result);*/
		
		//4.Remove Duplicates from Sorted List
		//����һ�������������ɾ�����е��ظ�Ԫ�أ�ʹÿһ��Ԫ��������1��
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);		l1.next = l2;
		ListNode l3 = new ListNode(2);		l2.next = l3;
		ListNode l4 = new ListNode(3);		l3.next = l4;
		ListNode l5 = new ListNode(3);		l4.next = l5;
		ListNode result = deleteDuplicatesI(l1);
		printList(result);*/
		
		//5.Remove Duplicates from Sorted List II
		//����һ�������������ɾ�����е��ظ�Ԫ�أ�ֻ��������1�ε�Ԫ��
		/*ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(3);		l1.next = l2;
		ListNode l3 = new ListNode(4);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode result = deleteDuplicatesII(l1);
		printList(result);*/
		
		//6.Rotate List
		//����һ����������kֵ��������ĩβk��Ԫ����ת������ͷ
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
		int k = 3;
		ListNode result = rotateRight(l1, k);
		printList(result);*/
		
		//7.Remove Nth Node From End of List
		//����һ����������nֵ��ɾ����������n��Ԫ��
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
		int n = 5;
		ListNode result = removeNthFromEnd(l1, n);
		printList(result);*/
		
		//8.Swap Nodes in Pairs
		//����һ�����������������ڵ�����Ԫ�ص�λ��
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
		ListNode result = swapPairs(l1);
		printList(result);*/
		
		//9.Reverse Nodes in k-Group
		//����һ����������kֵ��������������k�����ڵ�Ԫ�������������k��Ԫ�أ�����ԭ˳��
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
		ListNode l6 = new ListNode(6);		l5.next = l6;
		ListNode l7 = new ListNode(7);		l6.next = l7;
		int k = 3;
		ListNode result = reverseKGroup(l1, k);
		printList(result);*/
		
		//11.Linked List Cycle
		//����һ�������ж��������Ƕ����ڻ�
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
											l5.next = l3;
		boolean result = hasCycle(l1);
		System.out.println(result);*/
		
		//12.Linked List Cycle II
		//����һ�������ж��������Ƿ���ڻ��������򷵻ػ�����ʼ��㣬���򷵻�null
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
											l5.next = l3;
		ListNode result = detectCycle(l1);
		System.out.println(result.val);*/
		
		//13.Reorder List
		//Given L0 �� L1 �� �� �� Ln-1 �� Ln, return L0 �� Ln �� L1 �� Ln-1 �� L2 �� Ln-2 �� ��
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
		ListNode l6 = new ListNode(6);		l5.next = l6;
		ListNode l7 = new ListNode(7);		l6.next = l7;
		reorderList(l1);*/
		
		//14.LRU Cache
		//���һ������LRU(Least Recently Used)�����ݽṹ����get��set������Ҫ�������ʱ�临�Ӷ�O(1)
		/*LRUCache l =new Solution().new LRUCache(2);
		l.put(1, 1);
		l.put(2, 2);
		System.out.println(l.get(1));
		l.put(3, 3);
		System.out.println(l.get(2));
		l.put(4, 4);
		System.out.println(l.get(1));
		System.out.println(l.get(3));
		System.out.println(l.get(4));*/
		
	}
	
	//2017-5-12
	//14.LRU Cache
	//���һ������LRU(Least Recently Used)�����ݽṹ����get��set������Ҫ�������ʱ�临�Ӷ�O(1)
	//get(key)����key�����򷵻�key��Ӧ��value(>0)�����򷵻�-1
	//put(key, value)����key�����������key��value��ӳ���ϵ
	//				     ������������Χ����ɾ��������ٷ��ʵ�Ԫ��
	//HashMap + ˫������
	//HashMap�洢��Ӧ��key��value��
	//˫�������д洢value��Խ����head����������ʽ϶࣬Խ����tail����������ʽ���
	//get(key)ʱ����key���ڣ��򷵻�value��������Ԫ�ؽ�����˫������ͷ��
	//put(key, value)ʱ����key���ڣ������value��������Ԫ�ؽ�����˫������ͷ��
	//��key�����ڣ����½�(key, value)ӳ��ԣ�����������ͷ����������������ɾ������ĩβԪ��
	public class LRUCache {
		
		Map<Integer, ListNode> hashMap = new HashMap<Integer, ListNode>();

		ListNode head;
		ListNode tail;
		
		int maxCap;
		int cap = 0;
		
		public LRUCache(int capacity) {
	        maxCap = capacity;
	    }
	    
	    public int get(int key) {
	    	printList(head);
	    	System.out.println("try to get " + key);
	    	
	    	if(cap==0) return -1;
	    	
	    	ListNode curr = hashMap.get(key);
	    	
	    	if(curr == null) return -1;
	    	
	    	moveToHead(curr);//��temp�Ƶ�����ͷ
	        return head.val;
	    }
	    
	    public void put(int key, int value) {
	    	printList(head);
	    	System.out.println("try to put " + key + " " + value);
	    	
	    	ListNode curr = null;
	    	
	    	if(hashMap.containsKey(key)) {
	    		curr = hashMap.get(key);
	    		curr.val = value;
	    		
	    		moveToHead(curr);//��temp�Ƶ�����ͷ
				return;
	    	} 

	    	curr = new ListNode(value);
    		curr.key = key;
	    	hashMap.put(key, curr);
	    	
    		if(cap==0) {
    			head = curr;
    			tail = curr;
    		} else {
    			curr.next = head;//����ͷ��
    			head.pre = curr;
    			head = curr;
    		}
    		
    		if(cap >= maxCap) {
    			hashMap.remove(tail.key);
    			tail = tail.pre;//ɾ��β��
    			tail.next = null;
    		} else {
    			cap++;
    		}
	    }
	    
	    public void moveToHead(ListNode curr) {
	    	if(curr == head) return;
	    	
	    	if(curr == tail) {
	    		curr.pre.next = null;
	    		tail = curr.pre;
	    	} else {
	    		curr.pre.next = curr.next;
	    		curr.next.pre = curr.pre;
	    	}
	    	
	    	curr.next = head;
	    	curr.pre = null;
			head.pre = curr;
			head = curr;
	    }
	}
	
	//2017-5-12
	//13.Reorder List
	//Given L0 �� L1 �� �� �� Ln-1 �� Ln, return L0 �� Ln �� L1 �� Ln-1 �� L2 �� Ln-2 �� ��
	//Given 1->2->3->4->null, retrun 1->4->2->3->null
	//ʹ�ÿ���˫ָ�룬curr1һ��һ����curr2һ������
	//��curr2==null����curr2.next==null����curr1����ָ������ָ�㣬������������յ�
	//�½���ʱ����head2ָ��curr1.next���ٽ����յ��յ�curr1.nextָ��null	
	//ʹ��ͷ�巨����ʱ����head2����
	//�����Ҫ������ԭ����head����ʱ����head2���õ���������
	public static void reorderList(ListNode head) {
        
		if(head == null) return;
		if(head.next == null) return;
		if(head.next.next == null) return;
		
		ListNode curr1 = head;
		ListNode curr2 = head;
		ListNode next;
		
		while(curr2!=null && curr2.next!=null) {
			curr1 = curr1.next;
			curr2 = curr2.next.next;
		}
		
		ListNode head2 = curr1.next;
		curr1.next = null;
		
		curr2 = head2.next;
		head2.next = null;
		
		while(curr2 != null) {
			next = curr2.next;
			curr2.next = head2;
			head2 = curr2;
			curr2 = next;
		}
		
		curr1 = head;
		curr2 = head2;
		
		while(curr2 != null) {
			next = curr2.next;
			curr2.next = curr1.next;
			curr1.next = curr2;
			curr2 = next;
			curr1 = curr1.next.next;
		}
		
		printList(head);
    }
	
	//2017-5-11
	//12.Linked List Cycle II
	//����һ�������ж��������Ƿ���ڻ��������򷵻ػ�����ʼ��㣬���򷵻�null
	//i.e: 1->2->3->4->5->3, return 3
	//ʹ�ÿ���ָ���ж��������Ƿ���ڻ�
	//�����ڣ�����ָ��ص�head����ָ������������
	//��ָ������ȵ��ٶ�1ǰ�����´������㼴Ϊ������ʼ��
	//��֤������ָ��·��*2 = ��ָ��·�� 
	//aΪ������㵽�����·�̣�bΪ����㵽������·�̣�cΪ�����㵽�����·��
	//(a+b)*2 = (a+b) + n*(b+c)
	//(a+b) = n*(b+c)
	//a = (n-1)*(b+c) +c
	//��ָ�����1�ֱ������������������������ڻ��������
	public static ListNode detectCycle(ListNode head) {
        
		if(head == null) return null;
		
		ListNode curr1 = head;
		ListNode curr2 = head;
		
		while(curr2!=null && curr2.next!=null) {
			
			curr1 = curr1.next;
			curr2 = curr2.next.next;
			
			if(curr1 == curr2) {
				curr1 = head;
				while(curr1 != curr2) {
					curr1 = curr1.next;
					curr2 = curr2.next;
				}
				return curr1;
			}
		}
		return null;
    }
	
	//2017-5-10
	//11.Linked List Cycle
	//����һ�������ж��������Ƿ���ڻ�
	//i.e: 1->2->3->4->5->3, return true
	//ʹ�ÿ���˫ָ��curr1��curr2��curr1ÿ����һ����curr2ÿ��������
	//��curr2==null����curr2.next==null���򲻴��ڻ���return false
	//��curr1==curr2������ڻ���return true
	//��֤���������ڻ�����curr1��curr2���뻷����ָ������ٶ�Ϊ1
	//��curr2ÿ�ο���curr1һ��������curr1==curr2
	public static boolean hasCycle(ListNode head) {
		
		if(head == null) return false;
		
		ListNode curr1 = head;
		ListNode curr2 = head;
		
		while(curr2!=null && curr2.next!=null) {
			
			curr1 = curr1.next;
			curr2 = curr2.next.next;
			
			if(curr1 == curr2) return true;
		}
		
		return false;
    }
	
	//2017-5-9
	//10.Copy List with Random Pointer
	//����һ����������ÿ����㶼��һ��randomָ�룬ָ��������е������ڵ����null�����������
	//i.e: 1->2->3->4->5->null
	//		  |     ^
	//		  ------|
	//����������������Ԫ�أ�����Ԫ�ز���ԭԪ��֮��
	//�ٴα���������ԭԪ��randomָ�벻Ϊnull������¶�Ӧ��Ԫ�ص�randomָ�룬curr.next.randomָ��curr.random.next
	//�������������л�ԭԭ������������������������
	public static RandomListNode copyRandomList(RandomListNode head) {
        
		if(head == null) return head;
		
		RandomListNode newHead = null;
		RandomListNode pre = null;
		RandomListNode curr = head;
		
		while(curr != null) {
			RandomListNode temp = new RandomListNode(curr.label);
			temp.next = curr.next;
			curr.next = temp;
			curr = temp.next;
		}
		
		curr = head;
		
		while(curr != null) {
			if(curr.random != null) {
				curr.next.random = curr.random.next;
			}
			curr = curr.next.next;
		}
		
		pre = head;
		curr = head.next;
		newHead = curr;
		
		while(true) {
			pre.next = curr.next;
			pre = pre.next;
			if(pre == null) {
				curr.next = null;
				break;
			} else {
				curr.next = pre.next;
				curr = curr.next;
			}
		}
		return newHead;
    }
	
	//2017-5-9
	//9.Reverse Nodes in k-Group
	//����һ����������kֵ��������������k�����ڵ�Ԫ�ط����������k��Ԫ�أ�����ԭ˳��
	//i.e: Given 1->2->3->4->5->null, k=3, return 3->2->1->4->5->null
	//�½�һ��������newLink��ʹ��ͷ�巨����ԭ��������Ҫ�����Ԫ�ز���������
	//ʹ��newPre,newTail��¼������Ԫ��λ�ã�ʹ��curr,next��¼ԭ����Ԫ��λ��
	//����ԭ������ȡԭ������length��������Ҫ�����������length2=length-length%k
	//������Ҫ���������
	//��count%k==1������ǰԪ��Ϊ��Ҫ�����k��Ԫ���еĵ�һ��ʱ������Ԫ�ؽӵ�������ĩβ
	//	����newPreָ��newTail��newTail.nextָ��curr��newTailָ��curr
	//���򽫵�ǰԪ�ز嵽��һ��Ԫ��֮ǰ
	//	����curr.nextָ��newPre.next��newPre.nextָ��curr;
	//���ԭ������ʣ��Ĳ���k����Ԫ��ֱ�ӽӵ�������ĩβ
	//ע�⽫newTail.nextָ��null
	public static ListNode reverseKGroup(ListNode head, int k) {
        
		if(head == null) return null;
		if(head.next==null && k==1) return head;
		
		ListNode newLink = new ListNode(0);
		ListNode newPre = newLink;
		ListNode newTail = newPre;
		ListNode curr = head;
		ListNode next = null;

		int length = 0;
		int count = 0;
		
		while(curr != null) {
			length++;
			curr = curr.next;
		}
		
		int length2 = length - length % k;
		
		curr = head;
		
		while(count < length2) {
			count++;
			
			next = curr.next;

			if(count % k == 1) {
				newPre = newTail;
				newTail.next = curr;
				newTail = curr;
			} else {
				curr.next = newPre.next;
				newPre.next = curr;
			}
			
			curr = next;
		}
		
		while(curr != null) {
			newTail.next = curr;
			newTail = curr;
			curr = curr.next;
		}
		
		newTail.next = null;
		
		return newLink.next;
    }
	
	//2017-5-8
	//8.Swap Nodes in Pairs
	//����һ�����������������ڵ�����Ԫ�ص�λ��
	//i.e: Given 1->2->3->4, return 2->1->4->3
	//��������ʹ��pre,curr1,curr2,next��¼����Ԫ��λ��
	//��pre==null����headָ��curr2������pre.nextָ��curr2
	//����curr1��curr2˳�򣬽�curr2.nextָ��curr1��curr1.nextָ��next
	//	����ʱnext==null������next.next==null����return head
	//ָ�����ƣ���preָ��curr1��curr1ָ��next��curr2ָ��curr1.next��nextָ��curr2.next����������
	public static ListNode swapPairs(ListNode head) {
		
		if(head == null) return null;
		if(head.next == null) return head;
		
		ListNode pre = null;
		ListNode curr1 = head;
		ListNode curr2 = curr1.next;
		ListNode next = curr2.next;
		
		while(true) {
			
			if(pre==null) {
				head = curr2;
			} else {
				pre.next = curr2;
			}
			
			curr2.next = curr1;
			curr1.next = next;
			
			if(next==null || next.next==null) break;
			
			pre = curr1;
			curr1 = next;
			curr2 = curr1.next;
			next = curr2.next;
		}
		
        return head;
    }
	
	//2017-5-7
	//7.Remove Nth Node From End of List
	//����һ����������nֵ��ɾ����������n��Ԫ��
	//i.e: Given 1->2->3->4->5->null, n = 2, return 1->2->3->5->null
	//ʹ��˫ָ�룬delete��curr����ָ����(n-1)��Ԫ��
	//��currָ�������βnullʱ��delete��ָ����Ҫɾ����Ԫ��
	//��deletePre==null����headָ��delete.next
	//��deletePre��=null����deletePre.nextָ��delete.next
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		
		if(head.next == null) return null;
		
		ListNode deletePre = null;
		ListNode delete = head;
		ListNode curr = head;
		int count = 0;
		
		while(curr != null) {
			if(count >= n) {
				deletePre = delete;
				delete = delete.next;
			} else {
				count++;
			}
			curr = curr.next;
		}
		
		if(deletePre == null) {
			head = delete.next;
		} else {
			deletePre.next = delete.next; 
		}
		
        return head;
    }
	
	//2017-5-7
	//6.Rotate List
	//����һ����������kֵ��������ĩβk��Ԫ����ת������ͷ (kҪ��������ȡģ)
	//i.e: Given 1->2->3->4->5->NULL, k=2, return 4->5->1->2->3->NULL
	//���������õ�������length������¼ԭ����ĩβԪ��last��
	//k��lengthȡģ��������0��return head;
	//���±���������ȡ�������newHead��newLast
	//ԭ�����last.nextָ��ԭ�����head���������newLast.nextָ��null��return newHead;
	public static ListNode rotateRight(ListNode head, int k) {
		
		if(head == null) return null;
		if(head.next==null || k==0) return head;
		
		ListNode newHead = null;
		ListNode newLast = null;
		ListNode pre = null;
		ListNode curr = head;
		ListNode last = null;
		int length = 0;
		int count = 0;
		
		while(curr != null) {
			length++;
			pre = curr;
			curr = curr.next;
		}
		
		k %= length;
		
		if(k == 0) return head;
		
		last = pre;
		
		curr = head;
		
		while(count < length-k) {
			count++;
			pre = curr;
			curr = curr.next;
		}
		
		newHead = curr;
		newLast = pre;
		
		last.next = head;
		newLast.next = null;
		
        return newHead;
    }
	
	//2017-5-7
	//5.Remove Duplicates from Sorted List II
	//����һ�������������ɾ�����е��ظ�Ԫ�أ�ֻ��������1�ε�Ԫ��
	//i.e: Given 1->2->3->3->4->4->5, return 1->2->5
	//��������ʹ��pre, curr, next��¼����Ԫ��λ��
	//��curr==next����ѭ��next=next.nextֱ��curr��=next
	//	����ʱpre==null��next==null����˵������ֻ��������ͬ��Ԫ�أ�return null
	//	����ʱpre==null��next!=null����˵��next֮ǰ�����ظ�Ԫ�أ���headָ��next��curr��next���ƣ�continue
	//	����ʱ pre!=null����pre.nextָ��next������pre��next֮����ظ�Ԫ�أ���curr��next���ƣ�continue
	//��curr��=next����pre��curr��next���ƣ�continue
	//��curr==nullʱ����ѭ����return head
	public static ListNode deleteDuplicatesII(ListNode head) {
		
		if(head == null) return null;
		if(head.next == null) return head;
		
		ListNode pre = null;
		ListNode curr = head;
		ListNode next = head.next;
		
		while(curr != null) {
			
			if(next!=null && curr.val==next.val) {
				
				while(next!=null && curr.val==next.val) {
					curr.next = next.next;
					next = next.next;
				}
				
				if(pre==null && next==null) {
					return null;
				} else if(pre==null && next!=null) {
					head = next;
					curr = next;
					if(next!=null) {
						next = next.next;
					}
					continue;
				} else {
					pre.next = next;
					curr = next;
					if(next!=null) {
						next = next.next;
					}
					continue;
				}
			}
			
			pre = curr;
			curr = next;
			if(next!=null) {
				next = next.next;
			}
		}
        return head;
    }
	
	//2017-5-7
	//4.Remove Duplicates from Sorted List
	//����һ�������������ɾ�����е��ظ�Ԫ�أ�ʹÿһ��Ԫ��������1��
	//i.e: Given 1->1->2->3->3, return 1->2->3
	//��pre==curr����pre.nextָ�� curr.next
	//��pre��=curr����preָ��curr
	//������������currָ��curr.next
	public static ListNode deleteDuplicatesI(ListNode head) {
		
		if(head == null) return null;
		if(head.next == null) return head;
		
		ListNode pre = head;
		ListNode curr = head.next;
		
		while(curr != null) {
			if(pre.val == curr.val) {
				pre.next = curr.next;
			} else {
				pre = curr;
			}
			curr = curr.next;
		}
		return head;
	}
	
	//2017-5-6
	//3.Partition List
	//����һ����������xֵ����������ֵС��x�Ľ���ƶ���ֵ���ڵ���x�Ľ��ǰ������������ԭ�ȵ����λ��
	//i.e: Given 1->4->3->2->5->2->NULL, x=3, return 1->2->2->4->3->5->NULL
	//ʹ����������less��large�������ӽ��
	//����ԭ����ֵС��x�Ľ����ӵ�less����ֵ���ڵ���x�Ľ����ӵ�large����
	//���less��largeƴ������
	//ע�⽫large��ĩβ����nextָ��null
	public static ListNode partition(ListNode head, int x) {
		
		ListNode less = new ListNode(0);
		ListNode large = new ListNode(0);
		
		ListNode lessPointer = less;
		ListNode largePointer = large;
		ListNode curr = head;
		
		while(curr != null) {
			
			if(curr.val < x) {
				lessPointer.next = curr;
				lessPointer = curr;
			} else {
				largePointer.next = curr;
				largePointer = curr;
			}
			
			curr = curr.next;
		}
		
		lessPointer.next = large.next;
		largePointer.next = null;
		
		return less.next;
		
		//�ύ����ͨ�������㷨˼·���Ӳ�����
		/*if(head == null) return null;
		if(head.next == null) return head;
		
		ListNode pre = null;
		ListNode curr = head;
		ListNode maxPre = null;
		ListNode firstMax = null;
		ListNode prePre = null;
		
		while(curr != null)	{
			
			if(firstMax!=null && curr.val<x) {
				pre.next = curr.next;
				prePre = pre;
				pre = curr;
				curr = curr.next;
				
				if(maxPre == null) {
					head = pre;
				} else {
					maxPre.next = pre;
				}

				maxPre = pre;
				pre.next = firstMax;
				pre = prePre;

				continue;
			}
			
			if( firstMax==null && curr.val>=x) {
				maxPre = pre;
				firstMax = curr;
			}
			
			pre = curr;
			curr = curr.next;
		}
        return head;*/
    }
	
	//2017-5-6
	//2.Reverse Linked List II
	//����һ����������m��n���������еĵ�m����n��Ԫ�ط���
	//i.e: Given 1->2->3->4->5->NULL, m=2 and n=4, return 1->4->3->2->5->NULL
	//��¼m-1, m, n, n+1��������
	//ʹ����ʱ���ã���m��n�������(m-1)->n, ��m->(n+1)
	//ע���ж�(m-1)�Ƿ�null
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		
		if(head.next == null) return head;
		
		ListNode pre = null;
		ListNode curr = head;
		ListNode next = curr.next;
		ListNode nextNext = null;
		ListNode startM = null;
		
		int count = 1;
		
		while(count != m) {
			count++;
			pre = curr;
			curr = next;
			next = curr.next;
		}
		
		startM = curr;
		
		while(count != n) {
			count++;
			if(next != null) {
				nextNext = next.next;
			} else {
				nextNext = null;
			}
			next.next = curr;
			curr = next;
			next = nextNext;
		}
		
		if(pre == null) {
			head = curr;
		} else {
			pre.next = curr;
		}
		startM.next = next;
		
        return head;
    }
	
	//2017-5-5
	//1.Add Two Numbers
	//���������ǿ��������������Ǹ�������������ֻ��Ÿ�λ��ֵ���ҷ����ţ���������������õ���������
	//i.e: Given 0->9->9, 0->1, return 0->0->0->1
	//��ǰ��Ӧλ��ӣ�sum = val1 + val2 + carry
	//��sum>=10����carry=1����ǰλsum=sum-10������carry=0����ǰλsum=sum
	//������һ���������������������һ�������ʣ���λ��sum = val + carry������ͬ��
	//����ڷ��ؽ��ǰ��ע�����յ�carry����carry==1�����������������ĩβ
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		int sum;
		int carry = 0;
		
		ListNode next1 = l1;
		ListNode next2 = l2;
		
		ListNode front = null;
		ListNode tail = null;
		
		while(next1!=null && next2!=null) {
			
			sum = next1.val + next2.val + carry;
			if(sum >= 10) {
				carry = 1;
				sum -= 10;
			} else {
				carry = 0;
			}
			
			ListNode temp = new ListNode(sum);
			
			if(front == null) {
				front = temp;
				tail = front;
			} else {
				tail.next = temp;
				tail = temp;
			}
			
			next1 = next1.next;
			next2 = next2.next;
		}
		
		while(next1 != null) {
			sum = next1.val + carry;
			if(sum >= 10) {
				carry = 1;
				sum -= 10;
			} else {
				carry = 0;
			}
			ListNode temp = new ListNode(sum);
			tail.next = temp;
			tail = temp;
			next1 = next1.next;
		}
		while(next2 != null) {
			sum = next2.val + carry;
			if(sum >= 10) {
				carry = 1;
				sum -= 10;
			} else {
				carry = 0;
			}
			ListNode temp = new ListNode(sum);
			tail.next = temp;
			tail = temp;
			next2 = next2.next;
		}
		
		if(carry == 1) {
			ListNode temp = new ListNode(1);
			tail.next = temp;
		}
		return front;
    }
}
