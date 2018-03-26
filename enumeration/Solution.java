package enumeration;

import java.util.*;

public class Solution {

	
	public static void main(String[] args) {
		
	}
	
	//2018-3-20
	//6.Letter Combinations of a Phone Number
	//给定一个数字字符串，返回所有可能代表的信息（九宫格数字键）
	// 0:"" 	1:""	2:abc	3:def	4:ghi	5:jkl	6:mno	7:pqrs	8:tuv	9:wxyz
	// given "23"; return ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
	//枚举所有情况
	//	对于每一个输入数字，对于已有的排列中每一个字符串，分别加入该数字所代表的每一个字符
	//	所有是三重for循环
	//举例
	//	初始化排列{""}
	//	1、输入2，代表"abc"
	//		已有排列中只有字符串""，所以得到{"a","b","c"}
	//	2、输入3，代表"def"
	//		(1)对于排列中的首元素"a"，删除"a"，并分别加入'd','e','f'，得到{"b","c","ad","ae","af"}
	//		(2)对于排列中的首元素"b"，删除"b"，并分别加入'd','e','f'，得到{"c","ad","ae","af","bd","be","bf"}
	//		(2)对于排列中的首元素"c"，删除"c"，并分别加入'd','e','f'，得到{"ad","ae","af","bd","be","bf","cd","ce","cf"}
	//注意，每次添加新字母时，应该先取出现有ret当前的size()，而不是每次都在循环中调用ret.size()，因为ret.size()是不断增长的
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
	//给定两个整数n和k，返回[1..n]中所有长度为k的组合
	// given n=4, k=2; return [[1,2], [1,3], [1,4], [2,3], [2,4], [3,4]]
	// 递归，从下标start==1开始递归
	//  若list.size()==k，则保存当前结果集list到最终结果集result
	//	否则
	//		从start遍历到n
	//			当前数值i加入结果集list
	//			递归start = i + 1
	//			当前数值i移出结果集list
	// 最后返回result
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
	//给定一个数值集合，可能存在重复数值，返回其全排列
	// given [1,1,2] return [[1,1,2], [1,2,1], [2,1,1]]
	//避免重复的核心思路在于
	//使用一个boolean数组来代表当前的数值是否已经被使用过
	//  当前的值如果已经被使用过，则继续判断下一个数值
	//  如果当前的值为重复值，则只要前面的值没有被使用过，则当前值就不可以被使用
	//  这样确保了只有第一个出现的重复值可以算进结果集，后序重复的情况不会被添加进结果集
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
	//给定一个无重复的数值集合，返回其全排列
	// given [1,2,3]; return [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]];
	//递归
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
	//给定一个整型集合，可能包含重复数字，返回所有可能的无重复子集
	// given [1,2,2]; return [[], [1], [2], [1,2], [2,2], [1,2,2]];
	//首先添加空集合
	//循环数组，在原有集合的情况下，新建集合，并添加当前数
	//  若当前数等于前一个数，则忽略原来集合的前半部分集合，即从上一次集合大小处开始新建集合
	// []
	// [1]
	// [2], [1,2]
	// [2，2], [1,2,3] // 只在后半部分的集合中添加 2 这个元素
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
	//给定一个无重复的整型集合，返回所有可能的子集
	//given [1,2,3]; return [[], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]];
	//首先添加空集合
	//循环数组，在原有集合的情况下，新建集合，并添加当前数
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
