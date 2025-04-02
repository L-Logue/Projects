public class Exam extends Assessment {
    private int numQuestions;
    private int numMissed;
    private double pointsEach;

    public Exam(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        this.pointsEach = 100.0 / numQuestions;
        setScore(100 - (numMissed * pointsEach));
    }

    public double getPointsEach() {
        return pointsEach;
    }
}
