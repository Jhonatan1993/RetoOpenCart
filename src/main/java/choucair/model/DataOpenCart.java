package choucair.model;

public class DataOpenCart {

    private String username;
    private String password;
    private String orderId;
    private String salesOptions;
    private String verifyOderId;
    private String currency;
    private String errorMssage;

    public String getCurrency() {return currency;}
    public void setCurrency(String currency) {this.currency = currency;}

    public String getErrorMssage() {return errorMssage;}
    public void setErrorMssage(String errorMssage) {this.errorMssage = errorMssage;}

    public String getVerifyOderId() {return verifyOderId;}
    public void setVerifyOderId(String verifyOderId) {this.verifyOderId = verifyOderId;}

    public String getOrderId() {return orderId;}
    public void setOrderId(String orderId) {this.orderId = orderId;}

    public String getSalesOptions() {return salesOptions;}
    public void setSalesOptions(String salesOptions) {this.salesOptions = salesOptions;}

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


}
