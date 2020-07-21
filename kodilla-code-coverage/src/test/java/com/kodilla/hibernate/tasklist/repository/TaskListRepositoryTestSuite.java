package com.kodilla.hibernate.tasklist.repository;
import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String listName = "FirstTest";

    @Test
    public void testFindByListName() {



        //Given
        TaskList taskList = new TaskList(listName, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListRepository.findByListName(listName);

        //Then
        Assert.assertTrue(readTasksList.get(0).getDescription().equals(DESCRIPTION));

        //CleanUp

        taskListRepository.delete(taskList);


    }



    @Test
    public void testTaskListRepositorySaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("New list", "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //Then
        Assert.assertNotEquals("", listName);

        //CleanUp
        taskListRepository.delete(taskList);
    }

}