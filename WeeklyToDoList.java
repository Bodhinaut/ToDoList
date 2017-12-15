import java.util.ArrayList;
import java.util.Scanner;

/**
 * Kyle M. Shive 
 */
public class WeeklyToDoList {
    private static final int PRIORITY_HIGH = 1;
    private static final int PRIORITY_NORMAL = 2;
    private static final int PRIORITY_LOW = 3;
    ArrayList<ToDoItem> items;
    
    public WeeklyToDoList() {
        items = new ArrayList<>();
        // why is it advantageous to put this here and not just initz in fields
    }// end default ctr
    
    public ArrayList<ToDoItem> addItemToFront(ToDoItem item){
        
        items.add(0, item);
        
        return items;
     }// end additemtoFront method
    
    public ArrayList<ToDoItem> addItemToBack(ToDoItem item){
        items.add(item);
        return items;
    }// end additemtoBack method
    
    public ArrayList<ToDoItem> addItemAt(ToDoItem item, int index){
       items.add(index, item);
       return items;
    }// end additemtoBack method
    
    public ArrayList<ToDoItem> removeItemFromBack(){
        items.remove(items.size() - 1);
        return items;
    }// end removeItemFromBack
    
    public ArrayList<ToDoItem> removeItemFromFront(){
       items.remove(0);
       return items;
    }// end removeItemFromBack
    
    public ArrayList<ToDoItem> removeItemAt(int index){
       items.remove(index);
       return items;
    }// end additemtoBack method
    
    public ToDoItem getItemAtBack()      {return items.get(items.size() - 1);}// end getBack
    
    public ToDoItem getItemAtFront()     {return items.get(0);}// end getFront
    
    public ToDoItem getItemAt(int index) {return items.get(index);}// end getAt
    
        public ToDoItem setItemPriorityAt(int index, int priority){
        if(index >= 0 && index < items.size()){
            items.get(index).setPriority(priority);
        }else{
            System.out.println("Error in priority");
        }
         return items.get(index);
    }//end setItemPriority at
    
    public ToDoItem setItemWhatAt(int index, String what){
        if(index >= 0 && index < items.size()){
            items.get(index).setWhat(what);
        }else{
            System.out.println("Error in what");
        }
        return items.get(index);
    }// end setItemWhatAt method
    
    public ToDoItem setItemWhenAt(int index, String when){
        if(index >= 0 && index < items.size()){
            items.get(index).setWhen(when);
        }else{
            System.out.println("Error in when");
        }
        return items.get(index);
    }// end setItemWhent metod
    
    public ArrayList<ToDoItem> getHighPriorityItems(){
        ArrayList<ToDoItem> newListHigh = new ArrayList<>();
        for(ToDoItem l: items){
            if(l.getPriority() == 1){
                newListHigh.add(l);
            }
        }
        return newListHigh;
    }// end getHighPrior items
    
    public ArrayList<ToDoItem> getLowPriorityItems(){
        ArrayList<ToDoItem> newListLow = new ArrayList<>();
        for(ToDoItem e : items){
            if(e.getPriority() == 3){
                newListLow.add(e);
            }
        }
        return newListLow;
    }//end get lowPriority items
    
    public ArrayList<ToDoItem> getNormalPriorityItems(){
        ArrayList<ToDoItem> newListNormal = new ArrayList<>();
        for(ToDoItem f : items){
            if(f.getPriority() == 2){
                newListNormal.add(f);
            }
        }
        return newListNormal;
    }// end getNormalPrioty items
    
    public ArrayList<ToDoItem> getAllPriorityItems(){
        return items;
    }// end getallPrioity items
    
    @Override
    public String toString(){
      String str = "";
        for(ToDoItem g : items){
            str += g.toString() + "\n" ;
        }
      return str;
    }// end str to string
}// end class
