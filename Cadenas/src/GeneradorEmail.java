public class GeneradorEmail {
    public static void main(String[] args) {

        var username = "Isabella Salcedo Hernandez";
        var company = "Kodland Education";
        var domain = ".com.org";
        
        var username1 = username.replace(" ",".").toLowerCase();
        var company1 = company.replace(" ",".").toLowerCase();
        
        var email = String.join("@",username1, company1) + domain;
        System.out.println("email = " + email);

        /*var username1 = username.substring(0,8).toLowerCase();
        var username2 = username.substring(9,16).toLowerCase();
        var username3 = username.substring(17).toLowerCase();
        var company1 = String.join(".", company.substring(0,7).toLowerCase() + company.substring(8).toLowerCase(),domain);

        var email = String.join(".",username1, username2, username3);
        var email1 = String.join("@", email, company1);

        System.out.println("email = " + email1);*/

    }
}
