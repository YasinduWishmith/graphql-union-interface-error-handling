package com.yasindu.unionintefacetest.models;

import lombok.Builder;
import lombok.Data;

/**
 * @Author Yasindu Wishmith (SE II)
 * @Created 3/11/2023
 * @Project union-inteface-test
 */
@Data
@Builder
public class SportMan {
    private int age;
    private String name;

    private String sport;
}
