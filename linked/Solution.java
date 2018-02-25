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
		//给定两个非空链表，代表两个非负整数，每个结点只存放个位数值，且反序存放，求两链表相加所得到的新链表
		/*ListNode l11 = new ListNode(0);
		ListNode l12 = new ListNode(9);		l11.next = l12;
		ListNode l13 = new ListNode(9);		l12.next = l13;
		ListNode l21 = new ListNode(0);
		ListNode l22 = new ListNode(1);		l21.next = l22;
		ListNode result = addTwoNumbers(l11, l21);
		printList(result);*/
		
		//2.Reverse Linked List II
		//给定一个链表，给定m和n，将链表中的第m到第n个元素倒叙
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
		//给定一个链表，给定x值，将链表中值小于x的结点移动到值大于等于x的结点前，保持链表结点原先的相对位置
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
		//给定一个已排序的链表，删除其中的重复元素，使每一个元素最多出现1次
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);		l1.next = l2;
		ListNode l3 = new ListNode(2);		l2.next = l3;
		ListNode l4 = new ListNode(3);		l3.next = l4;
		ListNode l5 = new ListNode(3);		l4.next = l5;
		ListNode result = deleteDuplicatesI(l1);
		printList(result);*/
		
		//5.Remove Duplicates from Sorted List II
		//给定一个已排序的链表，删除其中的重复元素，只保留出现1次的元素
		/*ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(3);		l1.next = l2;
		ListNode l3 = new ListNode(4);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode result = deleteDuplicatesII(l1);
		printList(result);*/
		
		//6.Rotate List
		//给定一个链表，给定k值，将链表末尾k个元素旋转至链表开头
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
		int k = 3;
		ListNode result = rotateRight(l1, k);
		printList(result);*/
		
		//7.Remove Nth Node From End of List
		//给定一个链表，给定n值，删除链表倒数第n个元素
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
		int n = 5;
		ListNode result = removeNthFromEnd(l1, n);
		printList(result);*/
		
		//8.Swap Nodes in Pairs
		//给定一个链表，交换所有相邻的两个元素的位置
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
		ListNode result = swapPairs(l1);
		printList(result);*/
		
		//9.Reverse Nodes in k-Group
		//给定一个链表，给定k值，将链表中所有k个相邻的元素逆序，若最后不足k个元素，则保留原顺序
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
		//给定一个链表，判断链表中是都存在环
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
											l5.next = l3;
		boolean result = hasCycle(l1);
		System.out.println(result);*/
		
		//12.Linked List Cycle II
		//给定一个链表，判断链表中是否存在环，存在则返回环的起始结点，否则返回null
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
											l5.next = l3;
		ListNode result = detectCycle(l1);
		System.out.println(result.val);*/
		
		//13.Reorder List
		//Given L0 → L1 → … → Ln-1 → Ln, return L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
		/*ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);		l1.next = l2;
		ListNode l3 = new ListNode(3);		l2.next = l3;
		ListNode l4 = new ListNode(4);		l3.next = l4;
		ListNode l5 = new ListNode(5);		l4.next = l5;
		ListNode l6 = new ListNode(6);		l5.next = l6;
		ListNode l7 = new ListNode(7);		l6.next = l7;
		reorderList(l1);*/
		
		//14.LRU Cache
		//设计一个基于LRU(Least Recently Used)的数据结构，有get和set方法，要求操作的时间复杂度O(1)
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
	//设计一个基于LRU(Least Recently Used)的数据结构，有get和set方法，要求操作的时间复杂度O(1)
	//get(key)，若key存在则返回key对应的value(>0)，否则返回-1
	//put(key, value)，若key不存在则添加key和value的映射关系
	//				     若容量超出范围，则删除最近最少访问的元素
	//HashMap + 双向链表
	//HashMap存储对应的key和value，
	//双向链表中存储value，越靠近head，则最近访问较多，越靠近tail，则最近访问较少
	//get(key)时，若key存在，则返回value，并将此元素交换到双向链表头部
	//put(key, value)时，若key存在，则更新value，并将此元素交换到双向链表头部
	//若key不存在，则新建(key, value)映射对，并插入链表头，若超出容量，则删除链表末尾元素
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
	    	
	    	moveToHead(curr);//将temp移到链表头
	        return head.val;
	    }
	    
	    public void put(int key, int value) {
	    	printList(head);
	    	System.out.println("try to put " + key + " " + value);
	    	
	    	ListNode curr = null;
	    	
	    	if(hashMap.containsKey(key)) {
	    		curr = hashMap.get(key);
	    		curr.val = value;
	    		
	    		moveToHead(curr);//将temp移到链表头
				return;
	    	} 

	    	curr = new ListNode(value);
    		curr.key = key;
	    	hashMap.put(key, curr);
	    	
    		if(cap==0) {
    			head = curr;
    			tail = curr;
    		} else {
    			curr.next = head;//插入头部
    			head.pre = curr;
    			head = curr;
    		}
    		
    		if(cap >= maxCap) {
    			hashMap.remove(tail.key);
    			tail = tail.pre;//删除尾部
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
	//Given L0 → L1 → … → Ln-1 → Ln, return L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
	//Given 1->2->3->4->null, retrun 1->4->2->3->null
	//使用快慢双指针，curr1一次一步，curr2一次两步
	//若curr2==null或者curr2.next==null，则curr1正好指向链表分割点，即最终链表的终点
	//新建临时链表head2指向curr1.next，再将最终的终点curr1.next指向null	
	//使用头插法将临时链表head2反序
	//最后按照要求连接原链表head和临时链表head2，得到最终链表
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
	//给定一个链表，判断链表中是否存在环，存在则返回环的起始结点，否则返回null
	//i.e: 1->2->3->4->5->3, return 3
	//使用快慢指针判断链表中是否存在环
	//若存在，则慢指针回到head，快指针留在相遇点
	//两指针以相等的速度1前进，下次相遇点即为环的起始点
	//简单证明：慢指针路程*2 = 快指针路程 
	//a为链表起点到环起点路程，b为环起点到相遇点路程，c为相遇点到环起点路程
	//(a+b)*2 = (a+b) + n*(b+c)
	//(a+b) = n*(b+c)
	//a = (n-1)*(b+c) +c
	//两指针等速1分别从链表起点和相遇点出发，则在环起点相遇
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
	//给定一个链表，判断链表中是否存在环
	//i.e: 1->2->3->4->5->3, return true
	//使用快慢双指针curr1和curr2，curr1每次走一步，curr2每次走两步
	//若curr2==null或者curr2.next==null，则不存在环，return false
	//若curr1==curr2，则存在环，return true
	//简单证明：若存在环，则curr1和curr2进入环后，两指针相对速度为1
	//即curr2每次靠近curr1一步，最终curr1==curr2
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
	//给定一个链表，其中每个结点都有一个random指针，指向此链表中的其他节点或者null，深拷贝此链表
	//i.e: 1->2->3->4->5->null
	//		  |     ^
	//		  ------|
	//遍历链表，复制链表元素，将新元素插入原元素之后
	//再次遍历链表，若原元素random指针不为null，则更新对应新元素的random指针，curr.next.random指向curr.random.next
	//最后遍历链表，从中还原原链表，构建新链表，返回新链表
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
	//给定一个链表，给定k值，将链表中所有k个相邻的元素反序，若最后不足k个元素，则保留原顺序
	//i.e: Given 1->2->3->4->5->null, k=3, return 3->2->1->4->5->null
	//新建一个新链表newLink，使用头插法，将原链表中需要反序的元素插入新链表
	//使用newPre,newTail记录新链表元素位置，使用curr,next记录原链表元素位置
	//遍历原链表，获取原链表长度length，计算需要反序的链表长度length2=length-length%k
	//遍历需要反序的链表
	//当count%k==1，即当前元素为需要反序的k个元素中的第一个时，将此元素接到新链表末尾
	//	即将newPre指向newTail，newTail.next指向curr，newTail指向curr
	//否则将当前元素插到上一个元素之前
	//	即将curr.next指向newPre.next，newPre.next指向curr;
	//最后将原链表中剩余的不足k个的元素直接接到新链表末尾
	//注意将newTail.next指向null
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
	//给定一个链表，交换所有相邻的两个元素的位置
	//i.e: Given 1->2->3->4, return 2->1->4->3
	//遍历链表，使用pre,curr1,curr2,next记录链表元素位置
	//若pre==null，则将head指向curr2，否则将pre.next指向curr2
	//交换curr1和curr2顺序，将curr2.next指向curr1，curr1.next指向next
	//	若此时next==null，或者next.next==null，则return head
	//指针右移，将pre指向curr1，curr1指向next，curr2指向curr1.next，next指向curr2.next，继续遍历
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
	//给定一个链表，给定n值，删除链表倒数第n个元素
	//i.e: Given 1->2->3->4->5->null, n = 2, return 1->2->3->5->null
	//使用双指针，delete和curr，两指针间隔(n-1)个元素
	//当curr指向链表结尾null时，delete则指向所要删除的元素
	//若deletePre==null，则将head指向delete.next
	//若deletePre！=null，则将deletePre.next指向delete.next
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
	//给定一个链表，给定k值，将链表末尾k个元素旋转至链表开头 (k要对链表长度取模)
	//i.e: Given 1->2->3->4->5->NULL, k=2, return 4->5->1->2->3->NULL
	//遍历链表，得到链表长度length，并记录原链表末尾元素last，
	//k对length取模，若等于0则return head;
	//重新遍历链表，获取新链表的newHead和newLast
	//原链表的last.next指向原链表的head，新链表的newLast.next指向null，return newHead;
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
	//给定一个已排序的链表，删除其中的重复元素，只保留出现1次的元素
	//i.e: Given 1->2->3->3->4->4->5, return 1->2->5
	//遍历链表，使用pre, curr, next记录链表元素位置
	//若curr==next，则循环next=next.next直到curr！=next
	//	若此时pre==null且next==null，则说明链表只有两个相同的元素，return null
	//	若此时pre==null且next!=null，则说明next之前都是重复元素，将head指向next，curr和next右移，continue
	//	若此时 pre!=null，则pre.next指向next，跳过pre和next之间的重复元素，将curr和next右移，continue
	//若curr！=next，则将pre，curr和next右移，continue
	//当curr==null时结束循环，return head
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
	//给定一个已排序的链表，删除其中的重复元素，使每一个元素最多出现1次
	//i.e: Given 1->1->2->3->3, return 1->2->3
	//若pre==curr，则pre.next指向 curr.next
	//若pre！=curr，则pre指向curr
	//继续遍历链表，curr指向curr.next
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
	//给定一个链表，给定x值，将链表中值小于x的结点移动到值大于等于x的结点前，保持链表结点原先的相对位置
	//i.e: Given 1->4->3->2->5->2->NULL, x=3, return 1->2->2->4->3->5->NULL
	//使用两个链表less和large重新连接结点
	//遍历原链表，值小于x的结点添加到less链表，值大于等于x的结点添加到large链表
	//最后将less和large拼接起来
	//注意将large的末尾结点的next指向null
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
		
		//提交运行通过，但算法思路复杂不清晰
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
	//给定一个链表，给定m和n，将链表中的第m到第n个元素反序
	//i.e: Given 1->2->3->4->5->NULL, m=2 and n=4, return 1->4->3->2->5->NULL
	//记录m-1, m, n, n+1处的引用
	//使用临时引用，将m到n反序，最后将(m-1)->n, 将m->(n+1)
	//注意判断(m-1)是否null
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
	//给定两个非空链表，代表两个非负整数，链表结点只存放个位数值，且反序存放，求两链表相加所得到的新链表
	//i.e: Given 0->9->9, 0->1, return 0->0->0->1
	//当前对应位相加，sum = val1 + val2 + carry
	//若sum>=10，则carry=1，当前位sum=sum-10，否则carry=0，当前位sum=sum
	//若其中一个链表遍历结束，则处理另一个链表的剩余高位，sum = val + carry，处理同上
	//最后在返回结果前，注意最终的carry，若carry==1，则添加至返回链表末尾
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
