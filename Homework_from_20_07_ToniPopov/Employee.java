package Homework_from_20_07_ToniPopov;

public class Employee {
	private String name;
	private Task currentTask;
	private double hoursLeft;
	private int index;

	Employee() {
		this.name = "Employee";
		this.hoursLeft = 8;
	}

	Employee(String name) {
		this();
		setName(name);
		setCurrentTask();
	}

	public void work() {
		// helping variables , to make the code more readable
		double taskHours = this.currentTask.getWorkingHours();
		double remainingHours = this.hoursLeft;

		if (taskHours > remainingHours) {
			System.out.println("I have to work " + (taskHours - remainingHours) + " hours to finish the task !");
			this.currentTask.setWorkingHours((taskHours - remainingHours));
			this.hoursLeft = 0;
		}
		if (taskHours == remainingHours) {
			System.out.println("I`ll finish the task to the edn of the day !");
			this.currentTask.setWorkingHours(0);
			this.hoursLeft = 0;
			if (AllWork.taskList.size() > 0) {
				AllWork.taskList.remove(this.index);
			}
			setCurrentTask();
		}
		if (taskHours < remainingHours) {
			System.out.println("I have " + (remainingHours - taskHours) + " hourse left to the end of the day ");
			this.hoursLeft = (remainingHours - taskHours);
			this.currentTask.setWorkingHours(0);
			setCurrentTask();
		}
	}

	public void showReport() {
		System.out.println("\nEmployee information:\n");
		System.out.println("Employee name: " + this.name);
		System.out.println("Current task: " + this.currentTask.getTaskName());
		System.out.println("Task working hours: " + this.currentTask.getWorkingHours());
		System.out.println("Remaining hours: " + this.hoursLeft + "\n");
	}

	public void startWorkingDay() {
		this.hoursLeft = 8;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	public void setHourseLeft(int hourseLeft) {
		if (hourseLeft > 0) {
			this.hoursLeft = hourseLeft;
		}
	}

	public void setCurrentTask() {
		if (AllWork.taskList.size() > 0) {
			String taskName = AllWork.taskList.get(0).getTaskName();
			double workingHours = AllWork.taskList.get(0).getWorkingHours();
			if (taskName != null && !taskName.isEmpty() && workingHours > 0) {
				this.currentTask = new Task(taskName, workingHours);
				AllWork.taskList.remove(0);
			}
		}
	}

	public void check() {
		if (this.getHoursLeft() == 0) {
			this.startWorkingDay();
		} else {
			this.work();
			this.showReport();
		}
	}
public double taskHoursLeft(){
	return this.currentTask.getWorkingHours();
}
	public double getHoursLeft() {
		return hoursLeft;
	}
}
