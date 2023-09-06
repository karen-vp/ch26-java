package com.generation.test;
import  org.junit.platform.suite.api.SelectClasses;
import  org.junit.platform.suite.api.Suite;

/*
 * Si queremos probar una suite de varias pruebas unitarias,
 * es de la siguiente manera:
 */
@Suite
@SelectClasses({MathTest.class /* OtraClase.class*/})
public class AllTests {

}
