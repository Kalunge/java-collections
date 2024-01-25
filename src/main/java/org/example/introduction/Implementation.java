package org.example.introduction;

public class Implementation implements Contract{

    @Override
    public void termOne() {
        System.out.println("Term 1: Implementation");
    }

    @Override
    public void termTwo() {
        System.out.println("Term 2: Implementation");
    }

    @Override
    public void termExtended() {
        System.out.println("Term extended: Implementation");
    }
}
