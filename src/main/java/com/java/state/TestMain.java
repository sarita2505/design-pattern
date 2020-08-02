package com.java.state;

public class TestMain {
    public static void main(String[] args) {
        CourseState state=new CourseState();
        ICourse course=state.getDetails(CourseEnum.ONE);
    }
}
