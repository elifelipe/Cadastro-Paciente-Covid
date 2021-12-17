package mapa01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {
  public static void main(String[] args){

    // declaração de variaveis
    int temFebre = 5;
    int temDorCabeca = 1;
    int temSecNasalEsp = 1;
    int temDorGarganta = 1;
    int temTosseSeca = 3;
    int temDifResp = 10;
    int temDorCorpo = 1;
    int temDiarreia = 1;
    int teveContato = 10;
    int teveLocais = 3;

    // lista e objetos
    ArrayList<Paciente> lista = new ArrayList<>();
    Paciente paciente = new Paciente();
    lista.add(paciente);

    System.out.println("Registros no sistema hoje");

        //dados do paciente
        for(int i = 0; i < 1000; i++){
            paciente.cpf = JOptionPane.showInputDialog("Digite seu CPF");
            paciente.nome = JOptionPane.showInputDialog("Digite seu Nome");
            if("sair".equals(paciente.nome)){
                System.exit(0);
            }
            for(Paciente p: lista){
                System.out.println((i + 1)+ " " +  p.nome);
            }
            JOptionPane.showInputDialog(null, "Escolha o sexo", "Opçao", 
            JOptionPane.INFORMATION_MESSAGE, null,
            paciente.sexo , paciente.sexo [0]);
            String idadePaciente = JOptionPane.showInputDialog("Digite sua idade");
            paciente.idade = Integer.parseInt(idadePaciente);

            // formulario COVID
            int total = 0;
            boolean result = JOptionPane.showConfirmDialog(null, "Tem Febre?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
            if(result == true){
                total += temFebre;
            }
            result = JOptionPane.showConfirmDialog(null, "Tem dor de cabeça?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
            if(result == true){
                total += temDorCabeca;
            }
            result = JOptionPane.showConfirmDialog(null, "Tem Secreção nasal ou espirros?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
            if(result == true){
                total += temSecNasalEsp;
            }
            result = JOptionPane.showConfirmDialog(null, "Tem dor/irritação na garganta?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
            if(result == true){
                total += temDorGarganta;
            }
            result = JOptionPane.showConfirmDialog(null, "Tem tosse seca?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
            if(result == true){
            total += temTosseSeca;
            }
            result = JOptionPane.showConfirmDialog(null, "Tem dificuldade respiratória?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
            if(result == true){
            total += temDifResp;
            }
            result = JOptionPane.showConfirmDialog(null, "Tem dores no corpo?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
            if(result == true){
            total += temDorCorpo;
            }
            result = JOptionPane.showConfirmDialog(null, "Tem diarreia?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
            if(result == true){
            total += temDiarreia;
            }
            result = JOptionPane.showConfirmDialog(null, 
            "Esteve em contato, nos últimos 14 dias, com um caso diagnosticado com COVID-19?", "Atenção", 
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
            if(result == true){
            total += teveContato;
            }
            result = JOptionPane.showConfirmDialog(null, 
            "Esteve em locais com grande aglomeração?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
            if(result == true){
                total += teveLocais;
            }

            // resultado do formulario
            StringBuilder mensagem = new StringBuilder();
            if(total == 0 || total <= 9){
                mensagem.append(paciente.nome).append(" Vá para ala de baixo risco!");
                JOptionPane.showMessageDialog(null, mensagem);
            }
            if(total == 10 && total <= 19){
                mensagem.append(paciente.nome).append(" Vá para ala de Médio risco!");
                JOptionPane.showMessageDialog(null, mensagem);
            }else if(total > 20 ){
                mensagem.append(paciente.nome).append(" Vá para ala de Alto risco!");
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }
    } 
}