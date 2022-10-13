package com.graphQLEndpoint;

import com.graphQLEndpoint.repository.CharacterRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class ApplicationTests {

    @Autowired
    CharacterRepository characterRepository;

    @Test
    void testCharactersAreSavedInCharacterRepositoryStorage() {
        assertFalse(characterRepository.getCharacterInMemoryStore().isEmpty());
        assertEquals(characterRepository.getCharacterInMemoryStore().size(), 4);
    }

    @Test
    void contextLoads() {
    }

}
