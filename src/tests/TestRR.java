package src.tests;

import java.util.ArrayList;
import java.util.List;
import src.models.Process;
import src.schedulers.RRScheduler;

public class TestRR {

    public static void main(String[] args) {

        List<Process> processes = new ArrayList<>();

        processes.add(new Process("P1", 0, 10, 5));
        processes.add(new Process("P2", 2, 5, 1));
        processes.add(new Process("P3", 5, 3, 2));
        processes.add(new Process("P4", 8, 7, 1));
        processes.add(new Process("P5", 10, 2, 3));

        int contextSwitch = 1;
        int quantum = 4;
        double sumWaiting = 0;
        double sumTurnaround = 0;

        List<String> order = RRScheduler.run(processes, quantum, contextSwitch);

        System.out.println("Execution Order: " + order);

        for (Process p : processes) {
            System.out.printf(
                "%s | Waiting= %d | Turnaround= %d\n",
                p.name,
                p.waitingTime,
                p.turnaroundTime
            );
            sumWaiting += p.waitingTime;
            sumTurnaround += p.turnaroundTime;
        }
        System.out.printf(
            "Arverage Waiting Time: %.1f | Average Turnaround Time: %.1f\n",
            sumWaiting / processes.size(),
            sumTurnaround / processes.size()
        );
    }
}
