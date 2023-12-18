public class QuizOneJunitTest {

    @Test
    public void testSquare() {
        QuizOneJunit quiz = new QuizOneJunit();
        assertEquals(25, quiz.square(5)); // Example test case, adjust accordingly
    }

    @Test
    public void testCountLetterA() {
        QuizOneJunit quiz = new QuizOneJunit();
        assertEquals(3, quiz.countLetterA("Java is Awesome")); // Example test case, adjust accordingly
    }

    @Test
    public void testCheckTwoLetter() {
        QuizOneJunit quiz = new QuizOneJunit();
        assertTrue(quiz.checkTwoLetter("ab")); // Example test case, adjust accordingly
        assertFalse(quiz.checkTwoLetter("xy")); // Example test case, adjust accordingly
    }
}