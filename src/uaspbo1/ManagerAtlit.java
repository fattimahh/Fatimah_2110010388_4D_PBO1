package uaspbo1;

public class ManagerAtlit {
    //atribut dan encapculation
    private String id;
    private String nama;

    //construktor
    public ManagerAtlit(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    //setter
    public void setId(String id) {
        this.id = id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    //getter
    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    
    public String displayInfo() {
        return "ID = "+getId()+ "\nNama = "+getNama();
    }
    
    //polymortisme(overloding)
    public String displayInfo(String alamat){
        return displayInfo()+"\nAlamat = "+alamat;
    }
}
