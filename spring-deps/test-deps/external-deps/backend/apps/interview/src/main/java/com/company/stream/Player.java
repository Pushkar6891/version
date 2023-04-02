package com.company.stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private int id;
    private String name;
    private String team;
    private double score;
    private List<String> phoneNumbers;
}
