public class Student {
    private String name;
    private int[] testScores;

    // constructor method
    public Student(String _name, int testNum) {
        name = _name;
        testScores = new int[testNum];
    }

    // public method to retrieve name of student
    public String getName() { return name; }

    // public method to retrieve a score value (includes validation)
    public int getScore(int num) {
        if (num > testScores.length) {
            System.out.println(
                "You tried updated test score number " + 
                Integer.toString(num) + 
                " and there are only " + 
                Integer.toString(testScores.length) + 
                " tests for " + 
                name
            );
            return 0;
        }
        return testScores[num];
    }

    // public method to retrieve the number of scores for a student
    public int getScoreNum() { return testScores.length; }

    //public method for setting the student's name
    public void setName(String _name) { name = _name; }

    //public method for setting a students test score
    public void setScore(int newScore, int num) {
        if (num > testScores.length) {
            System.out.println(
                "You tried updated test score number " + 
                Integer.toString(num) + 
                " and there are only " + 
                Integer.toString(testScores.length) + 
                " tests for " + 
                name
            );
            return;
        }
        testScores[num] = newScore;
    }

    // public method for calculating and returning the average of the student's scores
    public double getAverage() {
        double result = 0.0;
        for (int score : testScores) {
            result += score;
        }
        result /= testScores.length;
        return result;
    }

    // public method for printing the students row of data in the console
    public String toString() {
        String result = name;
        for (int score : testScores) { result += "\t\t" + score; } // print all the scores
        for (int i = getScoreNum(); i < 5; i++) { result += "\t\t--"; } // put a "--" where there is a missing score
        result += "\t\t" + getAverage();
        return result;
    }
}
