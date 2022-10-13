package com.graphQLEndpoint.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Location {

    private String url;
    private String name;

}
