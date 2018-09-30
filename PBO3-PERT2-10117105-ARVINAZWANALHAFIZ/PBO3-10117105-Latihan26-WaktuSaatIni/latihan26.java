
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3

/**
 *
 * @author RIA FITRIANI
 */
public class latihan26 {
    public static void main(String[] args) {
     Date date = new Date();
     Calendar cal = Calendar.getInstance();
     int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);// hari dalam format angka
        
//     format tanggal dan waktu
     SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        
//     data array -> nama hari Indonesia
     String[] strDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu"
             ,"Kamus","Jumat"};
        
//     menampilkannya sesuai format
     System.out.println("Hari ini adalah hari : "+(strDays[daysOfWeek])+" ,"
             +formatIndo.format(date));

    }
    
}
