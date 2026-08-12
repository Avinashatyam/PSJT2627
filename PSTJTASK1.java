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

        List<Integer> updatedSalaries = salaries.stream()
                .map(salary -> (int)(salary * 2))  
                .collect(Collectors.toList());

        updatedSalaries.forEach(sal -> System.out.print(sal + " "));
    }
}





