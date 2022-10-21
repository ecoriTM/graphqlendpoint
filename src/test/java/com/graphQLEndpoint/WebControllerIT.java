package com.graphQLEndpoint;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.context.annotation.Import;
import org.springframework.graphql.test.tester.GraphQlTester;

import com.graphQLEndpoint.dto.Character;
import com.graphQLEndpoint.repository.CharacterRepository;
import com.graphQLEndpoint.web.WebController;


@Import( CharacterRepository.class )
@GraphQlTest( WebController.class )
public class WebControllerIT {

    @Autowired
    GraphQlTester graphQlTester;

    @Test
    void testFindCharactersByNameReturnsCorrectCharacters() {
        // language=GraphQL
        String document = "query {\n" +
                          "  getCharactersByName(name: \"Summer Smith\"){\n" +
                          "    name\n" +
                          "    episode\n" +
                          "    type\n" +
                          "\n" +
                          "  }\n" +
                          "}";

        graphQlTester.document( document )
                .execute().path( "getCharactersByName" )
                .entityList( Character.class )
                .hasSize( 2 );
    }

    @Test
    void testFindAllCharactersReturnsCharacters() {
        // language=GraphQL
        String document = "query {\n" +
                          "  getAllCharacters {\n" +
                          "    name\n" +
                          "  }\n" +
                          "}";

        graphQlTester.document( document )
                .execute().path( "getAllCharacters" )
                .entityList( Character.class )
                .hasSize( 4 );
    }

    @Test
    void testFindCharacterByNameValidTest() {
        // language=GraphQL
        String document = "query {\n" +
                          "  getCharactersByName(name: \"Summer Smith\"){\n" +
                          "    name\n" +
                          "    gender\n" +
                          "    species\n" +
                          "\n" +
                          "  }\n" +
                          "}";

        graphQlTester.document( document )
                .execute().path( "getCharactersByName" )
                .entityList( Character.class )
                .satisfies( characters -> {
                    assertEquals( "Summer Smith", characters.get( 0 ).getName() );
                    assertEquals( "Female", characters.get( 0 ).getGender() );
                    assertEquals( "Human", characters.get( 0 ).getSpecies() );
                } );
    }
}