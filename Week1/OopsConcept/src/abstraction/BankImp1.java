package abstraction;

public abstract class BankImp1 implements IBank{

	public void deposit() {
		System.out.println("Deposit Success...");
		
	}

	public abstract void withdraw();

}
