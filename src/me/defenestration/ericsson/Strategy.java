package me.defenestration.ericsson;

import com.sun.org.apache.xpath.internal.operations.Bool;
import me.defenestration.ericsson.connection.protocol.ResponseClass;

import java.util.List;

class Unit {public int x,y;}

class Player{public Unit[] units;}

public class Strategy {

	Map map;
	List<Player> players;

	 public int GetDirection (Map map, int x, int y, List<Player> players) {
		this.map = map;
		this.players = players;

		int dir = 0;

		dir = ProtcolAlpha(dir, x, y);

		return dir;
	}

	int ProtocolBeta (int dir) {


	 	return dir;
	}

	//"A" function
	int stepsToClose (int playerId, int unitId) {
		int pX = players.get(playerId).units[unitId].x ,pY = players.get(playerId).units[unitId].y;
		int minDist = 100000;
		for (int x = 0; x < 120; x++) {
			for (int y = 0; y < 90; y++) {
				if (map.get(x, y).owner == playerId) {
					if (Math.abs(x - pX) + Math.abs(y - pY) < minDist)
						minDist = Math.abs(x - pX) + Math.abs(y - pY);
				}
			}
		}

		return minDist;
	}

	//"B" function
	int stepsToHunt (int hPlayer, int hUnit, int pPlayer, int pUnit) {
		int hX = players.get(hPlayer).units[hUnit].x ,hY = players.get(hPlayer).units[hUnit].y;

		int minDist = 1000000;
		for (int x = 0; x < 120; x++) {
			for (int y = 0; y < 90; y++) {
				if (map.get(x, y).attacked && map.get(x,y).attackedId == players.get(pPlayer).units[pUnit].id) {
					if (Math.abs(x - hX) + Math.abs(y - hY) < minDist)
						minDist = Math.abs(x - hX) + Math.abs(y - hY);
				}
			}
		}

		return minDist;
	}

	int ProtcolAlpha (int dir, int x, int y) { //Avoid Walls
		Boolean willHit = false;
		switch (dir) {
			case 0: //UP
				if (!map.get(x, y - 1).attackable)
					willHit = true;
				break;
			case 1: //LEFT
				if (!map.get(x - 1, y).attackable)
					willHit = true;
				break;
			case 2: //DOWN
				if (!map.get(x, y + 1).attackable)
					willHit = true;
				break;
			case 3: //RIGHT
				if (!map.get(x + 1, y).attackable)
					willHit = true;
				break;
		}

		if (willHit) {
			dir = (dir + 2) % 4;
		}

		return dir;
	}
}
