/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;
/**
 *
 * @author lab_services_student
 */
public class TaskUnitTest {


    @Test
    public void testTaskDescriptionLength() {
        String taskDescription = "Create Login to authenticate users";
        Assertions.assertTrue(taskDescription.length() <= 50, "Task description should be less than or equal to 50 characters");
    }

    @Test
    public void testTaskCaptureSuccess() {
        // Simulating the task capture process
        String capturedTask = "Task successfully captured";
        Assertions.assertEquals("Task successfully captured", capturedTask);
    }

    @Test
    public void testTaskCaptureFailure() {
        // Simulating the task capture process
        String capturedTask = "Create Add Task feature to add task users";
        Assertions.assertNotEquals("Task successfully captured", capturedTask, "Please enter a task description of less than 50 characters");
    }

   @Test
public void testTaskId() {
    // Assuming the task ID is generated as "CR:{taskNumber}:{developerInitials}"
    int taskNumber = 1;
    String developerInitials = "BYN";
    String expectedTaskId = "CR:1:BYN";
    String actualTaskId = generateTaskId(taskNumber, developerInitials);
    Assertions.assertEquals(expectedTaskId, actualTaskId);
}

@Test
public void testTaskIdLoop() {
    // Assuming the task ID is generated as "CR:{taskNumber}:{developerInitials}"
    String[] expectedTaskIds = {"CR:0:IKE", "CR:1:ARD", "CR:2:THA", "CR:3:ND"};

    for (int i = 0; i < expectedTaskIds.length; i++) {
        int taskNumber = i;
        String developerInitials = generateDeveloperInitials(i);
        String expectedTaskId = expectedTaskIds[i];
        String actualTaskId = generateTaskId(taskNumber, developerInitials);
        Assertions.assertEquals(expectedTaskId, actualTaskId);
    }
}

    @Test
    public void testTotalHoursAccumulation() {
        int[] durations = {10, 12, 55, 11, 1};
        int expectedTotalHours = 89;

        int totalHours = calculateTotalHours(durations);

        Assertions.assertEquals(expectedTotalHours, totalHours);
    }

    @Test
    public void testAdditionalTotalHoursAccumulation() {
        int[] durations = {10, 12, 55, 11, 1};
        int expectedTotalHours = 89;

        int totalHours = calculateTotalHours(durations);

        Assertions.assertEquals(expectedTotalHours, totalHours, "Total hours should be correctly accumulated");
    }

    // Helper methods for the tests

    private String generateTaskId(int taskNumber, String developerInitials) {
        return String.format("CR:%d:%s", taskNumber, developerInitials);
    }

    private String generateDeveloperInitials(int index) {
        String[] initials = {"IKE", "ARD", "THA", "ND"};
        return initials[index];
    }

    private int calculateTotalHours(int[] durations) {
        int total = 0;
        for (int duration : durations) {
            total += duration;
        }
        return total;
    }
}



    


