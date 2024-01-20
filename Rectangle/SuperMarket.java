public class SuperMarket {
    double itemPrice;
    double discount;
    double tax;
    public SuperMarket(){
        itemPrice = 0;
        discount = 0;
        tax = 1.24;
    }

    public void recordItem(double amount){
        double recordPrice = itemPrice + amount;
        itemPrice =recordPrice; 
    }

    

    public void DiscountPercentage(double amount){
        double discountPrice = discount + amount;
        discount = discountPrice;
     }

     public double taxFree(){
        return itemPrice / tax;
     }


    public double getOriginalPrice(){
        return itemPrice;
    }

     public double getDiscountPercentage(){
        return discount;
    }

    public double getNewPrice(){
        double finalPrice = itemPrice * discount;
        return itemPrice - finalPrice;
    }
   
        
}
