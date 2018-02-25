package sort;

public class Solution {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	
	public static void main(String[] args) {
		//1.Merge Sorted Array
		//给定两个有序数组，将数组2归并到数组1中，形成一个有序数组，假设数组1空间足够大
		
		//2.Merge Two Sorted Lists
		//归并两个有序链表，并返回一个新链表，新链表由原先两个链表中的节点组成
		
		//3.Merge k Sorted Lists
		//归并k个有序链表
		
		//4.Insertion Sort List
		//使用插入排序，排序一个链表
		
		//5.Sort List
		//使用时间复杂度为O(nlogn)、空间复杂度为O(1)的算法，排序链表
		
		//6.First Missing Positive
		//给定一个未排序的整数数组，找出其中丢失的第一个正整数，要求时间复杂度为O(n)、空间复杂度为O(1)
		/*int[] nums = {1, 1, 1, 1, 1};
		int result = firstMissingPositive(nums);
		System.out.println(result);*/
		
		//7.Sort Colors
		//给定一个数组，包含0、1、2三个数，序数组，使得相同值为相邻位置，并且按照0、1、2的顺序排列
		int[] nums = {0, 1, 2, 0, 1, 2};
		sortColors(nums);
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	//2017-12-30
	//7.Sort Colors
	//给定一个数组，包含0、1、2三个数，排序数组，使得相同值为相邻位置，并且按照0、1、2的顺序排列
	//一次遍历，恒定空间
	//使用左右指针l和r，指向数组开头和结尾，将0值换到下标l处，将2值换到下标r处
	//遍历数组
	//	若nums[index]==0，则将nums[index]和nums[l]的值交换，index和l一起右移
	//	若nums[index]==1，则继续遍历，index右移
	//	若nums[index]==2，则将nums[index]和nums[r]的值交换，r左移
	//index>r时遍历结束
	public static void sortColors(int[] nums) {
		
		int length = nums.length;
		
		int l = 0;
		int r = length - 1;
		
		int index = 0;
		int temp;
		
		while(index <= r) {
			if(nums[index] == 0) {
				temp = nums[index];
				nums[index] = nums[l];
				nums[l] = temp;
				index++;
				l++;
			} else if(nums[index] == 1) {
				index++;
			} else if(nums[index] == 2) {
				temp = nums[index];
				nums[index] = nums[r];
				nums[r] = temp;
				r--;
			}
		}
    }
	
	//2017-12-30
	//6.First Missing Positive
	//给定一个未排序的整数数组，找出其中丢失的第一个正整数，要求时间复杂度为O(n)、空间复杂度为O(1)
	//正整数从1开始计数，有重复
	//Given [1,2,0] return 3, and [3,4,-1,1] return 2.
	//将非正整数划分到数组右边，只对有效值进行操作
	//选出最小的正整数，若不为1，则第一个缺失的正整数即为1
	//遍历数组，计算当前值value的对应下标index = value - 1
	//	若index等于当前下标i，continue
	//	若index超出数组范围，则i处的当前值value置-1，continue
	//	若index处的值，等于i处的当前值value，则值重复，将当前值value置-1，continue
	//	交换index处与i处的值的位置，重新计算i处的值的下标index
	//数组中第一个出现-1的地方，即为第一个缺失的正整数，若未出现-1，则序列连续，返回序列最后一个值+1
    public static int firstMissingPositive(int[] nums) {
        
    	int length = nums.length;
    	
    	// 将非正整数划分到数组右边，
    	int countNegative = 0;
    	int temp;
    	for(int i=length-1; i>=0; i--) {
    		if(nums[i]<=0) {
    			if(i != length - 1 - countNegative) {
    				temp = nums[length -1 - countNegative];
    				nums[length -1 - countNegative] = nums[i];
    				nums[i] = temp;
    			}
    			countNegative++;
    		}
    	}
    	
    	int end = length - 1 - countNegative;
    	if(end < 0) return 1;
    	
    	// 选出最小的正整数
    	int minValue = Integer.MAX_VALUE;
    	int minIndex = -1;
    	for(int i=0; i<=end; i++) {
    		if(nums[i] < minValue) {
    			minValue = nums[i];
    			minIndex = i;
    		}
    	}

    	if(minValue > 1) return 1; // 从1开始计数
    	
    	// 将最小的正整数交换到数组前面
   		temp = nums[0];
   		nums[0] = nums[minIndex];
   		nums[minIndex] = temp;
   		
    	// 排序
    	int index;
    	for(int i=1; i<=end; i++) {
    		
    		if(nums[i] == -1) continue;
    		
    		index = nums[i] - minValue;
    		
    		if(index == i) continue; // index为当前下标
    		
    		if(index > end) { // index超出范围
    			nums[i] = -1; // 置为-1
    			continue;
    		}
    		
    		if(nums[index] == nums[i]) {
    			nums[i] = -1; // 去重复
    			continue;
    		}
    		
    		// 将当前值nums[i]放到对应的下标index处
    		temp = nums[index];
    		nums[index] = nums[i];
    		nums[i] = temp;
    		i--; // 原来nums[index]的值被交换到数组的i下标处，需要重新计算nums[i]
    	}
    	
    	for(int i=1; i<=end; i++) {
    		if(nums[i] == -1) {
    			return minValue + i; // 第一个出现-1的地方，即为第一个缺失的正整数
    		}
    	}
    	
    	return nums[end] + 1; // 未出现-1，则序列连续
    }
	
	//2017-12-28
	//5.Sort List
	//使用时间复杂度为O(nlogn)、空间复杂度为O(1)的算法，排序链表
	//根据归并排序的思想
	//	使用快慢指针fast和slow遍历链表，取链表中点，并截断链表
	//	递归两段链表，继续截断，直到每个链表只拥有一个元素
	//	使用归并排序算法重建链表
    public ListNode sortList(ListNode head) {

    	if(head==null || head.next==null) return head; // 只有一个元素时，返回
    	
    	ListNode fast = head.next; // 速度为2
    	ListNode slow = head; // 速度为1
    	
    	while(fast!=null && fast.next!=null) { // 取链表中点
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	fast = slow.next; // fast指向后半段
    	slow.next = null; // 截断链表
    	
    	return mergeTwoLists(sortList(head), sortList(fast)); // 递归前后两段链表，最后归并排序
    }
	
	//2017-12-28
	//4.Insertion Sort List
	//使用插入排序，排序一个链表
	//使用helper指针记录已排序链表头
	//根据插入排序的思想，使用pre指针从前往后遍历已排序链表，并在合适的位置插入节点
	//	若插入的节点值大于等于pre节点值，则无需重置pre=helper，因为pre之前的节点值都小于插入的节点值
	//	只有当插入的节点值更小，才需要重置pre=helper
    public ListNode insertionSortList(ListNode head) {
        
    	if(head==null || head.next==null) return head;
    	
    	ListNode helper = new ListNode(-1); // 记录已排序链表
    	helper.next = head;
    	head = head.next;
    	helper.next.next = null;
    	
    	ListNode pre = helper;
    	ListNode curr = null;
    	
    	while(head != null) {
    		
    		if(head.val < pre.val) {
    			pre = helper; // 若插入的节点值大于等于pre节点值，则无需重置pre，只有当插入的节点值更小，才需要重置pre
    		}
    		
    		curr = head; // 取出原链表表头
    		head = head.next;
    		
    		while(pre.next!= null && pre.next.val <= curr.val) { // 即使等于，pre也要后移，保持插入排序的稳定性
    			pre = pre.next;
    		}
    		
    		curr.next = pre.next; // 插入pre和pre.next之间
    		pre.next = curr;
    	}
    	
    	return helper.next;
    }
	
	//2017-12-28
	//3.Merge k Sorted Lists
	//归并k个有序链表
	//递归
	//	根据归并排序的思想，分散链表数组，两两归并
    public ListNode mergeKLists(ListNode[] lists) {
        
    	if(lists==null || lists.length==0) return null;
    	
    	int length = lists.length;
    	
    	if(length == 1) return lists[0];
    	
    	return mergrKLists(lists, 0, length-1);
    }
    private ListNode mergrKLists(ListNode[] lists, int left, int right) {
    	
    	if(left == right) {
    		return lists[left];
    	}
    	
    	int mid = (left + right) / 2;
    	return mergeTwoLists(mergrKLists(lists, left, mid), mergrKLists(lists, mid+1, right));
    }
	
	//2017-12-27
	//2.Merge Two Sorted Lists
	//归并两个有序链表，并返回一个有序新链表，新链表由原先两个链表中的节点组成
	//Input: 1->2->4, 1->3->4
	//Output: 1->1->2->3->4->4
	//使用head指针记录新链表头
	//使用curr指针记录新链表当前节点
	//使用l1和l2指针记录原链表当前节点
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	
    	//if(l1 == null) return l2;
    	//if(l2 == null) return l1;
    	
    	ListNode helper = new ListNode(0);
    	ListNode curr = helper;
    	
    	while(l1!=null && l2!=null) {
	    	if(l1.val < l2.val) {
	    		curr.next = l1;
	    		curr = l1;
	    		l1 = l1.next;
	    	} else {
	    		curr.next = l2;
	    		curr = l2;
	    		l2 = l2.next;
	    	}
    	}

    	if(l1 != null) {
    		curr.next = l1;
    	} else {
    		curr.next = l2;
    	}
        return helper.next;
    }
    
	//2017-12-27
	//1.Merge Sorted Array
	//给定两个有序数组，将数组2(n个元素)归并到数组1(m个元素)中，形成一个有序数组，假设数组1空间足够大
	//从数组1的(m+n-1)位置，往前填充数据
	//数组1与数组2从后往前比较
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
    	int last = m + n - 1;
    	int index1 = m - 1;
    	int index2 = n - 1;
    	
    	while(index1>=0 && index2>=0) {
    		
    		if(nums1[index1] > nums2[index2]) {
    			nums1[last] = nums1[index1];
    			last--;
    			index1--;
    		} else {
    			nums1[last] = nums2[index2];
    			last--;
    			index2--;
    		}
    	}
    	while(index2 >= 0) {
    		nums1[last] = nums2[index2];
			last--;
			index2--;
    	}
    }
}
