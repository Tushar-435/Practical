package Mar_01;

public class Maineg2 {
	public static void main(String[] args) {
	Bank b=new Bank();
	b.setAcc_num(4464653448564464L);
	b.setAmount(45566f);
	b.setE_mail("tusharsingh@gmail.com");
	b.setName("Tushar");
	//System.out.println(b.getAcc_num()+" "+b.getAmount()+" "+b.getE_mail()+" "+b.getName());
	// getting values
			System.out.println("Account no.: "+b.getAcc_num());
			System.out.println("Name: "+b.getName());
			System.out.println("Customer Email: "+b.getE_mail());
			System.out.println("Amount: Rs."+b.getAmount());
		}
	
	}


