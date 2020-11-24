package pattern_Command;

public class Retangulo {

	public Retangulo(int x, int y, String cor) {
		this.x = x;
		this.y = y;
		this.cor = cor;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return this.y;

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	private String cor;
	private int x;
	private int y;

}
