class TaskNode{
	int taskId;
	String taskName;
	int priority;
	String dueDate;
	
	TaskNode next;
	public TaskNode(int taskId,String taskName,int priority,String dueDate) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.priority = priority;
		this.dueDate = dueDate;
		this.next = null;
	}
	
}

class TaskOperations{
	TaskNode head = null;
	TaskNode current = null;
	public void addAtBeginning(int taskId,String taskName,int priority,String dueDate) {
		TaskNode newTask = new TaskNode(taskId,taskName,priority,dueDate);
		if(head == null) {
			head = newTask;
			newTask.next = head;
		}else {
			TaskNode temp = head;
			while(temp.next!=head) {
				temp = temp.next;
			}
			newTask.next = head;
			temp.next = newTask;
			head = newTask;
		}
		
	}
	
	public void addAtEnd(int taskId,String taskName,int priority,String dueDate) {
		TaskNode newTask = new TaskNode(taskId,taskName,priority,dueDate);
		if(head == null) {
			head = newTask;
			newTask.next = head;
			return;
		}
		TaskNode temp = head;
		while(temp.next!=head) {
			temp = temp.next;
		}
		temp.next = newTask;
		newTask.next = head;
		
	}
	
	public void addAtPosition(int position,int taskId,String taskName,int priority,String dueDate) {
		if(position == 1) {
			addAtBeginning(taskId,taskName,priority,dueDate);
			return;
		}
		TaskNode newTask = new TaskNode(taskId,taskName,priority,dueDate);
		TaskNode temp = head;
		for(int i = 1;i < position-1 && temp.next!=null;i++) {
			temp = temp.next;
		}
		newTask.next = temp.next;
		temp.next = newTask;
	}
	
	public void removeById(int Id) {
		if(head == null) {
			return;
		}
		
		TaskNode curr = head, prev = null;

        do {
            if (curr.taskId == Id) {
                if (prev != null) {
                    prev.next = curr.next;
                } else {
                    TaskNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = curr.next;
                    temp.next = head;
                }
                System.out.println("Task removed: " + Id);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Task not found!");
    }
		
	public void viewNextTask() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        if (current == null) {
            current = head;
        }

        System.out.println("Current Task:");
        printTask(current);
        current = current.next;
    
	}
	
	public void displayTasks() {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        TaskNode temp = head;
        while (true) {
            printTask(temp);
            temp = temp.next;

            if (temp == head) break;
        }
    }
	
	public void searchByPriority(int priority) {
        if (head == null) return;

        TaskNode temp = head;
        boolean found = false;

        while (true) {
            if (temp.priority == priority) {
                printTask(temp);
                found = true;
            }

            temp = temp.next;
            if (temp == head) break;
        }

        if (!found) {
            System.out.println("No task found");
        }
    }
	
	public void printTask(TaskNode task) {
        System.out.println("Task ID: " + task.taskId +",Task Name: " + task.taskName +",Task Priority: " + task.priority +", DueDate: " + task.dueDate);
    }
}
public class TaskScheduller {

	public static void main(String[] args) {
		TaskOperations task = new TaskOperations();

		task.addAtEnd(1, "Design", 1, "10-Feb");
		task.addAtEnd(2, "Development", 2, "12-Feb");
		task.addAtBeginning(3, "Bug Fix", 1, "08-Feb");

		task.displayTasks();

		task.viewNextTask();
		task.viewNextTask();

		task.searchByPriority(1);

		task.removeById(2);
		task.displayTasks();

	}

}
