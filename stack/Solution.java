package stack;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		//1.Valid Parentheses
		//给定一个由'(', ')', '{', '}', '[', ']'组成的字符串，判定其是否为有效括号
		/*String s = "(({}))[]{[()]}";
		boolean result = solution.isValid(s);
		System.out.println("result: " + result);*/
		
		//2.Longest Valid Parentheses
		//给定一个由'(', ')'组成的字符串，找出其中最长的有效括号
		/*String s = "(())()(()(()(()()";
		int result = solution.longestValidParentheses(s);
		System.out.println("result: " + result);*/
		
		//3.Largest Rectangle in Histogram
		//给定n个非负整数，代表宽度为1的矩形的高，找出其中存在的最大矩形并算出其面积
		/*int[] heigths = {4,2,0,3,2,4,3,4};
		int result = solution.largestRectangleArea(heigths);
		System.out.println("result: " + result);*/
		
		//4.Evaluate Reverse Polish Notation
		//逆波兰表达式，即后缀表达式，输出结果
		/*String[] tokens = {"2", "1", "+", "3", "*"};
		int result = solution.evalRPN(tokens);
		System.out.println("result: " + result);*/
	}
	
	//2017-7-24
	//4.Evaluate Reverse Polish Notation
	//逆波兰表达式，即后缀表达式，输出结果
	//["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
	//["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
	//循环遍历
	//	遇到数字则压栈
	//	遇到"+", "-", "*", "/"则弹出两个栈顶元素做相应计算，再将结果压入栈中
    public int evalRPN(String[] tokens) {
        
    	Stack<Integer> stack = new Stack<Integer>();
    	int num1;
    	int num2;
    	
    	for(int i=0; i<tokens.length; i++) {
    		switch (tokens[i]) {
				case "+":
					stack.push(stack.pop() + stack.pop());
					break;
				
				case "-":
					stack.push(-(stack.pop() - stack.pop()));
					break;
				
				case "*":
					stack.push(stack.pop() * stack.pop());
					break;
					
				case "/":
					num1 = stack.pop();
					num2 = stack.pop();
					stack.push(num2 / num1);
					break;
	
				default:
					stack.push(Integer.valueOf(tokens[i]));
					break;
			}
    	}
    	return stack.pop();
    }
	
	//2017-7-24
	//3.Largest Rectangle in Histogram
	//给定n个非负整数，代表宽度为1的矩形的高，找出其中存在的最大矩形并算出其面积
	//For example, given heights = [2,1,5,6,2,3], return 10.
	//			   given heights = [4,2,0,3,2,4,3,4], return 10.
	//使用栈Stack<Integer> stack，维护一个非递减序列
	//即若左<=右，则可以继续向右扩展面积，否则向左清算面积
	//遍历数组h
	//	h[i]下标i进栈
	//	若h[i]<=h[i+1]，则h[i+1]下标i+1进栈，直到h[i]>h[i+1]，或者i=h.length-1
	//	若h[i]>h[i+1]，则左边高度大于右边，即无法向右扩展面积，此时需要向左清算面积
	//		循环查看栈顶元素所对应的数组值peek
	//			若peek>h[i+1]，或者i=h.length-1，则弹出stack栈顶元素作为当前下标curr，直到peek<=h[i+1]
	//				若此时栈顶元素所对应的数组值peek1==peek，则弹出栈顶元素，直到不等
	//					（连续相等的值扩展所得面积相等）
	//				若此时栈空，则起始下标start=0，否则start=此时的栈顶元素+1
	//					（栈中元素越靠近栈底，所对应的值越小）
	//					（即h[curr]>=h[此时的栈顶元素]）
	//					（即h[curr]向左扩展面积，只能扩展到下标为此时的栈顶元素+1处）
	//				计算area = Math.max(area, (i-start+1)*h[curr]);
	//					（i为向右扩展所能到达的下标，因为i对应的值相对最大）
	public int largestRectangleArea(int[] heights) {
        
		if(heights==null || heights.length==0) return 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		int area = 0;
		int startIndex;
		int currIndex;
		
		for(int i=0; i<heights.length; i++) {
			
			stack.push(i);
			if(i<heights.length-1 && heights[i]<=heights[i+1]) {
				continue;
			}
			
			while(!stack.isEmpty() && (i==heights.length-1 || heights[stack.peek()]>heights[i+1])) {
				
				currIndex = stack.pop();
				
				while(!stack.isEmpty() && heights[stack.peek()]==heights[currIndex]) {
					stack.pop();
				}
				
				if(stack.isEmpty()) {
					startIndex = -1;
				} else {
					startIndex = stack.peek();
				}
				
				area = Math.max(area, (i-startIndex)*heights[currIndex]);
			}
		}
		return area;
    }
	
	//2017-7-21
	//2.Longest Valid Parentheses
	//给定一个由'(', ')'组成的字符串，找出其中最长的有效括号
	//"(()", max length = 2
	//"(())()(()((", max length = 6
	//使用Stack<Character> stackC和Stack<Integer> stackI
	//首先去掉字符串前后多余的')'和'('
	//遍历字符串
	//	若当前字符为'('
	//		若栈stackC不空，且上一字符也为'('，则将有效括号长度统计count压入栈stackI
	//		将当前字符'('压入栈stackC
	//	若当前字符为')'
	//		若栈stackC空，则')'没有'('匹配，当前统计结束，比较maxCount和count，更新maxCount
	//		若栈stackC不空，则')'有'('匹配
	//			弹出stackC栈顶元素，更新count += 2
	//			若此时栈stackC和栈stackI中的元素个数不等，则弹出stackI栈顶元素加到count中，直到两栈元素个数相等
	//			（每当有一个连续的左括号'('进栈stackC时，都需要将当前统计count放入栈stackI）
	//			（以此划分最长有效括号长度界限，即防止此'('没有')'匹配）
	//			（因此在当前有效括号长度统计下，两栈中的元素个数总是相等）
	//最后比较maxCount和count，以及栈stackI中的元素，更新maxCount
	public int longestValidParentheses(String s) {
		
		if(s==null || s.length()==0) return 0;
		
		char[] chs = s.toCharArray();
		
		int length = chs.length;
		int begin = 0;
		
		//去掉后面多余'('
		for(int i=chs.length-1; i>=0; i--) {
			if(chs[i] == '(') {
				length--;
			} else {
				break;
			}
		}
		
		if(length <2) return 0;
		
		//去掉前面多余')'
		for(int i=0; i<length; i++) {
			if(chs[i] == ')') {
				begin++;
			} else {
				break;
			}
		}
		
		if(length - begin < 2) return 0;
		
		Stack<Character> stackC = new Stack<Character>();
		Stack<Integer> stackI = new Stack<Integer>();
		
		int maxCount = 0;
		int count = 0;
		char lastC = ' ';
		
		for(int i=begin; i<length; i++) {
			
			if(chs[i] == '(') {
				if(!stackC.isEmpty() && lastC=='(') {
					stackI.push(count);
					count = 0;
				}
				stackC.push(chs[i]);
				
			} else {
				if(stackC.isEmpty()) {
					if(maxCount < count) {
						maxCount = count;
					}
					count = 0;
				
				} else {
					stackC.pop();
					count += 2;
					while(!stackI.isEmpty() && stackC.size()!=stackI.size()) {
						count += stackI.pop();
					}
				}
			}
			lastC = chs[i];
		}
		
		if(maxCount < count) {
			maxCount = count;
		}
		
		while(!stackI.isEmpty()) {
			count = stackI.pop();
			//System.out.println(count + " stackI.pop" );
			if(maxCount < count) {
				maxCount = count;
			}
		}
		
        return maxCount;
    }
	
	//2017-7-20
	//1.Valid Parentheses
	//给定一个由'(', ')', '{', '}', '[', ']'组成的字符串，判定其是否为有效括号
	//For example: "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	//若为'(', '[', '{'则进栈
	//若为')', ']', '}'则弹出栈顶元素进行比较，若空栈或不匹配，则return false
	//最后栈不空则return false，否则return true
	public boolean isValid(String s) {
		
		if(s==null || s.length()==0) return false;
		
		Stack<Character> stack = new Stack<Character>();
		char[] chs = s.toCharArray();
		
		for(int i=0; i<chs.length; i++) {
			switch (chs[i]) {
				case ')':
					if(stack.isEmpty() || stack.pop() != '(') {
						return false;
					}
					break;
				
				case ']':
					if(stack.isEmpty() || stack.pop() != '[') {
						return false;
					}
					break;
					
				case '}':
					if(stack.isEmpty() || stack.pop() != '{') {
						return false;
					}
					break;
						
				default:
					stack.push(chs[i]);
					break;
			}
		}
		
		if(!stack.isEmpty()) {
			return false;
		}
		
        return true;
    }
	
}
