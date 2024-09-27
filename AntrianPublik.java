import java.util.LinkedList;
import java.util.Scanner;

public class AntrianPublik {
    public static void main(String[] args) {
        LinkedList<String> antrian = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String operasi = sc.nextLine();
            
            if (operasi.startsWith("add_masyarakat")) {
                String nama = operasi.split(" ")[1];
                antrian.addLast(nama);
                
            } else if (operasi.startsWith("add_pejabat")) {
                String nama = operasi.split(" ")[1];
                antrian.addFirst(nama);
                
            } else if (operasi.equals("remove")) {
                if (!antrian.isEmpty()) {
                    System.out.println(antrian.removeFirst());
                }
                
            } else if (operasi.equals("show")) {
                if (!antrian.isEmpty()) {
                    for (String orang : antrian) {
                        System.out.print(orang + " ");
                    }
                    System.out.println();
                }
                
            } else if (operasi.startsWith("check_index")) {
                int index = Integer.parseInt(operasi.split(" ")[1]);
                if (index >= 0 && index < antrian.size()) {
                    System.out.println(antrian.get(index));
                } else {
                    System.out.println("Kosong");
                }
            }
        }
        
        sc.close();
    }
}
