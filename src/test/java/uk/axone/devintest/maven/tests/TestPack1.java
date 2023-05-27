package uk.axone.devintest.maven.tests;


import org.junit.jupiter.api.Test;

public class TestPack1 {

    @Test
    public void test1(){
        System.out.println("Running test 1");
    }

    @Test
    public void test2(){
        System.out.println("Running test 2");
    }

    @Test
    public void test3(){
        System.out.println("Running test 3");
    }

    @Test
    public void test4(){
        System.out.println("Running test 4");
    }

    @Test
    public void test5(){
        int x = 10/0;
        System.out.println("Running test 5");
    }

}
