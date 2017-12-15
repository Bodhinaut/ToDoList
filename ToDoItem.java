
/**
 * Kyle M. Shive 
 */
public class ToDoItem {
   private int priority;
   private String what;
   private String when;
   
   public ToDoItem() {
       
       priority = 1;
       what = "Breathe";
       when = "S-S";
       
   }// end default ctr, convenience ctr
   
   public ToDoItem(int priority, String what, String when){
       setPriority(priority);
       setWhat(what);
       setWhen(when);
   }// end designated 3 arg ctr
   
   public int getPriority() {return priority;}
   public String getWhat () {return what;}
   public String getWhen () {return when;}
   // below for setters how do i return updated object? It wont let me return  ToDoItem
   public ToDoItem setPriority(int priority) { this.priority = priority; return this;}
   public ToDoItem setWhat    (String what) { this.what =         what; return this;}
   public ToDoItem setWhen    (String when) { this.when =         when; return this;}
   
   
   @Override
   public String toString() {
        String str = "";

        str +="[" + priority  + "]" + "[" + what + "][" +  when + "]";
        
        return str;
    }// end toString()
   
   
}// end class
