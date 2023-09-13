package Fixture;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teams> teams = new ArrayList<>();

        teams.add(new Teams("Galatasaray"));
        teams.add(new Teams("Fenerbahçe"));
        teams.add(new Teams("Başakşehir"));
        teams.add(new Teams("Beşiktaş"));
        teams.add(new Teams("Trabzonspor"));
        teams.add(new Teams("Bursaspor"));
        teams.add(new Teams("Sivasspor"));


        TeamManager teamManager = new TeamManager(teams);
        
        teamManager.start(teams);
    }
}
