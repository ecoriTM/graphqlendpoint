package com.graphQLEndpoint;


import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.graphQLEndpoint.dto.Character;
import com.graphQLEndpoint.dto.Location;
import com.graphQLEndpoint.dto.Origin;
import com.graphQLEndpoint.repository.CharacterRepository;


@SpringBootApplication
public class Application {

    public static void main( String[] args ) {
        SpringApplication.run( Application.class, args );
    }

    @Bean
    ApplicationRunner applicationRunner( CharacterRepository characterRepository ) {
        return args -> {
            characterRepository.save( createRickSanchezEntry( 1 ) );
            characterRepository.save( createMortySmithEntry( 2 ) );
            characterRepository.save( createSummerSmithEntry( 3 ) );
            characterRepository.save( createSummerSmithEntry( 4 ) );
        };
    }

    private Character createRickSanchezEntry( int id ) {
        return Character.builder().id( id ).name( "Rick Sanchez" )
                .status( "Alive" )
                .species( "Human" )
                .type( "" )
                .gender( "Male" )
                .origin( Origin.builder().name( "Earth (C-137)" ).url( "https://rickandmortyapi.com/api/location/1" ).build() )
                .image( "https://rickandmortyapi.com/api/character/avatar/2.jpe" )
                .episode( asList( "https://rickandmortyapi.com/api/episode/1",
                                         "https://rickandmortyapi.com/api/episode/2",
                                         "https://rickandmortyapi.com/api/episode/3",
                                         "https://rickandmortyapi.com/api/episode/4",
                                         "https://rickandmortyapi.com/api/episode/5",
                                         "https://rickandmortyapi.com/api/episode/6",
                                         "https://rickandmortyapi.com/api/episode/7",
                                         "https://rickandmortyapi.com/api/episode/8",
                                         "https://rickandmortyapi.com/api/episode/9",
                                         "https://rickandmortyapi.com/api/episode/10",
                                         "https://rickandmortyapi.com/api/episode/11",
                                         "https://rickandmortyapi.com/api/episode/12",
                                         "https://rickandmortyapi.com/api/episode/13",
                                         "https://rickandmortyapi.com/api/episode/14",
                                         "https://rickandmortyapi.com/api/episode/15",
                                         "https://rickandmortyapi.com/api/episode/16",
                                         "https://rickandmortyapi.com/api/episode/17",
                                         "https://rickandmortyapi.com/api/episode/18",
                                         "https://rickandmortyapi.com/api/episode/19",
                                         "https://rickandmortyapi.com/api/episode/20",
                                         "https://rickandmortyapi.com/api/episode/21",
                                         "https://rickandmortyapi.com/api/episode/22",
                                         "https://rickandmortyapi.com/api/episode/23",
                                         "https://rickandmortyapi.com/api/episode/24",
                                         "https://rickandmortyapi.com/api/episode/25",
                                         "https://rickandmortyapi.com/api/episode/26",
                                         "https://rickandmortyapi.com/api/episode/27",
                                         "https://rickandmortyapi.com/api/episode/28",
                                         "https://rickandmortyapi.com/api/episode/29",
                                         "https://rickandmortyapi.com/api/episode/30",
                                         "https://rickandmortyapi.com/api/episode/31",
                                         "https://rickandmortyapi.com/api/episode/32",
                                         "https://rickandmortyapi.com/api/episode/33",
                                         "https://rickandmortyapi.com/api/episode/34",
                                         "https://rickandmortyapi.com/api/episode/35",
                                         "https://rickandmortyapi.com/api/episode/36",
                                         "https://rickandmortyapi.com/api/episode/37",
                                         "https://rickandmortyapi.com/api/episode/38",
                                         "https://rickandmortyapi.com/api/episode/39",
                                         "https://rickandmortyapi.com/api/episode/40",
                                         "https://rickandmortyapi.com/api/episode/41",
                                         "https://rickandmortyapi.com/api/episode/42",
                                         "https://rickandmortyapi.com/api/episode/43",
                                         "https://rickandmortyapi.com/api/episode/44",
                                         "https://rickandmortyapi.com/api/episode/45",
                                         "https://rickandmortyapi.com/api/episode/46",
                                         "https://rickandmortyapi.com/api/episode/47",
                                         "https://rickandmortyapi.com/api/episode/48",
                                         "https://rickandmortyapi.com/api/episode/49",
                                         "https://rickandmortyapi.com/api/episode/50",
                                         "https://rickandmortyapi.com/api/episode/51" ) )
                .url( new ArrayList<String>( asList( "https://rickandmortyapi.com/api/character/1" ) ) )
                .created( "2017-11-04T18:48:46.250Z" )
                .location( Location.builder().name( "Citadel of Ricks" ).url( "https://rickandmortyapi.com/api/location/3" ).build() )
                .build();
    }

    private Character createMortySmithEntry( int id ) {
        return Character.builder().id( id )
                .name( "Morty Smith" )
                .status( "Alive" )
                .species( "Human" )
                .type( "" )
                .gender( "Male" )
                .origin( Origin.builder().name( "unknown" )
                                 .url( "" ).build() )
                .image( "https://rickandmortyapi.com/api/character/avatar/1.jpeg" )
                .episode( asList( "https://rickandmortyapi.com/api/episode/1",
                                         "https://rickandmortyapi.com/api/episode/2",
                                         "https://rickandmortyapi.com/api/episode/3",
                                         "https://rickandmortyapi.com/api/episode/4",
                                         "https://rickandmortyapi.com/api/episode/5",
                                         "https://rickandmortyapi.com/api/episode/6",
                                         "https://rickandmortyapi.com/api/episode/7",
                                         "https://rickandmortyapi.com/api/episode/8",
                                         "https://rickandmortyapi.com/api/episode/9",
                                         "https://rickandmortyapi.com/api/episode/10",
                                         "https://rickandmortyapi.com/api/episode/11",
                                         "https://rickandmortyapi.com/api/episode/12",
                                         "https://rickandmortyapi.com/api/episode/13",
                                         "https://rickandmortyapi.com/api/episode/14",
                                         "https://rickandmortyapi.com/api/episode/15",
                                         "https://rickandmortyapi.com/api/episode/16",
                                         "https://rickandmortyapi.com/api/episode/17",
                                         "https://rickandmortyapi.com/api/episode/18",
                                         "https://rickandmortyapi.com/api/episode/19",
                                         "https://rickandmortyapi.com/api/episode/20",
                                         "https://rickandmortyapi.com/api/episode/21",
                                         "https://rickandmortyapi.com/api/episode/22",
                                         "https://rickandmortyapi.com/api/episode/23",
                                         "https://rickandmortyapi.com/api/episode/24",
                                         "https://rickandmortyapi.com/api/episode/25",
                                         "https://rickandmortyapi.com/api/episode/26",
                                         "https://rickandmortyapi.com/api/episode/27",
                                         "https://rickandmortyapi.com/api/episode/28",
                                         "https://rickandmortyapi.com/api/episode/29",
                                         "https://rickandmortyapi.com/api/episode/30",
                                         "https://rickandmortyapi.com/api/episode/31",
                                         "https://rickandmortyapi.com/api/episode/32",
                                         "https://rickandmortyapi.com/api/episode/33",
                                         "https://rickandmortyapi.com/api/episode/34",
                                         "https://rickandmortyapi.com/api/episode/35",
                                         "https://rickandmortyapi.com/api/episode/36",
                                         "https://rickandmortyapi.com/api/episode/37",
                                         "https://rickandmortyapi.com/api/episode/38",
                                         "https://rickandmortyapi.com/api/episode/39",
                                         "https://rickandmortyapi.com/api/episode/40",
                                         "https://rickandmortyapi.com/api/episode/41",
                                         "https://rickandmortyapi.com/api/episode/42",
                                         "https://rickandmortyapi.com/api/episode/43",
                                         "https://rickandmortyapi.com/api/episode/44",
                                         "https://rickandmortyapi.com/api/episode/45",
                                         "https://rickandmortyapi.com/api/episode/46",
                                         "https://rickandmortyapi.com/api/episode/47",
                                         "https://rickandmortyapi.com/api/episode/48",
                                         "https://rickandmortyapi.com/api/episode/49",
                                         "https://rickandmortyapi.com/api/episode/50",
                                         "https://rickandmortyapi.com/api/episode/51" ) )
                .url( new ArrayList<String>( asList( "https://rickandmortyapi.com/api/character/2" ) ) )
                .created( "2017-11-04T18:50:21.651Z" )
                .location( Location.builder().name( "Citadel of Ricks" )
                                   .url( "https://rickandmortyapi.com/api/location/3" ).build() )
                .build();
    }

    private Character createSummerSmithEntry( int id ) {
        return Character.builder().id( id )
                .name( "Summer Smith" )
                .status( "Alive" )
                .species( "Human" )
                .type( "" )
                .gender( "Female" )
                .origin( Origin.builder().name( "Earth (Replacement Dimension)" )
                                 .url( "https://rickandmortyapi.com/api/location/20" ).build() )
                .image( "https://rickandmortyapi.com/api/character/avatar/3.jpeg" )
                .episode( asList( "https://rickandmortyapi.com/api/episode/6",
                                         "https://rickandmortyapi.com/api/episode/7",
                                         "https://rickandmortyapi.com/api/episode/8",
                                         "https://rickandmortyapi.com/api/episode/9",
                                         "https://rickandmortyapi.com/api/episode/10",
                                         "https://rickandmortyapi.com/api/episode/11",
                                         "https://rickandmortyapi.com/api/episode/12",
                                         "https://rickandmortyapi.com/api/episode/14",
                                         "https://rickandmortyapi.com/api/episode/15",
                                         "https://rickandmortyapi.com/api/episode/16",
                                         "https://rickandmortyapi.com/api/episode/17",
                                         "https://rickandmortyapi.com/api/episode/18",
                                         "https://rickandmortyapi.com/api/episode/19",
                                         "https://rickandmortyapi.com/api/episode/20",
                                         "https://rickandmortyapi.com/api/episode/21",
                                         "https://rickandmortyapi.com/api/episode/22",
                                         "https://rickandmortyapi.com/api/episode/23",
                                         "https://rickandmortyapi.com/api/episode/24",
                                         "https://rickandmortyapi.com/api/episode/25",
                                         "https://rickandmortyapi.com/api/episode/26",
                                         "https://rickandmortyapi.com/api/episode/27",
                                         "https://rickandmortyapi.com/api/episode/29",
                                         "https://rickandmortyapi.com/api/episode/30",
                                         "https://rickandmortyapi.com/api/episode/31",
                                         "https://rickandmortyapi.com/api/episode/32",
                                         "https://rickandmortyapi.com/api/episode/33",
                                         "https://rickandmortyapi.com/api/episode/34",
                                         "https://rickandmortyapi.com/api/episode/35",
                                         "https://rickandmortyapi.com/api/episode/36",
                                         "https://rickandmortyapi.com/api/episode/38",
                                         "https://rickandmortyapi.com/api/episode/39",
                                         "https://rickandmortyapi.com/api/episode/40",
                                         "https://rickandmortyapi.com/api/episode/41",
                                         "https://rickandmortyapi.com/api/episode/42",
                                         "https://rickandmortyapi.com/api/episode/43",
                                         "https://rickandmortyapi.com/api/episode/44",
                                         "https://rickandmortyapi.com/api/episode/45",
                                         "https://rickandmortyapi.com/api/episode/46",
                                         "https://rickandmortyapi.com/api/episode/47",
                                         "https://rickandmortyapi.com/api/episode/48",
                                         "https://rickandmortyapi.com/api/episode/49",
                                         "https://rickandmortyapi.com/api/episode/51" ) )
                .url( new ArrayList<String>( asList( "https://rickandmortyapi.com/api/character/3" ) ) )
                .created( "2017-11-04T19:09:56.428Z" )
                .location( Location.builder().name( "Earth (Replacement Dimension)" )
                                   .url( "https://rickandmortyapi.com/api/location/20" ).build() )
                .build();
    }
}