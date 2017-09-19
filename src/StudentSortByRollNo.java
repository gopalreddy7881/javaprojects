package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSortByRollNo {



//A class to represent a student.
 int rollno;
 String name, address;

 // Constructor
 public StudentSortByRollNo(int rollno, String name,
                            String address)
 {
     this.rollno = rollno;
     this.name = name;
     this.address = address;
 }

 // Used to print student details in main()
 public String toString()
 {
     return this.rollno + " " + this.name +
                        " " + this.address;
 }
}

class Sortbyroll1 implements Comparator<StudentSortByRollNo>
{
 // Used for sorting in ascending order of
 // roll number
 public int compare(StudentSortByRollNo a, StudentSortByRollNo b)
 {
     return a.rollno - b.rollno;
 }
}

class Sortbyname2 implements Comparator<StudentSortByRollNo>
{
 // Used for sorting in ascending order of
 // roll name
 public int compare(StudentSortByRollNo a, StudentSortByRollNo b)
 {
     return a.name.compareTo(b.name);
 }


//Driver class

 public static void main (String[] args)
 {
     ArrayList<StudentSortByRollNo> ar = new ArrayList<StudentSortByRollNo>();
     ar.add(new StudentSortByRollNo(111, "bbbb", "london"));
     ar.add(new StudentSortByRollNo(131, "aaaa", "nyc"));
     ar.add(new StudentSortByRollNo(121, "cccc", "jaipur"));

     System.out.println("Unsorted");
     for (int i=0; i<ar.size(); i++)
         System.out.println(ar.get(i));

     Collections.sort(ar, new Sortbyroll1());

     System.out.println("\nSorted by rollno");
     for (int i=0; i<ar.size(); i++)
         System.out.println(ar.get(i));

     Collections.sort(ar, new Sortbyname2());

     System.out.println("\nSorted by name");
     for (int i=0; i<ar.size(); i++)
         System.out.println(ar.get(i));
 }
}
