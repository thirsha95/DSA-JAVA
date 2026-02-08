/*
Problem: Best Time to Buy and Sell Stock
Platform: LeetCode
Topic: Greedy
Approach:
- Track minimum price so far
- Calculate max profit greedily
*/

package arrays;
class BstTimeToBuyAndSellStock{
public static void main (String[]args){
    int[] prices = {7,1,5,3,6,4};
    int res = BstTimeToBuyAndSellStock(prices);
    System.out.println(res);
}
public static int BstTimeToBuyAndSellStock (int[] prices ){
    int maxprofit = 0;
    int minprice = Integer.MAX_VALUE;
    for(int price : prices){
        if(price < minprice){
            minprice = price;
        }
        else{
          int profit = price - minprice;
          if(profit > maxprofit){
            maxprofit=profit;
          }
        }    
    }
    return maxprofit;


}

}
