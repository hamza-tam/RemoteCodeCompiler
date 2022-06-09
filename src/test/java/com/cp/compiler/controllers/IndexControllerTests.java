package com.cp.compiler.controllers;

import com.cp.compiler.executions.ExecutionFactory;
import com.cp.compiler.models.Language;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest
class IndexControllerTests {
    
    @Autowired
    private IndexController indexController;
    
    @Test
    void shouldReturnSupportedLanguages() {
        // When
        Set<Language> supportedLanguages = indexController.getSupportedLanguages();
        
        // Then
        Assertions.assertEquals(ExecutionFactory.getRegisteredFactories(), supportedLanguages);
    }
}
