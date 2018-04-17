//Interface declaration...
interface Bank {    
public void deposit();    
public void withdraw();  }

class SBI implements Bank {

	public void deposit()    {        
		System.out.println("Printing deposit details");    
	}    

	public void withdraw()    {        
		System.out.println("Printing withdraw details");     
       	}	
}

class HSBC implements Bank {   
	public void deposit()    {        
		System.out.println("Printing deposit details");    
	}    

	public void withdraw()    {        
		System.out.println("Printing withdraw details");     
       	}	
	
	public static void main(String args[]) {    
		Bank b = new HSBC();    
		b.deposit();    
		b.withdraw();
	}//End of the Method...
} //End of the Class..