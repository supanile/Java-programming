import javax.swing.JOptionPane;
public class Exercise5E {
  public static String email(String name,String surname,String domain){
    return name +"." + surname + "@" + domain;
    }
  public static String homePage(String surname,String webDomain){
    return "http://"+ webDomain + "/~"+ surname;
    }
  public static String userId(String firstname,String surname){
    String tmp = surname + "1234567";
    return firstname.substring(0,1) + tmp.substring(0,7);
    }
  public static void main(String[] args){
    String name = JOptionPane.showInputDialog("Insert a Name");
    String lastname = JOptionPane.showInputDialog("Insert a LastName");
    String domain = JOptionPane.showInputDialog("Insert a domain");
    String webDomain = JOptionPane.showInputDialog("Insert a web domain");
    String address = email(name, lastname, domain);
    String webPage = homePage(lastname, webDomain);
    String account = user2Id(name, lastname);
   
    System.out.println("email: " +address);
    System.out.println("homePage: " +webPage);
    System.out.println("userId: " +account);
    System.exit(0);
  }
}//Supawit Saengrattanayon 64050694