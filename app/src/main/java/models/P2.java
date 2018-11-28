package models;

public class P2 {
    Data trnRating;
    Data kills;
    Data score;
    Data kd;

    public P2(Data trnRating, Data kills, Data score, Data kd) {
        this.trnRating = trnRating;
        this.kills = kills;
        this.score = score;
        this.kd = kd;
    }

    public Data getTrnRating() {
        return trnRating;
    }

    public void setTrnRating(Data trnRating) {
        this.trnRating = trnRating;
    }

    public Data getKills() {
        return kills;
    }

    public void setKills(Data kills) {
        this.kills = kills;
    }

    public Data getScore() {
        return score;
    }

    public void setScore(Data score) {
        this.score = score;
    }

    public Data getKd() {
        return kd;
    }

    public void setKd(Data kd) {
        this.kd = kd;
    }
}
