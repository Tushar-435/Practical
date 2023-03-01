package Mar_01;
// we can read only (only getting method)
public class Read_Encap {
	private String name="Riya";
	// getting name
	public String getname() {
		return name;
	}
	public static void main(String[] args) {
		Read_Encap obj=new Read_Encap();
		// obj.set.name("Pallabi");// we can't change the value of the name
		System.out.println(obj.name);
	}
	}


