package com.company;

import java.util.Scanner;

public class Test1 {

    /*
    1-1
    public class Main {
        public int solution(String str,char t){
            int answer = 0;
            str = str.toUpperCase();
            t = Character.toUpperCase(t);
        *//*for(int i =0; i<str.length();i++) {
            if (str.charAt(i) == t) answer++;
        }*//*
            for(char x:str.toCharArray()){
                if(x==t) answer++;
            }
            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            String str = in.next();
            char c = in.next().charAt(0);
            System.out.println(T.solution(str,c));

        }
    }
*/
/*
    1-2
    public class Main {
        public String solution(String str){
            String answer = "";

            for(char x:str.toCharArray()){
            *//*if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);*//*
                if(x>=97 && x<=122) answer +=(char)(x-32);
                else answer += (char)(x+32);
            }
            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            String str = in.next();

            System.out.println(T.solution(str));

        }
    }
*/
/*  1-3
    package com.company;
import java.util.Locale;
import java.util.Scanner;

    public class Main {
        public String solution(String str){
            String answer = "";
            int m = Integer.MIN_VALUE,pos;
            //case1
        */
/*String[] s = str.split(" ");
        for(String x:s){
             int len = x.length();
             if(len>m){
                 m=len;
                 answer = x;
             }
        }*//*


            //case2
            while((pos = str.indexOf(' '))!=-1){
                String tmp = str.substring(0,pos);
                int len = tmp.length();
                if(len>m){
                    m=len;
                    answer=tmp;
                }
                str = str.substring(pos+1);
            }
            if(str.length()>m) answer=str;
            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            String str = in.nextLine();

            System.out.println(T.solution(str));

        }
    }
*/
/* 1-4
    package com.company;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

    public class Main {
        public ArrayList<String> solution(int n, String[] str){
            ArrayList<String> answer = new ArrayList<>();
            //case1
        *//*for(String x:str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }*//*
            //case2
            for(String x:str){
                char[] s = x.toCharArray();
                int lt = 0,rt=x.length()-1;
                while(lt<rt){
                    char tmp = s[lt];
                    s[lt] = s[rt];
                    s[rt] = tmp;
                    lt++; rt--;
                }
                answer.add(String.valueOf(s));
            }

            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            int n = in.nextInt();
            String[] str = new String[n];
            for(int i=0; i<n; i++){
                str[i] = in.next();
            }
            for(String x : T.solution(n,str)) {
                System.out.println(x);
            }
        }
    }
*/
/* 1-5
    public class Main {
        public String solution(String str){
            String answer = "";
            char[] s = str.toCharArray();
            int lt = 0, rt = str.length()-1;
            while(lt<rt){
                //알파벳유무
                if(!Character.isAlphabetic(s[lt])) lt++;
                else if(!Character.isAlphabetic(s[rt])) rt--;
                else{
                    char tmp = s[lt];
                    s[lt] = s[rt];
                    s[rt] = tmp;
                    lt++; rt--;
                }
            }
            answer = String.valueOf(s);
            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            //int n = in.nextInt();
            String str = in.next();
            System.out.println(T.solution(str));

        }
    }*/

    /*1-6

public class Main {
    public String solution(String str){
        String answer = "";
        for(int i =0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==i){
                answer+= str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
	// write your code here
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        //int n = in.nextInt();
        String str = in.next();
        System.out.println(T.solution(str));

    }
}
*/
    /* 1-7
public class Main {
    public String solution(String str){
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) return "NO";
        *//*
        int len = str.length();
        for(int i =0; i<len/2; i++){
           if(str.charAt(i)!=str.charAt(len-1-i)) return "NO";
        }*//*
        return answer;
}
    public static void main(String[] args) {
        // write your code here
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));

    }
}*/
/*
    1-8
    public class Main {
        public String solution(String s){
            String answer = "NO";
            s=s.toUpperCase().replaceAll("[^A-Z]","");
            String tmp = new StringBuilder(s).reverse().toString();
            if(s.equals(tmp)) return "YES";

            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            String str = in.nextLine();
            System.out.println(T.solution(str));

        }
    }
*/
/* 1-9
    public class Main {
        public int solution(String str){
            String answer = "";

            for(char x:  str.toCharArray()) {
            *//*if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }*//*
                if(Character.isDigit(x)) answer+=x;
            }

            return Integer.parseInt(answer);
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            String str = in.next();
            System.out.println(T.solution(str));

        }
    }*/

/* 1-10
    public class Main {
        public int[] solution(String str,char t){
            int[] answer = new int[str.length()];
            int p=1000;
            for(int i=0; i<str.length();i++){
                if(str.charAt(i)==t){
                    p =0;
                }else{
                    p++;
                }
                answer[i] = p;
            }
            p=1000;
            for(int i=str.length()-1;i>=0;i--){
                if(str.charAt(i)==t) p=0;
                else{
                    p++;
                    answer[i] = Math.min(answer[i],p);
                }
            }

            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            String str = in.next();
            char c = in.next().charAt(0);
            for(int x : T.solution(str,c))  System.out.print(x+" ");

        }
    }*/
/* 1-11
    public class Main {
        public String solution(String str){
            String answer = "";
            int cnt=1;
            for(int i=0; i<str.length()-1;i++){
                if(str.charAt(i)==str.charAt(i+1)){
                    cnt++;
                }else {
                    answer += str.charAt(i);
                    if(cnt>1) answer+=Integer.toString(cnt);
                    cnt = 1;
                }
            }
            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            String str = in.next();
            System.out.println(T.solution(str));

        }
    }*/
/* 1-12
    public class Main {
        public String solution(String str,int n){
            String answer = "";
            for(int i=0;i<n;i++){
                String tmp = str.substring(0,7).replace('#','1').replace('*','0');
                str = str.substring(7);
                int num = Integer.parseInt(tmp,2);
                answer += (char)num;
            }
            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            int n = in.nextInt();
            String str = in.next();
            System.out.println(T.solution(str,n));

        }
    }*/
}
