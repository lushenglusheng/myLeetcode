package enumeration;

import java.util.*;

public class Solution {

	
	public static void main(String[] args) {
		
	}
	
	//2018-3-20
	//6.Letter Combinations of a Phone Number
	//����һ�������ַ������������п��ܴ������Ϣ���Ź������ּ���
	// 0:"" 	1:""	2:abc	3:def	4:ghi	5:jkl	6:mno	7:pqrs	8:tuv	9:wxyz
	// given "23"; return ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
	//ö���������
	//	����ÿһ���������֣��������е�������ÿһ���ַ������ֱ����������������ÿһ���ַ�
	//	����������forѭ��
	//����
	//	��ʼ������{""}
	//	1������2������"abc"
	//		����������ֻ���ַ���""�����Եõ�{"a","b","c"}
	//	2������3������"def"
	//		(1)���������е���Ԫ��"a"��ɾ��"a"�����ֱ����'d','e','f'���õ�{"b","c","ad","ae","af"}
	//		(2)���������е���Ԫ��"b"��ɾ��"b"�����ֱ����'d','e','f'���õ�{"c","ad","ae","af","bd","be","bf"}
	//		(2)���������е���Ԫ��"c"��ɾ��"c"�����ֱ����'d','e','f'���õ�{"ad","ae","af","bd","be","bf","cd","ce","cf"}
	//ע�⣬ÿ���������ĸʱ��Ӧ����ȡ������ret��ǰ��size()��������ÿ�ζ���ѭ���е���ret.size()����Ϊret.size()�ǲ���������
    public List<String> letterCombinations(String digits) {
    	
    	LinkedList<String> list = new LinkedList<String>();
    	if(digits==null || digits.length()==0) {
    		return list;
    	}
    	
    	list.add("");
    	char[][] chs= {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    	
    	
    	char[] digitsChar = digits.toCharArray();
    	
    	for(int i=0; i<digitsChar.length; i++) {
    		
    		int size = list.size();
    		
    		for(int k=0; k<size; k++) {
    			String str = list.removeFirst();
    			int index = digitsChar[i] - '0';
	    		for(int j=0; j<chs[index].length; j++) {
	    			list.addLast(str + chs[index][j]);
	    		}
    		}
    	}
    	return list;
    }
	
	//2018-3-20
	//5.Combinations
	//������������n��k������[1..n]�����г���Ϊk�����
	// given n=4, k=2; return [[1,2], [1,3], [1,4], [2,3], [2,4], [3,4]]
	// �ݹ飬���±�start==1��ʼ�ݹ�
	//  ��list.size()==k���򱣴浱ǰ�����list�����ս����result
	//	����
	//		��start������n
	//			��ǰ��ֵi��������list
	//			�ݹ�start = i + 1
	//			��ǰ��ֵi�Ƴ������list
	// ��󷵻�result
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		combine(result, list, n, k, 1);
        return result;
    }
	private static void combine(List<List<Integer>> result, LinkedList<Integer> list, int n, int k, int start) {
		if(list.size() == k) {
			result.add(new LinkedList<Integer>(list));
		} else {
			for(int i=start; i<=n; i++) {
				list.addLast(i);
				combine(result, list, n, k, i+1);
				list.removeLast();
			}
		}
	}

	//2018-3-18
	//4.Permutations II
	//����һ����ֵ���ϣ����ܴ����ظ���ֵ��������ȫ����
	// given [1,1,2] return [[1,1,2], [1,2,1], [2,1,1]]
	//�����ظ��ĺ���˼·����
	//ʹ��һ��boolean����������ǰ����ֵ�Ƿ��Ѿ���ʹ�ù�
	//  ��ǰ��ֵ����Ѿ���ʹ�ù���������ж���һ����ֵ
	//  �����ǰ��ֵΪ�ظ�ֵ����ֻҪǰ���ֵû�б�ʹ�ù�����ǰֵ�Ͳ����Ա�ʹ��
	//  ����ȷ����ֻ�е�һ�����ֵ��ظ�ֵ�������������������ظ���������ᱻ��ӽ������
    public List<List<Integer>> permuteUnique(int[] nums) {
    	
    	List<List<Integer>> result = new LinkedList<List<Integer>>();
    	
    	if(nums == null) return result;
    	
		Arrays.sort(nums);
		
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		boolean[] used = new boolean[nums.length];
		
    	permuteUnique(result, list, nums, used);
		
		return result;
    }
	private static void permuteUnique(List<List<Integer>> result, LinkedList<Integer> list, int[] nums, boolean[] used) {
		
		if(list.size() == nums.length) {
			result.add(new LinkedList<Integer>(list));
		} else {
			for(int i=0; i<nums.length; i++) {
				
				if(used[i]) continue;
				
				if(i>0 && !used[i-1] && nums[i-1]==nums[i]) continue;
				
				used[i] = true;
				list.addLast(nums[i]);
				permuteUnique(result, list, nums, used);
				list.removeLast();
				used[i] = false;
			}
		}
	}
	
	//2018-3-18
	//3.Permutations
	//����һ�����ظ�����ֵ���ϣ�������ȫ����
	// given [1,2,3]; return [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]];
	//�ݹ�
	//1+per(2, 3)
	// 1+2+per(3) = 123
	// 1+3+per(2) = 132
	//2+per(1, 3)
	// 2+1+per(3) = 213
	// 2+3+per(1) = 231
	//3+per(1, 2)
	// 3+1+per(2) = 312
	// 3+2+per(1) = 321
	public List<List<Integer>> permute(int[] nums) {
        
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		
		permute(result, nums, 0, nums.length);
		
		return result;
    }
	private static void permute(List<List<Integer>> result, int[] nums, int start, int end) {
		if(start == end) {
			List<Integer> list = new LinkedList<Integer>();
			for(int i=0; i<nums.length; i++) {
				list.add(nums[i]);
			}
			result.add(list);
		} else {
			for(int i=start; i<nums.length; i++) {
				swap(nums, start, i);
				permute(result, nums, start+1, end);
				swap(nums, start, i);
			}
		}
	}
	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	//2018-3-12
	//2.Subsets II
	//����һ�����ͼ��ϣ����ܰ����ظ����֣��������п��ܵ����ظ��Ӽ�
	// given [1,2,2]; return [[], [1], [2], [1,2], [2,2], [1,2,2]];
	//������ӿռ���
	//ѭ�����飬��ԭ�м��ϵ�����£��½����ϣ�����ӵ�ǰ��
	//  ����ǰ������ǰһ�����������ԭ�����ϵ�ǰ�벿�ּ��ϣ�������һ�μ��ϴ�С����ʼ�½�����
	// []
	// [1]
	// [2], [1,2]
	// [2��2], [1,2,3] // ֻ�ں�벿�ֵļ�������� 2 ���Ԫ��
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(nums == null) return result;
		
		Arrays.sort(nums);
		
		List<Integer> list0 = new ArrayList<Integer>();
		result.add(list0);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(nums[0]);
		result.add(list1);
		
		int size = 1; 
		int start;
		
		for(int i=1; i<nums.length; i++) {
			
			if(nums[i-1] == nums[i]) {
				start = size;
			} else {
				start = 0;
			}
			
			size = result.size();
			
			for(int j=start; j<size; j++) {
    			List<Integer> list2 = new ArrayList<Integer>(result.get(j));
    			list2.add(nums[i]);
    			result.add(list2);
    		}
		}
		return result;
    }
	
	//2018-3-12
	//1.Subsets
	//����һ�����ظ������ͼ��ϣ��������п��ܵ��Ӽ�
	//given [1,2,3]; return [[], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]];
	//������ӿռ���
	//ѭ�����飬��ԭ�м��ϵ�����£��½����ϣ�����ӵ�ǰ��
	// []
	// [1]
	// [2], [1,2]
	// [3], [1,3], [2,3], [1,2,3]
    public List<List<Integer>> subsets(int[] nums) {
    	
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	
    	if(nums == null) return result;
    	
    	List<Integer> list0 = new ArrayList<Integer>();
    	
    	result.add(list0);
    	
    	for(int i=0; i<nums.length; i++) {
    		
    		int size = result.size();
    		
    		for(int j=0; j<size; j++) {
    			List<Integer> list1 = new ArrayList<Integer>(result.get(j));
    			list1.add(nums[i]);
    			result.add(list1);
    		}
    	}
    	
        return result;
    }
}
