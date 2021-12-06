package com.company;

import java.util.Stack;

public class Test5 {
/*

    public String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(char x: str.toCharArray()){
            if(x=='(') stack.push('(');
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }*/


/*
    public int solution(int[][] board, int[] moves){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){
            for(int i=0;i<board.length;i++){
                if(board[i][pos-1]!=0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1]= 0;
                    if(!stack.isEmpty() && stack.peek()==tmp){
                        answer+=2;
                        stack.pop();
                    }else{
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }*/
/*
    public int solution(String str){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for(char x: str.toCharArray()){
            if(Character.isDigit(x)) stack.push(x-48);
            else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(x=='+') stack.push(lt+rt);
                else if(x=='-') stack.push(lt+rt);
                else if(x=='/') stack.push(lt/rt);
                else if(x=='*') stack.push(lt*rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }*/

/*
    public int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(') stack.push(str.charAt(i));
            else{
                stack.pop();
                if(str.charAt(i-1)=='(') answer+=stack.size();    //레이저
                else answer++;    //막대기
            }
        }

        return answer;
    }*/
}
