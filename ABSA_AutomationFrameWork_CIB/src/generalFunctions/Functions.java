package generalFunctions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Functions {




    public static void main(String[]args) throws FileNotFoundException, ParseException{
        PrintWriter pw = new PrintWriter(new File("C:\\Users\\abdv220\\Desktop\\Selinium Framework_Supplier Finance\\Test_data\\TestFiles\\AOFIRA22082017-PRO20170822145338.csv"));
        StringBuilder sb = new StringBuilder();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        Calendar c = Calendar.getInstance();    
        c.add(Calendar.DATE, 60);
       
        //SRF File  //        
      
        sb.append("EXPORT_DATE,,,,,,,,,,,,,,,,,");        
        sb.append('\n');
        sb.append("22-Aug-2017 14:15 (SAST),,,,,,,,,,,,,,,,,");        
        sb.append('\n');               
        
        //sb.append('"');
        sb.append("Offer Acceptance Date");
        //sb.append('"');        
        sb.append(',');
        //sb.append('"');
        sb.append("Advanced Value");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("Obligor External ID");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("Program Name");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("Obligor");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("Currency");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("FI Payment");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("Invoice Reference");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("Repayment Date");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("SP Rate Amount");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("FI Rate and Base Amount");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("Seller External ID");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("Seller");
        //sb.append('"');        
        sb.append(',');
        //sb.append('"');
        sb.append("Supplier Receipt");
        //sb.append('"');        
        sb.append(',');
        //sb.append('"');
        sb.append("Trade Payment Date");
        //sb.append('"');        
        sb.append(',');
        //sb.append('"');
        sb.append("Offer Reference");
        //sb.append('"');        
        sb.append(',');
        //sb.append('"');
        sb.append("Tenor Days (Trade payment to Repayment)");
        //sb.append('"');        
        sb.append(',');
        //sb.append('"');
        sb.append("Invoice Value");
        //sb.append('"');        
        sb.append('\n');
        
        
   
        //sb.append('"');
        sb.append(dateFormat.format(date));
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append(3341.16);
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append(79044);
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("Farmwise on ABSA: Woolworths (79044)");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("Woolworths (Pty) Ltd");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("ZAR");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append(3281.66);
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("INV21484");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');     
        sb.append(dateFormat.format(c.getTime()));
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append(2.14);
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append(59.5);
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("Farmwise");
        //sb.append('"');
        sb.append(',');
        //sb.append('"');
        sb.append("Farmwise Marketing (Pty) Ltd");
        //sb.append('"');        
        sb.append(',');
        //sb.append('"');
        sb.append(3279.52);
        //sb.append('"');        
        sb.append(',');
        //sb.append('"');
        sb.append(dateFormat.format(date));
        //sb.append('"');        
        sb.append(',');
        //sb.append('"');
        sb.append("SCQCGOSQITKNDCY");
        //sb.append('"');        
        sb.append(',');
        //sb.append('"');
        sb.append(60);
        //sb.append('"');       
        sb.append(',');
        //sb.append('"');
        sb.append(3712.4);
        //sb.append('"');        
        sb.append('\n');

        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
    }
    
}
