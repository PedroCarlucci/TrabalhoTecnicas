package com.isekai.isekaiOnline.entities;

public class Mage extends Character{
    int[] stats;
    int level;
    public Mage(int[] stats, int level)throws IllegalArgumentException{
        if(stats.length != 7){
            throw new IllegalArgumentException("There must be 7 stats");
        }
        this.stats = stats;
        this.level = level;
        stats[5] = calcHP();
    }
    protected int calcHP(){
        return stats[2] * 4 + 4;
    }

    protected int calcMP(){
        return stats[4] * 7 + 12;
    }
}