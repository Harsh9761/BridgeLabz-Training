package OnlineCourseEnrollment;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class OnlineCourseApp {

	public static void main(String[] args) {
		List<Enrollment> enrollments = Arrays.asList(
                new Enrollment("Harsh", "Java", "Programming", LocalDate.of(2026, 2, 1)),
                new Enrollment("Simran", "Python", "Programming", LocalDate.of(2026, 2, 3)),
                new Enrollment("Aman", "Digital Marketing", "Marketing", LocalDate.of(2026, 1, 25)),
                new Enrollment("Riya", "Java", "Programming", LocalDate.of(2026, 2, 5)),
                new Enrollment("Karan", "SEO", "Marketing", LocalDate.of(2026, 1, 28))
        );

        System.out.println("---- Filter by Course: Java ----");
        enrollments.stream()
                .filter(e -> e.getCourseName().equalsIgnoreCase("Java"))
                .forEach(System.out::println);

        System.out.println("\n---- Filter by Category: Programming ----");
        enrollments.stream()
                .filter(e -> e.getCategory().equalsIgnoreCase("Programming"))
                .forEach(System.out::println);

        System.out.println("\n---- Group by Course Name ----");
        Map<String, List<Enrollment>> groupedByCourse =
                enrollments.stream()
                        .collect(Collectors.groupingBy(Enrollment::getCourseName));

        groupedByCourse.forEach((course, list) -> {
            System.out.println(course + " : ");
            list.forEach(System.out::println);
        });

        System.out.println("\n---- Count per Category ----");
        Map<String, Long> countByCategory =
                enrollments.stream()
                        .collect(Collectors.groupingBy(
                                Enrollment::getCategory,
                                Collectors.counting()
                        ));

        countByCategory.forEach((category, count) ->
                System.out.println(category + " : " + count)
        );


        System.out.println("\n---- Sorted by Enrollment Date ----");
        enrollments.stream()
                .sorted(Comparator.comparing(Enrollment::getEnrollmentDate))
                .forEach(System.out::println);
    }

	

}
