package Tugas;
public class Barrier implements Idestroyable{
    private int strength; 
    public Barrier(int strength) { 
        this.strength = strength; 
    } 
    public void setStrength(int strength) {
        this.strength = strength;
    } 
    public int getStrength() {
        return strength;
    } 
    @Override 
    public void destroyed() {
        strength -= (strength * 0.1);
    } 
    public String getBarrierInfo() { 
        String info = "";
        info += "Barrier Strength - " + strength; 
        return info; 
    }
}
