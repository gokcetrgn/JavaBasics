package Fixture;

import java.util.ArrayList;
import java.util.Collections;

public class TeamManager {
    Teams team;
    ArrayList<Teams> fixture;
    ArrayList<Teams> hTeams;
    ArrayList<Teams> dTeams;
    int teamNumber;

    public TeamManager() {

    }

    public TeamManager(ArrayList<Teams> fixture) {
        this.fixture = fixture;
        this.teamNumber = fixture.size();
    }

    public void shuffle(ArrayList<Teams> teams) {
        Collections.shuffle(teams);
    }

    public void print() {
        System.out.println("Takimlar: ");
        for (Teams teams : fixture) {
            System.out.println(teams.getTeamName());
        }
    }

    public void start(ArrayList<Teams> fixture) {
        int matchNumber = (this.teamNumber % 2);
        if (matchNumber != 0) {
            this.fixture.add(new Teams("Bay"));
            teamNumber++;
        }
        
        int numRounds = (teamNumber - 1) * 2;
        int half = teamNumber / 2;
        this.fixture = fixture;
        hTeams = new ArrayList<>();
        dTeams = new ArrayList<>();
   
        for (int round = 0; round < numRounds; round++) {
            System.out.println("Round: " + (round + 1));

            for (int i = 0; i < teamNumber; i++) {
                if (i % 2 == 0) {
                    hTeams.add(fixture.get(i));
                } else {
                    dTeams.add(fixture.get(i));
                }
            }
            for (int match = 0; match < half; match++) {
                Teams teamA = hTeams.get(match);
                Teams teamB = dTeams.get(match);

                System.out.println(teamA.getTeamName() + " vs " + teamB.getTeamName());
            }
        hTeams.clear();
        dTeams.clear();

        shuffle(fixture);
        
        }       
    }
}
