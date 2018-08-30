package Ejercicio3_salondebelleza;

public class DiscountRate {
    private double serviceDiscountPremium=0.2;
    private double serviceDiscountGold=0.15;
    private double serviceDiscountSilver=0.1;
    private double productDiscountPremium=0.1;
    private double productDiscountGold=0.1;
    private double productDiscountSilver=0.1;
    
    public double getServicesDiscount (String discount){
        double discountD=0;
        if (discount.equals("Premium")){
            discountD=this.serviceDiscountPremium;
        }
        else if (discount.equals("Gold")){
            discountD=this.serviceDiscountGold;
        }
        else if (discount.equals("Silver")){
            discountD=this.serviceDiscountSilver;
        }
        return discountD;
    }
}
