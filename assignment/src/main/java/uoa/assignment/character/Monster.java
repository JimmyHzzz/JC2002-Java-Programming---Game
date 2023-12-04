package uoa.assignment.character;

import java.util.Random;

public class Monster extends GameCharacter {

	public Monster(String name) {
		super(name);
	}


	public void hurtCharacter(GameCharacter character) {
		
	}

	
	public boolean successfulDefense() {
		Random random = new Random();
        boolean defenseResult = random.nextBoolean();
        if (defenseResult == false) {
            int healthValue = getHealth();
            healthValue = healthValue - 20;
            setHealth(healthValue);
            return false;
        } else {
            return true;
        }
	}


	
	public String decideMove () {
		return "move";
	}

}
