//package accounts.bank;

import java.util.Scanner;

 public class Accounts {
	
Scanner sc=new Scanner(System.in);


private int acc;
private double bal;
private String nm;
private String uNm;
private String mn;
private String pass1;
private String pass2;
private String upass;


public Scanner getSc() {
		return sc;
	}


	public void setSc(Scanner sc) {
		this.sc = sc;
	}


	public int getAcc() {
		return acc;
	}


	public void setAcc(int acc) {
		this.acc = acc;
	}


	public double getBal() {
		return bal;
	}


	public void setBal(double bal) {
		this.bal = bal;
	}


	public String getNm() {
		return nm;
	}


	public void setNm(String nm) {
		this.nm = nm;
	}


	public String getuNm() {
		return uNm;
	}


	public void setuNm(String uNm) {
		this.uNm = uNm;
	}


	public String getMn() {
		return mn;
	}


	public void setMn(String mn) {
		this.mn = mn;
	}


	public String getPass1() {
		return pass1;
	}


	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}


	public String getPass2() {
		return pass2;
	}


	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}

public void setC(int c) {
	this.c=c;
	
}

char ar[];
int c=0;

private Object getpas1;
private Object getnm;

void crt() {
	double b;
	
	System.out.println("---Your Welcome To Create Bank Account In Our Bank-------");
	do {
		System.out.println("User Name Must Contain Special Character '@'");
		System.out.println("Creat User Name:");
		nm=sc.next();
		if(nm.contains("@")) {
			break;
		}
		else {
			System.out.println("Re-Enter user name-----------");
		}

	}while(true);
	System.out.println("Enter your mobile no:");
	mn=sc.next();
	do {
		System.out.println("Enter your password:");
		pass1=sc.next();
		System.out.println("Re-Enter your password:");
		pass2=sc.next();
		if(pass1.equals(pass2)) {
			break;
		}
		else {
			System.out.println("The Password Not Matched!!!!!!!!!!!!!!!!");
			System.out.println("Re-Enter your Password!!!!!!!!!!!!!!!!!!");
			
		}
	}while(true);
	System.out.println("You Have Successfully Create Your Account.  .!!!!!!!!!!!!!  ");
	System.out.println("                                                    |");
	System.out.println("                                                     _");
	System.out.println("Please Deposite Some Ammount:");
	b=sc.nextDouble();
	bal=bal+b;
	
}

void lgIn(Accounts a[]) {
	int x=0;c=0;
	String y;
	do {
		System.out.println("Enter Yout Name----------------");
		uNm=sc.next();
		System.out.println("Enter your password:");
		upass=sc.next();
		for(int i=0;i<a.length;i++) {
			if(a[i].getNm().equals(uNm)&& a[i].getPass1().equals(upass)) {
			x=0;
			c++;
			System.out.println("You Have Sucessfully Log-in Your Account......!");
			System.out.println("_______________________________________________|");
			System.out.println("_______________________________________________");
			do {
				System.out.println("Welcome In Customer Menue:::::::::::::::");
				System.out.println("------------------------------------------");
				System.out.println("press 1.)To Deposite Balance:");
				System.out.println("press 2.) To Withdraw Balance:");
				System.out.println("press 3.)To Exit");
				int ch=sc.nextInt();
				switch(ch){
				case 1:
						a[i].dpst();
						break;
					
				case 2:
						a[i].wthdr();
							break;
				case 3:
						break;
				}
				System.out.println("Do You Want To More Operation(Yes/No)");
				y=sc.next();
				
			
				}while(y.equalsIgnoreCase("yes"));
				break;
		
			}
			
		}
	x++;
	if(c!=0) {
		break;
	}	
	}while(x<3);
	if(x>=3) {
		System.out.println("You Exceed YOUR LOGIN Limit!!!!!!!!!!!!!!!!!");
		}
}




void dpst() {
	double b;
	System.out.println("Your  Current Ammount Is:+bal");
	System.out.println("Enter The Amount For Deposite:");
	b=sc.nextDouble();
	bal=bal+b;
	System.out.println("Your Current Amount Is:"+bal);
	
}


void wthdr() {
	double b;
	System.out.println("Your Current Amount Is:"+bal);
	System.out.println("Enter The Ammount For Withdraw:");
	b=sc.nextDouble();
	if(bal<b) {
		System.out.println("Insuffitient Amount!!!!!!!!!!!!!!!!");
	}else {
		bal=bal-b;
		System.out.println("Your Current Amount Is:"+bal);
	}
}
}
 class Ash{ 
	public static void main(String[] args) {
	
		Accounts a[]=new Accounts[100];
		for(int i=0;i<100;i++) {
			a[i]=new Accounts();
		}
		Scanner  s=new Scanner (System.in);
		int ac=0;
		String y;
		do {
			System.out.println("Welcome In Main Menue::::::::::");
			System.out.println("---------------------------------");
			System.out.println("Press 1.) To Create Account:");
			System.out.println("Press 2.) To Log-In Account;");
			System.out.println("Press 3.) For Exit:");
			System.out.println("Please Enter Your Choice:");
			int ch=s.hashCode();
			switch(ch) {
			case 1:
					a[ac].crt();
					ac++;
					break;
			case 2:
					new Accounts().lgIn(a);
					break;
			case 3:
					break;
					}
			System.out.println("Do You Want To Create/Login More(Yes/No)???");
			y=s.next();
		}while(y.equalsIgnoreCase("yes"));
		}
	}

