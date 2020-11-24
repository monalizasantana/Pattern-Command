package pattern_Command;

public class MudarCor implements Icommand {

	public MudarCor(Retangulo retangulo, String novaCor) {
		this.retangulo = retangulo;
		this.corAnterior = retangulo.getCor();
		this.novaCor = novaCor;

	}

	public void redo() {
		retangulo.setCor(this.novaCor);
	}

	public void undo() {
		retangulo.setCor(this.corAnterior);
	}

	public String toString() {
		return "Mudar a Cor [" + corAnterior + " -> " + novaCor + "]";
	}

	private Retangulo retangulo;
	private String novaCor;
	private String corAnterior;

}
