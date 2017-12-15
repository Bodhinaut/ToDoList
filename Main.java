import java.util.ArrayList;
import java.util.Scanner;
/**
 * Main class
 * Kyle M. Shive
 */
public class Main {
   public static void main(String[] args){
       WeeklyToDoList list = new WeeklyToDoList();
       
       
       populateToDoListFromKeyboard(list);
       
   }// end main
   
   public static void populateToDoListFromKeyboard(WeeklyToDoList todoList){
       
      int priority = 0;
      
       do{
           
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter the todo priority(0 to end input): ");
       
       if(keyboard.hasNextInt() ){ 
           priority = keyboard.nextInt(); 
       }
       
       keyboard.nextLine();
       // moves scanner down after returning last line
       if(priority == 0){
           break;
       }// this is needed in case user hits 0 and needs to exit todoList
       
       String what = "";
       System.out.print("Enter the todo what: ");
       if(keyboard.hasNextLine() ){
         what = keyboard.nextLine();
       }
       
       String when = "";
       System.out.print("Enter the todo when (S-S): ");
       if(keyboard.hasNextLine() ){ 
           when = keyboard.nextLine();
       }

       ToDoItem item = new ToDoItem(priority, what, when);
       
       todoList.addItemToFront(item);
      }while(priority != 0);
      
      System.out.println();
      
      displayToDoList(todoList);
      processToDoList(todoList);
   }// end populate method
   
   public static void displayToDoList(WeeklyToDoList todoList){
       System.out.println("Current Weekly 'To Do' list: ");
       System.out.println(todoList.toString() );
   }// end display method
   
   public static void processToDoList(WeeklyToDoList todoList){
       System.out.println("High priority items: " + "\n" + todoList.getHighPriorityItems() + "\n");
       System.out.println("Normal priority items: " + "\n" + todoList.getNormalPriorityItems()+ "\n");
       System.out.println("Low priority items: " + "\n" + todoList.getLowPriorityItems() + "\n");
       
       System.out.println("All priority items: " + "\n" + todoList.toString());
   }// end processtodoList method
   
}// end class 
