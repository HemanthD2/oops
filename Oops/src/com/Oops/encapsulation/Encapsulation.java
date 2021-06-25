package com.Oops.encapsulation;

class UserModel{
	private int id;
	private String name;
	private String password;
	private long mobileNo;
	
	public UserModel(int id, String name, String password,long mobileNo) {
	super();
	this.name=name;
	this.id=id;
	this.password=password;
	this.mobileNo=mobileNo;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
}

class AccountService{
	int id=1;
	public UserModel createAccount(String name,String password,long mobileNo) {
		UserModel u1=new UserModel(id,name,password,mobileNo);
				++id;
				return u1;
	}
	
	public void update_mobileNo(UserModel u1,long newmobileNo)
	{
		u1.setMobileNo(newmobileNo);
		System.out.println("Mobile number changed");

	}

	public void update_password(UserModel u1,String newpassword)
	{
		u1.setPassword(newpassword);
		System.out.println("Password changed");
	}
	
	public void show_MoileNo(UserModel u1)
	{
		System.out.println(u1.getMobileNo());

	}
	
	public void show_id(UserModel u1)
	{
		System.out.println(u1.getId());
	}
	
	public void show_User(UserModel u1)
	{
		System.out.println(u1.getId());
		System.out.println(u1.getName());
		System.out.println(u1.getMobileNo());
	}
}

public class Encapsulation {

	public static void main(String[] args) {

		AccountService a1=new AccountService();
		UserModel us1=a1.createAccount("HemanthD", "asdfghjkl", 9876543210l);
		UserModel us2=a1.createAccount("Samanth", "ghhjsdfghjkl", 7654323456l);

	//	a1.show_User(us1);
		a1.update_mobileNo(us1, 8765432123l);
		a1.show_User(us1);
		a1.show_User(us2);
	}

}
