package com.yasindu.unionintefacetest.controller;

import com.yasindu.unionintefacetest.exceptions.CustomException;
import com.yasindu.unionintefacetest.models.Employee;
import com.yasindu.unionintefacetest.models.SportMan;
import graphql.TypeResolutionEnvironment;
import graphql.schema.GraphQLObjectType;
import graphql.schema.TypeResolver;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

/**
 * @Author Yasindu Wishmith (SE II)
 * @Created 3/11/2023
 * @Project union-inteface-test
 */
@Controller
public class UnionController {

    @QueryMapping
    public Object getPersons(){

//        return SportMan.builder().name("Sporty").sport("Cricket").age(20).build();
        return Employee.builder().name("Employee").age(20).build();
    }

    @QueryMapping
    public Object getError(){
        throw new CustomException("Invalid Account Id");
    }

}
