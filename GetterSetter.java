
package getteAndsetter;

/*NAMA ; Fitriani Hasbullah
STAMBUK : 13020180028
TANGGAL/WAKTU ;02MEI 2020 / 21.17 
 */


public class GetterSetter {

   public static void main(String[] args) {
         tampungan objek = new tampungan();
         objek.setNidn(1302018);
         objek.setNamadosen("Mardiyyah Hasnawi.,S.Kom");
         objek.setJurusan("Teknik Informatika");
         objek.setFakultas("Ilmu Komputer");
         objek.setEmail("mardiyyah.hm@gmail.com");
         
         System.out.println("NIDN = " + objek.getNidn());
         System.out.println("Nama Dosen = " + objek.getNamadosen());
         System.out.println("Jurusan = " + objek.getJurusan());
         System.out.println("Fakultas = " + objek.getFakultas());
         System.out.println("Email = " + objek.getEmail());
    }
    
}
