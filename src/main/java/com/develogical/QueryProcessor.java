package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("pokemon")) {
            return "Pokémon is a series of video games developed by Game Freak and published " +
                   "by Nintendo and The Pokémon Company under the Pokémon media franchise.";
        }
        if (query.toLowerCase().contains("name")) {
            return "Arn";
        }
        if (query.toLowerCase().contains("numbers is the largest")) {
            String[] parts = query.split(":");
            String[] numbers = parts[1].split(",");
            int max = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (Integer.parseInt(numbers[i].trim()) > max) {
                    max = Integer.parseInt(numbers[i].trim());
                }
            }
            return String.valueOf(max);
        }
        if (query.toLowerCase().contains("plus")) {
            String[] parts = query.split(" ");
            int val = Integer.parseInt(parts[2].trim()) + Integer.parseInt((parts[4].trim()));
            return String.valueOf(val);
        }
        return "";
    }
}
