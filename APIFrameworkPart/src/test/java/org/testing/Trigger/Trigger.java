package org.testing.Trigger;

import java.io.IOException;

import org.testing.TestScripts.EmployeeTC1;
import org.testing.TestScripts.EmployeeTC2;
import org.testing.TestScripts.TC1;
import org.testing.TestScripts.TC2;
import org.testing.TestScripts.TC3;
import org.testing.TestScripts.TC4;
import org.testing.TestScripts.TC5;

public class Trigger {

	public static void main(String[] args) throws IOException {
//		
//      	 TC1 t1 = new TC1(); 
//         t1.testCase1();
		
//         TC2 t2 = new TC2(); 
//         t2.testCase2();
//
//         TC3 t3 = new TC3(); 
//         t3.testCase3();
//
//         TC4 t4 = new TC4(); 
//         t4.testCase4();
//		 
//		 TC5 t5 = new TC5();
//		 t5.testCase5();
//
		EmployeeTC1 tc1 = new EmployeeTC1();
		tc1.empTestCase1();
		
		EmployeeTC2 tc2 = new EmployeeTC2();
		tc2.empTestCase2();
	}

}
