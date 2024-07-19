import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        ArrayList<String> Tarefas = new ArrayList<>();
        Tarefas.add("");
        while(true){
            System.out.print("\nOque voce deseja fazer?\n" +
                    "[1]-Adicionar tarefa\n" +
                    "[2]-Ver tarefas\n" +
                    "[3]-Editar tarefa\n" +
                    "[4]-Remover tarefa\n" +
                    "[5]-Sair\n");
            byte ind = scan.nextByte();
            if (ind < 1 || ind > 5) return;
            switch (ind) {
                case 1:
                    System.out.println("Digite a sua tarefa: ");
                    Tarefas.add(scan2.nextLine());
                    break;
                case 2:
                    if(Tarefas.size()==1){
                        System.out.println("Voce não tem nenhuma tarefa adicionada");
                        break;}
                    System.out.println("Aqui estão todas as tarefas:");
                    for (int i=1;i<Tarefas.size();i++) {
                        System.out.println(i + " " + Tarefas.get(i));
                    }break;
                case 3:
                    if(Tarefas.size()==1){
                        System.out.println("Voce não tem nenhuma tarefa adicionada");
                        break;}
                    System.out.println("Existem atualmente " + (Tarefas.size()-1) +
                            " Tarefas\nDigite qual tarefa voce quer editar:");
                    int trf = scan3.nextInt();
                    System.out.println("Digite a tarefa:");
                    String trf2 = scan2.nextLine();
                    Tarefas.set(trf, trf2);
                    break;
                case 4:
                    if(Tarefas.size()==1){
                        System.out.println("Voce não tem nenhuma tarefa adicionada");
                        break;}
                    System.out.println("Digite qual tarefa voce quer remover:");
                    int rmv = scan3.nextInt();
                    Tarefas.remove(rmv);
                    break;
                case 5:
                    System.out.println("Suas tarefas serão perdidas, deseja mesmo sair?\n" +
                            "[1]-Sim\n" +
                            "[2]-Nao\n");
                    byte exit = scan.nextByte();
                    if(exit<1||exit>2){System.out.println("Erro");break;}
                    if(exit==1){return;}
                    if(exit==2){break;}
                    break;
            }
        }
    }
}