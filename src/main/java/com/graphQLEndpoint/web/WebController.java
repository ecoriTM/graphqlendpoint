package com.graphQLEndpoint.web;

import com.graphQLEndpoint.dto.Character;
import com.graphQLEndpoint.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;


@Controller
@RequiredArgsConstructor
public class WebController {

    Logger logger = LoggerFactory.getLogger(WebController.class);

    private final CharacterRepository characterRepository;

    @QueryMapping
    public Iterable<Character> getAllCharacters() {
        logger.info("graphql endpoint getAllCharacters invoked");
        return characterRepository.findAll();
    }

    @QueryMapping
    public Optional<List<Character>> getCharactersByName(@Argument String name) {
        logger.info("graphql endpoint getCharactersByName with name: {} invoked", name);
        return characterRepository.findAllByName(name);
    }

}
