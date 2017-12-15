------------------------------------------------------------------------
This is the project README file.
This program makes a schedule for the user and prioritizes the items
------------------------------------------------------------------------

PROJECT TITLE: ToDoList

PURPOSE OF PROJECT: Make a "To do" list for the user

VERSION or DATE: September 11, 2017

HOW TO START THIS PROJECT: Open project files in the BlueJ IDE. Run the main
method and follow the commands to enter your "ToDoList"

AUTHORS: Kyle Shive

USER INSTRUCTIONS: 
This program asks the user to input a schedule. It first asks for the priority of the 
task from 1 - 3. 1 being the highest, 2 being normal, 3 being lowest priority. 
It then asks for what the task is, and what days during the week the task will
need to be completed, S-S. At the end it generates a toString that formats the 
output in an easier to read schedule for the user. 


Below is the UML

------------------------------------------------------------------------------------------------
                                           ToDoItem
------------------------------------------------------------------------------------------------
-priority: int
-what: String
-when: String
------------------------------------------------------------------------------------------------
+ToDoItem()
+ToDoItem(priority: int, what: String, when: String)

+getPriority(): int
+getWhat(): String
+getWhen(): String
+setPriority(priority: int): ToDoItem
+setWhat(what: String): ToDoItem
+setWhen(when: String): ToDoItem

+toString(): String <<Override>>
------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------
                                           WeeklyToDoList
------------------------------------------------------------------------------------------------
-PRIORITY_HIGH: static final int = 1
-PRIORITY_NORMAL: static final int = 2
-PRIORITY_LOW: static final int = 3
-list: ArrayList<ToDoItem>
------------------------------------------------------------------------------------------------
+WeeklyToDoList()

+addItemToBack(o: ToDoItem): ArrayList<ToDoItem>
+addItemToFront(o: ToDoItem): ArrayList<ToDoItem>
+addItemAt(o: ToDoItem, index: int): ArrayList<ToDoItem>
+removeItemFromBack(): ArrayList<ToDoItem>
+removeItemFromFront(): ArrayList<ToDoItem>
+removeItemAt(index: int): ArrayList<ToDoItem>

+getItemAtBack(): ToDoItem
+getItemAtFront(): ToDoItem
+getItemAt(index: int): ToDoItem
+setItemPriorityAt(index: int, priority: int): ToDoItem
+setItemWhatAt(index: int, what: String): ToDoItem
+setItemWhenAt(index: int, what: String): ToDoItem

+getHighPriorityItems(): ArrayList<ToDoItem>
+getLowPriorityItems(): ArrayList<ToDoItem>
+getNormalPriorityItems(): ArrayList<ToDoItem>
+getAllPriorityItems(): ArrayList<ToDoItem>

+toString(): String <<Override>>

