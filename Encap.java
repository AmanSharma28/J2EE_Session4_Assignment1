class Emp{

	private String name;
    
	private int id;
    
	private String address;
    
    

	public void setname(String name) {this.name=name;}
    
	public String getname() { return this.name;}
    
    

	public void setid (int id) {this.id=id;}
    
	public int getid() {return this.id;}
    
    

	public void setaddr (String address) {this.address=address;}
    
	public String getaddr() {return this.address;}
    

}



class Encap{

     
	public static void main(String []args){
     
	Emp e = new Emp();
     
	e.setname("John");
    
	e.setid(101);
     
	e.setaddr("New York");
     
     

	System.out.print("Name : " + e.getname() + " ID : " + e.getid() + " Address : " + e.getaddr());
    
 }
}
