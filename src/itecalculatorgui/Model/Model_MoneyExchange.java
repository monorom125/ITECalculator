/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui.Model;

/**
 *This class is Model of MoneyExchange that calculate money to other moneys
 * @author BTS071016
 */
public class Model_MoneyExchange {
    Double MoneyExchange;
    public double RileToDollar(double money)
    { 
        MoneyExchange= money/4000;
        return MoneyExchange;
    }
     public double RileToFrance(double money)
    { 
        MoneyExchange= money/4500;
        return MoneyExchange;
    }
     public double RileToPund(double money)
    { 
        MoneyExchange= money/5000;
        return MoneyExchange;
    }
      public double RileToEuro(double money)
    { 
        MoneyExchange= money/5500;
        return MoneyExchange;
    }
     public double RileToBath(double money)
    { 
        MoneyExchange= money/150;
        return MoneyExchange;
    }
     public double DollarToRile(double money){
          MoneyExchange= money*4000;
        return MoneyExchange;
     }
      public double FranceToRile(double money){
          MoneyExchange= money*4500;
        return MoneyExchange;
     }
       public double EuroToRile(double money){
          MoneyExchange= money*5500;
        return MoneyExchange;
     }
      
         public double PundTORile(double money){
          MoneyExchange= money*5000;
        return MoneyExchange;
     }
         public double BahtToRile(double money){
          MoneyExchange= money*150;
        return MoneyExchange;
     }
}
 