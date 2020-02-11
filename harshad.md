# programmers

package com.hk.exam;

class Solution {
	  public static boolean solution(int x) {
		  if(!(x >=0 && x<= 10000)) {
			  return false;
		  }	  //0에서 10000사이 숫자인지 체크 
		 
		  String y = Integer.toString(x);          	// int to String
		  int [] num = new int[y.length()];			// 배열 생성 
		  String[] str = new String[y.length()];	// 배열 생성
		  str = y.split("");			// split() 함수는 스트링에 있는 글자 하나하나를 괄호 안에 있는 글자로 구분하여  하나씩 배열에 넣어줌
		  int sum = 0;
		  for(int i=0;i<y.length();i++) {
			  num[i]=Integer.parseInt(str[i]);		// String[] to int[]
			  System.out.println(num[i]);       	
			  sum += num[i];						//각자리수의 합
			  }
		 
		  if(x%sum != 0) {							//나머지가 0이 아닌것
			  return false;
		  }	  
	
		  
		  boolean answer = true;
		  
		  if(x >= 10) {
			  return answer;
		  }

	      return answer;
	  }
	    public static void main(String[]args){
	        System.out.println(solution(12));
	    }
	}
