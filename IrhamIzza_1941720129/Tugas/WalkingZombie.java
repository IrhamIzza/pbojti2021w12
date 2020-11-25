package Tugas;
public class WalkingZombie extends Zombie { 
        public WalkingZombie(int health, int level) { 
            this.health = health; 
            this.level = level;
        } 
    public void heal() {
            if(level == 1) { 
                health += (health * 2/100);
            } else if(level == 2) { 
                health += (health * 3/100);
            } else { 
                health += (health * 4/100);
            } 
    } 
    @Override
    public void destroyed() {
        health -= (health * 20/100);
    } 
    @Override
    public String getZombieInfo() {
        String info = "Walking " +super.getZombieInfo() + "\n";
        info += "Health = " + health + "\n" + "Level = " + level + "\n"; 
        return info; 
    }
}
