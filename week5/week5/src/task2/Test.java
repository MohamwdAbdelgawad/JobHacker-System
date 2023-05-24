/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Date;

/**
 *
 * @author Eng Mohamed
 */
public class Test {
      public static void main(String[] args) {
        Person person = new Person("Mohamed", "nasr city", "12345", "mohamed@mail.com");
        Student student = new Student("Ahmed", "ain shams", "123456", "ahmed@mail.com", Student.SOPHOMORE);
        Employee employee = new Employee("hany", "shubra", "122345", "hany@mail.com", "Office 1", 50000.0, new Date());
        Faculty faculty = new Faculty("osama", "mansura", "123345", "Osama@mail.com", "Office 2", 60000.0, new Date(), "9 AM - 2 PM", "Professor");
        Staff staff = new Staff("Ali", "Aswan", "12337", "Ali@mail.com", "Office 3", 40000.0, new Date(), "Assistant");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
