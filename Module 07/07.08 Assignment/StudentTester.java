/**
 * @author Eli R DeWitt
 * @date 2/6/2022
 * @purose demonstrate understanding of manipulating arrays/arraylists using student grades
 * 
 * @PMR The last assignment took me a long time because there were so many versions but it got me to understand
 * how ArrayLists work and now I was able to complete this challenge program with relatively no trouble. Looking
 * back, it might've made more sense to make the parameters of instantiating the Student (String name, int quiz1,
 * int quiz2 ect) instead of (String name, int [] scores) becuase that would better prevent a future error where
 * the programmer inputs more than five scores into the class. I tested it out and there is no difference to what
 * is printed to the console, but if you were calculating averages by iterating through the length of the scores
 * array instead of a range of 5, it would be inaccurate
 * 
 */

import java.util.ArrayList;
public class StudentTester {
    public static void main(String [] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Eli DeWitt", new int [] {99, 98, 95, 100, 98}));
        students.add(new Student("Carter Piepenburg", new int [] {91, 86, 93, 97, 80}));
        students.add(new Student("Cayden Granger", new int [] {85, 79, 84, 84, 85}));
        students.add(new Student("Mason Thomson", new int [] {86, 82, 73, 78, 89}));
        students.add(new Student("Ryan Hanson", new int [] {91, 94, 89, 97, 94}));

        
        printStudents(students);

        setStudentName(students, "Mason Thomson", "Christian Hafeman");
        setScore(students, "Christian Hafeman", 2, 100);
        setStudent(students, "Cayden Granger", "Henry Manhke", new int [] {98, 97, 100, 88, 85});
        insertStudentBefore(students, "Eli DeWitt", "Grace Koss", new int [] {100, 95, 100, 97, 96});
        deleteStudent(students, "Ryan Hanson");
    }

    public static void printStudents(ArrayList<Student> students) {
        System.out.printf("%20s%7s%8s%8s%8s%8s%n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("----------------------------------------------------------------");
        for (Student student : students) System.out.println(student);
        System.out.println();
    }

    public static void setStudentName(ArrayList<Student> students, String find, String name) {
        Boolean found = false;
        for (int i = 0; i < students.size(); i ++) {
            if (students.get(i).getName().equals(find)) {
                found = true;
                students.get(i).setName(name);

                System.out.printf("<< Changing %s to %s >>%n%n", find, name);
                printStudents(students);

                break;
            }
        }
        if (!found) System.out.printf("Couldn't find Student %s", find);
    }

    public static void setScore(ArrayList<Student> students, String find, int scoreNum, int score) {
        Boolean found = false;
        for (int i = 0; i < students.size(); i ++) {
            if (students.get(i).getName().equals(find)) {
                found = true;
                students.get(i).setScore(scoreNum, score);

                System.out.printf("<< Setting %s's Score %d to %d >>%n%n", find, scoreNum, score);
                printStudents(students);

                break;
            }
        }
        if (!found) System.out.printf("Couldn't find Student %s", find);
    }

    public static void setStudent(ArrayList<Student> students, String find, String name, int [] scores) {
        Boolean found = false;
        for (int i = 0; i < students.size(); i ++) {
            if (students.get(i).getName().equals(find)) {
                found = true;
                students.get(i).setName(name);
                for (int j = 0; j < 5; j ++) {
                    students.get(i).setScore(j, scores[j]);
                }

                System.out.printf("<< Setting %s to %s with new scores >>%n%n", find, name, scores);
                printStudents(students);

                break;
            }
        }
        if (!found) System.out.printf("Couldn't find Student %s", find);
    }

    public static void insertStudentBefore(ArrayList<Student> students, String find, String name, int [] scores) {
        Boolean found = false;
        for (int i = 0; i < students.size(); i ++) {
            if (students.get(i).getName().equals(find)) {
                found = true;
                students.add(i, new Student(name, scores));

                System.out.printf("<< Inserting %s before %s with new scores >>%n%n", name, find, scores);
                printStudents(students);

                break;
            }
        }
        if (!found) System.out.printf("Couldn't find Student %s", find);
    }

    public static void deleteStudent(ArrayList<Student> students, String find) {
        Boolean found = false;
        for (int i = 0; i < students.size(); i ++) {
            if (students.get(i).getName().equals(find)) {
                found = true;
                students.remove(i);

                System.out.printf("<< Deleting %s >>%n%n", find);
                printStudents(students);

                break;
            }
        }
        if (!found) System.out.printf("Couldn't find Student %s", find);
    }
}
