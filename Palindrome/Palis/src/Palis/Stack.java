package Palis;

public class Stack{
	 private char [] A;
	 private int top = -1;

	 public Stack(int size){
	  A = new char[size];
	  }

	  public void push(char x){
		  top++;
	   A[top] = x;
	    
	  }

	  public void pop(){
	   top--;
	  }

	  public char top(){
	     return A[top];
	  }

	  public boolean isEmpty(){
	     if( top == -1){
	          return true;
	     }else{
	          return false;
	     }
	   }

}
