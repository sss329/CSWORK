import java.util.Scanner;

public class TrueFalse extends MC {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TrueFalse(){
		
	}
	/*Get the Prompt from the user for the T/F*/
	public void getPrompt() {
		
		System.out.println("Enter the prompt for your True/False question:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		SetPrompt(i +"\n");
	
	}
	/*Sets the question and adds True and False to the choices vector*/
	public void setQuestion() {
		getPrompt();
		choices.add("True"); choices.add("False");
	}
	/*Modify the question*/
	public void Modify() {
		
		//check to see if it catches errors 
		System.out.println(this.prompt);
		String prompt = null;
		
		System.out.println("Do you wish to modify the prompt?");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		String prompt1 = sc.nextLine();
		if(prompt1.toLowerCase().equals("yes")){
			System.out.println("Enter a new Prompt");
			@SuppressWarnings("resource")
			Scanner sc1 = new Scanner(System.in);
			prompt = sc1.nextLine();
			this.prompt = prompt;
		}
		
	}
}