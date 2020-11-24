package pattern_Command;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Retangulo retangulo = new Retangulo(0, 0, "Preta");
		HistoricoCommand historico = new HistoricoCommand();

		Scanner scanner = new Scanner(System.in);
		int opcao;
		do {
			System.out.println(" ");
			historico.Impressao();
			System.out.println("Posicao Atual: " +retangulo.getX() +"  "+ +retangulo.getY());
			System.out.println("Cor Atual: " + retangulo.getCor());
			System.out.println("\n1 - Mover o ret�ngulo");
			System.out.println("2 - Altera a cor do ret�ngulo");
			System.out.println("3 - undo");
			System.out.println("4 - redo");
			System.out.println("5 - Sair da aplica��o");
			
			System.out.print("\nEntre com a opcao desejada: ");
			
			opcao = Integer.parseInt(scanner.nextLine());

			switch (opcao) {
			
			case 1:
				int x;
				int y;
				System.out.print(" Entre a posi��o x: ");
				x = Integer.parseInt(scanner.nextLine());
				System.out.print(" Entre a posi��o y: ");
				y = Integer.parseInt(scanner.nextLine());
				historico.add(new MudarPosicao(retangulo, x, y));
		     	break;
			case 2:
				String cor;
				System.out.print(" Digite uma Cor: ");
				cor = scanner.nextLine();
				historico.add(new MudarCor(retangulo, cor));
				break;
			case 3:
				if (!historico.MoverParaTras())
					System.out.println("N�o posso mais realizar undo !");
				break;
			case 4:
				if (!historico.MoverPraFrente())
					System.out.println("N�o posso mais realizar redo!");
				break;
			}
		} while (opcao != 5);
	}
}