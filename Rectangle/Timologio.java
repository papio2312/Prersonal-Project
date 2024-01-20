public class Timologio implements PaymentCalculator{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Timologio (String part, String desc, int count, double price){
        partNumber = part;
        partDescription = desc;
        setQuantity(count);
        pricePerItem = price;
    }

    public void setPartNumber(String part){
        partNumber = part;
    }

    public String getPartNumber(){
        return partNumber;
    }

    public void setPartDescription(String desc){
        partDescription = desc;
    }

    public String getPartDescription(){
        return partDescription;
    }

    public void setQuantity(int count){
        if(count >0){
            quantity = count;
        }
        else{
        quantity = 0;
    }
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPricePerItem(){
        return pricePerItem;
    }

    


}
