package pattern_Command;

import java.util.ArrayList;

public class HistoricoCommand {

	public void add(Icommand command) {
		if (ultimaExecucao != historico.size() - 1)
			historico.subList(ultimaExecucao + 1, historico.size()).clear();
		historico.add(command);
		command.redo();
		ultimaExecucao = historico.size() - 1;
	}

	public boolean MoverParaTras() {
		if (ultimaExecucao >= 0) {
			historico.get(ultimaExecucao--).undo();
			return true;
		} else
			return false;
	}

	public boolean MoverPraFrente() {
		if (ultimaExecucao < historico.size() - 1) {
			historico.get(++ultimaExecucao).redo();
			return true;
		} else
			return false;
	}

	public void Impressao() {
		if (ultimaExecucao == -1)
			System.out.println("> ");
		for (int i = 0; i < historico.size(); ++i)
			System.out.println(((ultimaExecucao == i) ? "> " : "  ") + historico.get(i));
	}

	private ArrayList<Icommand> historico = new ArrayList<Icommand>();
	private int ultimaExecucao = -1;
}
