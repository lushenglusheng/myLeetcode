package stack;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		//1.Valid Parentheses
		//����һ����'(', ')', '{', '}', '[', ']'��ɵ��ַ������ж����Ƿ�Ϊ��Ч����
		/*String s = "(({}))[]{[()]}";
		boolean result = solution.isValid(s);
		System.out.println("result: " + result);*/
		
		//2.Longest Valid Parentheses
		//����һ����'(', ')'��ɵ��ַ������ҳ����������Ч����
		/*String s = "(())()(()(()(()()";
		int result = solution.longestValidParentheses(s);
		System.out.println("result: " + result);*/
		
		//3.Largest Rectangle in Histogram
		//����n���Ǹ�������������Ϊ1�ľ��εĸߣ��ҳ����д��ڵ������β���������
		/*int[] heigths = {4,2,0,3,2,4,3,4};
		int result = solution.largestRectangleArea(heigths);
		System.out.println("result: " + result);*/
		
		//4.Evaluate Reverse Polish Notation
		//�沨�����ʽ������׺���ʽ��������
		/*String[] tokens = {"2", "1", "+", "3", "*"};
		int result = solution.evalRPN(tokens);
		System.out.println("result: " + result);*/
	}
	
	//2017-7-24
	//4.Evaluate Reverse Polish Notation
	//�沨�����ʽ������׺���ʽ��������
	//["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
	//["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
	//ѭ������
	//	����������ѹջ
	//	����"+", "-", "*", "/"�򵯳�����ջ��Ԫ������Ӧ���㣬�ٽ����ѹ��ջ��
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
	//����n���Ǹ�������������Ϊ1�ľ��εĸߣ��ҳ����д��ڵ������β���������
	//For example, given heights = [2,1,5,6,2,3], return 10.
	//			   given heights = [4,2,0,3,2,4,3,4], return 10.
	//ʹ��ջStack<Integer> stack��ά��һ���ǵݼ�����
	//������<=�ң�����Լ���������չ��������������������
	//��������h
	//	h[i]�±�i��ջ
	//	��h[i]<=h[i+1]����h[i+1]�±�i+1��ջ��ֱ��h[i]>h[i+1]������i=h.length-1
	//	��h[i]>h[i+1]������߸߶ȴ����ұߣ����޷�������չ�������ʱ��Ҫ�����������
	//		ѭ���鿴ջ��Ԫ������Ӧ������ֵpeek
	//			��peek>h[i+1]������i=h.length-1���򵯳�stackջ��Ԫ����Ϊ��ǰ�±�curr��ֱ��peek<=h[i+1]
	//				����ʱջ��Ԫ������Ӧ������ֵpeek1==peek���򵯳�ջ��Ԫ�أ�ֱ������
	//					��������ȵ�ֵ��չ���������ȣ�
	//				����ʱջ�գ�����ʼ�±�start=0������start=��ʱ��ջ��Ԫ��+1
	//					��ջ��Ԫ��Խ����ջ�ף�����Ӧ��ֵԽС��
	//					����h[curr]>=h[��ʱ��ջ��Ԫ��]��
	//					����h[curr]������չ�����ֻ����չ���±�Ϊ��ʱ��ջ��Ԫ��+1����
	//				����area = Math.max(area, (i-start+1)*h[curr]);
	//					��iΪ������չ���ܵ�����±꣬��Ϊi��Ӧ��ֵ������
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
	//����һ����'(', ')'��ɵ��ַ������ҳ����������Ч����
	//"(()", max length = 2
	//"(())()(()((", max length = 6
	//ʹ��Stack<Character> stackC��Stack<Integer> stackI
	//����ȥ���ַ���ǰ������')'��'('
	//�����ַ���
	//	����ǰ�ַ�Ϊ'('
	//		��ջstackC���գ�����һ�ַ�ҲΪ'('������Ч���ų���ͳ��countѹ��ջstackI
	//		����ǰ�ַ�'('ѹ��ջstackC
	//	����ǰ�ַ�Ϊ')'
	//		��ջstackC�գ���')'û��'('ƥ�䣬��ǰͳ�ƽ������Ƚ�maxCount��count������maxCount
	//		��ջstackC���գ���')'��'('ƥ��
	//			����stackCջ��Ԫ�أ�����count += 2
	//			����ʱջstackC��ջstackI�е�Ԫ�ظ������ȣ��򵯳�stackIջ��Ԫ�ؼӵ�count�У�ֱ����ջԪ�ظ������
	//			��ÿ����һ��������������'('��ջstackCʱ������Ҫ����ǰͳ��count����ջstackI��
	//			���Դ˻������Ч���ų��Ƚ��ޣ�����ֹ��'('û��')'ƥ�䣩
	//			������ڵ�ǰ��Ч���ų���ͳ���£���ջ�е�Ԫ�ظ���������ȣ�
	//���Ƚ�maxCount��count���Լ�ջstackI�е�Ԫ�أ�����maxCount
	public int longestValidParentheses(String s) {
		
		if(s==null || s.length()==0) return 0;
		
		char[] chs = s.toCharArray();
		
		int length = chs.length;
		int begin = 0;
		
		//ȥ���������'('
		for(int i=chs.length-1; i>=0; i--) {
			if(chs[i] == '(') {
				length--;
			} else {
				break;
			}
		}
		
		if(length <2) return 0;
		
		//ȥ��ǰ�����')'
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
	//����һ����'(', ')', '{', '}', '[', ']'��ɵ��ַ������ж����Ƿ�Ϊ��Ч����
	//For example: "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	//��Ϊ'(', '[', '{'���ջ
	//��Ϊ')', ']', '}'�򵯳�ջ��Ԫ�ؽ��бȽϣ�����ջ��ƥ�䣬��return false
	//���ջ������return false������return true
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
