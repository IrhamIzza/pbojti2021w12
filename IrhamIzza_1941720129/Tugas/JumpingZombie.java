package Tugas;
public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level){ 
        this.health = health; this.level = level; 
    }
    @Override
    public void heal() {
        if(level == 1) { 
            health += (health * 3/100);
        } else if(level == 2) { 
            health += (health * 4/100); 
        } else {
            health += (health * 5/100); 
        }
    }
    @Override   
    public void destroyed(){ 
        health -= (health * 10/100); 
    }
    @Override
    public String getZombieInfo() { 
        String info = "Jumping " +super.getZombieInfo() + "\n";
        info += "Health = " + health + "\n" + "Level = " + level + "\n"; 
        return info; 
    }
}
