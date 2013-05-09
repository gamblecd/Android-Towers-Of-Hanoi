package gamblecd.android.games.towersofhanoi.util;

import abstracts.AbstractThreeTowers;
import entities.Plate;
import gamblecd.android.games.towersofhanoi.R;

public class AndroidThreeTowers extends AbstractThreeTowers {

	public AndroidThreeTowers(int sizeOfGame) {
		this.left = new AndroidHanoiTower(sizeOfGame, R.id.left_tower);
		this.center = new AndroidHanoiTower(sizeOfGame, R.id.center_tower);
		this.right = new AndroidHanoiTower(sizeOfGame, R.id.right_tower);
		for (int i = 0; i < sizeOfGame; i++) {
			this.left.pushOnto(new Plate(sizeOfGame - i));
		}
		this.numberOfPlates = sizeOfGame;
	}
}
