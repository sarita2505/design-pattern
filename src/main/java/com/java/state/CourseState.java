package com.java.state;

public class CourseState {
    private ICourse course;

    public ICourse getDetails(CourseEnum courseEnum) {
        switch (courseEnum) {
            case ONE: {
                course = new One();
                course.disp();
                return course;
            }
            case TWO: {
                course = new Two();
                course.disp();
                return course;
            }
        }
        return null;
    }
}
