# Tasks Memberships

## Member 1 - Input/Output + Models <!-- Malak Khattab -->
### Working files
* [Process](src/models/process.java)
* [InputHandler](src/io/inputHandler.java)
* [OutputHandler](src/io/outputHandler.java)
* [Main](src/Main.java)

### Tasks to be performed
- [ ] Define the process structure
- [ ] Make input reader
- [ ] Print all results
- [ ] Create main program that calls all schedulers

## Member 2 - Preemptive SJF <!-- Gehad Shaban -->
### Working files
* [SJFScheduler](src/schedulers/SJFScheduler.java)
* [TestSJF](src/tests/TestSJF.java)

### Tasks to be performed
- [ ] Implement preemptive SJF scheduler
- [ ] Implement context switching
- [ ] Return execution history, waiting time, turnaround

## Member 3 - Round Robin <!-- Ahmed Hassan -->
### Working files
* [RRScheduler](src/schedulers/RRScheduler.java)
* [TestRR](src/tests/TestRR.java)

### Tasks to be performed
- [x] Implement RR with context swiching
- [x] Handle quantum
- [x] Calculate times

## Member 4 - Preemptive Priority <!-- Mohamed Sayed -->
### Working files
* [PriorityScheduler](src/schedulers/PriorityScheduler.java)
* [TestPriority](src/tests/TestPriority.java)

### Tasks to be performed
- [ ] Preemptive priority algorithm
- [ ] Add starvation prevention
- [ ] Context switching

## Member 5 - AG Scheduling <!-- Ahmed Mohamed -->
### Working files
* [AGScheduler](src/schedulers/AGScheduler.java)
* [TestAG](src/tests/TestAG.java)

### Tasks to be performed
- [ ] Full AG scheduling algorithm
- [ ] All 4 scenarios form assignment
- [ ] 25%, 50% calculation
- [ ] Update quantum history