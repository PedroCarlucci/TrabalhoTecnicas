package com.isekai.isekaiOnline.entities;

public class Warrior extends Character{
    int[] stats;
    int level;
    public Warrior(int[] stats, int level)throws IllegalArgumentException{
        if(stats.length != 7){
            throw new IllegalArgumentException("There must be 7 stats");
        }
        this.stats = stats;
        this.level = level;
        stats[5] = calcHP();
    }
    protected int calcHP(){
        return stats[2] * 8 + 8;
    }

    protected int calcMP(){
        return stats[4] * 5 + 6;
    }
}