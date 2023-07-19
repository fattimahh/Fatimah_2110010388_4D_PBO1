package uaspbo1;
import java.util.Scanner;
public class ManagerAtlitBeraksi {
     public static void main(String[] args) {
        //objek
        //DataDiri ManagerAtlit = new DataDiri("22110010388","Fatimah");
        
        //System.out.println(manageratlit.displayInfo());
        //System.out.println(manageratlit.displayInfo("Banjarbaru"));
        
        //error headling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
       ManagerAtlitDetail[] manageratlit = new ManagerAtlitDetail[2];
        
        //perulangan
        for(int i =0; i<manageratlit.length;i++){  
        System.out.print(" Masukkan ID "+(i+1)+" = ");
        String id = scanner.nextLine();
        System.out.print(" Masukkan NAMA  "+(i+1)+" = ");
        String nama = scanner.nextLine();
        
        //objek
        manageratlit[i] = new ManagerAtlitDetail(id,nama);
        }
        
        //perulangan
        for(ManagerAtlitDetail data : manageratlit) {
            System.out.println("====================");
            System.out.println("Data Diri = ");
            System.out.println(data.displayInfo());
        }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format ID "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format Nama"+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
    }
  }    
}
