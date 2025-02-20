package com.cp.compiler.controllers;

import com.cp.compiler.exceptions.ContainerFailedDependencyException;
import com.cp.compiler.services.ContainerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;

import java.io.IOException;

/**
 * The type Containers info controller tests.
 */
@DirtiesContext
@ExtendWith(MockitoExtension.class)
@SpringBootTest
class ContainersInfoControllerTests {
    
    @InjectMocks
    private ContainersInfoController containersInfoController;
    
    @Mock
    private ContainerService containerService;
    
    @Test
    void WhenGetRunningContainersThrowAnExceptionThenTheServiceShouldThrowContainerFailedDependencyException() {
        // Given
        Mockito.when(containerService.getRunningContainers())
                .thenThrow(new ContainerFailedDependencyException());
        
        // When
        Assertions.assertThrows(ContainerFailedDependencyException.class, () -> {
            containersInfoController.getRunningContainers();
        });
    }
    
    /**
     * When get running containers is executed then the service should return status code 200.
     *
     * @throws IOException the io exception
     */
    @Test
    void WhenGetRunningContainersIsExecutedThenTheServiceShouldReturnStatusCode200() {
        // Given
        String returnedAnswer = "value result";
        Mockito.when(containerService.getRunningContainers()).thenReturn(returnedAnswer);
        
        // When
        ResponseEntity<String> result = containersInfoController.getRunningContainers();
        
        // Then
        Assertions.assertEquals(200, result.getStatusCodeValue());
        Assertions.assertEquals(returnedAnswer, result.getBody());
    }
    
    /**
     * When get images throw an exception then the service should throw ContainerFailedDependencyException
     *
     * @throws IOException the io exception
     */
    @Test
    void WhenGetImagesThrowAnExceptionThenTheServiceShouldThrowContainerFailedDependencyException() {
        // Given
        Mockito.when(containerService.getImages())
                .thenThrow(new ContainerFailedDependencyException());

        // When
        Assertions.assertThrows(ContainerFailedDependencyException.class, () -> {
            containersInfoController.getImages();
        });
    }
    
    /**
     * When get images is executed then the service should return status code 200.
     *
     * @throws IOException the io exception
     */
    @Test
    void WhenGetImagesIsExecutedThenTheServiceShouldReturnStatusCode200() {
        // Given
        String returnedAnswer = "value result";
        Mockito.when(containerService.getImages()).thenReturn(returnedAnswer);
        
        // When
        ResponseEntity<String> result = containersInfoController.getImages();
        
        // Then
        Assertions.assertEquals(200, result.getStatusCodeValue());
        Assertions.assertEquals(returnedAnswer, result.getBody());
    }
    
    /**
     * When get running containers stats throw an exception then the service should throw ContainerFailedDependencyException
     *
     * @throws IOException the io exception
     */
    @Test
    void WhenGetRunningContainersStatsThrowAnExceptionThenTheServiceShouldThrowContainerFailedDependencyException() {
        // Given
        Mockito.when(containerService.getContainersStats())
                .thenThrow(new ContainerFailedDependencyException());
    
        // When
        Assertions.assertThrows(ContainerFailedDependencyException.class, () -> {
            containersInfoController.getRunningContainersStats();
        });
    }
    
    /**
     * When get running containers stats is executed then the service should return status code 200.
     *
     * @throws IOException the io exception
     */
    @Test
    void WhenGetRunningContainersStatsIsExecutedThenTheServiceShouldReturnStatusCode200() {
        // Given
        String returnedAnswer = "value result";
        Mockito.when(containerService.getContainersStats()).thenReturn(returnedAnswer);
        
        // When
        ResponseEntity<String> result = containersInfoController.getRunningContainersStats();
        
        // Then
        Assertions.assertEquals(200, result.getStatusCodeValue());
        Assertions.assertEquals(returnedAnswer, result.getBody());
    }
    
    /**
     * When get all containers stats throw an exception then the service should return status code 500.
     *
     * @throws IOException the io exception
     */
    @Test
    void WhenGetAllContainersStatsThrowAnExceptionThenTheServiceShouldThrowContainerFailedDependencyException() {
        // Given
        Mockito.when(containerService.getAllContainersStats())
                .thenThrow(new ContainerFailedDependencyException());
    
        // When
        Assertions.assertThrows(ContainerFailedDependencyException.class, () -> {
            containersInfoController.getAllContainersStats();
        });
    }
    
    /**
     * When get all containers stats is executed then the service should return status code 200.
     *
     * @throws IOException the io exception
     */
    @Test
    void WhenGetAllContainersStatsIsExecutedThenTheServiceShouldReturnStatusCode200() {
        // Given
        String returnedAnswer = "value result";
        Mockito.when(containerService.getAllContainersStats()).thenReturn(returnedAnswer);
        
        // When
        ResponseEntity<String> result = containersInfoController.getAllContainersStats();
        
        // Then
        Assertions.assertEquals(200, result.getStatusCodeValue());
        Assertions.assertEquals(returnedAnswer, result.getBody());
    }
    
}
