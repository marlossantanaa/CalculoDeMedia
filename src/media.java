import javax.swing.JOptionPane;

public class media {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "BEM VINDOS AO SISTEMA DE NOTAS");
		for (int cont = 0; cont <= 2; cont++) {
			
			String nome = JOptionPane.showInputDialog("Nome do Aluno:");
			String nota1 = JOptionPane.showInputDialog("Informe 1 nota:");
			String nota2 = JOptionPane.showInputDialog("Informe 2 nota:");
			String nota3 = JOptionPane.showInputDialog("Informe 3 nota:");
			String nota4 = JOptionPane.showInputDialog("Informe 4 nota:");

			double dNota1 = Double.parseDouble(nota1);
			double dNota2 = Double.parseDouble(nota2);
			double dNota3 = Double.parseDouble(nota3);
			double dNota4 = Double.parseDouble(nota4);
			double media = (int) (dNota1 + dNota2 + dNota3 + dNota4) / 4;
			JOptionPane.showMessageDialog(null, "A media é :" + media);

			if (media >= 50) {

				if (media >= 70) {
					JOptionPane.showMessageDialog(null, nome + ",você foi Aprovado com a média: " + media);
				} else {
					JOptionPane.showMessageDialog(null, nome + ",você foi para Recuperação com média: " + media);

				}
			} else {
				JOptionPane.showMessageDialog(null, nome + ",você foi reprovado" + media);
				continue;
			}

		}
		JOptionPane.showMessageDialog(null, "Obrigado pela a Consulta");
	}
}
