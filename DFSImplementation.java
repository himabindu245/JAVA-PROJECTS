package xyz;

import java.util.*;

public class DFSImplementation {

    private Map<String, List<String>> socialCircle = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    // Renamed to addConnection for clarity
    public void addConnection(String person1, String person2) {
        socialCircle.computeIfAbsent(person1, k -> new ArrayList<>()).add(person2);
        socialCircle.computeIfAbsent(person2, k -> new ArrayList<>()).add(person1);
    }

    public void dfs(String person) {
        if (visited.contains(person)) return;

        visited.add(person);
        System.out.println("Visited: " + person);

        for (String neighbor : socialCircle.getOrDefault(person, new ArrayList<>())) {
            dfs(neighbor);
        }
    }

    public static void main(String[] args) {
        DFSImplementation ppl = new DFSImplementation();

        ppl.addConnection("Alice", "Bob");
        ppl.addConnection("Bob", "Caroline");
        ppl.addConnection("Caroline", "David");

        System.out.println("DFS Traversal to connect people:");
        ppl.dfs("Alice");
    }
}
