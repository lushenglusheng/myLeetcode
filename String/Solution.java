package String;

import java.math.BigInteger;
import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		
		//1.Valid Palindrome
		//�����ַ������ж����Ƿ�Ϊ��Ч���ģ�ֻ������ĸ�����ֵ��ַ������Դ�Сд
		/*String s1 = "A man, a plan, a canal: Panama";
		String s2 = "!!!a";
		boolean result1 = isPalindrome(s1);
		boolean result2 = isPalindrome(s2);
		System.out.println(result1 + " " + result2);*/
		
		//2.Implement strStr()
		//���������ַ���str1��str2���ж�str2�Ƿ�Ϊstr1���Ӵ������򷵻�srt2��str1�е��±꣬���򷵻�-1
		/*String haystack = "acacabbaaaababa";
		String needle = "bbaaaababa";
		int result = strStr(haystack, needle);
		System.out.println("result: " + result);*/
		
		//3.String to Integer (atoi)
		//���ַ���תΪ����
		/*String str = "-00123aa321";
		int result = myAtoi(str);
		System.out.println("result: " + result);*/
		
		//4.Add Binary
		//���������ַ�����ʾ�Ķ����ƣ����
		/*String a = "1";
		String b = "111";
		String result = addBinary(a, b);
		System.out.println("result: " + result);*/
		
		//5.Longest Palindromic Substring
		//�����ַ������ҵ����������Ч����
		/*String s = "abbac";
		String result = longestPalindrome(s);
		System.out.println("result: " + result); */
		
		//6.Regular Expression Matching
		//������ʽƥ�䣬'.' Matches any single character. '*' Matches zero or more of the preceding element.
		/*String s = "aab";
		String p = "c*a*ab";
		boolean result = isMatch(s, p);
		System.out.println("result: " + result);*/
		
		//7.Wildcard Matching
		//������ʽƥ�䣬'?' Matches any single character. '*' Matches any sequence of characters (including the empty sequence).
		/*String s = "aabcccabd";
		String p = "a*abd";
		boolean result = isMatch2(s, p);
		System.out.println("result: " + result);*/
		
		//8.Longest Common Prefix
		//�����ַ�������strs[]���ҳ�strs[]�е������ַ����������ǰ׺
		/*String[] strs = {"abcdd","abc","abb","abcd"};
		String result = longestCommonPrefix(strs);
		System.out.println("result: " + result);*/
		
		//9.Valid Number
		//�����ַ������ж����Ƿ�Ϊ�Ϸ�����
		/*String s = "0.1e0.1 ";
		boolean result = isNumber(s);
		System.out.println("result: " + result);*/
		
		//10.Integer to Roman
		//�����������֣�����ת��Ϊ�����ַ�
		/*int num = 998;
		String result = intToRoman(num);
		System.out.println("result: " + result);*/
		
		//11.Roman to Integer
		//���������ַ�������ת��Ϊ����
		/*String s = "CDXCVIII";
		int result = romanToInt(s);
		System.out.println("result: " + result);*/
		
		//12.Count and Say
		//����n�������n������
		/*int n = 6;
		String result = countAndSay(n);
		System.out.println("result: " + result);*/
		
		//13.Group Anagrams
		//����һ���ַ������飬���ߵ���ĸ����ɵĵ��ʷ���һ��
		/*String[] strs = {"eat", "te", "tan", "att", "ate", "nat", "bat", "pup", "pup"};
		List<List<String>> resultList = groupAnagrams(strs);
		for(List<String> list : resultList) {
			System.out.println(list);
		}*/
		
		//14.Simplify Path
		//����һ������·����ַ�������
		/*String path = "/a/./b/../../c/";
		String result = simplifyPath(path);
		System.out.println("result: " + result);*/
		
		//15.Length of Last Word
		//����һ������ĸ�Ϳո���ɵ��ַ��������ظ��ַ����е����һ�����ʵĳ���
		/*String s = "Hello World ";
		int result = lengthOfLastWord(s);
		System.out.println("result: " + result);*/
	}
	
	//2017-7-20
	//15.Length of Last Word
	//����һ������ĸ�Ϳո���ɵ��ַ��������ظ��ַ����е����һ�����ʵĳ���
	//For example, given s = "Hello World", return 5.
	//ȥ��ǰ�����ո�
	//��ȡ���һ���ո��±�
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
	//����һ������·����ַ�������
	//path = "/home/", => "/home"
	//path = "/a/./b/../../c/", => "/c"
	//path = "/../", => "/"
	//path = "/home//foo/", => "/home/foo"
	//��"/"�и��ַ�����ʹ��ջ�洢·��
	//�����и������ַ������飺
	//��Ϊ"."����Ϊ��ǰĿ¼���޲���
	//��Ϊ".."���������ϼ�Ŀ¼�����˻��ϼ�Ŀ¼��������ջ��Ԫ��
	//��Ϊ""����Ϊ����"//"���޲���
	//����Ϊ�ļ������ƣ�����ջ��
	//���ʹ��StringBuliderƴ��ջ���ַ���
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
	//����һ���ַ������飬���ߵ���ĸ����ɵĵ��ʷ���һ��
	//For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"]
	//Return:[["ate", "eat","tea"], ["nat","tan"], ["bat"]]
	//�������е��ַ����е��ַ��������ֵ�˳�����򣬵õ��µ��ַ���
	//�������ַ�������ȣ���ԭ�ַ����ֵ�ͬһ��
	//ʹ��HashMap<String, List<String>>
	//keyΪ�������ַ���
	//valueΪ��Ӧ���ַ�������
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
	//����n�������n������
	//1.     1
	//2.     11
	//3.     21
	//4.     1211
	//5.     111221
	//1 is read off as "one 1" or 11.
	//11 is read off as "two 1s" or 21.
	//21 is read off as "one 2, then one 1" or 1211.
	//Ƕ��ѭ����ɨ�赱ǰ���У�ͳ��������ͬ�����ָ���
	//ʹ��StingBuilderƴ���ַ���
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
	//���������ַ�������ת��Ϊ����
	//case 'I': return 1;
	//case 'V': return 5;
	//case 'X': return 10;
	//case 'L': return 50;
	//case 'C': return 100;
	//case 'D': return 500;
	//case 'M': return 1000;
	//����һ���ַ�С��ǰһ���ַ���������ֵ=��+С
	//����һ���ַ�����ǰһ���ַ���������ֵ=��-С
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
	//�����������֣�����ת��Ϊ�����ַ�
	//1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}
	//10~90: {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}
	//100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}
	//1000~3000: {"M", "MM", "MMM"}
	//ѭ��ȡ�࣬ȡ�ַ��������Ӧ�±�
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
	//�����ַ������ж����Ƿ�Ϊ�Ϸ�����
	//i.e: "0" => true;		" 0.1 " => true;	"abc" => false;		"1 a" => false;		"2e10" => true
	//����״̬��
	//ö�ٺϷ��������
	//1.�ո� + ���� + �ո�
	//2.�ո� + �� + ���� + �ո�
	//3.�ո� + ���� + ���� + �ո�
	//4.�ո� + ���� + �� + ���� + �ո�
	//5.�ո� + (�Ϸ�����)(1, 2, 3, 4�� + e + (�Ϸ�����)(1, 3) + �ո�
	//�˸�״̬����
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
            {-1,  0,  3,  1,  2, -1},//0 ��ʼ���������ֻ��space��״̬ 
            {-1,  8, -1,  1,  4,  5},//1 ����������֮���״̬�����ִ�ͷ��
            {-1, -1, -1,  4, -1, -1},//2 ǰ�������֣�ֻ������Dot��״̬��dot��ͷ�� 
            {-1, -1, -1,  1,  2, -1},//3 �����˷���״̬�������Ŵ�ͷ��
            {-1,  8, -1,  4, -1,  5},//4 ǰ�������ֺ���dot��״̬�����ֺ�dot��ͷ����������dot����dot��״̬����������dot�������ֵ�״̬��
            {-1, -1,  6,  7, -1, -1},//5 'e' or 'E'������״̬
            {-1, -1, -1,  7, -1, -1},//6 ����e֮������Sign��״̬
            {-1,  8, -1,  7, -1, -1},//7 ����e���������ֵ�״̬
            {-1,  8, -1, -1, -1, -1} //8 ǰ������Ч������֮������space��״̬
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
	//�����ַ�������strs[]���ҳ�strs[]�е������ַ����������ǰ׺
	//i.e: Given strs={"ab","abc","abb","abcd"}; return "ab";
	//�����ַ�������strs[]���Ƚ�ÿ���ַ����Ķ�Ӧλ
	//��ȫ����ȣ�����ӵ�����ǰ׺�У��������ҵ������ǰ׺
	//���ַ�������strs[]�е�����ַ����Ѿ��Ƚ���ϣ������ҵ������ǰ׺
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
	//������ʽƥ�䣬'?' Matches any single character. '*' Matches any sequence of characters (including the empty sequence).
	//������ƥ���ַ���s��������ʽp���ж��Ƿ��ܹ�ƥ��ɹ�
	//i.e: Given s="aabcccabd"; p="a*abd"; return true;
	//ʹ��boolean b[i]����¼s��ǰi���ַ���p��ǰj���ַ��Ƿ�ƥ�䣬b��ά����(s.length()+1)
	//���ѭ��p���ڲ�ѭ��s
	//p.charAt(j)��ȡp�ĵ�j+1���ַ�
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
			
			//��p�ĵ�һ���ַ�������*
			//��s�ĵڶ������ڶ����Ժ���ַ���p�ĵ�һ���ַ�����������ȷƥ��
			//��res[0]==false;
			res[0] = res[0] && (p.charAt(j)=='*');
		}
        return res[s.length()];
    }
	
	//2017-5-27
	//6.Regular Expression Matching
	//������ʽƥ�䣬'.' Matches any single character. '*' Matches zero or more of the preceding element.
	//������ƥ���ַ���s��������ʽp���ж��Ƿ��ܹ�ƥ��ɹ�
	//i.e: Given s="aab"; p="c*a*ab"; return true;
	//ʹ��boolean b[i][j]����¼s��ǰi���ַ���p��ǰj���ַ��Ƿ�ƥ�䣬b��ά����(s.length()+1, p.length()+1)
	//���ѭ��p���ڲ�ѭ��s
	//p.charAt(j)��ȡp�ĵ�j+1���ַ�
	public static boolean isMatch(String s, String p) {
		
		if(s.length()==0 && p.length()==0) return true;
		if(p.length()==0) return false;
		
		boolean[][] b = new boolean[s.length()+1][p.length()+1];
		
		b[0][0] = true;
		
		for(int j=0; j<p.length(); j++) {
			
			if(p.charAt(j) == '*') {//��p�ĵ�j+1���ַ�Ϊ*

				if(j < 1) continue;//*��������ڵ�һ��λ�ã���j==0����
				
				if(b[0][j-1]) {//��p��ǰj-1���ַ����Ժ��ԣ���p��ǰj-1���ַ�ƥ��s��ǰ0���ַ�
					b[0][j+1] = true;//��p��ǰj+1���ַ�Ҳ���Ժ��ԣ���p��ǰ��*��ƥ��0���ַ�
				}
				
				if(p.charAt(j-1) != '.') {//��p�ĵ�j���ַ���Ϊ'.'
					
					for(int i=0; i<s.length(); i++) {
						
						if(b[i+1][j]) {//��s��ǰi+1���ַ���p��ǰj���ַ���ƥ��
							b[i+1][j+1] = true;//��s��ǰi+1���ַ���p��ǰj+1���ַ���ƥ��
											   //��p��ǰ��*��ֻƥ��һ���ַ�
						}
						
						if(b[i+1][j-1]) {//��s��ǰi+1���ַ���p��ǰj-1���ַ���ƥ��
							b[i+1][j+1] = true;//��s��ǰi+1���ַ���p��ǰj+1���ַ���ƥ��
											   //��p��ǰ��*��ƥ��0���ַ�
						}
						
						if(i>0 && b[i][j+1] && s.charAt(i-1)==s.charAt(i) && s.charAt(i)==p.charAt(j-1)) {
							//��s��ǰi���ַ���p��ǰj+1���ַ���ƥ�䣬��s�ĵ�i���ַ�==��i+1���ַ�����s�ĵ�i+1���ַ���p�ĵ�j���ַ���ƥ��
							b[i+1][j+1] = true;//��s��ǰi+1���ַ���p��ǰj+1���ַ���ƥ��
											   //��p��ǰ��*�Ŷ�ƥ��һ��s�ĵ�i+1���ַ�
						}
					}
					
				} else {//��p�ĵ�j���ַ�Ϊ'.'
					
					int i = 0;
					while(i<s.length() && !b[i+1][j-1] && !b[i+1][j]) {
						i++;//��s��ǰi+1���ַ���p��ǰj-1���ַ���ƥ�䣬����s��ǰi+1���ַ���p��ǰj���ַ���ƥ��
							//��p��ǰ��.*ƥ������ַ�������p��ǰ��.ƥ��һ���ַ�
					}
					for(; i<s.length(); i++) {
						b[i+1][j+1] = true;//��s�������ַ���p��ǰj+1���ַ���ƥ�䣬��p��ǰ��.*ƥ��sʣ��������ַ�
					}
				}
				
			} else {//��p�ĵ�j+1���ַ���Ϊ*
				
				for(int i=0; i<s.length(); i++) {
					if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='.') {//��s�ĵ�i+1���ַ���p�ĵ�j+1���ַ���ƥ��
						b[i+1][j+1] = b[i][j];//����s��ǰi���ַ���p��ǰj���ַ���ƥ��
											  //��s��ǰi+1���ַ���p��ǰj+1���ַ���ƥ��
					}
				}
			}
		}
		return b[s.length()][p.length()];//�����Ϊs��ǰs.length()���ַ���p��ǰp.length()���ַ��Ƿ���ƥ��
    }
	
	//2017-5-19
	//5.Longest Palindromic Substring
	//�����ַ������ҵ����������Ч����
	//i.e: Given "abbac", return "abba"
	//�ڸ����ַ��������"#"�ַ�������s="abbac"ת��Ϊstr="#a#b#b#a#c#"��ʹ��StringBuilderת��
	//�ӵڶ����ַ���ʼ�����ַ���str
	//�Ƚϵ�ǰ�ַ��������߶Գ��ַ����������˵��Ϊ��Ч���ģ����������߱���
	//�����߱��������k��������ȣ���Ϊ��ǰ��Ч���ĵ���󳤶�
	//������ȣ������str�������Ч���ĳ���max=k����¼s�������Ч���ĳ������maxIndex=(i-max)/2
	//���������ַ���str����󷵻�s�����Ч����s.substring(maxIndex, maxIndex + max)
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
	//�����������ַ�����ʾ�Ķ����ƣ����
	//i.e: Given a="11", b="1", return "100"
	//�Ӻ���ǰ����ab���ַ�������Ӧλ��ӣ�ע���λ��sum = a + b + carry
	//��sum>=2����sum=sum-2��carry=1������carry=0����sum��ӵ������ַ���result��ͷ
	//���������ϳ��ַ�����ʣ���λ�����ƣ�����ͬ��
	//���ע��carry��ֵ����carry==1����carry��ӵ������ַ���result��ͷ
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
	//���ַ���תΪ���Σ��޷�ת����return 0
	//�����ַ���ǰ�Ŀո񣬿����������ţ����ڶ����������return 0
	//ֻ��ת���ַ�����ߵ���Ч���֣�����Integer��Χ�򷵻�Integer�߽�ֵ
	//i.e: Given -00123aa321 return -123, given +-1, return 0, given a123, return 0
	//ʹ��str.trim()ȥ��str���߶���ո�
	//�鿴str��һ���ַ���ȷ����ֵ������
	//��һ��ȡstrʣ���ַ��������������ѭ��
	//������Ϊ������result = result*10 + temp������result = result*10 - temp
	//ע���ж�result�Ƿ񳬳�Integer�߽磬�����򷵻ر߽�ֵ
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
	//���������ַ���str1��str2���ж�str2�Ƿ�Ϊstr1���Ӵ������򷵻�srt2��str1�е��±꣬���򷵻�-1
	//�������ң�����ѭ��������ַ��Ƚϣ�ʱ��O(m*n)
	//Hash���ң�ʱ��O(n)��ʹ��BigInteger���������������Ӻ�ʱ����
	//ʹ��һ��hashcode����ʾһ���ַ�����ͨ��ȡ����29Ϊ��
	//�ַ��� "abcde"��hashcode = a*29^0 + b*29^1 + c*29^2 + d*29^3 + e*29^4
	//����һ���ַ���"bcdef"��hashcode = (hash-a)/29 + f*29^4
	//һ�α��������ж�str2�Ƿ�Ϊstr1���Ӵ�
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
	//�����ַ������ж����Ƿ�Ϊ��Ч���ģ�ֻ������ĸ�����֣����Դ�Сд
	//i.e: "A man, a plan, a canal: Panama" is a palindrome
	//	   "race a car" is not a palindrome.
	//ʹ��˫ָ��l��r����ʼ��l=0��r=length-1
	//l�����ұ߱�����ѡ�е�һ����ĸ��������
	//r������߱�����ѡ�е�һ����ĸ��������
	//��ch[l]==ch[r]����������м����������return false
	//��l > r�������������˵�����Ҷ�Ӧ��ȣ�Ϊ��Ч���ģ�return true
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
