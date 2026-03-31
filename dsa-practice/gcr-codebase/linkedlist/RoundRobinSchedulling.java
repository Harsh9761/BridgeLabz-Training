class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnAroundTime;
    
    ProcessNode next;
    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private ProcessNode head = null;
    private ProcessNode tail = null;


    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newProcess = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = tail = newProcess;
            newProcess.next = head;
            return;
        }

        tail.next = newProcess;
        newProcess.next = head;
        tail = newProcess;
    }

    public void removeProcess(ProcessNode prev, ProcessNode curr) {
        if (curr == head && curr == tail) {
            head = tail = null;
        } 
        else if (curr == head) {
            head = head.next;
            tail.next = head;
        } 
        else if (curr == tail) {
            prev.next = head;
            tail = prev;
        } 
        else {
            prev.next = curr.next;
        }
    }

    public void displayQueue() {
        if (head == null) {
            System.out.println("No processes left");
            return;
        }

        ProcessNode temp = head;
        while (true) {
            System.out.print("P" + temp.pid + "(" + temp.remainingTime + ") ");
            temp = temp.next;
            if (temp == head)
                break;
        }
        System.out.println();
    }

    public void schedule(int timeQuantum) {
        if (head == null) return;

        int time = 0;
        int completed = 0;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;

        ProcessNode curr = head;
        ProcessNode prev = tail;

        System.out.println("Initial Queue:");
        displayQueue();
        System.out.println();

        while (head != null) {

            if (curr.remainingTime > 0) {
                if (curr.remainingTime > timeQuantum) {
                    time += timeQuantum;
                    curr.remainingTime -= timeQuantum;
                } else {
                    time += curr.remainingTime;
                    curr.remainingTime = 0;

                    curr.turnAroundTime = time;
                    curr.waitingTime = curr.turnAroundTime - curr.burstTime;

                    totalWaitingTime += curr.waitingTime;
                    totalTurnAroundTime += curr.turnAroundTime;
                    completed++;

                    removeProcess(prev, curr);
                }
            }

            displayQueue();

            if (head == null)
                break;

            prev = curr;
            curr = curr.next;
        }

        System.out.println("\nScheduling Complete");
        System.out.println("Average Waiting Time = " + (double) totalWaitingTime / completed);
        System.out.println("Average Turnaround Time = " + (double) totalTurnAroundTime / completed);
    }
}


public class RoundRobinSchedulling {

	public static void main(String[] args) {
		
		
		RoundRobinScheduler roundRobin = new RoundRobinScheduler();

		roundRobin.addProcess(1, 10, 1);
		roundRobin.addProcess(2, 5, 2);
		roundRobin.addProcess(3, 8, 1);

        int timeQuantum = 3;

        roundRobin.schedule(timeQuantum);

	}

}
