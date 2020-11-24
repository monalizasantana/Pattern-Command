package pattern_Command;

public class MudarPosicao implements Icommand {

	public MudarPosicao(Retangulo retangulo, int novoX, int novoY) {
		this.retangulo = retangulo;
		this.novoX = novoX;
		this.novoY = novoY;
		this.anteriorX = retangulo.getX();
		this.anteriorY = retangulo.getY();
		

	}
	public void redo() {
		retangulo.setX(novoX);
		retangulo.setY(novoY);
	}

	public void undo() {
		retangulo.setX(this.anteriorX);
		retangulo.setY(this.anteriorY);
		
	}

	public String toString() {
		return "Mover Posicao : " + "Coordenada Anterior:" + "[" + this.anteriorX + "," + this.anteriorY + "]" + " -> "
				+ "Nova Coordenada:" + "[" + this.novoX + "," + this.novoY + "]";
	}

	private Retangulo retangulo;
	private int novoX;
	private int novoY;
	private int anteriorX;
	private int anteriorY;

}
