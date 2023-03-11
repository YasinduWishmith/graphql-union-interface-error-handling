package com.yasindu.unionintefacetest.exceptions;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Objects;

/**
 * @Author Yasindu Wishmith (SE II)
 * @Created 3/11/2023
 * @Project union-inteface-test
 */
@Component
public class CustomExceptionResolver extends DataFetcherExceptionResolverAdapter {
    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
        HashMap<String, Object> extensions = new HashMap<String, Object>();
        extensions.put("errorCode", "tr_4512");
        if (ex instanceof CustomException) {
            return GraphqlErrorBuilder.newError()
                    .extensions(extensions)
                    .errorType(ErrorType.NOT_FOUND)
                    .message(ex.getMessage())
                    .path(env.getExecutionStepInfo().getPath())
                    .location(env.getField().getSourceLocation())
                    .build();
        } else {
            return null;
        }
    }
}
