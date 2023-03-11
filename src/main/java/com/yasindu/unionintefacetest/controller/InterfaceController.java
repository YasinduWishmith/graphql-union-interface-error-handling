package com.yasindu.unionintefacetest.controller;

import com.yasindu.unionintefacetest.models.Human;
import com.yasindu.unionintefacetest.models.SportMan;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

/**
 * @Author Yasindu Wishmith (SE II)
 * @Created 3/11/2023
 * @Project union-inteface-test
 */
@Controller
public class InterfaceController {

    @QueryMapping
    public Object getCustomer(){
//        return Human.builder().age(20).name("Customer").build();
        return SportMan.builder().name("Sporty").sport("Cricket").age(20).build();
    }
}
