package com.cdk.cricket;
public class CricketMatch {
    String country1;
    String country2;
    String matchType;
    String winner;
    String location;
    String manOfMatch;

    public CricketMatch(String country1, String country2, String matchType, String winner, String location, String manOfMatch) {
        this.country1 = country1;
        this.country2 = country2;
        this.matchType = matchType;
        this.winner = winner;
        this.location = location;
        this.manOfMatch = manOfMatch;
    }

    @Override
    public String toString() {
        return "CricketMatch{" +
                "country1='" + country1 + '\'' +
                ", country2='" + country2 + '\'' +
                ", matchType='" + matchType + '\'' +
                ", winner='" + winner + '\'' +
                ", location='" + location + '\'' +
                ", manOfMatch='" + manOfMatch + '\'' +
                '}';
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManOfMatch() {
        return manOfMatch;
    }

    public void setManOfMatch(String manOfMatch) {
        this.manOfMatch = manOfMatch;
    }
}
