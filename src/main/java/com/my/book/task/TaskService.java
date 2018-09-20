package com.my.book.task;

import org.springframework.beans.factory.annotation.Autowired;

public class TaskService {

	@Autowired
	private AsyncTask asyncTask;
	
	public void doTask() throws InterruptedException {
		asyncTask.task1();
		asyncTask.task2();
		asyncTask.task3();
	}
}
