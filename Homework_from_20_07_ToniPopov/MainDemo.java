package Homework_from_20_07_ToniPopov;

public class MainDemo {

	public static void main(String[] args) {

		AllWork all = new AllWork();

		all.tasksInfo();
		all.addTask();
		all.tasksInfo();

		Employee pi = new Employee("Pesho");
		Employee kolio = new Employee("Kolio");
		Employee venci = new Employee("Venci");
		while (true) {
			pi.showReport();
			kolio.showReport();
			venci.showReport();
			pi.check();
			kolio.check();
			venci.check();
			if ((pi.taskHoursLeft() + kolio.taskHoursLeft() + venci.taskHoursLeft()) == 0
					&& AllWork.taskList.size() == 0) {
				break;
			}
		}
	}

}
test
