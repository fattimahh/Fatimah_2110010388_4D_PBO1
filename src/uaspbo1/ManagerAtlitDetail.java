package uaspbo1;//inheritance
public class ManagerAtlitDetail extends ManagerAtlit{
     //overriding
    public ManagerAtlitDetail(String id, String nama) {
        super(id, nama);
    }
    
    public String getDomisili(){
        String kodeKabupaten = getId().substring(0, 4);
        //seleksi swicth
        switch(kodeKabupaten) {
            case "1234":
                return "Banjarbaru";
            case "4567":
                return "Banjarmasin";
            default:
                return "Kabupaten Lain";
        }
    }
    
    public int getIdentitas(){
          return Integer.parseInt(getId().substring(4, 6));   
    }
    
    public String getKomunitas(){
        String urutankeluarga = getId().substring(6, 8);
        //seleksi swicth
        switch(urutankeluarga) {
            case "112":
                return "Dojo1";
            case "113":
                return "Dojo2";
            case "114":
                return "Dojo3";
            case "115":
                return "Dojo4";
            case "116":
                return "Dojo5";
            default:
                return "Dan Seterusnya";
         }
    }
   //polymortisme(override)
    @Override
    public String displayInfo(){
            return super.displayInfo()+
            "\nKabupaten = "+getDomisili()+
            "\nIdentitas = "+getIdentitas()+
            "\nUrutan Keluarga = "+getKomunitas();
        }
    }
