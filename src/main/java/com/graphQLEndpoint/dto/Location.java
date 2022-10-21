package com.graphQLEndpoint.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@AllArgsConstructor
public class Location {

    private String url;
    private String name;

}
