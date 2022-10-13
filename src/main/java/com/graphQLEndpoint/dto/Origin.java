package com.graphQLEndpoint.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Origin {
    private String url;
    private String name;
}
