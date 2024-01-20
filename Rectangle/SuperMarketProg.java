public class SuperMarketProg {
    public static void main (String args[]){

        SuperMarket item = new SuperMarket();

        item.recordItem(20);
        item.DiscountPercentage(1);

        System.out.println("Original price: "+item.getOriginalPrice());
        System.out.println("Discount: "+item.getDiscountPercentage());
        System.out.print("final price: "+item.getNewPrice());
        System.out.println("\nPrice without tax: "+item.taxFree());
    }
}
