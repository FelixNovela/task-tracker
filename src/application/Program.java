package application;

import java.time.LocalDate;
import java.util.List;

import model.entities.Task;
import model.entities.crud.TaskCrud;
import model.entities.enums.Status;

public class Program {

	public static void main(String[] args) {
		TaskCrud tskc = new TaskCrud();
		tskc.updateTask(new Task("TASK1","ESTUDAR JAVA", LocalDate.now(), LocalDate.parse("2025-02-20")), Status.DONE);
		//tskc.addTask(new Task("TASK1","ESTUDAR JAVA", LocalDate.now(), LocalDate.parse("2025-02-20")));
		List<Task> lista = tskc.listTask();
		for(Task listar : lista) {
			System.out.println(listar);
		}
		

		System.out.println("ATUALIZAR");
		List<Task> listaa = tskc.listTask(); 
		for(Task listar : listaa) {
			System.out.println(listar);
		}
	}

}
