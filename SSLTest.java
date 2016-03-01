
public class SSLTest
{

public static void main (String[] args)
{

  // java -Djavax.net.ssl.trustStore=keystore -Djavax.net.ssl.trustStorePassword=test123 SSLTest 	
  String ServerName = "159.8.44.39";
  int PortNumber = 50000;
  String DatabaseName = "JCRDB";

    java.util.Properties properties = new java.util.Properties();

  properties.put("user", "user1");
  properties.put("password", "crageJed5a");
  properties.put("sslConnection", "true");

    String url = "jdbc:db2://" + ServerName + ":"+ PortNumber + "/" +
                DatabaseName+ ":traceFile=foobar.txt;traceLevel="+ 0xFFFFFFFF+ ";";

				  java.sql.Connection con = null;  
   try
   {
      Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();
   }
   catch ( Exception e )
   {
      System.out.println("Error: failed to load Db2 jcc driver.");
      e.printStackTrace();
   }

   try
   {
      System.out.println("url: " + url);
      con = java.sql.DriverManager.getConnection(url, properties);
      java.sql.Statement s2 = con.createStatement();


      con.close();
   }
   catch (Exception e)
   {
      e.printStackTrace();
   }
 }
} 