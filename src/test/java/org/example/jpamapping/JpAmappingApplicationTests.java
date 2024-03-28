package org.example.jpamapping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
class JpAmappingApplicationTests {

    @Autowired
    private BurgerkingService burgerkingService;

    private static Stream<Arguments> getOrder(){
        return Stream.of(
                Arguments.of(
                        "와퍼",
                        "감자튀김",
                        "제로콜라"
                )
        );
    }


    @ParameterizedTest
    @MethodSource("getOrder")
    void testCreateOrder(String burger, String side, String drink){



        Assertions.assertDoesNotThrow(
                () -> burgerkingService.registOrder(
                        new OrderDTO()

                )

        );





    }


}
