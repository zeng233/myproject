package com.myspring.integration.schedule.spring;

import org.springframework.core.task.TaskExecutor;

/**
 * 定时执行规则自己定义
 */
public class TaskExecutorJob
{
	private TaskExecutor taskExecutor;

	public TaskExecutorJob(TaskExecutor taskExecutor)
	{
		this.taskExecutor = taskExecutor;
	}

	public void printMessages()
	{
		for (int i = 0; i < 25; i++) {
			taskExecutor.execute(new MessagePrinterTask("Message" + i));
		}
	}

	private class MessagePrinterTask implements Runnable
	{
		private String message;

		public MessagePrinterTask(String message)
		{
			this.message = message;
		}

		public void run()
		{
			System.out.println(message);
		}

	}
}
