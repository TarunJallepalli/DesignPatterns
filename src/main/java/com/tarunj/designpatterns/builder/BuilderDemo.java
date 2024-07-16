package com.tarunj.designpatterns.builder;

public class BuilderDemo {

    public static void main(String[] args) {

        try {
            Student student = Student.builder().setAge(25).setName("Tarun")
                    .setBatch("AUG-01").setMarks(98d).build();
            System.out.println(student);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
