import java.util.*;
import java.util.stream.*;
public class PSTJTASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> salaries = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            salaries.add(sc.nextInt());
        }

        // Functional transformation: increase each salary by 10%
        List<Integer> updatedSalaries = salaries.stream()
                .map(salary -> (int)(salary * 2))   // increase by 10%
                .collect(Collectors.toList());

        // Print updated salaries
        updatedSalaries.forEach(sal -> System.out.print(sal + " "));
    }
}





