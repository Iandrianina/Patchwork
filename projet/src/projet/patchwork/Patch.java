package projet.patchwork;

import java.util.Objects;

public record Patch(int nbButton, int priceButton, int nbSpaces, int[][] shape) {
	public Patch {
		Objects.requireNonNull(priceButton);
		Objects.requireNonNull(nbSpaces);
		Objects.requireNonNull(shape);
	}
}
