package e201814101;

public class Hello {
	String msg = "hello";
	public Hello(String msg) {
		this.msg = msg;
		}
	public void say() {
<<<<<<< HEAD
		System.out.println(msg);
		}
=======
		say(this.msg);
	} 
	public void say(String msg) { 
		System.out.println(msg); 
>>>>>>> f28b8cfe2238aa33f47a0beacc7bc6fa2d048434
	}
