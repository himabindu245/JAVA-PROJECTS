package xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphStructure {

	public static void main(String[] args) {
		
        Map<String, List<String>> zooMap= new HashMap<>();

        zooMap.put("Entrance", Arrays.asList("Reptile House", "Bird sanctuary", "Mammal Zone"));
        zooMap.put("Reptile House", Arrays.asList("Snake pit"));
        zooMap.put("Bird sanctuary", Arrays.asList("Parrot Pavilion"));
        zooMap.put("Mammal Zone", Arrays.asList("Lion Den","Elephant Enclosure"));

        System.out.println("Exploring the zoomap using BFS starting from Reptile House:");											
        bfs(zooMap, "Reptile House");
        bfs(zooMap, "Bird sanctuary");
        bfs(zooMap, "Mammal Zone");

    }

    public static void bfs(Map<String, List<String>> zooMap, String entrance) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(entrance);
        visited.add(entrance);

        while (!queue.isEmpty()) {
            String currententrance= queue.poll();
            System.out.println("Visited " + currententrance);

            for (String neighbor : zooMap.getOrDefault(currententrance, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
