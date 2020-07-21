package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String LIST_NAME = "FirstTest";

    @Test
    public void testFindByListName() {



        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION);
        taskListRepository.save(taskList);
//        String LIST_NAME = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListRepository.findByListName(LIST_NAME);

        //Then
        Assert.assertTrue(readTasksList.get(0).getDescription().equals(DESCRIPTION));

        //CleanUp

        taskListRepository.delete(taskList);


    }

    @Test
    public void testTaskListRepositorySave () {
        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION);

        //When
        taskListRepository.save(taskList);

        //Then
        String listName = taskList.getListName();
        List<TaskList> readTask = taskListRepository.findByListName(listName);
        Assert.assertTrue(!readTask.isEmpty());

        //CleanUp
        taskListRepository.deleteById(listName);
    }

}