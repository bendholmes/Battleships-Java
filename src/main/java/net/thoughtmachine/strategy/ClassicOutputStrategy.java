package net.thoughtmachine.strategy;

import java.util.List;

import net.thoughtmachine.domain.GameBoard;
import net.thoughtmachine.domain.Ship;

public class ClassicOutputStrategy implements OutputStrategy {
	@Override
	public String generateOutput(GameBoard board) {
		String output = "";
		for(List<Ship> ships : board.values()) {
			for(Ship ship : ships) {
				output += ship + "\n";
			}
		}
		return output.substring(0, -2);
	}
}
