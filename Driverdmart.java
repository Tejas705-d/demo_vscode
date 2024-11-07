class Dmart{
  String address;
  String contact;
  String email;
  String website;

    public Dmart(String address,String contact,String email,String website) {
        this.address=address;
        this.contact=contact;
        this.email=email;
        this.website=website;

    }
    public void displayDmart(){
        System.out.println("Address :"+address);
        System.out.println("contact :"+contact);
        System.out.println("email :"+email);
        System.out.println("website :"+website);
    }
   

}
class product{
    String cate;
    String name;
    String orgprice;
    String dmartprice;
    barcode barcode;

    public product(String cate,String name ,String orgprice ,String dmartprice,barcode barcode ) {
        this.cate=cate;
        this.name=name;
        this.orgprice=orgprice;
        this.dmartprice=dmartprice;
        this.barcode=barcode;

     }
    public void displayProduct(){
        System.out.println("Cate :"+cate);
        System.out.println("name :"+name);
        System.out.println("Orgprice :"+orgprice);
        System.out.println("Dmartprice :"+dmartprice);
        
    }
    
}
class barcode{
    String productid;
    String price ;

    public barcode( String productid,String price ) {
        this.productid=productid;
        this.price=price;

    }
    public void displayBarcode(){
        System.out.println("Productid :"+productid);
        System.out.println("Price :"+price );

    }
     
}
class customer{
    String name;
    long contact;
    String paymentmode;

    public customer(String name, long contact,String paymentmode ) {
        this.name=name;
        this.contact=contact;
        this.paymentmode=paymentmode;

    }
    public void displayCustomer(){
        System.out.println("Nmae :"+name);
        System.out.println("Contact :"+contact );
        System.out.println("Payment mode :"+paymentmode);
    }
    

}
class cashier{
    String name;
    String id;
    long contact;
    int counterNum;
}
class Driverdmart{
    public static void main(String[] args) {
        
    }
}