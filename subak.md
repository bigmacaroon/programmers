# programmers
class Solution {
	  public static String solution(int n) {
	    
		  String su = "수";
		  String bak = "박";
		  String answer = "";
		  String temp = "";
		for(int i=0 ; i < n/2; i++) {
			temp = su ;
			temp += bak ;
			answer += temp;			
		}
		if(n%2 != 0) {
			answer += su;
		}
		  
	      return answer;
	  }
	  public static void main(String[]args) {
		  
		  System.out.println(solution(7));
	  }
	}
