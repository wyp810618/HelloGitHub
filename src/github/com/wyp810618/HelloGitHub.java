package github.com.wyp810618;

public class HelloGitHub {

	public static void main(String[] args) {
		HelloGitHub gitHub = new HelloGitHub();
		gitHub.sayHello();

	}
	
	public void sayHello(){
		System.out.println("Hello,GitHub!");
	}

	public void sayHello(String msg){
		System.out.println("Hello " + msg);
	}
}
