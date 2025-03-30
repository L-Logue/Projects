public class Exam extends Assessment {
    private int numQuestions;
    private int numMissed;
    private double pointsEach;

    public Exam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / questions;
        setScore((int) Math.round((questions - missed) * pointsEach));
    }

    public double getPointsEach() {
        return pointsEach;
    }
}
