package search;

public class Solution {

	public static void main(String[] args) {

		//1.Search for a Range
		//����һ�������������飬����һ��Ŀ�����������ش������������е�λ�ã�ʱ�临�Ӷ�O(logn)
		/*int[] nums = {1, 5, 5};
		int target = 4;
		int[] result = searchRange(nums, target);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}*/
		
		//2.Search Insert Position
		//����һ�����������飬����һ��Ŀ��ֵ
		//�������д���Ŀ��ֵ���򷵻����±꣬�������ڣ��򷵻�Ŀ��ֵӦ�����λ���±꣬��������Ԫ�ز��ظ�
		/*int[] nums = {1, 3, 5, 6};
		int target = 7;
		int result = searchInsert(nums, target);
		System.out.println(result);*/
		
		//3.Search a 2D Matrix 
		//��һ��m*n��������в���Ŀ��ֵ�����о���ÿһ����ֵ��������һ�е�ֵ��������һ�е�ֵ
		/*int[][] matrix = {{1, 3, 5, 7},
						  {10, 11, 16, 20},
						  {23, 30, 34, 50}};
		int target = 34;
		boolean result = searchMatrix(matrix, target);
		System.out.println(result);*/
		
	}

	//2018-1-2
	//3.Search a 2D Matrix 
	//��һ��m*n��������в���Ŀ��ֵ�����о���ÿһ����ֵ��������һ�е�ֵ��������һ�е�ֵ
	//[[1,   3,  5,  7],
	// [10, 11, 16, 20],
	// [23, 30, 34, 50]]
	// target=3; return true;
	//������������ʹ�ö��ַ�������size = m * n
	//ʹ��size/n�ж��У�ʹ��size%n�ж���
    public static boolean searchMatrix(int[][] matrix, int target) {
    	
    	if(matrix == null) return false;
    	
    	int rowNum = matrix.length; // ����
    	if(rowNum == 0) return false;
    	
    	int colNum = matrix[0].length; // ����
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
	//����һ�����������飬����һ��Ŀ��ֵ
	//�������д���Ŀ��ֵ���򷵻����±꣬�������ڣ��򷵻�Ŀ��ֵӦ������±꣬��������Ԫ�ز��ظ�
	//ʹ�ö��ַ�����������Ŀ��ֵ
	//	�����ҵ�ƥ��ֵ���򷵻ص�ǰ�м��±�mid
	//	�����±�l>���±�r���򷵻����±�l
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
	//����һ�������������飬����һ��Ŀ�����������ش������������е��±귶Χ��ʱ�临�Ӷ�O(logn)
	//Given [5, 7, 7, 8, 8, 10] and target value 8,	return [3, 4]. �������ڣ�����[-1, -1]
	//ʹ�ö��ַ�����������targetֵ��targetn+1ֵ�������е���ʼ�±꣬���ɵõ�targetֵ���±귶Χ
	//��Ŀ��ֵС�ڵ����м�ֵ���������ұ��±굽�м��±�
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
    			r = mid; // ��Ŀ��ֵС�ڵ����м�ֵ���������ұ��±굽�м��±�
    		}
    	}
    	
    	return l;
    }
	
	
}

