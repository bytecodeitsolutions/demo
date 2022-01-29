import java.text.SimpleDateFormat;
import java.text.ParseException;
class TestDate 
{
	public static void main(String[] args) throws ParseException
	{
		String sdate="28-01-2022";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yy");
        java.util.Date udate=simpleDateFormat.parse(sdate);
       long ms= udate.getTime();
	   java.sql.Date sqldate=new java.sql.Date(ms);
       System.out.println("sql date is ::"+sqldate);
	   java.util.Date udate1=(java.util.Date)sqldate;
       SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("dd-MM-yy");
       String sdate1=simpleDateFormat1.format(udate1);
		System.out.println("string date is ::"+sdate1);
	}
}
