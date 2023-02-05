public class Student {
    String _navn;
    int _quizScore;
    int _antQuiz;

    public Student(String navn) {
        _navn = navn; // The students name.
        _quizScore = 0; // The students total quiz-score.
        _antQuiz = 0; // Amount of quizes the student har taken.
    }

    // Returns the students name.
    public String hentNavn() {
        return _navn;
    }

    // Adds 'score' to the students total quiz score.
    // Increments '_antQuiz'.
    public void leggTilQuizScore(int score) {
        _quizScore += score;
        _antQuiz++;
    }

    // Returns students total score.
    public int hentTotalScore() {
        return _quizScore;
    }

    // Returns student average quiz-score.
    public int hentGjennomsnittligScore() {
        return (_quizScore / _antQuiz);
    }

}
