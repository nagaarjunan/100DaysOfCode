// import java.io.*;
// import java.util.*;
// import java.util.Scanner;
// import java.util.PriorityQueue;
// import java.util.ArrayList;
// import java.util.List;

// class Student implements Comparable<Student> {
//     private int id;
//     private String name;
//     private double cgpa;
    
//     public Student(int id, String name, double cgpa) {
//         this.id = id;
//         this.name = name;
//         this.cgpa = cgpa;
//     }
    
//     public int getID() {
//         return id;
//     }
    
//     public String getName() {
//         return name;
//     }
    
//     public double getCGPA() {
//         return cgpa;
//     }
    
//     @Override
//     public int compareTo(Student s) {
//         if (cgpa == s.cgpa) {
//             if (name.equals(s.name)) {
//                 return id - s.id;
//             } else {
//                 return name.compareTo(s.name);
//             }
//         } else {
//             return s.cgpa - cgpa > 0 ? 1 : -1;
//         }
//     }



// public class Solution {

//     public static void main(String[] args) {
//          Scanner in = new Scanner(System.in);
//         Priorities priorities = new Priorities();
        
//         int totalEvents = Integer.parseInt(in.nextLine());
//         List<String> events = new ArrayList<>();
        
//         while (totalEvents-- != 0) {
//             String event = in.nextLine();
//             events.add(event);
//         }
        
//         List<Student> students = priorities.getStudents(events);
        
//         if (students.isEmpty()) {
//             System.out.println("EMPTY");
//         } else {
//             for (Student st: students) {
//                 System.out.println(st.getName());
//             }
//         }
        
//     }

//clear the error



