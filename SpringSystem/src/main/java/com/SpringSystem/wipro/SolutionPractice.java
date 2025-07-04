package com.SpringSystem.wipro;

        import java.util.LinkedHashMap;
        import java.util.Map;
        import java.util.function.Function;
        import java.util.stream.Collectors;
        import java.util.stream.IntStream;

public class SolutionPractice {
    public static char nonRepeatedChar(String str) {
        return str.chars().mapToObj(c -> (char) c).collect(Collectors.
                        groupingBy(Function.identity(), LinkedHashMap::new,
                                Collectors.counting()))
                .entrySet().stream().filter(
                        e -> e.getValue() == 1).
                map(Map.Entry::getKey).findFirst().orElse('\0');
    }

        public static void main(String[] args) {
String str = "madam";
            System.out.println(nonRepeatedChar(str));
        }
    }


