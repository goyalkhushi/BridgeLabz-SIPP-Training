package linkedlist;

class Process {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnAroundTime;
    Process next;

    Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnAroundTime = 0;
        this.next = null;
    }
}

class CircularLinkedList {
    private Process tail = null;

  
    public void addProcess(int pid, int burstTime, int priority) {
        Process newNode = new Process(pid, burstTime, priority);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        }
        else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Remove process by pid
    public void removeProcess(int pid) {
        if (tail == null) return;

        Process curr = tail.next, prev = tail;
        do {
            if (curr.pid == pid) {
                if (curr == tail && curr.next == tail) {
                    tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == tail) tail = prev;
                }
                break;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != tail.next);
    }

    // Simulate Round-Robin Scheduling
    public void roundRobin(int timeQuantum) {
        if (tail == null) return;

        int time = 0;
        Process curr = tail.next;
        int totalProcesses = getSize();

        System.out.println("Starting Round-Robin Scheduling:\n");

        while (tail != null) {
            System.out.println("Time = " + time);
            displayProcesses();

            if (curr.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, curr.remainingTime);
                curr.remainingTime -= execTime;
                time += execTime;

               
                Process temp = curr.next;
                while (temp != curr) {
                    if (temp.remainingTime > 0)
                        temp.waitingTime += execTime;
                    temp = temp.next;
                }

                if (curr.remainingTime == 0) {
                    curr.turnAroundTime = time;
                    System.out.println("Process P" + curr.pid + " completed.");
                    Process toRemove = curr;
                    curr = curr.next;
                    removeProcess(toRemove.pid);
                }
                else {
                    curr = curr.next;
                }
            } 
            else {
                curr = curr.next;
            }

            System.out.println();
        }

        System.out.println("All processes completed.\n");
        displayAverages(totalProcesses);
    }

    // Display current state of processes
    public void displayProcesses() {
        if (tail == null) {
            System.out.println("No processes in queue.");
            return;
        }

        Process curr = tail.next;
        do {
            System.out.println("P" + curr.pid + " [Remaining: " + curr.remainingTime +
                               ", Waiting: " + curr.waitingTime + "]");
            curr = curr.next;
        }
        while (curr != tail.next);
        System.out.println();
    }

    // Display average waiting and turnaround time
    public void displayAverages(int total) {
        if (total == 0) return;
        double totalWT = 0, totalTAT = 0;
        System.out.println("Final Turnaround and Waiting Times:");

        System.out.printf("Average Waiting Time = %.2f\n", totalWT / total);
        System.out.printf("Average Turnaround Time = %.2f\n", totalTAT / total);
    }

    // Count total processes
    public int getSize() {
        if (tail == null) return 0;
        int count = 0;
        Process curr = tail.next;
        do {
            count++;
            curr = curr.next;
        } while (curr != tail.next);
        return count;
    }
}

public class round_robin {
    public static void main(String[] args) {
        CircularLinkedList scheduler = new CircularLinkedList();

        // Sample input
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);
        scheduler.addProcess(4, 6, 3);

        int timeQuantum = 4;
        scheduler.roundRobin(timeQuantum);
    }
}
