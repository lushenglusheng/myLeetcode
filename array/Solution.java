package array;

import java.util.*;

public class Solution {
	
	//��ӡ����
	public static void printArr(int[] arr, int size) {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	//��ӡ����
	public static void printMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		//1.Remove Duplicates	from Sorted Array
		//ɾ�������������е��ظ�Ԫ��
		/*int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7};
		int result = removeDuplicates(arr);
		printArr(arr, result);
		System.out.print(result);*/
		
		//2.Remove Duplicates	from Sorted Array II
		//ɾ�������������е��ظ�Ԫ�أ�����2�����ڵ��ظ�Ԫ��
		/*int[] arr = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3};
		int result = removeDuplicates2(arr);
		printArr(arr, result);
		System.out.println(result);*/
		
		//3.Search in Rotated Sorted Array
		//����ת������������������Ԫ��
		/*int[] arr = {4, 5, 6, 7, 8, 9, 11, 14, 16, 0, 1, 2, 3};
		int key = 1;
		int result = searchRotatedSorted(arr, key);
		if(result == -1) {
			System.out.println("Can not find key " + key);
		} else {
			System.out.println("Found key " + key);
		}*/
		
		//4.Search in Rotated Sorted Array II
		//����ת������������������Ԫ�أ������п��ܺ����ظ�Ԫ��
		/*int[] arr = {1, 3, 1, 1, 1};
		int key = 3;
		boolean result = searchRotatedSorted2(arr, key);
		if(result) {
			System.out.println("Found key " + key);
		} else {
			System.out.println("Can not find key " + key);
		}*/
		
		//5.Median of Two Sorted Arrays
		//�������������������ҳ���λ��
		/*int[] arr1 = {1, 2};
		int[] arr2 = {1, 2};
		double median = findMedianSortedArrays(arr1, arr2);
		System.out.println("The median is " + median);*/
		
		//6.Longest Consecutive Sequence
		//��һ��δ���������У��ҳ��������Ԫ�����У������䳤��
		/*int[] arr = {100, 4, 200, 1, 3, 2};
		int result = longestConsecutive(arr);
		System.out.println("Longest Consecutive Sequence Length " + result);*/
		
		//7.Two Sum
		//�ڸ������������ҳ�������ֵ��������ӵ���ָ��ֵ
		/*int[] arr = {2, 7, 11, 15};
		int target = 9;
		int[] result = twoSum(arr, target);
		System.out.println(target + "=" + arr[result[0]] + "+" + arr[result[1]]);*/
		
		//8.3Sum
		//�ڸ������������ҳ�������ֵ��������ӵ���0��������������������������
		/*int[] arr = {0,0,0,0};
		List<List<Integer>> result = threeSum(arr);
		for(List l : result) {
			System.out.println(l);
		}*/
		
		//9.3Sum Closest
		//�ڸ������������ҳ�������ֵ�����������ӽ��ڸ���ֵ
		/*int[] arr = {-1, 2, 1, -4};
		int target = 1;
		int result = threeSumClosest(arr, target);
		System.out.println("target=" + target + " result=" + result);*/
		
		//10.4Sum
		//�ڸ������������ҳ��ĸ���ֵ��������ӵ��ڸ�����ֵ�����������������������������������ظ�
		/*int[] arr = {0, 0, 0, 0};
		int target = 0;
		List<List<Integer>> result = fourSum(arr, target);
		for(List l : result) {
			System.out.println(l);
		}*/
		
		//11.Remove Element
		//�ڸ����������У�ɾ�����������ֵ��ȵ���ֵ�������������鳤��length����������ǰlength����Ϊ�������Ԫ��
		/*int[] arr = {3,2,2,3};
		int val = 3;
		int result = removeElement(arr, val);
		System.out.print("resutl=" + result);*/
		
		//12.Next Permutation
		//����һ�������һ�����У�����һ������
		/*int[] arr = {1,2,3};
		nextPermutation(arr);*/
		
		//13.Permutation Sequence
		//����n��k����n!��ȫ���У����ص�k������
		/*int n = 3;
		int k = 1;
		String result = getPermutation(n, k);
		System.out.println(result);*/
		
		//14.Valid Sudoku
		//�ڸ��������У��ж����������Ƿ���Ч�������ж������Ƿ��н�
		/*char[][] board = {{'.','.','.','.','.','.','.','.','2'},
						  {'.','.','.','.','.','.','6','.','.'},
						  {'.','.','1','4','.','.','8','.','.'},
						  {'.','.','.','.','.','.','.','.','.'},
						  {'.','.','.','.','.','.','.','.','.'},
						  {'.','.','.','.','3','.','.','.','.'},
						  {'5','.','8','6','.','.','.','.','.'},
						  {'.','9','.','.','.','.','4','.','.'},
						  {'.','.','.','.','5','.','.','.','.'}
						 };
		boolean result = isValidSudoku(board);
		System.out.println("result: " + result);*/
		
		//15.Trapping Rain Water
		//���������İ����ݻ�
		/*int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int result = trap(height);
		System.out.println("result: " + result);*/
		
		//16.Rotate Image
		//����n*n����˳ʱ����ת90��
		/*int[][] matrix = {{1,2,3,4,5},
						  {6,7,8,9,10},
						  {11,12,13,14,15},
						  {16,17,18,19,20},
						  {21,22,23,24,25},
						 };
		printMatrix(matrix);
		rotate(matrix);*/
		
		//17.Plus One
		//����һ���������ʾ��һ�������������м�һ����
		/*int[] digits = {9,9};
		int[] result = plusOne(digits);
		printArr(result, result.length);*/
		
		//18.Climbing Stairs
		//����n��̨�ף�ÿ��ֻ����1���2�㣬�󵽴ﶥ��Ĳ�ͬ�߷�
		/*int n = 3;
		int result = climbStairs(n);
		System.out.println("result: " + result);*/
		
		//19.Gray Code
		//����nֵ����nλ������
		/*int n = 3;
		List<Integer> result = grayCode(n);
		System.out.println(result);*/
		
		//20.Set Matrix Zeroes
		//����m*n���󣬽������е�����0Ԫ������������0
		/*int[][] matrix = {{1,2,3,4},
						  {1,2,3,4},
						  {1,2,3,0},
						 };
		setZeroes(matrix);*/
		
		//21.Gas Station
		//һ����������n������վ���������ֱ�Ϊgas[i]��һ�����������޵��������Ӽ���վi������վ(i+1)��������Ϊcost[i]
		//������ǰ������Ϊ0����ĳһ������վ��ʼ�������ƻ���һ�ܻص���ʼ�㣬�򷵻���ʼ���±꣬���򷵻�-1����Ψһ
		/*int[] gas = {1,3,1};
		int[] cost = {2,1,2};
		int start = canCompleteCircuit(gas, cost);
		System.out.println("start: " + start);*/
		
		//22.Candy
		//n��С�����ų�һ�У�ÿ��С���Ѷ���һ���ȼ������ڸ�С�����Ƿ��ǹ������ǹ����ٵ������
		//����ÿ��С���������ֵܷ�һ���ǹ������ҵȼ��ϸߵ�С���ѷֵ����ǹ�Ҫ�����ĵȼ��ϵ͵��ھӶ�
		/*int[] ratings1 = {1,5,4,3,2};
		int[] ratings2 = {1,5,4,3,2};
		int candies1 = candy1(ratings1);
		int candies2 = candy2(ratings2);
		System.out.println("candies1: " + candies1);
		System.out.println("candies2: " + candies2);*/
		
		//23.Single Number
		//����һ�����飬���У�����1��Ԫ��֮�⣬����Ԫ�ؾ�����2�Σ��ҳ���Ԫ�أ�Ҫ��ʱ��O(n)���ռ�O(1)
		/*int[] arr = {1,2,3,3,2,1,4};
		int result = singleNumberI(arr);
		System.out.println("result: " + result);*/
		
		//24.Single Number II
		//����һ�����飬���У�����1��Ԫ��֮�⣬����Ԫ�ؾ�����3�Σ��ҳ���Ԫ�أ�Ҫ��ʱ��O(n)���ռ�O(1)
		/*int[] arr = {1,2,3,3,2,1,1,2,3,4,4,4,5};
		int result = singleNumberII(arr);
		System.out.println("result: " + result);*/
		
		//25.Single Number III
		//����һ�����飬���У�����2��Ԫ��֮�⣬����Ԫ�ؾ�����2�Σ��ҳ���2��Ԫ�أ�Ҫ��ʱ��O(n)���ռ�㶨
		/*int[] arr = {1,2,3,3,2,1,4,4,5,5,6,7};
		int[] result = singleNumberIII(arr);
		printArr(result, result.length);*/
	}
	
	//2017-5-4
	//25.Single Number III
	//����һ�����飬���У�����2��Ԫ��֮�⣬����Ԫ�ؾ�����2�Σ��ҳ���2��Ԫ�أ�Ҫ��ʱ��O(n)���ռ�㶨
	//i.e: Given arr=[1,2,3,3,2,1,4,5], return [4,5]
	//��ִ����飬����������Ԫ�ز�ֵ���ͬ���飬���ʹ���������ֱ��ҳ�������Ԫ��
	//���ȶ�����������������㣬�õ�����������Ԫ�ص��������ֵxor
	//��ȡ������Ԫ�ص�32λ�����Ƶĵ�һ����ͬλdiff=xor&(-xor)
	//Ȼ�����������diff�������㣬�ֳ�����������ʱ������Ԫ�ر���ֵ���ͬ����
	//��(arr[i]&diff)==diff����arr[i]���ڵ�һ�飬����arr[i]���ڵڶ���
	//���ʹ���������ֱ��ҳ�������Ԫ��
	public static int[] singleNumberIII(int[] arr) {
		
		int xor = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			xor = xor ^ arr[i];
		}
		
		int diff = xor & (-xor);
		int[] result = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			if((arr[i] & diff) == diff) {
				result[0] = result[0] ^ arr[i];
			} else {
				result[1] = result[1] ^ arr[i];
			}
		}
		
        return result;
    }
	
	//2017-5-4
	//24.Single Number II
	//����һ�����飬���У�����1��Ԫ��֮�⣬����Ԫ�ؾ�����3�Σ��ҳ���Ԫ�أ�Ҫ��ʱ��O(n)���ռ�O(1)
	//i.e: Given arr=[1,2,3,3,2,1,1,2,3,4], return 4
	//��int[]�е�int����Ԫ�أ���ʮ����ת����32λ�Ķ�����
	//������Ԫ�ص�32λ�������ϵĶ�Ӧλ������ͣ��ٶ�3ȡ�࣬��Ϊ��ǰλ����ֵ
	//�����õ���32λ������ת��Ϊʮ���ƣ���Ϊ����Ԫ�ص�ֵ
	public static int singleNumberII(int[] arr) {
		
        int result = 0;
        int bitNum;
		
        for(int i=0; i<32; i++) {
        	bitNum = 0;
        	for(int j=0; j<arr.length; j++) {
        		bitNum += arr[j]>>i & 1;
        	}
        	result += bitNum % 3 << i;
        }
		return result;
    }
	
	//2017-5-4
	//23.Single Number
	//����һ�����飬���У�����1��Ԫ��֮�⣬����Ԫ�ؾ�����2�Σ��ҳ���Ԫ�أ�Ҫ��ʱ��O(n)���ռ�O(1)
	//i.e: Given arr=[1,2,3,3,2,1,4], return 4
	//ʹ��λ���㣺������� XOR
	//���㽻����a^b = b^a�������a^b^c= a^(b^c)
	//��a!=b����a^b==1����a==b����a^b==0������a��0^a==a
	//�������飬������Ԫ����������㣬���Ϊ���γ��ֵ�Ԫ��
	//����������ͬԪ�ؽ���������λ�ã�����������ͬԪ�أ�������(n-1)/2��0���������ʣ��һ����һԪ��
	public static int singleNumberI(int[] arr) {
        
		int result = arr[0];
		for(int i=1; i<arr.length; i++) {
			result = result ^ arr[i];
		}
		return result;
    }	
	
	//2017-5-3
	//22.Candy
	//n��С�����ų�һ�У�ÿ��С���Ѷ���һ���ȼ������ڸ�С�����Ƿ��ǹ������ǹ����ٵ������
	//����ÿ��С���������ֵܷ�һ���ǹ������ҵȼ��ϸߵ�С���ѷֵ����ǹ�Ҫ�������ھӶ�
	//i.e: Given ratings=[1,5,3,3,1], then candies=[1,2,1,2,1], return 7
	//candy1:�ռ�O(n), ʱ��O(n)
	//�ȴ������ұ���ratings����ʼ��candies[0]=1
	//��ratings[i]>ratings[i-1]����candies[i]=candies[i-1]+1������candies[i]=1
	//�ٴ����������ratings
	//��ratings[i]>ratings[i+1]&&candies[i]<=candies[i+1]����candies[i]=candies[i+1]+1
	//���candies[i]�ĺͼ�Ϊ��С�ǹ���
	//candy2:�ռ�O(1), ʱ��O(n)
	//����ratings
	//����ǰ�ȼ�����֮ǰ�ȼ�����ǰ��֮ǰ����һ���ǹ�
	//����ǰ�ȼ�����֮ǰ�ȼ�����ǰֻ��һ���ǹ�
	//����ǰ�ȼ�С��֮ǰ�ȼ����������г���descLen++
	//	��descLenС����һ������ǹ�������ǰ��descLen���ǹ�
	//	��descLen���ڵ�����һ������ǹ�������ǰ��descLen+1���ǹ���+1���ڻز���һ������ǹ���
	//	���������ϣ���ǰ�ȼ��͵�ǰ�����ǹ����Ƿ����ϵ
	//���շ���totalCandies
	public static int candy1(int[] ratings) {
		
		if(ratings.length == 0) return -1;
		if(ratings.length == 1) return 1;
		
		int totalCandies = 0;
		int[] candies = new int[ratings.length];
		candies[0] = 1;
		
		for(int i=1; i<ratings.length; i++) {
			if(ratings[i] > ratings[i-1]) {
				candies[i] = candies[i-1] + 1;
			} else {
				candies[i] = 1;
			}
		}
		for(int i=ratings.length-2; i>=0; i--) {
			if(ratings[i]>ratings[i+1] && candies[i]<=candies[i+1]) {
				candies[i] = candies[i+1] + 1;
			}
		}
		for(int i=0; i<candies.length; i++) {
			totalCandies += candies[i];
		}
		return totalCandies;
    }
	public static int candy2(int[] ratings) {
		
		if(ratings.length == 0) return -1;
		if(ratings.length == 1) return 1;
		
		int totalCandies = 0;
		int descLen = 0;
		
		int lastRating = -1;
		int lastMaxCandies = 0;
		int lastCandies = 0;
		
		for(int i=0; i<ratings.length; i++) {
			
			if(ratings[i] > lastRating) {
				descLen = 0;
				lastCandies++;
				lastMaxCandies = lastCandies;
				totalCandies += lastCandies;
			} else if(ratings[i] == lastRating) {
				descLen = 0;
				lastCandies = 1;
				lastMaxCandies = lastCandies;
				totalCandies += lastCandies;
			} else {
				descLen++;
				lastCandies = 1;
				
				if(descLen < lastMaxCandies) {
					totalCandies += descLen;
				} else {
					totalCandies += descLen + 1;
				}
			}
			
			lastRating = ratings[i];
		}
		return totalCandies;
	}
	 
	//2017-5-2
	//21.Gas Station
	//һ����������n������վ���������ֱ�Ϊgas[i]��һ�����������޵��������Ӽ���վi������վ(i+1)��������Ϊcost[i]
	//������ǰ������Ϊ0������ĳһ������վ��ʼ�����ƻ���һ�ܻص���ʼ�㣬�򷵻���ʼ���±꣬���򷵻�-1����Ψһ
	//i.e: Given gas=[1,3,1], cost=[2,1,2], return 1
	//�����i=0���ۼ�sum+=gas[i]-cost[i]��total+=gas[i]-cost[i]
	//���ۼӵ�i=kʱ��sum<0����˵��0��k������Ϊ��㣨0��k�ۼ�С��0����1��k�ۼ�Ҳһ��С��0��
	//�����Ϊi=k+1������sum=0��������i=n-1����
	//��total<0���򷵻�-1��total<0˵�������������У�������<��������
	//���򷵻�k+1��total>=0�������һ�⣩
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		
		int sum = 0;
		int total = 0;
		int start = -1;
		
		for(int i=0; i<gas.length; i++) {
			
			sum += gas[i] - cost[i];
			total += gas[i] - cost[i];
			
			if(sum < 0) {
				sum = 0;
				start = i;
			}
		}
		
		if(total < 0) return -1;
		
		return start+1;
    }
	
	//2017-5-2
	//20.Set Matrix Zeroes
	//����m*n���󣬽������е�����0Ԫ�����ڵ�������0
	//ʹ�þ����0�к�0�м�¼��1�к�1�п�ʼ�����������0Ԫ�ص�λ��
	//���ж�0�к�0���Ƿ���0Ԫ�أ�������
	//��1�к�1�п�ʼ����������Ԫ��==0������0�к�0���м�¼��0Ԫ��λ��
	//��1�п�ʼ����0�У���Ԫ��==0������и�ֵΪ0
	//��1�п�ʼ����0�У���Ԫ��==0������и�ֵΪ0
	//����ж�0�к�0���Ƿ���Ҫ��0
	public static void setZeroes(int[][] matrix) {
        
		boolean firstRow = false;
		boolean firstCol = false;
		
		for(int i=0; i<matrix[0].length; i++) {
			if(matrix[0][i] == 0) {
				firstRow = true;
				break;
			}
		}
		
		for(int i=0; i<matrix.length; i++) {
			if(matrix[i][0] == 0) {
				firstCol = true;
				break;
			}
		}
		
		for(int i=1; i<matrix.length; i++)
			for(int j=1; j<matrix[i].length; j++)
				if(matrix[i][j] == 0)
					matrix[0][j] = matrix[i][0] = 0;
		
		for(int i=1; i<matrix[0].length; i++)
			if(matrix[0][i] == 0)
				for(int j=1; j<matrix.length; j++)
					matrix[j][i] = 0;
		
		for(int i=1; i<matrix.length; i++)
			if(matrix[i][0] == 0)
				for(int j=1; j<matrix[0].length; j++)
					matrix[i][j] = 0;
		
		if(firstRow)
			for(int i=0; i<matrix[0].length; i++)
				matrix[0][i] = 0;
		
		if(firstCol)
			for(int i=0; i<matrix.length; i++)
				matrix[i][0] = 0;
		
		printMatrix(matrix);
    }
	
	//2017-5-1
	//19.Gray Code
	//����nֵ����nλ������
	//i.e: Given n=2, return [0,1,3,2]
	//00 - 0 
	//01 - 1
	//11 - 3
	//10 - 2
	//nλ�������������ֹ��ɣ���һ������(n-1)λ�����룬�ڶ������� 1<<(n-1)��(n-1)λ�����������ĺ�
	//��¼ʹ�õݹ�
	public static List<Integer> grayCode(int n) {
		
		if(n == 0) {
			List<Integer> result = new ArrayList<Integer>();
			result.add(0);
			return result;
		}
		
		List<Integer> temp = grayCode(n-1);//�ݹ�
		
		List<Integer> result = new ArrayList<Integer>(temp);
		
		int add = 1 << (n-1);//1����(n-1)λ����1����2��(n-1)�η�
		
		for(int i=temp.size()-1; i>=0; i--) {
			result.add(temp.get(i) + add);
		}
		
        return result;
    }
	
	
	//2017-5-1
	//18.Climbing Stairs
	//����n��̨�ף�ÿ��ֻ����1���2�㣬�󵽴ﶥ��Ĳ�ͬ�߷�
	//i.e: Given n=3, return 3
	//n==0���n==1��̨��ֻ��1���߷�
	//��n>=2��̨��ʱ��n��̨���߷���(n-1)��̨���߷���(n-2)��̨���߷�֮��
	public static int climbStairs(int n) {
		
		if(n==0 || n==1) 
			return 1;
		
		int pre = 1;
		int curr = 1;
		int temp;
		
		for(int i=2; i<=n; i++) {
			temp =  curr;
			curr += pre;
			pre = temp;
		}
		
		return curr;
    }
	
	//2017-4-30
	//17.Plus One
	//����һ���������ʾ�������������м�һ����
	//i.e: Given [1,2], return [1,3], Given [9,9], return [1,0,0]
	//������ĩβ��ʼ����
	//��ǰԪ��+1����������10����return
	//������10����ֵ��ǰԪ��=0����һԪ��+1��ѭ������
	//ѭ������������һ��Ԫ��==0������Ҫ�½�����+1�������飬��ֵ��һ��Ԫ��=1��return
	public static int[] plusOne(int[] digits) {
		
		for(int i=digits.length-1; i>=0; i--) {
			digits[i] += 1;
			if(digits[i] != 10) break;
			digits[i] = 0;
		}
		
		if(digits[0] == 0) {
			int[] newDigits = new int[digits.length+1];//���Զ���ʼ��Ϊ0
			newDigits[0] = 1;
			/*for(int j=1; j<newDigits.length; j++)
				newDigits[j] = 0;*/
			return newDigits;
		}
		
		return digits;
    }
	
	//2017-4-30
	//16.Rotate Image
	//����n*n����˳ʱ����ת90��
	//i.e:
	//������ֲ㣬����layerNum=length/2
	//�ֱ������ƶ������У������ƶ������У������ƶ������У������ƶ�������
	//���ڲ�ѭ��������ΪlayerNum
	public static void rotate(int[][] matrix) {
        
		int length = matrix.length;
		int layerNum = length / 2;
		int temp;
		
		for(int layer=0; layer<layerNum; layer++) {
			
			for(int i=layer; i<length-layer-1; i++) {
				
				temp = matrix[layer][i];
				
				matrix[layer][i] = matrix[length-i-1][layer]; 
				
				matrix[length-i-1][layer] = matrix[length-layer-1][length-i-1];
				
				matrix[length-layer-1][length-i-1] = matrix[i][length-layer-1]; 
				
				matrix[i][length-layer-1] = temp;
			}
		}
		
		printMatrix(matrix);
    }
	
	//2017-4-29
	//15.Trapping Rain Water
	//���������İ����ݻ�
	//i.e: Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6
	//�ҳ���������ļ���ֵ
	//�ֱ�����������򼫴�ֵ����
	//����ʱѡ���ֲ�����ֵ��������һ����Сֵ֮���Ϊ��Сֵ�ϵ��ݻ�
	public static int trap(int[] height) {
		
		if(height==null || height.length==0) {
			return 0;
		}
		
		int result = 0;
		int max = height[0];
		int maxIndex = 0;
		
		for(int i=1; i<height.length; i++) {
			if(height[i] > max) {
				max = height[i];
				maxIndex = i;
			}
		}
		
		int max2 = height[0];
		
		for(int i=1; i<maxIndex; i++) {
			if(max2 > height[i]) {
				result += max2 - height[i];
			} else {
				max2 = height[i];
			}
		}
		
		max2 = height[height.length-1];
		
		for(int i=height.length-2; i>maxIndex; i--) {
			if(max2 > height[i]) {
				result += max2 - height[i];
			} else {
				max2 = height[i];
			}
		}
		
		return result;
    }
	
	//2017-4-29
	//14.Valid Sudoku
	//�����������ж����������Ƿ���Ч�������ж��Ƿ��н�
	//i.e:
	//�ֱ��ж��С��С�3*3�����Ƿ����ظ�����
	//boolean[] b = new boolean[9], b[i]��ʼ��Ϊfalse
	//��board[i][j]!='.'ʱ
	//��b[board[i][j]-'1']==true, ��˵�������ظ�����, return false;
	//��b[board[i][j]-'1']==false, ��ֵb[board[i][j]-'1']=true, ѭ������
	//ȫ��������return true;
	public static boolean isValidSudoku(char[][] board) {

		if(board==null || board.length!=9 || board[0].length!=9) {
			return false;
		}
		
		for(int i=0; i<9; i++) {
			
			boolean[] b = new boolean[9];
			
			for(int j=0; j<9; j++) {
				if(board[i][j] != '.') {
					if(b[board[i][j]-'1']) {
						return false;
					} else {
						b[board[i][j]-'1'] = true;
					}
				}
			}
		}
		
		for(int i=0; i<9; i++) {
			
			boolean[] b = new boolean[9];
			
			for(int j=0; j<9; j++) {
				if(board[j][i] != '.') {
					if(b[board[j][i]-'1']) {
						return false;
					} else {
						b[board[j][i]-'1'] = true;
					}
				}
			}
		}
		
		int col = 0;
		boolean[] b = null;
		
		label1:
		for(int i=0; i<9; i++) {
			
			if(i%3 == 0) {
				b = new boolean[9];
			}
			
			label2:
			for(int j=0+col; j<3+col; j++) {
				
				if(board[i][j] != '.') {
					if(b[board[i][j]-'1']) {
						return false;
					} else {
						b[board[i][j]-'1'] = true;
					}
				}
			
				if(i==8 && j==8) {
					
					break label1;
					
				} else if(i==8 && (j+1)%3==0) {
					i = -1;
					col += 3;
					break label2;
				}
			}
		}
		
		return true;
    }
	
	//2017-4-28
	//13.Permutation Sequence
	//����n��k����n!��ȫ���У����ص�k������
	//i.e: Given n=3, return [1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]
	//��ѧ�ⷨ��
	//��n=3, k=3, ��ȡk=k-1=2
	//����һ��Ԫ�ع̶�������(n-1)!=2�����У�arr=[1,2,3]
	//��˵�һ��Ԫ��Ϊarr[k/(n-1)!]=arr[1]=2
	//��ʱk=k%(n-1)!=0
	//���ڶ���Ԫ�ع̶�������(n-2)!=1�����У�arr=[1,3]
	//��˵ڶ���Ԫ��Ϊarr[k/(n-2)!]=arr[0]=1
	//��ʱk=k%(n-2)! = 0
	//��������Ԫ�ع̶�������(n-3)!=1�����У�arr=[3]
	//��˵ڶ���Ԫ��Ϊarr[k/(n-3)!]=arr[0]=3
	//��������Ϊ[2,1,3]
	public static String getPermutation(int n, int k) {
		
		k -= 1;
		int[] arr = new int[n];
		int factorial = 1;
		int index;
		String result = "";
		
		for(int i=0; i<n; i++) {
			arr[i] = i + 1;
			factorial *= i+1; 
		}
		
		for(int i=0; i<n; i++) {
			factorial /= n - i;
			index = k / factorial;
			
			result += arr[index];
			
			for(int j=index; j<n-1; j++) {
				arr[j] = arr[j+1];
			}
			
			k %= factorial;
		}
		return result;
	}
	
	//2017-4-26
	//12.Next Permutation
	//����һ�������һ�����У�����һ������
	//i.e: [1,2,3] return [1,3,2]; [3,2,1] return [1,2,3]; [1,1,5] return [1,5,1];
	//�Ӻ���ǰ�������飬�ҵ���һ����������arr[index]
	//��δ�ҵ�����Ϊ�������У�Ϊ���һ�����У���һ������Ϊ�������У���תԭ���м��ɵõ�����
	//���ҵ�����Ӻ���ǰ�������飬�ҵ���һ����arr[index]�������Ȼ�󻥻�����λ��
	//���������±�index+1��length-1��Ԫ�ص��򼴿ɵõ�����
	public static void nextPermutation(int[] arr) {
        
		int index = -1;
		
		for(int i=arr.length-1; i>0; i--) {
			if(arr[i-1] < arr[i]) {
				index = i-1;
				break;
			}
		}
		
		int l = 0;
		int r = arr.length - 1;;
		int temp;
		
		if(index != -1) {
			for(int j=arr.length-1;; j--) {
				if(arr[index] < arr[j]) {
					temp = arr[index];
					arr[index] = arr[j];
					arr[j] = temp;
					break;
				}
			}
			l = index + 1;
		}
		
		while(l < r) {
			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		
		printArr(arr,arr.length);
    }
	
	//2017-4-26
	//11.Remove Element
	//�ڸ����������У�ɾ�����������ֵ��ȵ���ֵ�������������鳤��length����������ǰlength����Ϊ�������Ԫ��
	//i.e: Given [3,2,2,3], val=3, return length=2, newArray [2,2]
	//�������飬��arr[i]!=val; ��arr[count]=arr[i]; count++;
	//��󷵻�count
	public static int removeElement(int[] arr, int val) {
        
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=val) {
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }
	
	//2017-4-26
	//10.4Sum
	//�ڸ������������ҳ��ĸ���ֵ��������ӵ��ڸ�����ֵ�����������������������������������ظ�
	//i.e: Given [1, 0, -1, 0, -2, 2], target=0, return [[-1, 0, 0, 1], [-2, -1, 1, 2], [-2, 0, 0, 2]]
	//�ⷨ��3Sum���ƣ���Ҫ������һ��ѭ��
	public static List<List<Integer>> fourSum(int[] arr, int target) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		Arrays.sort(arr);
		
		int left;
		int right;
		int sum;
		
		for(int i=0; i<=arr.length-4; i++) {
			
			/*if(arr.length-i < 4) {
				break;
			}*/
			if(i>0 && arr[i]==arr[i-1]) {
				continue;//�ظ�
			}
			
			for(int j=i+1; j<=arr.length-3; j++) {
				
				if(j>i+1 && arr[j]==arr[j-1]) {
					continue;//�ظ�
				}
				
				left = j + 1;
				right = arr.length - 1;
				sum = 0;
				
				while(left < right) {
					
					if(arr[left]>=0 && arr[i]+arr[j]+arr[left]>target) {
						break;
					}
					
					sum = arr[i] + arr[j] + arr[left] + arr[right];
					
					if(sum < target) {
						left++;
						while(left<right && arr[left]==arr[left-1]) {
							left++;//�ظ�
						}
					} else if(sum > target) {
						right--;
						while(left<right && arr[right]==arr[right+1]) {
							right--;//�ظ�
						}
					} else {
						List<Integer> l = new ArrayList<Integer>();
						l.add(arr[i]);
						l.add(arr[j]);
						l.add(arr[left]);
						l.add(arr[right]);
						result.add(l);

						left++;
						while(left<right && arr[left]==arr[left-1]) {
							left++;//�ظ�
						}
					}
				}
			}
		}
		return result;
    }
	
	//2017-4-25
	//9.3Sum Closest
	//�ڸ������������ҳ�������ֵ�����������ӽ��ڸ���ֵ
	//i.e: Given [-1 2 1 -4], target=1, return -1 + 2 + 1 = 2
	//�ȶ������������
	//�������������飬ѡ��i��Ϊ��ǰ�±꣬��arr[i]==arr[i-1]�����ظ���continue
	//ʹ��˫ָ�룬left=i+1��right=length-1
	//����left<right
	//tempResult = arr[i] + arr[left] + arr[right]
	//tempD = tempResult - target
	//��Math.abs(tempD)<minD�������minD=Math.abs(tempD);result = tempResult;
	//�ƶ�ָ��
	//��tempD<0����left++����arr[left]==arr[left-1]��left++��ֱ��arr[left]!=arr[left-1]��continue
	//��tempD>0����right--����arr[right]==arr[right+1]��right--��ֱ��arr[right]!=arr[right+1]��continue
	//��tempD==0����return target;
	//����return result;
	public static int threeSumClosest(int[] arr, int target) {
		
		Arrays.sort(arr);
		
		int left;
		int right;
		int tempD;
		int minD = Integer.MAX_VALUE;
		int tempResult;
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr.length-i < 3) {
				break;
			}
			if(i>0 && arr[i]==arr[i-1]) {
				continue;//�ظ�
			}
			
			left = i + 1;
			right = arr.length - 1;
			
			while(left < right) {
				
				tempResult = arr[i] + arr[left] + arr[right];
				tempD = tempResult - target;
				
				if(Math.abs(tempD) < minD) {
					minD = Math.abs(tempD);
					result = tempResult;
				}
				
				if(tempD < 0) {
					left++;
					while(left<right && arr[left]==arr[left-1]) {
						left++;//�ظ�
					}
				} else if(tempD > 0) {
					right--;
					while(left<right && arr[right]==arr[right+1]) {
						right--;//�ظ�
					}
				} else {
					return target;
				}
			}
		}
		return result;
    }
	
	//2017-4-25
	//8.3Sum
	//�ڸ������������ҳ�������ֵ��������ӵ���0�����������������������������������ظ�
	//i.e: Given [-1, 0, 1, 2, -1, -4], return [[-1, 0, 1], [-1, -1, 2]]
	//�ȶ������������
	//�������������飬ѡ��i��Ϊ��ǰ�±꣬��arr[i]==arr[i-1]�����ظ���continue
	//ʹ��˫ָ�룬left=i+1��right=length-1
	//����left<right��sum = arr[i] + arr[left] + arr[right]
	//��sum<0����left++����arr[left]==arr[left-1]��left++��ֱ��arr[left]!=arr[left-1]��continue
	//��sum>0����right--����arr[right]==arr[right+1]��right--��ֱ��arr[right]!=arr[right+1]��continue
	//��sum==0�����¼arr[i] arr[left] arr[right]
	//�ٽ�left++����arr[left]==arr[left-1]�����ظ���left++��ֱ��arr[left]!=arr[left-1]��continue
	public static List<List<Integer>> threeSum(int[] arr) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		Arrays.sort(arr);
		
		int left;
		int right;
		int sum;
		
		for(int i=0; i<=arr.length-3; i++) {

			/*if(arr.length-i < 3) {
				break;
			}*/
			if(i>0 && arr[i]==arr[i-1]) {
				continue;//�ظ�
			}
			
			left = i+1;
			right = arr.length - 1;
			sum = 0;
			
			while(left < right) {
				
				if(arr[i] + arr[left] > 0) {
					break;
				}
				
				sum = arr[i] + arr[left] + arr[right];
				
				if(sum < 0)	{
					left++;
					while(left<right && arr[left]==arr[left-1]) {
						left++;//�ظ�
					}
					continue;
				} else if(sum > 0) {
					right--;
					while(left<right && arr[right]==arr[right+1]) {
						right--;//�ظ�
					}
					continue;
				} else {
					List<Integer> l = new ArrayList<Integer>();
					l.add(arr[i]);
					l.add(arr[left]);
					l.add(arr[right]);
					result.add(l);

					left++;
					while(left<right && arr[left]==arr[left-1]) {
						left++;//�ظ�
					}
				}
			}
		}
		return result;
    }
	
	//2017-4-24
	//7.Two Sum
	//�ڸ������������ҳ�������ֵ��������ӵ���ָ��ֵ�����������±�
	//i.e: Given [2, 7, 11, 15], target=9, return [0, 1]
	//ʹ��HashMap��ѭ���ж�temp=(target-arr[i])�Ƿ���HashMap��
	//���򷵻�i��temp��Ӧ�±꣬������arr[i]��i����HashMap�У�ѭ������
	public static int[] twoSum(int[] arr, int target) {
		
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			
			int temp = target - arr[i];
			
			if(hashMap.containsKey(temp)) {
				
				if(temp < arr[i]) {
					result[0] = hashMap.get(temp);
					result[1] = i;
					return result;
				} else {
					result[0] = i;
					result[1] = hashMap.get(temp);
					return result;
				}
				
			} else {
				hashMap.put(arr[i], i);
			}
		}
		return null;
    }
	
	//2017-4-23
	//6.Longest Consecutive Sequence
	//��һ��δ���������У��ҳ��������Ԫ�����У������䳤��
	//(i.e: Given [100, 4, 200, 1, 3, 2], The longest consecutive elements sequence is [1, 2, 3, 4].)
	//ʹ��HashSet��Ԫ�أ���˳�����ظ����洢����Ԫ��
	//�������飬�жϣ���ǰԪ��+1���ͣ���ǰԪ��-1���Ƿ���HashSet��
	//�����HashSet��ȥ����Ԫ�أ��������г�+1���ٽ�����ǰԪ��+1���򣨵�ǰԪ��-1����Ϊ��ǰԪ�أ�ѭ������
	//���շ����������г��������
	public static int longestConsecutive(int[] arr) {
		
		if(arr.length == 0) {
			return 0;
		}
		
		Set<Integer> hashSet = new HashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			hashSet.add(arr[i]);
		}
		
		int left;
		int right;
		int max = 1;
		int count;
		
		for(int i=0; i<arr.length; i++) {
			
			left = arr[i] - 1;
			right = arr[i] + 1;
			count = 1;
			
			while(hashSet.contains(left)) {
				hashSet.remove(left);
				left--;
				count++;
			}
			while(hashSet.contains(right)) {
				hashSet.remove(right);
				right++;
				count++;
			}
			
			max = Math.max(max, count);
		}
		
        return max;
    }
	
	
	//2017-4-23
	//5.Median of Two Sorted Arrays
	//�������������������ҳ���λ��
	//i.e: [1 3] and [2], median is 2.0
	//���ַ����ҳ���kСֵ
	//�ٶ��������ܳ�ʱ
	public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
		
		int l1 = arr1.length;
		int l2 = arr2.length;
		int k = (l1 + l2) / 2;
		
		if((l1+l2) % 2 == 1) {
			return fmsa(arr1, arr2, k+1);
		} else {
			double r1 = fmsa(arr1, arr2, k);
			double r2 = fmsa(arr1, arr2, k+1);
			System.out.println(r1);
			System.out.println(r2);
			return (r1 + r2) / 2;
		}
    }
	private static double fmsa(int[] arr1, int[] arr2, int k) {
		
		int l1 = arr1.length;
		int l2 = arr2.length;
		int s1 = 0;
		int s2 = 0;
		int i1;
		int i2;
		
		while(true) {
			
			if(l1 == 0) {
				return arr2[s2 + k - 1];
			}
			if(l2 == 0) {
				return arr1[s1 + k - 1];
			}
			
			if(k == 1) {
				return Math.min(arr1[s1], arr2[s2]);
			}
			
			if(l1 < l2) {
				i1 = Math.min((k/2), l1);
				i2 = k - i1;
			} else {
				i2 = Math.min((k/2), l2);
				i1 = k - i2;
			}
			
			if(arr1[s1 + i1 - 1] < arr2[s2 + i2 - 1]) {
				s1 += i1;
				l1 -= i1;
				k -= i1;
			} else if(arr1[s1 + i1 - 1] > arr2[s2 + i2 - 1]) {
				s2 += i2;
				l2 -= i2;
				k -= i2;
			} else {
				//return Math.min(arr1[s1 + i1 - 1], arr2[s2 + i2 - 1]);
				return arr1[s1 + i1 - 1];
			}
		}
	}
	
	//2017-4-22
	//4.Search in Rotated Sorted Array II
	//����ת������������������Ԫ�أ������п��ܺ����ظ�Ԫ��
	//i.e: [0 1 1 2 4 5 6 7 7] might become [4 5 6 7 7 0 1 1 2]
	//�������ᣬ�ֳ�2��������
	//arr[lower] < arr[mid]
	//arr[lower] > arr[mid]
	public static boolean searchRotatedSorted2(int[] arr, int target) {
		
		int lower = 0;
		int upper = arr.length - 1;
		int mid;
		
		while(true) {
			
			if(lower > upper) { 
				return false;
			}
			
			if(arr[lower] == target || arr[upper] == target) {
				return true;
			}
			
			mid = (lower + upper) / 2;
			
			if(arr[mid] == target) {
				return true;
			}
			
			if(arr[lower] < arr[mid]) {
				
				if(arr[lower]<target && arr[mid]>target) {
					lower += 1;
					upper = mid - 1;
					continue;
					
				} else {
					lower = mid + 1;
					upper -= 1;
					continue;
				}
				
			} else if(arr[lower] > arr[mid]) {
				
				if(arr[mid]<target && arr[upper]>target) {
					lower = mid + 1;
					upper -= 1;
					continue;
					
				} else {
					lower += 1;
					upper = mid - 1;
					continue;
				}
			} else {
				lower++;
			}
		}
	}
	
	//2017-4-21
	//3.Search in Rotated Sorted Array
	//����ת������������������Ԫ��
	//i.e: [0 1 2 4 5 6 7] might become [4 5 6 7 0 1 2]
	//�������ᣬ�ֳ�3��������
	//arr[lower] < arr[upper]
	//arr[lower] < arr[mid]
	//arr[lower] > arr[mid]
	public static int searchRotatedSorted(int[] arr, int target) {
		
		int lower = 0;
		int upper = arr.length - 1;
		int mid;
		
		while(true) {
			
			if(lower > upper) { 
				return -1;
			}
			
			if(arr[lower] == target) {
				return lower;
			} else if(arr[upper] == target) {
				return upper;
			}
			
			mid = (lower + upper) / 2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(arr[lower] < arr[upper]) {
				
				if(arr[lower]>target || arr[upper]<target) {
					return -1;
					
				} else if(arr[mid] > target) {
					lower += 1; 
					upper = mid - 1;
					continue;
					
				} else {
					lower = mid + 1;
					upper -= 1;
					continue;
				}
				
			} else if(arr[lower] < arr[mid]) {
				
				if(arr[lower]<target && arr[mid]>target) {
					lower += 1;
					upper = mid - 1;
					continue;
					
				} else {
					lower = mid + 1;
					upper -= 1;
					continue;
				}
				
			} else {
				
				if(arr[mid]<target && arr[upper]>target) {
					lower = mid + 1;
					upper -= 1;
					continue;
					
				} else {
					lower += 1;
					upper = mid - 1;
					continue;
				}
			}
		}
	}
	
	//2017-4-21
	//2.Remove Duplicates	from Sorted Array II
	//ɾ�������������е��ظ�Ԫ�أ��������2�����ڵ��ظ�Ԫ��
	public static int removeDuplicates2(int[] arr) {
		if (arr.length == 0) return 0;
	    int i = 0;
	    int limit = 2;
	    int count = 1;
	    for (int j=1; j<arr.length; j++) {
	        if (arr[j] == arr[i]) {
	        	if(count < limit) {
	        		count++;
	        		i++;
	        		arr[i] = arr[j];
	        	}
	        } else {
	        	i++;
	            arr[i] = arr[j];
	            count = 1;
	        }
	    }
	    return i + 1;
	}
	
	//2017-4-21
	//1.Remove Duplicates	from Sorted Array
	//ɾ�������������е��ظ�Ԫ��
	public static int removeDuplicates(int[] arr) {
		if (arr.length == 0) return 0;
	    int i = 0;
	    for (int j=1; j<arr.length; j++) {
	        if (arr[j] != arr[i]) {
	            i++;
	            arr[i] = arr[j];
	        }
	    }
	    return i + 1;
    }
	
}
