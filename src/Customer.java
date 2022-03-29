public class Customer extends User {
    private String username,
            email,
            creditCard;

    /*public void Login();
    public void createAccount();
    public void setCustomerInfo(String name, String address, String cardNumber);
    public bool getCustomerInfo();
    public bool hasCoupon();*/

    public String getUsername(){
        return username;
    }
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public String getCreditCard(){
        return creditCard;
    }
    public void setCreditCard(String newCreditCard){
        this.creditCard = newCreditCard;
    }
}
