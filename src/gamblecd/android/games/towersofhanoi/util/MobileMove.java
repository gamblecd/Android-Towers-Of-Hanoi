package gamblecd.android.games.towersofhanoi.util;

import gamblecd.android.games.towersofhanoi.R;
import abstracts.AbstractThreeWayMove;
import android.widget.Button;

public class MobileMove extends AbstractThreeWayMove {
	
	public MobileMove (Button from, Button to) {
	    int id = from.getId();
	    if (id == R.id.left_tower) {
            this.from = TowerEnum.LEFT;
        }else if (id == R.id.center_tower) {
            this.from = TowerEnum.CENTER;
        }else if (id == R.id.right_tower) {
            this.from = TowerEnum.RIGHT;
        }else {
            throw new IllegalArgumentException();
        }
		id = to.getId();
		if (id == R.id.left_tower) {
		    this.to = TowerEnum.LEFT;
		}else if (id == R.id.center_tower) {
			this.to = TowerEnum.CENTER;
		}else if (id == R.id.right_tower) {
			this.to = TowerEnum.RIGHT;
		}else {
			throw new IllegalArgumentException();
		}
	}

}
