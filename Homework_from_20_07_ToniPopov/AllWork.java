package Homework_from_20_07_ToniPopov;

import java.util.ArrayList;
import java.util.Scanner;

public class AllWork {
	protected static ArrayList<Task> taskList = new ArrayList<Task>();
	private static int freePlacesForTask = 10;
	protected static int currentUnassignedTask = 0;
	Scanner in;

	AllWork() {
		addTask();
	}

	public void addTask() {
		if (AllWork.freePlacesForTask > 0) {
			in = new Scanner(System.in);
			System.out.println("How many task you want to add ?(limit " + AllWork.freePlacesForTask + ")");
			int lim = in.nextInt();
			in.nextLine();
			if (lim < 0) {
				lim = 0;
			} else if (lim > AllWork.freePlacesForTask) {
				lim = AllWork.freePlacesForTask;
			}
			System.out.println(lim);
			for (int i = 0; i < lim; i++) {
				if (i > 0) {
					in.nextLine();
				}
				AllWork.freePlacesForTask--;
				System.out.println("Enter the task name, press enter \nand than enter the hours for the task");
				AllWork.taskList.add(new Task(in.nextLine(), in.nextDouble()));
			}
//			System.out.println("free tasks: " + AllWork.freePlacesForTask);
		}
	}

	public void tasksInfo() {
		if(AllWork.taskList.size()> 0){
		for (int i = 0; i < AllWork.taskList.size(); i++) {
			System.out.println(AllWork.taskList.get(i));
		}
		}else{
			System.out.println("size 0");
		}
	}

	public void closeSc() {
		in.close();
	}

}
