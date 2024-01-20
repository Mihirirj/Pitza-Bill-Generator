public class Pitza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;

    private int basePitzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;
    public Pitza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
       basePitzaPrice = this.price;
    }

    public void addExtraCheese(){
         isExtraCheeseAdded = true;
         this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
         isExtraToppingsAdded = true;
         this.price += extraToppingsPrice;
    }

    public void takeAway(){
       isOptedForTakeAway = true;
       this.price += backPackPrice;
    }

    public void getBill(){
       String bill = "";
       System.out.println("Pitza: "+basePitzaPrice);
       if(isExtraCheeseAdded) {
            bill += "Extra cheese added: "+extraCheesePrice+ "\n";
       }
        if(isExtraToppingsAdded) {
            bill += "Extra Toppings added: "+extraToppingsPrice+ "\n";
    }
        if(isOptedForTakeAway) {
            bill += "Take  away: "+backPackPrice+ "\n";
        }
        bill +="Bill: "+this.price + "\n";
        System.out.println(bill);
    }


}

/**
 * Base Pitza: 300
 * Toppings: 150
 * Cheese: 100
 * Take away: 20
 */







