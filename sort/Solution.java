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
		//���������������飬������2�鲢������1�У��γ�һ���������飬��������1�ռ��㹻��
		
		//2.Merge Two Sorted Lists
		//�鲢������������������һ����������������ԭ�����������еĽڵ����
		
		//3.Merge k Sorted Lists
		//�鲢k����������
		
		//4.Insertion Sort List
		//ʹ�ò�����������һ������
		
		//5.Sort List
		//ʹ��ʱ�临�Ӷ�ΪO(nlogn)���ռ临�Ӷ�ΪO(1)���㷨����������
		
		//6.First Missing Positive
		//����һ��δ������������飬�ҳ����ж�ʧ�ĵ�һ����������Ҫ��ʱ�临�Ӷ�ΪO(n)���ռ临�Ӷ�ΪO(1)
		/*int[] nums = {1, 1, 1, 1, 1};
		int result = firstMissingPositive(nums);
		System.out.println(result);*/
		
		//7.Sort Colors
		//����һ�����飬����0��1��2�������������飬ʹ����ֵͬΪ����λ�ã����Ұ���0��1��2��˳������
		int[] nums = {0, 1, 2, 0, 1, 2};
		sortColors(nums);
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	//2017-12-30
	//7.Sort Colors
	//����һ�����飬����0��1��2���������������飬ʹ����ֵͬΪ����λ�ã����Ұ���0��1��2��˳������
	//һ�α������㶨�ռ�
	//ʹ������ָ��l��r��ָ�����鿪ͷ�ͽ�β����0ֵ�����±�l������2ֵ�����±�r��
	//��������
	//	��nums[index]==0����nums[index]��nums[l]��ֵ������index��lһ������
	//	��nums[index]==1�������������index����
	//	��nums[index]==2����nums[index]��nums[r]��ֵ������r����
	//index>rʱ��������
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
	//����һ��δ������������飬�ҳ����ж�ʧ�ĵ�һ����������Ҫ��ʱ�临�Ӷ�ΪO(n)���ռ临�Ӷ�ΪO(1)
	//��������1��ʼ���������ظ�
	//Given [1,2,0] return 3, and [3,4,-1,1] return 2.
	//�������������ֵ������ұߣ�ֻ����Чֵ���в���
	//ѡ����С��������������Ϊ1�����һ��ȱʧ����������Ϊ1
	//�������飬���㵱ǰֵvalue�Ķ�Ӧ�±�index = value - 1
	//	��index���ڵ�ǰ�±�i��continue
	//	��index�������鷶Χ����i���ĵ�ǰֵvalue��-1��continue
	//	��index����ֵ������i���ĵ�ǰֵvalue����ֵ�ظ�������ǰֵvalue��-1��continue
	//	����index����i����ֵ��λ�ã����¼���i����ֵ���±�index
	//�����е�һ������-1�ĵط�����Ϊ��һ��ȱʧ������������δ����-1�������������������������һ��ֵ+1
    public static int firstMissingPositive(int[] nums) {
        
    	int length = nums.length;
    	
    	// �������������ֵ������ұߣ�
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
    	
    	// ѡ����С��������
    	int minValue = Integer.MAX_VALUE;
    	int minIndex = -1;
    	for(int i=0; i<=end; i++) {
    		if(nums[i] < minValue) {
    			minValue = nums[i];
    			minIndex = i;
    		}
    	}

    	if(minValue > 1) return 1; // ��1��ʼ����
    	
    	// ����С������������������ǰ��
   		temp = nums[0];
   		nums[0] = nums[minIndex];
   		nums[minIndex] = temp;
   		
    	// ����
    	int index;
    	for(int i=1; i<=end; i++) {
    		
    		if(nums[i] == -1) continue;
    		
    		index = nums[i] - minValue;
    		
    		if(index == i) continue; // indexΪ��ǰ�±�
    		
    		if(index > end) { // index������Χ
    			nums[i] = -1; // ��Ϊ-1
    			continue;
    		}
    		
    		if(nums[index] == nums[i]) {
    			nums[i] = -1; // ȥ�ظ�
    			continue;
    		}
    		
    		// ����ǰֵnums[i]�ŵ���Ӧ���±�index��
    		temp = nums[index];
    		nums[index] = nums[i];
    		nums[i] = temp;
    		i--; // ԭ��nums[index]��ֵ�������������i�±괦����Ҫ���¼���nums[i]
    	}
    	
    	for(int i=1; i<=end; i++) {
    		if(nums[i] == -1) {
    			return minValue + i; // ��һ������-1�ĵط�����Ϊ��һ��ȱʧ��������
    		}
    	}
    	
    	return nums[end] + 1; // δ����-1������������
    }
	
	//2017-12-28
	//5.Sort List
	//ʹ��ʱ�临�Ӷ�ΪO(nlogn)���ռ临�Ӷ�ΪO(1)���㷨����������
	//���ݹ鲢�����˼��
	//	ʹ�ÿ���ָ��fast��slow��������ȡ�����е㣬���ض�����
	//	�ݹ��������������ضϣ�ֱ��ÿ������ֻӵ��һ��Ԫ��
	//	ʹ�ù鲢�����㷨�ؽ�����
    public ListNode sortList(ListNode head) {

    	if(head==null || head.next==null) return head; // ֻ��һ��Ԫ��ʱ������
    	
    	ListNode fast = head.next; // �ٶ�Ϊ2
    	ListNode slow = head; // �ٶ�Ϊ1
    	
    	while(fast!=null && fast.next!=null) { // ȡ�����е�
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	fast = slow.next; // fastָ�����
    	slow.next = null; // �ض�����
    	
    	return mergeTwoLists(sortList(head), sortList(fast)); // �ݹ�ǰ�������������鲢����
    }
	
	//2017-12-28
	//4.Insertion Sort List
	//ʹ�ò�����������һ������
	//ʹ��helperָ���¼����������ͷ
	//���ݲ��������˼�룬ʹ��preָ���ǰ��������������������ں��ʵ�λ�ò���ڵ�
	//	������Ľڵ�ֵ���ڵ���pre�ڵ�ֵ������������pre=helper����Ϊpre֮ǰ�Ľڵ�ֵ��С�ڲ���Ľڵ�ֵ
	//	ֻ�е�����Ľڵ�ֵ��С������Ҫ����pre=helper
    public ListNode insertionSortList(ListNode head) {
        
    	if(head==null || head.next==null) return head;
    	
    	ListNode helper = new ListNode(-1); // ��¼����������
    	helper.next = head;
    	head = head.next;
    	helper.next.next = null;
    	
    	ListNode pre = helper;
    	ListNode curr = null;
    	
    	while(head != null) {
    		
    		if(head.val < pre.val) {
    			pre = helper; // ������Ľڵ�ֵ���ڵ���pre�ڵ�ֵ������������pre��ֻ�е�����Ľڵ�ֵ��С������Ҫ����pre
    		}
    		
    		curr = head; // ȡ��ԭ�����ͷ
    		head = head.next;
    		
    		while(pre.next!= null && pre.next.val <= curr.val) { // ��ʹ���ڣ�preҲҪ���ƣ����ֲ���������ȶ���
    			pre = pre.next;
    		}
    		
    		curr.next = pre.next; // ����pre��pre.next֮��
    		pre.next = curr;
    	}
    	
    	return helper.next;
    }
	
	//2017-12-28
	//3.Merge k Sorted Lists
	//�鲢k����������
	//�ݹ�
	//	���ݹ鲢�����˼�룬��ɢ�������飬�����鲢
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
	//�鲢������������������һ��������������������ԭ�����������еĽڵ����
	//Input: 1->2->4, 1->3->4
	//Output: 1->1->2->3->4->4
	//ʹ��headָ���¼������ͷ
	//ʹ��currָ���¼������ǰ�ڵ�
	//ʹ��l1��l2ָ���¼ԭ����ǰ�ڵ�
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
	//���������������飬������2(n��Ԫ��)�鲢������1(m��Ԫ��)�У��γ�һ���������飬��������1�ռ��㹻��
	//������1��(m+n-1)λ�ã���ǰ�������
	//����1������2�Ӻ���ǰ�Ƚ�
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
