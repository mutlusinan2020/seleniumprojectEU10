package com.cydeo.tests.day9_javafaker_testbase_driverUtils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test

    public void JavaFakerPractice(){

        Faker faker = new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());

    }
}
