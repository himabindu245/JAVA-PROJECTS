package xyz;

abstract class Machines {
	abstract void ATM();
	public void ATM2() {
		System.out.println("ATM USING JAVA WITH PHP");
		}
	}
	class Bank extends Machines{
		void ATM() {
			System.out.println("ATM MACHINE USING JAVA");
		}
}
class Machine{
		public static void main(String[] args) {
			Bank b=new Bank();
			b.ATM();
			b.ATM2();
		}
}
