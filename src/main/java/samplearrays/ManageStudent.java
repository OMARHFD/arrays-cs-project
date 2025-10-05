package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest = students[0];
        for( Student s : students)
        {
            if (s.getAge()>oldest.getAge()) oldest =s;
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int noAdults = 0;
        for( Student s : students)
        {
            if (s.isAdult()) noAdults +=1;
        }
        return noAdults;
    }


    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        double avrgGrade = 0;
        for( Student s : students)
        {
            avrgGrade += s.getGrade();
        }
        avrgGrade =avrgGrade/ students.length;
        return avrgGrade;
    }



    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for( Student s : students)
        {
            if(s.getName() == name) return s;
        }
        return null;

    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        Arrays.sort(students, (a, b) -> Double.compare(b.getGrade(), a.getGrade()));
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for( Student s : students)
        {
            if(s.getGrade() >= 15) System.out.println(s.getName());
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for( Student s : students)
        {
            if(s.getId() == id)
            {
                s.setGrade(newGrade);
                return true;
            }
        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for (Student s1 : students)
        {
            for( Student s2 : students)
            {
                if(s1.getName() == s2.getName())
                {System.out.println("Duplicates found");
                    return true;}
            }
        }
        return false;

    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student [] newArr = Arrays.copyOf(students,students.length+1);
        newArr[newArr.length-1] = newStudent;
        return newArr;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student [] arr =new Student[5];
        arr[0]= new Student(0,"Omar");
        arr[1]= new Student(1,"Ahmed" ,20);
        arr[2]= new Student(2,"Mohammed" ,21,19);
        arr[3]= new Student(3,"Fatima");
        arr[4]= new Student(4,"Ali");

        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        Student oldest = findOldest(arr);
        System.out.println("Oldest Student { name :" + oldest.getName() + " age  : "+oldest.getAge() +" }");

        // 3) Count adults
        System.out.println("Number of Adults : " +countAdults(arr));

        // 4) Average grade
        System.out.println("Average Grade : " +averageGrade(arr));


        // 5) Find by name
        System.out.println("First Omar id : " +findStudentByName(arr,"Omar").getId());



        // 6) Sort by grade desc
        // sort function
        sortByGradeDesc(arr);
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        boolean updated =updateGrade(arr , 4,17);
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names
        System.out.println("\nHas duplicates ? " + hasDuplicateNames(arr));

        // 10) Append new student
        appendStudent(arr,new  Student(15,"Omar"));




        //School example --------------------------------------
        Student [][] school = new Student[2][3];
        school[0][0] =new Student(0 ,"Ahmed");
        school[0][1] =new Student(1,"Ali");
        school[0][2] =new Student(2,"Fahd");
        school[1][0] =new Student(3,"Aziz");
        school[1][1] =new Student(4,"Mohammed");
        school[1][2] =new Student(5,"Fatima");
        //printing names
        for (int i=0 ; i<school.length-1;i++)
        {System.out.println("Classrom "+i+1+" : ");

            for (Student s : school[i]) System.out.println(s.getName());

        }
        //top students in each class
        for (int i=0 ; i<school.length-1;i++)
        {System.out.println("Top student in Classrom "+i+1+" : ");
            sortByGradeDesc(school[i]);
            System.out.println(school[i][0].getName());

        }



    }



}

