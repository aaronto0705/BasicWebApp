package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("pokemon")) {
            return "Pokémon is a series of video games developed by Game Freak and published " +
                   " by Nintendo and The Pokémon Company under the Pokémon media franchise.";
        }
        return "";
    }
}
