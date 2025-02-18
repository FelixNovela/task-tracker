package model.entities.crud;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import model.entities.Task;
import model.entities.enums.Status;

public class TaskCrud{
	private static String TASKFILE = "TASKFILE.dat";
	
	public void addTask(Task task) {
		List<Task> tasks = listTask();
		tasks.addLast(task);
		saveTask(tasks);
	}
	public List<Task> listTask(){
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(TASKFILE))){
			return (List<Task>) ois.readObject();
		}catch (FileNotFoundException e) {
			return new ArrayList<Task>();
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return new ArrayList<Task>();  
		}
	}
	
	public void updateTask(Task task, Status status) {
		List<Task> tasks = listTask();
		for(int i = 0; i < tasks.size(); i++) {
			if(tasks.get(i).getId().equals(task.getId())) {
				task.setStatus(status);
				tasks.set(i, task);
			}
		}
		saveTask(tasks);
	}
	
	public void saveTask(List<Task> tasks) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(TASKFILE))){
			oos.writeObject(tasks);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
