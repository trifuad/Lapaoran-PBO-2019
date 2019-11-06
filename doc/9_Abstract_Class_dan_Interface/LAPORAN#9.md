# Laporan Praktikum #9 - Abstract Class dan Interface 


## Kompetensi
Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu: 
1. Menjelaskan maksud dan tujuan penggunaan Abstract Class;
2. Menjelaskan maksud dan tujuan penggunaan Interface; 
3. Menerapkan Abstract Class dan Interface di dalam pembuatan program. 



## Ringkasan Materi

untuk keseluruhan dalam menyelesaikan tugas yang di berikan dosen tidak ada masalah, mulai terbiasa dengan cara pengiriman 

## Praktikum

### Percobaan 1

Class Hewan
![](img/hewan.PNG)

Link kode program : 
[Hewan](../../src/9_Abstract_Class_dan_Interface/Hewan1841720139Fuad.java)

Class Kucing
![](img/kucing.PNG)

Link kode program : 
[Kucing](../../src/9_Abstract_Class_dan_Interface/Kucing1841720139Fuad.java)

Class Ikan
![](img/ikan.PNG)

Link kode program : 
[Ikan](../../src/9_Abstract_Class_dan_Interface/Ikan1841720139Fuad.java)

Class Orang
![](img/orang.PNG)

Link kode program : 
[Orang](../../src/9_Abstract_Class_dan_Interface/Orang1841720139Fuad.java)

Class Pt1Program
![](img/pt1.PNG)

Link kode program : 
[Pt1Program](../../src/9_Abstract_Class_dan_Interface/Pt1Program.java)

# Pertanyaan 1

- Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak 
  mengimplementasikan method abstract yang ada di class induknya? Buktikan

  Jawab : Tidak boleh, karena kelas turunan harus mengoverride method yang ada dari kelas induk dan bila tidak maka akan muncul eror, 
          misalnya di kelas ‘Kucing’ dihapus method bergerak(), makan akan muncul eror


### Percobaan 2
Class ICumlaude
![](img/icumlaude.PNG)

Link kode program : 
[ICumlaude](../../src/9_Abstract_Class_dan_Interface/ICumlaude1841720139Fuad.java)

Class Mahasiswa
![](img/mahasiswa.PNG)

Link kode program : 
[Mhasiswa](../../src/9_Abstract_Class_dan_Interface/Mahasiswa1841720139Fuad.java)

Class Sarjana
![](img/sarjana.PNG)

Link kode program : 
[Sarjana](../../src/9_Abstract_Class_dan_Interface/Sarjana1841720139Fuad.java)

Class PascaSarjana
![](img/pascasarjana.PNG)

Link kode program : 
[PascaSarjana](../../src/9_Abstract_Class_dan_Interface/PascaSarjana1841720139Fuad.java)

Class Rektor
![](img/rektor.PNG)

Link kode program : 
[Rektor](../../src/9_Abstract_Class_dan_Interface/Rektor1841720139Fuad.java)

Class Pt2Program
![](img/pt2.PNG)

Link kode program : 
[Pt2Program](../../src/9_Abstract_Class_dan_Interface/Pt2Program.java)

#### soal
a. Mengapa pada langkah nomor 9 terjadi error? Jelaskan! 
   Jawab : Karena pada class Mahasiswa tidak ter implementasi interfaces dari Icumlaude ] sehingga eror ketika akan dipanggil oleh ‘pakRektor’ 

b. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian?
   Jawab : Bisa, karena sarjanaCumlaude dari class Sarjana adalah kelas turunan dari ‘Mahasiswa’, sehingga method ‘KulihadiKampus’ bisa               dipanggil ke class Sarjana

c. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?
   Jawab : Tidak bisa, karena class rektor hanya menggunakan implementasi dari Icumlaude, dan ‘kuliahDiKampus’ dari Mahasiswa tidak pernah di inisiasi di kelas rektor 

d. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini: 
![](img/soalpt2.PNG)


### Percobaan 3

Class IBerprestasi
![](img/iberprestasi.PNG)

Link kode program : 
[IBerprestasi](../../src/9_Abstract_Class_dan_Interface/IBerprestasi1841720139Fuad.java)

Class PascaSarjana
![](img/pascasarjanav2.PNG)

Link kode program : 
[Kucing](../../src/9_Abstract_Class_dan_Interface/PascaSarjana1841720139Fuad.java)

Class Rektor 
![](img/rektorv2.PNG)

Link kode program : 
[Ikan](../../src/9_Abstract_Class_dan_Interface/Rektor1841720139Fuad.java)

Class Pt3Program
![](img/pt3.PNG)

Link kode program : 
[Pt3Program](../../src/9_Abstract_Class_dan_Interface/Pt2Program.java)

#### Soal
Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude. 

![](img/soalpt3.PNG)


## Kesimpulan

saya mulai memahami abstrack class dan interface class , dan sudah sedikit- sedikit sudah paham cara implementasi an nya terhadap suatau class.


## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(TRI FUAD)***