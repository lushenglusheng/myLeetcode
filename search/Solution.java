package search;

public class Solution {

	public static void main(String[] args) {

		//1.Search for a Range
		//给定一个升序整数数组，给定一个目标整数，返回此整数在数组中的位置，时间复杂度O(logn)
		/*int[] nums = {1, 5, 5};
		int target = 4;
		int[] result = searchRange(nums, target);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}*/
		
		//2.Search Insert Position
		//给定一个已排序数组，给定一个目标值
		//若数组中存在目标值，则返回其下标，若不存在，则返回目标值应插入的位置下标，假设数组元素不重复
		/*int[] nums = {1, 3, 5, 6};
		int target = 7;
		int result = searchInsert(nums, target);
		System.out.println(result);*/
		
		//3.Search a 2D Matrix 
		//在一个m*n矩阵矩阵中查找目标值，其中矩阵每一行数值有序，且下一行的值都大于上一行的值
		/*int[][] matrix = {{1, 3, 5, 7},
						  {10, 11, 16, 20},
						  {23, 30, 34, 50}};
		int target = 34;
		boolean result = searchMatrix(matrix, target);
		System.out.println(result);*/
		
	}

	//2018-1-2
	//3.Search a 2D Matrix 
	//在一个m*n矩阵矩阵中查找目标值，其中矩阵每一行数值有序，且下一行的值都大于上一行的值
	//[[1,   3,  5,  7],
	// [10, 11, 16, 20],
	// [23, 30, 34, 50]]
	// target=3; return true;
	//将矩阵看作链表，使用二分法搜索，size = m * n
	//使用size/n判断行，使用size%n判断列
    public static boolean searchMatrix(int[][] matrix, int target) {
    	
    	if(matrix == null) return false;
    	
    	int rowNum = matrix.length; // 行数
    	if(rowNum == 0) return false;
    	
    	int colNum = matrix[0].length; // 列数
    	if(colNum == 0) return false;
    	
    	int l = 0;
    	int r = rowNum * colNum - 1;
    	int mid;
    	
    	while(l <= r) {
    		
    		mid = (l + r) / 2;
    		
    		if(matrix[mid/colNum][mid%colNum] < target) {
    			l = mid + 1;
    		} else if(target < matrix[mid/colNum][mid%colNum]) {
    			r = mid - 1;
    		} else {
    			return true;
    		}
    	}
    	
        return false;
    }
	
	//2018-1-1
	//2.Search Insert Position
	//给定一个已排序数组，给定一个目标值
	//若数组中存在目标值，则返回其下标，若不存在，则返回目标值应插入的下标，假设数组元素不重复
	//使用二分法搜索，查找目标值
	//	若查找到匹配值，则返回当前中间下标mid
	//	当左下标l>右下标r，则返回左下标l
    public static int searchInsert(int[] nums, int target) {
    	
    	if(nums.length == 0) return 0;
    	
    	int l = 0;
    	int r = nums.length - 1;
    	
    	int mid;
    	
    	while(l <= r) {
    		
    		mid = (l + r) / 2;
    		
    		if(nums[mid] < target) {
    			l = mid + 1;
    		} else if(target < nums[mid]) {
    			r = mid - 1;
    		} else {
    			return mid;
    		}
    	}
    	
    	return l;
    }
	
	//2018-1-1
	//1.Search for a Range
	//给定一个升序整数数组，给定一个目标整数，返回此整数在数组中的下标范围，时间复杂度O(logn)
	//Given [5, 7, 7, 8, 8, 10] and target value 8,	return [3, 4]. 若不存在，返回[-1, -1]
	//使用二分法搜索，查找target值和targetn+1值在数组中的起始下标，即可得到target值的下标范围
	//当目标值小于等于中间值，则缩进右边下标到中间下标
    public static int[] searchRange(int[] nums, int target) {
        
    	int[] result = {-1, -1};
    	
    	if(nums==null || nums.length==0) {
    		return result;
    	}
    	
    	int begin = searchFirst(nums, target);
    	
    	if(begin==nums.length || nums[begin]!=target) {
    		return result;
    	}

    	int end = searchFirst(nums, target+1) - 1;
    	
    	result[0] = begin;
    	result[1] = end;
    	
    	return result;
    }
    private static int	searchFirst(int[] nums, int target) {
    	
    	int l = 0;
    	int r = nums.length;
    	
    	int mid;
    	
    	while(l < r) {
    		
    		mid = (l + r) / 2;
    		
    		if(nums[mid] < target) {
    			l = mid + 1;
    		} else {
    			r = mid; // 当目标值小于等于中间值，则缩进右边下标到中间下标
    		}
    	}
    	
    	return l;
    }
	
	
}

