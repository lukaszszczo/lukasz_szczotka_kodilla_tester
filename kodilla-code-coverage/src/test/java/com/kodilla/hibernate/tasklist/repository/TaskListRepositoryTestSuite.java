package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String listName = "FirstTest";

    @Test
    public void testTaskRepositoryFindByDuration() {



        //Given
        TaskList taskList = new TaskList(listName, DESCRIPTION) {
        };
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListRepository.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTasksList.size());

        //CleanUp

        taskListRepository.delete(taskList);


    }
}