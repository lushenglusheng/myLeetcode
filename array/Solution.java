package array;

import java.util.*;

public class Solution {
	
	//打印数组
	public static void printArr(int[] arr, int size) {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	//打印矩阵
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
		//删除已排序数组中的重复元素
		/*int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7};
		int result = removeDuplicates(arr);
		printArr(arr, result);
		System.out.print(result);*/
		
		//2.Remove Duplicates	from Sorted Array II
		//删除已排序数组中的重复元素，允许2个以内的重复元素
		/*int[] arr = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3};
		int result = removeDuplicates2(arr);
		printArr(arr, result);
		System.out.println(result);*/
		
		//3.Search in Rotated Sorted Array
		//在旋转的已排序数组中搜索元素
		/*int[] arr = {4, 5, 6, 7, 8, 9, 11, 14, 16, 0, 1, 2, 3};
		int key = 1;
		int result = searchRotatedSorted(arr, key);
		if(result == -1) {
			System.out.println("Can not find key " + key);
		} else {
			System.out.println("Found key " + key);
		}*/
		
		//4.Search in Rotated Sorted Array II
		//在旋转的已排序数组中搜索元素，数组中可能含有重复元素
		/*int[] arr = {1, 3, 1, 1, 1};
		int key = 3;
		boolean result = searchRotatedSorted2(arr, key);
		if(result) {
			System.out.println("Found key " + key);
		} else {
			System.out.println("Can not find key " + key);
		}*/
		
		//5.Median of Two Sorted Arrays
		//在两个已排序数组中找出中位数
		/*int[] arr1 = {1, 2};
		int[] arr2 = {1, 2};
		double median = findMedianSortedArrays(arr1, arr2);
		System.out.println("The median is " + median);*/
		
		//6.Longest Consecutive Sequence
		//在一个未排序数组中，找出最长的连续元素序列，返回其长度
		/*int[] arr = {100, 4, 200, 1, 3, 2};
		int result = longestConsecutive(arr);
		System.out.println("Longest Consecutive Sequence Length " + result);*/
		
		//7.Two Sum
		//在给定的数组中找出两个数值，两数相加等于指定值
		/*int[] arr = {2, 7, 11, 15};
		int target = 9;
		int[] result = twoSum(arr, target);
		System.out.println(target + "=" + arr[result[0]] + "+" + arr[result[1]]);*/
		
		//8.3Sum
		//在给定的数组中找出三个数值，三数相加等于0，给出所有满足条件的组合情况
		/*int[] arr = {0,0,0,0};
		List<List<Integer>> result = threeSum(arr);
		for(List l : result) {
			System.out.println(l);
		}*/
		
		//9.3Sum Closest
		//在给定的数组中找出三个数值，三数相加最接近于给定值
		/*int[] arr = {-1, 2, 1, -4};
		int target = 1;
		int result = threeSumClosest(arr, target);
		System.out.println("target=" + target + " result=" + result);*/
		
		//10.4Sum
		//在给定的数组中找出四个数值，四数相加等于给定数值，给出所有满足条件的组合情况，不允许重复
		/*int[] arr = {0, 0, 0, 0};
		int target = 0;
		List<List<Integer>> result = fourSum(arr, target);
		for(List l : result) {
			System.out.println(l);
		}*/
		
		//11.Remove Element
		//在给定的数组中，删除所有与给定值相等的数值，并返回新数组长度length，且新数组前length个数为新数组的元素
		/*int[] arr = {3,2,2,3};
		int val = 3;
		int result = removeElement(arr, val);
		System.out.print("resutl=" + result);*/
		
		//12.Next Permutation
		//给定一个数组和一个排列，求下一个排列
		/*int[] arr = {1,2,3};
		nextPermutation(arr);*/
		
		//13.Permutation Sequence
		//给定n和k，求n!的全排列，返回第k个排列
		/*int n = 3;
		int k = 1;
		String result = getPermutation(n, k);
		System.out.println(result);*/
		
		//14.Valid Sudoku
		//在给定数独中，判断所填数字是否有效，无需判断数独是否有解
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
		//求给定数组的凹槽容积
		/*int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int result = trap(height);
		System.out.println("result: " + result);*/
		
		//16.Rotate Image
		//给定n*n矩阵，顺时针旋转90度
		/*int[][] matrix = {{1,2,3,4,5},
						  {6,7,8,9,10},
						  {11,12,13,14,15},
						  {16,17,18,19,20},
						  {21,22,23,24,25},
						 };
		printMatrix(matrix);
		rotate(matrix);*/
		
		//17.Plus One
		//给定一个用数组表示的一个数，对它进行加一操作
		/*int[] digits = {9,9};
		int[] result = plusOne(digits);
		printArr(result, result.length);*/
		
		//18.Climbing Stairs
		//给定n层台阶，每步只能走1层或2层，求到达顶层的不同走法
		/*int n = 3;
		int result = climbStairs(n);
		System.out.println("result: " + result);*/
		
		//19.Gray Code
		//给定n值，求n位格雷码
		/*int n = 3;
		List<Integer> result = grayCode(n);
		System.out.println(result);*/
		
		//20.Set Matrix Zeroes
		//给定m*n矩阵，将矩阵中的所有0元素所在行列置0
		/*int[][] matrix = {{1,2,3,4},
						  {1,2,3,4},
						  {1,2,3,0},
						 };
		setZeroes(matrix);*/
		
		//21.Gas Station
		//一个环形上有n个加油站，储油量分别为gas[i]，一辆储油量无限的汽车，从加油站i到加油站(i+1)，耗油量为cost[i]
		//汽车当前储油量为0，从某一个加油站开始，若能绕环形一周回到起始点，则返回起始点下标，否则返回-1，答案唯一
		/*int[] gas = {1,3,1};
		int[] cost = {2,1,2};
		int start = canCompleteCircuit(gas, cost);
		System.out.println("start: " + start);*/
		
		//22.Candy
		//n个小朋友排成一列，每个小朋友都有一个等级，现在给小朋友们发糖果，在糖果最少的情况下
		//满足每个小朋友至少能分到一颗糖果，而且等级较高的小朋友分到的糖果要比他的等级较低的邻居多
		/*int[] ratings1 = {1,5,4,3,2};
		int[] ratings2 = {1,5,4,3,2};
		int candies1 = candy1(ratings1);
		int candies2 = candy2(ratings2);
		System.out.println("candies1: " + candies1);
		System.out.println("candies2: " + candies2);*/
		
		//23.Single Number
		//给定一个数组，其中，除了1个元素之外，其他元素均出现2次，找出此元素，要求时间O(n)，空间O(1)
		/*int[] arr = {1,2,3,3,2,1,4};
		int result = singleNumberI(arr);
		System.out.println("result: " + result);*/
		
		//24.Single Number II
		//给定一个数组，其中，除了1个元素之外，其他元素均出现3次，找出此元素，要求时间O(n)，空间O(1)
		/*int[] arr = {1,2,3,3,2,1,1,2,3,4,4,4,5};
		int result = singleNumberII(arr);
		System.out.println("result: " + result);*/
		
		//25.Single Number III
		//给定一个数组，其中，除了2个元素之外，其他元素均出现2次，找出此2个元素，要求时间O(n)，空间恒定
		/*int[] arr = {1,2,3,3,2,1,4,4,5,5,6,7};
		int[] result = singleNumberIII(arr);
		printArr(result, result.length);*/
	}
	
	//2017-5-4
	//25.Single Number III
	//给定一个数组，其中，除了2个元素之外，其他元素均出现2次，找出此2个元素，要求时间O(n)，空间恒定
	//i.e: Given arr=[1,2,3,3,2,1,4,5], return [4,5]
	//拆分此数组，即将这两个元素拆分到不同的组，最后使用异或运算分别找出这两个元素
	//首先对整个数组做异或运算，得到的是这两个元素的异或运算值xor
	//获取这两个元素的32位二进制的第一个不同位diff=xor&(-xor)
	//然后将整个数组和diff做与运算，分成两组数，此时这两个元素被拆分到不同的组
	//若(arr[i]&diff)==diff，则arr[i]分在第一组，否则arr[i]分在第二组
	//最后使用异或运算分别找出这两个元素
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
	//给定一个数组，其中，除了1个元素之外，其他元素均出现3次，找出此元素，要求时间O(n)，空间O(1)
	//i.e: Given arr=[1,2,3,3,2,1,1,2,3,4], return 4
	//将int[]中的int整型元素，从十进制转化成32位的二进制
	//对所有元素的32位二进制上的对应位进行求和，再对3取余，作为当前位的数值
	//将最后得到的32位二进制转化为十进制，即为所求元素的值
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
	//给定一个数组，其中，除了1个元素之外，其他元素均出现2次，找出此元素，要求时间O(n)，空间O(1)
	//i.e: Given arr=[1,2,3,3,2,1,4], return 4
	//使用位运算：异或运算 XOR
	//满足交换率a^b = b^a，结合律a^b^c= a^(b^c)
	//若a!=b，则a^b==1，若a==b，则a^b==0，任意a有0^a==a
	//遍历数组，对所有元素做异或运算，结果为单次出现的元素
	//即将所有相同元素交换至相邻位置，首先运算相同元素，则会产生(n-1)/2个0异或积，最后剩余一个单一元素
	public static int singleNumberI(int[] arr) {
        
		int result = arr[0];
		for(int i=1; i<arr.length; i++) {
			result = result ^ arr[i];
		}
		return result;
    }	
	
	//2017-5-3
	//22.Candy
	//n个小朋友排成一列，每个小朋友都有一个等级，现在给小朋友们发糖果，在糖果最少的情况下
	//满足每个小朋友至少能分到一颗糖果，而且等级较高的小朋友分到的糖果要比他的邻居多
	//i.e: Given ratings=[1,5,3,3,1], then candies=[1,2,1,2,1], return 7
	//candy1:空间O(n), 时间O(n)
	//先从左往右遍历ratings，初始化candies[0]=1
	//若ratings[i]>ratings[i-1]，则candies[i]=candies[i-1]+1，否则candies[i]=1
	//再从右往左遍历ratings
	//若ratings[i]>ratings[i+1]&&candies[i]<=candies[i+1]，则candies[i]=candies[i+1]+1
	//最后candies[i]的和即为最小糖果数
	//candy2:空间O(1), 时间O(n)
	//遍历ratings
	//若当前等级大于之前等级，则当前比之前多拿一个糖果
	//若当前等级等于之前等级，则当前只拿一个糖果
	//若当前等级小于之前等级，则降序序列长度descLen++
	//	若descLen小于上一个最大糖果数，则当前拿descLen个糖果
	//	若descLen大于等于上一个最大糖果数，则当前拿descLen+1个糖果，+1用于回补上一个最大糖果数
	//	降序序列上，当前等级和当前所拿糖果数是反序关系
	//最终返回totalCandies
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
	//一个环形上有n个加油站，储油量分别为gas[i]，一辆储油量无限的汽车，从加油站i到加油站(i+1)，耗油量为cost[i]
	//汽车当前储油量为0，若从某一个加油站开始，能绕环形一周回到起始点，则返回起始点下标，否则返回-1，答案唯一
	//i.e: Given gas=[1,3,1], cost=[2,1,2], return 1
	//设起点i=0，累加sum+=gas[i]-cost[i]，total+=gas[i]-cost[i]
	//若累加到i=k时，sum<0，则说明0到k不能作为起点（0到k累加小于0，则1到k累加也一定小于0）
	//起点设为i=k+1，重置sum=0，遍历到i=n-1结束
	//若total<0，则返回-1（total<0说明在整个环形中，储油量<耗油量）
	//否则返回k+1（total>=0，则必有一解）
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
	//给定m*n矩阵，将矩阵中的所有0元素所在的行列置0
	//使用矩阵的0行和0列记录从1行和1列开始的整个矩阵的0元素的位置
	//先判断0行和0列是否有0元素，有则标记
	//从1行和1列开始遍历矩阵，若元素==0，则在0行和0列中记录该0元素位置
	//从1列开始遍历0行，若元素==0，则此列赋值为0
	//从1行开始遍历0列，若元素==0，则此行赋值为0
	//最后判断0行和0列是否需要置0
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
	//给定n值，求n位格雷码
	//i.e: Given n=2, return [0,1,3,2]
	//00 - 0 
	//01 - 1
	//11 - 3
	//10 - 2
	//n位格雷码由两部分构成，第一部分是(n-1)位格雷码，第二部分是 1<<(n-1)与(n-1)位格雷码的逆序的和
	//考录使用递归
	public static List<Integer> grayCode(int n) {
		
		if(n == 0) {
			List<Integer> result = new ArrayList<Integer>();
			result.add(0);
			return result;
		}
		
		List<Integer> temp = grayCode(n-1);//递归
		
		List<Integer> result = new ArrayList<Integer>(temp);
		
		int add = 1 << (n-1);//1左移(n-1)位，即1乘以2的(n-1)次方
		
		for(int i=temp.size()-1; i>=0; i--) {
			result.add(temp.get(i) + add);
		}
		
        return result;
    }
	
	
	//2017-5-1
	//18.Climbing Stairs
	//给定n层台阶，每步只能走1层或2层，求到达顶层的不同走法
	//i.e: Given n=3, return 3
	//n==0层和n==1层台阶只有1种走法
	//当n>=2层台阶时，n层台阶走法是(n-1)层台阶走法与(n-2)层台阶走法之和
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
	//给定一个用数组表示的数，对它进行加一操作
	//i.e: Given [1,2], return [1,3], Given [9,9], return [1,0,0]
	//从数组末尾开始遍历
	//当前元素+1，若不等于10，则return
	//若等于10，则赋值当前元素=0，下一元素+1，循环继续
	//循环结束后，若第一个元素==0，则需要新建长度+1的新数组，赋值第一个元素=1，return
	public static int[] plusOne(int[] digits) {
		
		for(int i=digits.length-1; i>=0; i--) {
			digits[i] += 1;
			if(digits[i] != 10) break;
			digits[i] = 0;
		}
		
		if(digits[0] == 0) {
			int[] newDigits = new int[digits.length+1];//已自动初始化为0
			newDigits[0] = 1;
			/*for(int j=1; j<newDigits.length; j++)
				newDigits[j] = 0;*/
			return newDigits;
		}
		
		return digits;
    }
	
	//2017-4-30
	//16.Rotate Image
	//给定n*n矩阵，顺时针旋转90度
	//i.e:
	//将矩阵分层，层数layerNum=length/2
	//分别将上行移动到右列，右列移动到下行，下行移动到左列，左列移动到上行
	//往内层循环次数即为layerNum
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
	//求给定数组的凹槽容积
	//i.e: Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6
	//找出给定数组的极大值
	//分别从数组两边向极大值遍历
	//遍历时选出局部极大值，其与下一个较小值之差，即为较小值上的容积
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
	//给定数独，判断所填数字是否有效，无需判断是否有解
	//i.e:
	//分别判断行、列、3*3矩阵是否有重复数字
	//boolean[] b = new boolean[9], b[i]初始化为false
	//当board[i][j]!='.'时
	//若b[board[i][j]-'1']==true, 则说明存在重复数字, return false;
	//若b[board[i][j]-'1']==false, 则赋值b[board[i][j]-'1']=true, 循环继续
	//全部满足则return true;
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
	//给定n和k，求n!的全排列，返回第k个排列
	//i.e: Given n=3, return [1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]
	//数学解法：
	//设n=3, k=3, 则取k=k-1=2
	//若第一个元素固定，则有(n-1)!=2个排列，arr=[1,2,3]
	//因此第一个元素为arr[k/(n-1)!]=arr[1]=2
	//此时k=k%(n-1)!=0
	//若第二个元素固定，则有(n-2)!=1个排列，arr=[1,3]
	//因此第二个元素为arr[k/(n-2)!]=arr[0]=1
	//此时k=k%(n-2)! = 0
	//若第三个元素固定，则有(n-3)!=1个排列，arr=[3]
	//因此第二个元素为arr[k/(n-3)!]=arr[0]=3
	//最终排列为[2,1,3]
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
	//给定一个数组和一个排列，求下一个排列
	//i.e: [1,2,3] return [1,3,2]; [3,2,1] return [1,2,3]; [1,1,5] return [1,5,1];
	//从后往前遍历数组，找到第一个非升序数arr[index]
	//若未找到，则为降序序列，为最后一个排列，下一个排列为升序排列，反转原序列即可得到所求
	//若找到，则从后往前遍历数组，找到第一个比arr[index]大的数，然后互换两数位置
	//最后把数组下标index+1到length-1的元素倒序即可得到所求
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
	//在给定的数组中，删除所有与给定值相等的数值，并返回新数组长度length，且新数组前length个数为新数组的元素
	//i.e: Given [3,2,2,3], val=3, return length=2, newArray [2,2]
	//遍历数组，若arr[i]!=val; 则arr[count]=arr[i]; count++;
	//最后返回count
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
	//在给定的数组中找出四个数值，四数相加等于给定数值，给出所有满足条件的组合情况，不允许重复
	//i.e: Given [1, 0, -1, 0, -2, 2], target=0, return [[-1, 0, 0, 1], [-2, -1, 1, 2], [-2, 0, 0, 2]]
	//解法与3Sum相似，需要往外套一层循环
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
				continue;//重复
			}
			
			for(int j=i+1; j<=arr.length-3; j++) {
				
				if(j>i+1 && arr[j]==arr[j-1]) {
					continue;//重复
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
							left++;//重复
						}
					} else if(sum > target) {
						right--;
						while(left<right && arr[right]==arr[right+1]) {
							right--;//重复
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
							left++;//重复
						}
					}
				}
			}
		}
		return result;
    }
	
	//2017-4-25
	//9.3Sum Closest
	//在给定的数组中找出三个数值，三数相加最接近于给定值
	//i.e: Given [-1 2 1 -4], target=1, return -1 + 2 + 1 = 2
	//先对数组进行排序
	//遍历已排序数组，选择i作为当前下标，若arr[i]==arr[i-1]，则重复，continue
	//使用双指针，left=i+1，right=length-1
	//遍历left<right
	//tempResult = arr[i] + arr[left] + arr[right]
	//tempD = tempResult - target
	//若Math.abs(tempD)<minD，则更新minD=Math.abs(tempD);result = tempResult;
	//移动指针
	//若tempD<0，则left++，若arr[left]==arr[left-1]，left++，直到arr[left]!=arr[left-1]，continue
	//若tempD>0，则right--，若arr[right]==arr[right+1]，right--，直到arr[right]!=arr[right+1]，continue
	//若tempD==0，则return target;
	//最终return result;
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
				continue;//重复
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
						left++;//重复
					}
				} else if(tempD > 0) {
					right--;
					while(left<right && arr[right]==arr[right+1]) {
						right--;//重复
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
	//在给定的数组中找出三个数值，三数相加等于0，给出所有满足条件的组合情况，不允许重复
	//i.e: Given [-1, 0, 1, 2, -1, -4], return [[-1, 0, 1], [-1, -1, 2]]
	//先对数组进行排序
	//遍历已排序数组，选择i作为当前下标，若arr[i]==arr[i-1]，则重复，continue
	//使用双指针，left=i+1，right=length-1
	//遍历left<right，sum = arr[i] + arr[left] + arr[right]
	//若sum<0，则left++，若arr[left]==arr[left-1]，left++，直到arr[left]!=arr[left-1]，continue
	//若sum>0，则right--，若arr[right]==arr[right+1]，right--，直到arr[right]!=arr[right+1]，continue
	//若sum==0，则记录arr[i] arr[left] arr[right]
	//再将left++，若arr[left]==arr[left-1]，则重复，left++，直到arr[left]!=arr[left-1]，continue
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
				continue;//重复
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
						left++;//重复
					}
					continue;
				} else if(sum > 0) {
					right--;
					while(left<right && arr[right]==arr[right+1]) {
						right--;//重复
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
						left++;//重复
					}
				}
			}
		}
		return result;
    }
	
	//2017-4-24
	//7.Two Sum
	//在给定的数组中找出两个数值，两数相加等于指定值，返回两数下标
	//i.e: Given [2, 7, 11, 15], target=9, return [0, 1]
	//使用HashMap，循环判断temp=(target-arr[i])是否在HashMap中
	//在则返回i和temp对应下标，不在则将arr[i]和i放入HashMap中，循环继续
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
	//在一个未排序数组中，找出最长的连续元素序列，返回其长度
	//(i.e: Given [100, 4, 200, 1, 3, 2], The longest consecutive elements sequence is [1, 2, 3, 4].)
	//使用HashSet（元素：无顺序，无重复）存储数组元素
	//遍历数组，判断（当前元素+1）和（当前元素-1）是否在HashSet中
	//在则从HashSet中去除此元素，连续序列长+1，再将（当前元素+1）或（当前元素-1）作为当前元素，循环遍历
	//最终返回连续序列长的最大者
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
	//在两个已排序数组中找出中位数
	//i.e: [1 3] and [2], median is 2.0
	//二分法，找出第k小值
	//速度慢，可能超时
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
	//在旋转的已排序数组中搜索元素，数组中可能含有重复元素
	//i.e: [0 1 1 2 4 5 6 7 7] might become [4 5 6 7 7 0 1 1 2]
	//画坐标轴，分成2种情况求解
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
	//在旋转的已排序数组中搜索元素
	//i.e: [0 1 2 4 5 6 7] might become [4 5 6 7 0 1 2]
	//画坐标轴，分成3种情况求解
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
	//删除已排序数组中的重复元素，允许存在2个以内的重复元素
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
	//删除已排序数组中的重复元素
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
