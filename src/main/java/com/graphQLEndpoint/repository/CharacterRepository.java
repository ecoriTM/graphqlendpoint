package com.graphQLEndpoint.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.graphQLEndpoint.dto.Character;

import lombok.Getter;


@Service
public class CharacterRepository {

    Logger logger = LoggerFactory.getLogger( CharacterRepository.class );

    // Simple in-memory-db, alternatively spring-boot-jpa could be used for easily creating a real repository layer
    @Getter
    private List<Character> characterInMemoryStore = new ArrayList<>();

    public List<Character> findAll() {
        return this.characterInMemoryStore;
    }

    public void save( Character character ) {
        logger.debug( "Saved Character with name: {} in in-memory- db", character.getName() );
        this.characterInMemoryStore.add( character );
    }

    // Since Task calls for a non unique name a list is used here, with all its down sites regarding performance
    // (word case of lookup here is O(n)).
    // If name would be unique or a real database and not a in-memory implementation would be in use, a
    // Hashmap could be used here for O(1) on lookup.
    public Optional<List<Character>> findAllByName( String name ) {
        List<Character> retList = new ArrayList<>();
        for( Character elem : getCharacterInMemoryStore() ) {
            if( elem.getName().equalsIgnoreCase( name ) ) {
                retList.add( elem );
            }
        }
        return Optional.of( retList );
    }
}
