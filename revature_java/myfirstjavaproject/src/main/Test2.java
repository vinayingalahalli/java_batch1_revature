package main;

import main.Test.S;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		S s=t.new S();
		s.hello();
		
		Test.InnserStatic.innerStatic();
		
		Test.InnserStatic i=new Test.InnserStatic();
		i.innerNonStatic();
	}

}
