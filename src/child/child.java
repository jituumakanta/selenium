package child;

import java.io.IOException;


import parent.*;

/**
 * Created by jitu on 4/25/2017.
 */
public class child extends parent {

    public void test() {
        System.out.println("child");
    }

    public void test1() {
        System.out.println("child1");
    }

    public void test2() {
        System.out.println("child2");
    }

    public static void main(String[] args) {
        parent obj = new parent();
        child ch = new child();
        // ch.test();



    }
}
