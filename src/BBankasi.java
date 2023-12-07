public class BBankasi implements IBanka {
    private String bankaAdi;
    private String terminalID;
    private String password;
    public BBankasi(String  bankaAdi, String terminalID, String password){
        this.bankaAdi=bankaAdi;
        this.terminalID = terminalID;
        this.password=password;

    }
    public boolean connect(String ipAdress){
        System.out.println("kullanıcı ip "+ ipAdress);
        System.out.println("makine ip "+this.hostIpAdress);
        System.out.println(this.bankaAdi+" bağlanıldı");
        return true;

    }
    public boolean payment(double price,String cardnumber,String expiryDate,String cvc){
        System.out.println("Bankadan cevap bekleniyor");
        System.out.println("işlem başarılı oldu");
        return true;



    }

    public String getBankaAdi() {
        return this.bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return this.terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


