package String;

import java.math.BigInteger;
import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		
		//1.Valid Palindrome
		//给定字符串，判断其是否为有效回文，只考虑字母和数字的字符，忽略大小写
		/*String s1 = "A man, a plan, a canal: Panama";
		String s2 = "!!!a";
		boolean result1 = isPalindrome(s1);
		boolean result2 = isPalindrome(s2);
		System.out.println(result1 + " " + result2);*/
		
		//2.Implement strStr()
		//给定两个字符串str1和str2，判断str2是否为str1的子串，是则返回srt2在str1中的下标，否则返回-1
		/*String haystack = "acacabbaaaababa";
		String needle = "bbaaaababa";
		int result = strStr(haystack, needle);
		System.out.println("result: " + result);*/
		
		//3.String to Integer (atoi)
		//将字符串转为整形
		/*String str = "-00123aa321";
		int result = myAtoi(str);
		System.out.println("result: " + result);*/
		
		//4.Add Binary
		//给定两个字符串表示的二进制，求和
		/*String a = "1";
		String b = "111";
		String result = addBinary(a, b);
		System.out.println("result: " + result);*/
		
		//5.Longest Palindromic Substring
		//给定字符串，找到其中最长的有效回文
		/*String s = "abbac";
		String result = longestPalindrome(s);
		System.out.println("result: " + result); */
		
		//6.Regular Expression Matching
		//正则表达式匹配，'.' Matches any single character. '*' Matches zero or more of the preceding element.
		/*String s = "aab";
		String p = "c*a*ab";
		boolean result = isMatch(s, p);
		System.out.println("result: " + result);*/
		
		//7.Wildcard Matching
		//正则表达式匹配，'?' Matches any single character. '*' Matches any sequence of characters (including the empty sequence).
		/*String s = "aabcccabd";
		String p = "a*abd";
		boolean result = isMatch2(s, p);
		System.out.println("result: " + result);*/
		
		//8.Longest Common Prefix
		//给定字符串数组strs[]，找出strs[]中的所有字符串的最长公共前缀
		/*String[] strs = {"abcdd","abc","abb","abcd"};
		String result = longestCommonPrefix(strs);
		System.out.println("result: " + result);*/
		
		//9.Valid Number
		//给定字符串，判断其是否为合法数字
		/*String s = "0.1e0.1 ";
		boolean result = isNumber(s);
		System.out.println("result: " + result);*/
		
		//10.Integer to Roman
		//给定整形数字，将其转换为罗马字符
		/*int num = 998;
		String result = intToRoman(num);
		System.out.println("result: " + result);*/
		
		//11.Roman to Integer
		//给定罗马字符，将其转换为数字
		/*String s = "CDXCVIII";
		int result = romanToInt(s);
		System.out.println("result: " + result);*/
		
		//12.Count and Say
		//给定n，输出第n个序列
		/*int n = 6;
		String result = countAndSay(n);
		System.out.println("result: " + result);*/
		
		//13.Group Anagrams
		//给定一个字符串数组，将颠倒字母而组成的单词分在一组
		/*String[] strs = {"eat", "te", "tan", "att", "ate", "nat", "bat", "pup", "pup"};
		List<List<String>> resultList = groupAnagrams(strs);
		for(List<String> list : resultList) {
			System.out.println(list);
		}*/
		
		//14.Simplify Path
		//给定一个绝对路径地址，将其简化
		/*String path = "/a/./b/../../c/";
		String result = simplifyPath(path);
		System.out.println("result: " + result);*/
		
		//15.Length of Last Word
		//给定一个由字母和空格组成的字符串，返回该字符串中的最后一个单词的长度
		/*String s = "Hello World ";
		int result = lengthOfLastWord(s);
		System.out.println("result: " + result);*/
	}
	
	//2017-7-20
	//15.Length of Last Word
	//给定一个由字母和空格组成的字符串，返回该字符串中的最后一个单词的长度
	//For example, given s = "Hello World", return 5.
	//去掉前后多余空格
	//获取最后一个空格下标
	//return s.length() - index - 1;
	public static int lengthOfLastWord(String s) {
		
		if(s==null || s.length()==0) return 0;
		
		s = s.trim();
		
		if(s.length()==0) return 0;
		
		int index = s.lastIndexOf(" ");
		
		return s.length() - index - 1;
    }
	
	//2017-7-20
	//14.Simplify Path
	//给定一个绝对路径地址，将其简化
	//path = "/home/", => "/home"
	//path = "/a/./b/../../c/", => "/c"
	//path = "/../", => "/"
	//path = "/home//foo/", => "/home/foo"
	//以"/"切割字符串，使用栈存储路径
	//遍历切割所得字符串数组：
	//若为"."，则为当前目录，无操作
	//若为".."，则若有上级目录，则退回上级目录，即弹出栈顶元素
	//若为""，则为连续"//"，无操作
	//否则，为文件夹名称，放入栈中
	//最后使用StringBulider拼接栈中字符串
	public static String simplifyPath(String path) {
		
		if(path==null || path.length()==0) return "/";
		
		StringBuilder result = new StringBuilder();
		Stack<String> stack = new Stack<String>();
		
		String[] strs = path.split("/");
		
		for(int i=1; i<strs.length; i++) {
			switch (strs[i]) {
				case ".":
					break;
					
				case "..":
					if(!stack.isEmpty()) {
						stack.pop();
					}
					break;
					
				case "":
					break;
					
				default:
					stack.add(strs[i]);
					break;
			}
		}
		
		for(int i=0; i<stack.size(); i++) {
			result.append("/");
			result.append(stack.get(i));
		}
		
		if(result.length()==0) {
			return "/";
		}
		
        return result.toString();
    }
	
	//2017-7-19
	//13.Group Anagrams
	//给定一个字符串数组，将颠倒字母而组成的单词分在一组
	//For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"]
	//Return:[["ate", "eat","tea"], ["nat","tan"], ["bat"]]
	//将数组中的字符串中的字符，按照字典顺序排序，得到新的字符串
	//排序后的字符串若相等，则将原字符串分到同一组
	//使用HashMap<String, List<String>>
	//key为排序后的字符串
	//value为对应的字符串分组
	public static List<List<String>> groupAnagrams(String[] strs) {

		if(strs==null || strs.length==0) return null;
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		char[] chs;
		
		for(String str : strs) {
			
			chs = str.toCharArray();
			Arrays.sort(chs);
			String strSort = String.valueOf(chs);
			
			if(map.containsKey(strSort)) {
				map.get(strSort).add(str);
				
			} else {
				List<String> list = new ArrayList<String>();
				list.add(str);
				map.put(strSort, list);
			}
		}
		
		List<List<String>> resultList = new ArrayList<List<String>>(map.values());
		
		return resultList;
    }
	
	//2017-7-18
	//12.Count and Say
	//给定n，输出第n个序列
	//1.     1
	//2.     11
	//3.     21
	//4.     1211
	//5.     111221
	//1 is read off as "one 1" or 11.
	//11 is read off as "two 1s" or 21.
	//21 is read off as "one 2, then one 1" or 1211.
	//嵌套循环，扫描当前序列，统计连续相同的数字个数
	//使用StingBuilder拼接字符串
	public static String countAndSay(int n) {
		
		String str = "1";
		StringBuilder sb = new StringBuilder();
		char ch;
		int count;
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<str.length(); j++) {
				ch = str.charAt(j);
				count = 1;
				while(++j < str.length() && str.charAt(j)==ch) {
					count++;
				}
				sb.append("" + count + ch);
				j -= 1;
			}
			str = sb.toString();
			sb.setLength(0);
		}
		
        return str;
    }
	
	//2017-7-17
	//11.Roman to Integer
	//给定罗马字符，将其转换为数字
	//case 'I': return 1;
	//case 'V': return 5;
	//case 'X': return 10;
	//case 'L': return 50;
	//case 'C': return 100;
	//case 'D': return 500;
	//case 'M': return 1000;
	//若后一个字符小于前一个字符，则其数值=大+小
	//若后一个字符大于前一个字符，则其数值=大-小
    public static int romanToInt(String s) {
    	
    	char ch;
    	int result = 0;
    	int digit = 0;
    	int last = 0;
    	
    	for(int i=0; i<s.length(); i++) {
    		ch = s.charAt(i);
    		
    		switch (ch) {
				case 'I':
					digit = 1;
					break;
				case 'V':
					digit = 5;
					break;
				case 'X':
					digit = 10;
					break;
				case 'L':
					digit = 50;
					break;
				case 'C':
					digit = 100;
					break;
				case 'D':
					digit = 500;
					break;
				case 'M':
					digit = 1000;
					break;
			}
    		if(digit > last) {
    			result += digit - last*2;
    		} else {
    			result += digit;
    		}
    		last = digit;
    	}
        return result;
    }
	
	
	//2017-7-17
	//10.Integer to Roman
	//给定整形数字，将其转换为罗马字符
	//1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}
	//10~90: {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}
	//100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}
	//1000~3000: {"M", "MM", "MMM"}
	//循环取余，取字符串数组对应下标
	public static String intToRoman(int num) {
        
		String[][] dic = {
				{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
				{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
				{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
				{"", "M", "MM", "MMM"}
		};

		int count = 0;
		String temp = "";
		int remainder;
		
		while(num != 0) {
			remainder = num % 10;
			
			temp = dic[count][remainder] + temp;
			count++;
			num /= 10;
		}
		return temp;
    }
	
	//2017-7-9
	//9.Valid Number
	//给定字符串，判断其是否为合法数字
	//i.e: "0" => true;		" 0.1 " => true;	"abc" => false;		"1 a" => false;		"2e10" => true
	//有限状态机
	//枚举合法输入情况
	//1.空格 + 数字 + 空格
	//2.空格 + 点 + 数字 + 空格
	//3.空格 + 符号 + 数字 + 空格
	//4.空格 + 符号 + 点 + 数字 + 空格
	//5.空格 + (合法输入)(1, 2, 3, 4） + e + (合法输入)(1, 3) + 空格
	//八个状态如下
	public static boolean isNumber(String s) {
        
		if(s==null || s.length()==0) return false;

		int invalid = 0;
		int space = 1;
		int sign = 2;
		int digit = 3;
		int dot = 4;
		int exponent = 5;
		
		int[][] transTable = {  
	        //0INVA,1SPA,2SIG,3DI,4DO,5E  
            {-1,  0,  3,  1,  2, -1},//0 初始无输入或者只有space的状态 
            {-1,  8, -1,  1,  4,  5},//1 输入了数字之后的状态（数字打头）
            {-1, -1, -1,  4, -1, -1},//2 前面无数字，只输入了Dot的状态（dot打头） 
            {-1, -1, -1,  1,  2, -1},//3 输入了符号状态（正负号打头）
            {-1,  8, -1,  4, -1,  5},//4 前面有数字和有dot的状态（数字和dot打头，有数字无dot输入dot的状态，无数字有dot输入数字的状态）
            {-1, -1,  6,  7, -1, -1},//5 'e' or 'E'输入后的状态
            {-1, -1, -1,  7, -1, -1},//6 输入e之后输入Sign的状态
            {-1,  8, -1,  7, -1, -1},//7 输入e后输入数字的状态
            {-1,  8, -1, -1, -1, -1} //8 前面有有效数输入之后，输入space的状态
        };
		
		int state = 0;
		int input;
		char ch;
		
		for(int i=0; i<s.length(); i++) {
			
			ch = s.charAt(i);
			input = invalid;
			
			if(ch == ' ') {
				input = space;
				
			} else if(ch=='+' || ch=='-') {
				input = sign;
				
			} else if(ch>='0' && ch<='9') {
				input = digit;
				
			} else if(ch == '.') {
				input = dot;
				
			} else if(ch=='e' || ch=='E') {
				input = exponent;
			}
			
			state = transTable[state][input];
			
			if(state == -1) return false;
		}
		
		return state==1 || state==4 || state==7 ||state==8;
    }
	
	
	//2017-6-21
	//8.Longest Common Prefix
	//给定字符串数组strs[]，找出strs[]中的所有字符串的最长公共前缀
	//i.e: Given strs={"ab","abc","abb","abcd"}; return "ab";
	//遍历字符串数组strs[]，比较每个字符串的对应位
	//若全部相等，则添加到公共前缀中，否则已找到最长公共前缀
	//若字符串数组strs[]中的最短字符串已经比较完毕，则已找到最长公共前缀
	public static String longestCommonPrefix(String[] strs) {
		
		if(strs==null || strs.length==0) return "";
		
		int index = 0;
		StringBuffer result = new StringBuffer();
		char temp;
		
		label1:
		while(true) {
			if(index >= strs[0].length()) {
				break label1;
			} else {
				temp = strs[0].charAt(index);
			}
			for(int i=1; i<strs.length; i++) {
				if(!(index<strs[i].length() && temp==strs[i].charAt(index))) {
					break label1;
				}
			}
			result.append(temp);
			index++;
		}
        return result.toString();
    }
	
	//2017-6-21
	//7.Wildcard Matching
	//正则表达式匹配，'?' Matches any single character. '*' Matches any sequence of characters (including the empty sequence).
	//给定待匹配字符串s和正则表达式p，判断是否能够匹配成功
	//i.e: Given s="aabcccabd"; p="a*abd"; return true;
	//使用boolean b[i]，记录s的前i个字符和p的前j个字符是否匹配，b的维度是(s.length()+1)
	//外层循环p，内层循环s
	//p.charAt(j)，取p的第j+1个字符
	public static boolean isMatch2(String s, String p) {
		
		if(p.length() == 0)
			return s.length() == 0;
		
		boolean res[] = new boolean[s.length() + 1];
		res[0] = true;
		
		for(int j=0; j<p.length(); j++) {
			
			if(p.charAt(j) != '*') {
				for(int i=s.length()-1; i>=0; i--)
					res[i+1] = res[i] && (p.charAt(j)=='?' || s.charAt(i)==p.charAt(j));
				
			} else {
				int i = 0;
				while(i<=s.length() && !res[i])
					i++;

				for(; i<=s.length(); i++)
					res[i] = true;
			}
			
			//若p的第一个字符不等于*
			//则s的第二个及第二个以后的字符与p的第一个字符都不可能正确匹配
			//即res[0]==false;
			res[0] = res[0] && (p.charAt(j)=='*');
		}
        return res[s.length()];
    }
	
	//2017-5-27
	//6.Regular Expression Matching
	//正则表达式匹配，'.' Matches any single character. '*' Matches zero or more of the preceding element.
	//给定待匹配字符串s和正则表达式p，判断是否能够匹配成功
	//i.e: Given s="aab"; p="c*a*ab"; return true;
	//使用boolean b[i][j]，记录s的前i个字符和p的前j个字符是否匹配，b的维度是(s.length()+1, p.length()+1)
	//外层循环p，内层循环s
	//p.charAt(j)，取p的第j+1个字符
	public static boolean isMatch(String s, String p) {
		
		if(s.length()==0 && p.length()==0) return true;
		if(p.length()==0) return false;
		
		boolean[][] b = new boolean[s.length()+1][p.length()+1];
		
		b[0][0] = true;
		
		for(int j=0; j<p.length(); j++) {
			
			if(p.charAt(j) == '*') {//若p的第j+1个字符为*

				if(j < 1) continue;//*不会出现在第一个位置，则j==0跳过
				
				if(b[0][j-1]) {//若p的前j-1个字符可以忽略，即p的前j-1个字符匹配s的前0个字符
					b[0][j+1] = true;//则p的前j+1个字符也可以忽略，即p当前的*号匹配0个字符
				}
				
				if(p.charAt(j-1) != '.') {//若p的第j个字符不为'.'
					
					for(int i=0; i<s.length(); i++) {
						
						if(b[i+1][j]) {//若s的前i+1个字符与p的前j个字符相匹配
							b[i+1][j+1] = true;//则s的前i+1个字符与p的前j+1个字符相匹配
											   //即p当前的*号只匹配一个字符
						}
						
						if(b[i+1][j-1]) {//若s的前i+1个字符与p的前j-1个字符相匹配
							b[i+1][j+1] = true;//则s的前i+1个字符与p的前j+1个字符相匹配
											   //即p当前的*号匹配0个字符
						}
						
						if(i>0 && b[i][j+1] && s.charAt(i-1)==s.charAt(i) && s.charAt(i)==p.charAt(j-1)) {
							//若s的前i个字符与p的前j+1个字符相匹配，且s的第i个字符==第i+1个字符，且s的第i+1个字符与p的第j个字符相匹配
							b[i+1][j+1] = true;//则s的前i+1个字符与p的前j+1个字符相匹配
											   //即p当前的*号多匹配一个s的第i+1个字符
						}
					}
					
				} else {//若p的第j个字符为'.'
					
					int i = 0;
					while(i<s.length() && !b[i+1][j-1] && !b[i+1][j]) {
						i++;//若s的前i+1个字符与p的前j-1个字符相匹配，或者s的前i+1个字符与p的前j个字符相匹配
							//即p当前的.*匹配零个字符，或者p当前的.匹配一个字符
					}
					for(; i<s.length(); i++) {
						b[i+1][j+1] = true;//则s的所有字符与p的前j+1个字符相匹配，即p当前的.*匹配s剩余的所有字符
					}
				}
				
			} else {//若p的第j+1个字符不为*
				
				for(int i=0; i<s.length(); i++) {
					if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='.') {//若s的第i+1个字符与p的第j+1个字符相匹配
						b[i+1][j+1] = b[i][j];//则若s的前i个字符与p的前j个字符相匹配
											  //则s的前i+1个字符与p的前j+1个字符相匹配
					}
				}
			}
		}
		return b[s.length()][p.length()];//最后结果为s的前s.length()个字符与p的前p.length()个字符是否相匹配
    }
	
	//2017-5-19
	//5.Longest Palindromic Substring
	//给定字符串，找到其中最长的有效回文
	//i.e: Given "abbac", return "abba"
	//在给定字符串中添加"#"字符，即将s="abbac"转换为str="#a#b#b#a#c#"，使用StringBuilder转换
	//从第二个字符开始遍历字符串str
	//比较当前字符串的两边对称字符，若相等则说明为有效回文，继续往两边遍历
	//往两边遍历的深度k（单边深度）即为当前有效回文的最大长度
	//若不相等，则更新str的最大有效回文长度max=k，记录s的最大有效回文长度起点maxIndex=(i-max)/2
	//继续遍历字符串str，最后返回s的最长有效回文s.substring(maxIndex, maxIndex + max)
	public static String longestPalindrome(String s) {
		
		if(s==null || s.length()==0) return s;
		
        StringBuilder sb = new StringBuilder();
        	
        for(int i=0; i<s.length(); i++) {
        	sb.append("#");
        	sb.append(s.substring(i, i+1));
        }
        sb.append("#");
        
        char[] ch = sb.toString().toCharArray();
        int k;
        int max = -1;
        int maxIndex = -1;
        
        for(int i=1; i<ch.length; i++) {
        	
        	k = 1;
        	while(i-k>=0 && i+k<ch.length && ch[i-k]==ch[i+k]) {
        		k++;
        	}
        	k--;
        	
        	if(k > max) {
        		max = k;
        		maxIndex = (i - max) / 2;
        	}
        }
		return s.substring(maxIndex, maxIndex + max);
    }
	
	//2017-5-16
	//4.Add Binary
	//给定两个用字符串表示的二进制，求和
	//i.e: Given a="11", b="1", return "100"
	//从后往前遍历ab俩字符串，对应位相加，注意进位，sum = a + b + carry
	//若sum>=2，则sum=sum-2，carry=1，否则carry=0，将sum添加到最终字符串result开头
	//继续遍历较长字符串的剩余高位二进制，处理同上
	//最后注意carry的值，若carry==1，则将carry添加到最终字符串result开头
	public static String addBinary(String a, String b) {
		
		if(a==null || a.length()==0 || a.equals("0")) return b;
		if(b==null || b.length()==0 || b.equals("0")) return a;
		
		int la = a.length();
		int lb = b.length();
		int lmin = Math.min(la, lb);

		int sum = 0;
		int carry = 0;
		
		StringBuffer result = new StringBuffer();
		
		int i = 1;
		for( ; i<=lmin; i++) {
			sum = (a.charAt(la-i)-'0') + (b.charAt(lb-i)-'0') + carry;
			if(sum>=2) {
				sum = sum - 2;
				carry = 1;
			} else {
				carry = 0;
			}
			result.append(sum);
		}
		
		while(la-i >= 0) {
			sum = (a.charAt(la-i)-'0') + carry;
			if(sum>=2) {
				sum = sum - 2;
				carry = 1;
			} else {
				carry = 0;
			}
			result.append(sum);
			i++;
		}
		
		while(lb-i >= 0) {
			sum = (b.charAt(lb-i)-'0') + carry;
			if(sum>=2) {
				sum = sum - 2;
				carry = 1;
			} else {
				carry = 0;
			}
			result.append(sum);
			i++;
		}
		
		if(carry==1) {
			result.append(carry);
		}
		
		return result.reverse().toString();
    }
	
	//2017-5-15
	//3.String to Integer (atoi)
	//将字符串转为整形，无法转换则return 0
	//忽略字符串前的空格，可能有正负号，存在多个正负号则return 0
	//只需转化字符串左边的有效数字，超出Integer范围则返回Integer边界值
	//i.e: Given -00123aa321 return -123, given +-1, return 0, given a123, return 0
	//使用str.trim()去除str两边多余空格
	//查看str第一个字符，确定数值正负号
	//逐一读取str剩余字符，非数字则结束循环
	//若符号为正，则result = result*10 + temp，否则result = result*10 - temp
	//注意判断result是否超出Integer边界，超出则返回边界值
	public static int myAtoi(String str) {
		
		if(str==null || str.trim().length()==0) return 0;
		
		str = str.trim();
		
		long result = 0;
		int temp;
		int i = 0;
		boolean positive = true;
		
		if(str.charAt(i) == '+') {
			i++;
		} else if(str.charAt(i) == '-') {
			positive = false;
			i++;
		}
		
		for( ; i<str.length(); i++) {
			
			temp = str.charAt(i) - '0';
			
			if(temp<0 || temp>9) break;
			
			if(positive) {
				result = result*10 + temp;
				if(result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
			} else {
				result = result*10 - temp;
				if(result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
			}
		}
		return (int)result;
    }
	
	//2017-5-14
	//2.Implement strStr()
	//给定两个字符串str1和str2，判断str2是否为str1的子串，是则返回srt2在str1中的下标，否则返回-1
	//暴力查找，两层循环，逐个字符比较，时间O(m*n)
	//Hash查找，时间O(n)（使用BigInteger，操作对象好像更加耗时？）
	//使用一个hashcode来表示一个字符串，通常取素数29为底
	//字符串 "abcde"的hashcode = a*29^0 + b*29^1 + c*29^2 + d*29^3 + e*29^4
	//则下一个字符串"bcdef"的hashcode = (hash-a)/29 + f*29^4
	//一次遍历即可判断str2是否为str1的子串
	public static int strStr(String haystack, String needle) {
		
		if(haystack==null || needle==null) return -1;
		if(haystack.length()==0 || needle.length()==0) return needle.length()==0 ? 0 : -1;
		if(haystack.length() < needle.length()) return -1;
		
		int base = 29;
		long tempBase = 1;
		
		//long hash = 0;
		BigInteger hashB = new BigInteger(0 + "");
		
		//long tempHash = 0;
		BigInteger tempHashB = new BigInteger(0 + "");
		
		BigInteger tempB = null;
		
		for(int i=0; i<needle.length(); i++) {
			
			tempB = new BigInteger(((int)needle.charAt(i)) * tempBase + "");
			hashB = hashB.add(tempB);

			//hash += (int)needle.charAt(i) * tempBase;
			tempBase *= base;
		}
		
		tempBase = 1;
		
		for(int i=0; i<needle.length(); i++) {
			
			tempB = new BigInteger(((int)haystack.charAt(i)) * tempBase + "");
			tempHashB = tempHashB.add(tempB);
			
			//tempHash += (int)haystack.charAt(i) * tempBase;
			tempBase *= base;
		}
		
		if(hashB.equals(tempHashB)) return 0;
		//if(hash == tempHash) return 0;

		tempBase /= base;
		
		for(int i=needle.length(); i<haystack.length(); i++) {
			
			tempB = new BigInteger((int)haystack.charAt(i-needle.length()) + "");
			tempHashB = tempHashB.subtract(tempB);

			tempB = new BigInteger(base + "");
			tempHashB = tempHashB.divide(tempB);

			tempB = new BigInteger(((int)haystack.charAt(i)) * tempBase + "");
			tempHashB = tempHashB.add(tempB);
			
			//tempHash = (tempHash - (int)haystack.charAt(i-needle.length())) / base + (int)haystack.charAt(i) * tempBase; 
			
			if(hashB.equals(tempHashB)) return i - needle.length() + 1;
			//if(hash == tempHash) return i - needle.length() + 1;
		}
        return -1;
    }
	
	//2017-5-13
	//1.Valid Palindrome
	//给定字符串，判断其是否为有效回文，只考虑字母和数字，忽略大小写
	//i.e: "A man, a plan, a canal: Panama" is a palindrome
	//	   "race a car" is not a palindrome.
	//使用双指针l和r，初始化l=0，r=length-1
	//l先往右边遍历，选中第一个字母或者数字
	//r再往左边遍历，选中第一个字母或者数字
	//若ch[l]==ch[r]，则继续往中间遍历，否则return false
	//若l > r，则遍历结束，说明左右对应相等，为有效回文，return true
	public static boolean isPalindrome(String s) {
		
		if(s.trim().equals("") || s.length()==1) return true;
        
		char[] ch = s.toCharArray();
		
		int l = 0;
		int r = ch.length - 1;
		
		while(l < r) {
			
			if(!Character.isLetterOrDigit(ch[l])) {
				l++;
				
			} else if(!Character.isLetterOrDigit(ch[r])) {
				r--;
				
			} else if(Character.toLowerCase(ch[l]) != Character.toLowerCase(ch[r])) {
				return false;
				
			} else {
				l++;
				r--;
			}
		}
		return true;
    }
	
}
