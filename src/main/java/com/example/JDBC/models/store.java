package com.example.JDBC.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class store {

    private Long id;
    private String city;
    private String street;
    private String house;
}
