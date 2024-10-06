package com.bptn.course._15_big_coding_wk2;

public class Stock {

    // Create instance variables 
    private String tickerSymbol, companyName;
    private int price, totalShares;
    private double percentChange;
    private long marketCap;
    // Constructor 
    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
      this.tickerSymbol = tickerSymbol.toUpperCase();
      this.price = price;
      this.companyName = companyName;
      this.totalShares = totalShares;
      this.percentChange= 0;
      this.marketCap = totalShares * price;
     
    }
    // Create the methods 
    public void adjustPrice(int change){
      this.price += change;
      this.percentChange = ((double)change/this.price)*100;
      this.marketCap = totalShares * price;
    }

    public String toString(){
      return ("Ticker Symbol: "+this.tickerSymbol+
      "\nCompany: "+ this.companyName + "\nCurrent Price: $"+ this.price+ " ("+ this.percentChange+ "%)" +
      "\nMarket Cap: $"+ marketCap );
    }
    
    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
        
    }
}
