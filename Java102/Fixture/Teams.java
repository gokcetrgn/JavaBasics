package Fixture;


public class Teams {
    private String teamName;

    public Teams(String teamName){
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


    @Override
    public String toString() {
        return teamName;
    }
}
