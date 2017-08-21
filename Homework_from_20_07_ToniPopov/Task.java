package Homework_from_20_07_ToniPopov;

public class Task {
	private String taskName;
	private double workingHours;

	Task() {
		this.taskName = "Work";
		this.workingHours = 8;
	}

	Task(String taskName, double workingHours) {
		this();// if the input data are invalid
		setTaskName(taskName);
		setWorkingHours(workingHours);
	}

	public void setTaskName(String name) {
		if (name != null && !name.isEmpty()) {
			this.taskName = name;
		}
	}

	public String toString() {
		return ("Task name: " + this.taskName + "\nWorking hours: " + this.workingHours+"\n");
	}

	public void setWorkingHours(double hourse) {
		if (hourse >= 0) {
			this.workingHours = hourse;
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public double getWorkingHours() {
		return this.workingHours;
	}
}
