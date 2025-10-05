package samplearrays;

import java.util.Arrays;

public class CourseNumbersArray {
    private int[] registeredCourses ;
    private int[] updatedCourses ;
    public int[] addCourse(int courseNumber)
    {
      int[] updatedCourses = Arrays.copyOf(this.registeredCourses , this.registeredCourses.length+1);
      updatedCourses[updatedCourses.length-1] = courseNumber;
      this.registeredCourses = updatedCourses;
      return updatedCourses;
    };
    public void printer()
    {
        for (int courseNumber : this.registeredCourses)
        {
            System.out.println(courseNumber +" ");
        }
    };
    public boolean containsNumber(int courseNumber)
    {
        for (int courseNumber1 : this.registeredCourses)
        {
            if (courseNumber == courseNumber1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};


    }
}
