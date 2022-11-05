/**
 * @author Eli R DeWitt
 * @date 4/14/22
 * @purpose use an array to manage and manipulate multiples objects of the same class
 * 
 * @PMR
 * I enjoyed this assignment, but I think I took too much time on it. I was sick for a few days and got behind and then I spent a lot of time
 * on this. I made it so that it will randomly generate the test scores, the number of test scores, and it is all dependent on the
 * "studentList" array with the names, if you add more the randomness will apply to those too.
 */

public class StudentTester {
    public static void main(String[] args)
    {
        String[] studentList = {"Eli", "Jacob", "Mason", "Cayden"}; // Array of students in class
        Student[] students = new Student[studentList.length]; // creates an array of Students (class) with the same length as the "studentList" array
        
        // for every student in the array, set their number of tests to a random number between 2 and 5
        for (int i = 0; i < studentList.length; i++) {
            int tests = (int)(Math.random()*4) + 2; 
            students[i] = new Student(studentList[i], tests);
            
            System.out.println(students[i].getName());

            // look at each score per student and set that to random score between 70 and 99
            for (int j = 0; j < students[i].getScoreNum(); j++) { 
                int newScore = (int)(Math.random()*30) + 70;
                students[i].setScore(newScore, j);
            }
        }

        System.out.println("***QUIZ RESULTS***");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %s\n", "Student Name", "Test(1) Score","Test(2) Score", "Test(3) Score", "Test(4) Score", "Test(5) Score", "Average");
        System.out.println("========================================================================================================");
        for (Student student : students) { System.out.println(student); } // print each students' data
    }
}
