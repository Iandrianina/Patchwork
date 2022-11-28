package projet.patchwork;

import java.util.ArrayList;
import java.util.Objects;

public record Player(int button,  ArrayList<Patch> quiltBoard, int timeToken) {
	
	public Player {
		Objects.requireNonNull(button);
		Objects.requireNonNull(quiltBoard);	
		
	}
}
