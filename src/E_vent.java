import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class E_vent {
    private static final Path FILE_PATH = Paths.get("eventuario.txt");
    private static final Scanner leitor = new Scanner(System.in);
    public static void main(String[] args){
        int escolha = 3;
        do{
            String titulo = """
            ╔═╗  ┬  ┬┌─┐┌┐┌┌┬┐
            ║╣───└┐┌┘├┤ │││ │ 
            ╚═╝   └┘ └─┘┘└┘ ┴
                    """;

            System.out.print(titulo + "-------------------\n");

            System.out.printf("%-3s %-20s\n%-3s %-20s\n%-3s %-20s\n%-3s %-20s\n%-3s %-20s\n%-3s %-20s\n", "1.", "Add entry", "2.", "Entry history", "3.", "Search by date", "4.", "Search by title", "5.", "Delete entry", "6.", "Exit program");
            System.out.print("-------------------\n");
            System.out.printf("Insert option: ");
            escolha = Integer.parseInt(leitor.nextLine());
            
            switch (escolha) {
                case 1:                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;           
                default:
                    
                    break;
            }
        }while(escolha != 6);
    }

    public static void addEntry(){
        clearTerminal();
    }

    public static void entryHistory(){

    }

    public static void searchDate(){

    }

    public static void searchTitle(){

    }

    public static void deleteEntry(){

    }

    public static void clearTerminal(){
        String os = System.getProperty("os.name");

        try{
            if(os.startsWith("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();           //  Clear Windows terminal
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();                      //  Clear Linux / Mac terminal          
            }
        } catch (Exception e){
            System.out.println("Error(s) cleaning the terminal: " + e.getMessage());
        }
    }
}
