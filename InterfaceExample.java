package xyz;
interface Printable{
	void print();
}
class Message implements Printable{
	public void print() {
		System.out.println("Hello from INTERFACE");
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		Message msg=new Message();
		msg.print();
	}
}