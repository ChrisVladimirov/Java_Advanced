//package Lab;
//
// import java.util.LinkedHashMap;
// import java.util.Scanner;
//
// public class FilterByAge {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//
//         int n = Integer.parseInt(scanner.nextLine());
//         LinkedHashMap<String, Integer> people = new LinkedHashMap<>();
//
//         while (n-- > 0) {
//             String[] tokens = scanner.nextLine().split(", ");
//             String name = tokens[0];
//             int age = Integer.parseInt(tokens[1]);
//             people.put(name, age);
//         }
//
//         String ageCondition = scanner.nextLine();
//         int age = Integer.parseInt(scanner.nextLine());
//         String format = scanner.nextLine();
//
//         people.entrySet()
//                 .stream()
//                 .filter(e -> {
//                     if (ageCondition.equals("older")) {
//                         return e.getValue() >= age;
//                     } else {
//                         return e.getValue() <= age;
//                     }
//                 })
//         .forEach(entry -> {
//             if (format.equals("name")){
//                 System.out.println(entry);
//             }
//         });
//     }
// }
