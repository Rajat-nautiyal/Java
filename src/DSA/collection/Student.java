package DSA.collection;

import java.util.Objects;

public class Student {
        private String name;
        private int rollNo;
    
        // Constructor
        public Student(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }
    
        @Override
        public String toString() { //toString() method in Java is used to provide a string representation of an object
            return "Student{" +     //If you don't override toString(), the output will be something like Student@1a2b3c
                    "name='" + name + '\'' +
                    ", rollNo=" + rollNo +
                    '}';
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return rollNo == student.rollNo; // Compare roll numbers for equality
        }    
        @Override
        public int hashCode() {
            return Objects.hash(rollNo); // Consistent with equals
        }
    
    }
