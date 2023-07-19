# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data ManagerAtlit menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Id dan Nama, dan memberikan output berupa informasi detail dari Id tersebut seperti Domisili, Identitas, dan Komunitas.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `ManagerAtlit`, `ManagerAtlitDetail`, dan `ManagerAtlitBeraksi` adalah contoh dari class.

```bash
public class ManagerAtlit {
    ...
}

public class ManagerAtlitDetail extends ManagerAtlit {
    ...
}

public class ManagerAtlitBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `manageratlit[i] = new ManagerAtlitDetail(id, nama);` adalah contoh pembuatan object.

```bash
manageratlit[i] = new ManagerAtlitDetail(id, nama);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `id` dan `nama` adalah contoh atribut.

```bash
String id;
String nama;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `ManagerAtlit` dan `ManagerAtlitDetail`.

```bash
public ManagerAtlit(String id, String nama) {
    this.id = id;
    this.nama = nama;
}

public ManagerAtlitDetail(String id, String nama) {
    super(id, nama);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setId` dan `setNama` adalah contoh method mutator.

```bash
public void setId(String id) {
    this.id = id;
}

public void setNama(String nama) {
    this.nama = nama;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getId`, `getNama`, `getDomisili`, `getIdentitas`, dan `getKomunitas` adalah contoh method accessor.

```bash
public String getId() {
    return id;
}

public String getNama() {
    return nama;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `id` dan `nama` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String id;
private String nama;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `ManagerAtlitDetail` mewarisi `ManagerAtlit` dengan sintaks `extends`.

```bash
public class ManagerAtlitDetail extends ManagerAtlit {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `ManagerAtlit` merupakan overloading method `displayInfo` dan `displayInfo` di `ManagerAtlitDetail` merupakan override dari method `displayInfo` di `ManagerAtlit`.

```bash
public String displayInfo(String alamat) {
    return displayInfo() + "\nAlamat: " + alamat;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `case` dalam method `getDomisili` dan seleksi `switch` dalam method `getKomunitas`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < manageratlit.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print(" Masukkan ID "+(i+1)+" = ");
String id = scanner.nextLine();
System.out.print(" Masukkan NAMA  "+(i+1)+" = ");
String nama = scanner.nextLine();

System.out.println("====================");
System.out.println("Data Diri = ");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `ManagerAtlitDetail[] manageratlit = new ManagerAtlitDetail[2];` adalah contoh penggunaan array.

```bash
ManagerAtlitDetail[] manageratlit = new ManagerAtlitDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Fatimah
NPM: 2110010388
