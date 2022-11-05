public class Student {
    private String name;
    private int [] scores = new int[5];

    Student(String name, int [] scores) {
        this.name = name;
        for (int i = 0; i < 5; i++) {
            this.scores[i] = scores[i];
        }
    }

    public int getScore(int index) {
        return scores[index];
    }

    public void setScore(int index, int score) {
        scores[index] = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public String toString() {
        return String.format("%20s\t%3d\t%3d\t%3d\t%3d\t%3d", name, scores[0], scores[1], scores[2], scores[3], scores[4]);
    }
}
