import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * This class can be helpful for our exercises on stream pipelines.
 */
public class QueriesMain {

    public static List<String> getStudents(Collection<ExamResult> results) {
        return results.stream()
                      //.map(x -> x.getStudentName()) // alternative notation
                      .map(ExamResult::getStudentName)
                      .sorted()
                      .distinct()
                      .toList();
    }

    public static List<String> getStudentsParallel(Collection<ExamResult> results) {
        return results.parallelStream()
                      //.map(x -> x.getStudentName()) // alternative notation
                      .map(ExamResult::getStudentName)
                      .sorted()
                      .distinct()
                      .toList();
    }

    public static List<String> getStudentsOnExam(Collection<ExamResult> results, String exam) {
        return results.stream()
                      .filter(e -> e.getExamName().equals(exam))
                      //.map(x -> x.getStudentName()) // alternative notation
                      .map(ExamResult::getStudentName)
                      .sorted()
                      .distinct()
                      .toList();
    }

    public static Map<String, List<ExamResult>> groupByExams(Collection<ExamResult> results) {
        return null; // TODO
    }

    public static Map<ExamResult.Classification, List<ExamResult>> classificationsToResults(Collection<ExamResult> results, String exam) {
        return null; // TODO
    }

    private static List<ExamResult> makeTestData() {
        return List.of(
                new ExamResult("Harry", "FoC", 46),
                new ExamResult("Sally", "FoC", 82),
                new ExamResult("Sally", "PiJ", 76),
                new ExamResult("Alice", "PiJ", 80),
                new ExamResult("Bob", "PiJ", 68),
                new ExamResult("Bob", "FoC", 58)
                );
    }

    private static int getRandom(int max) {
        return (int) (Math.round(Math.random() * max));
    }
    private static List<ExamResult> makeLargeTestData() {
        final int SIZE = 4000000;
        final int MAX_MARK = 100;
        final int MAX_NAME_SUFFIX = 400;
        final String NAME_PREFIX = "Student";
        final String MODULE = "PiJ";
        List<ExamResult> result = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            int randomMark = getRandom(MAX_MARK);
            int randomSuffix = getRandom(MAX_NAME_SUFFIX);
            ExamResult examResult = new ExamResult(NAME_PREFIX + randomSuffix,
                    MODULE, randomMark);
            result.add(examResult);
        }
        return result;
    }

    
    public static void runLarge(boolean parallel) {
        long startTime = System.nanoTime();
        // use System.nanoTime() to measure time before and after the
        // method call, then compare
        if (parallel) {
            getStudentsParallel(makeLargeTestData());
        } else {
            getStudents(makeLargeTestData());
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("Total time (ms): " + totalTime / 1000000);
    }

    public static void main(String[] args) {
        System.out.println("getStudents: " + getStudents(makeTestData()));
        System.out.println("getStudentsParallel: " + getStudentsParallel(makeTestData()));
        System.out.println("getStudentsOnExam: " + getStudentsOnExam(makeTestData(), "PiJ"));
        System.out.println("groupByExams: " + groupByExams(makeTestData()));
        System.out.println("getClassificationForExam: " + classificationsToResults(makeTestData(), "PiJ"));
        runLarge(true);
    }
}
