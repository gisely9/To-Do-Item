import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ToDoList todo=new ToDoList();
		int flag =0;
		while(flag==0) {
			System.out.println("\n-------To do list-----\n\n1.Add item\n2.Delete item\n3.List of todo item\n4.exit\nEnter your choice:");
			@SuppressWarnings("resource")
			Scanner Input = new Scanner(System.in);
			int option =Input.nextInt();Input.nextLine();
			if(option==1) {
				System.out.println("Enter the item:");
				String item =Input.nextLine();
				todo.addItem(item);
				System.out.println("1 item added!");
			}
			else if(option==2) {
				todo.listAll();
				System.out.println("Enter item number to delete");
				int n=Input.nextInt();
				todo.deleteitem(n-1);
				System.out.println("1 item deleted!");
				
			}
			else if(option==3) {
				todo.listAll();
				
			}else{flag=1;}}
		}

	}
 class ToDoList{
	 ArrayList<String> todo=new ArrayList<String>();
	 
	 public void addItem(String item) {
		 this.todo.add(item);
	 }
	 public void deleteitem(int num) {
		 this.todo.remove(num);
	 }
	 
	 public void listAll() {
		 ToDoList ();
		 for (int i=0;i<this.todo.size(); i++) {
			 System.out.println((i+1)+","+this.todo.get(i));
		 }
	
		
	}

 }
