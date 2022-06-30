/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui.Model;

/**
 *
 * @author BTS071016
 */
public class Model_NumberSystem {
    
     public String binary2Decimal(int binary){
        int dec=0,pow=1,rem;
        while(binary>0){
            rem=binary%10;
            dec=dec+rem*pow;
            binary=binary/10;
            pow=pow*2;
        }
        return Integer.toString(dec);
     }
     public String binay2otcal(int binary){
         
        int rem,dec=0,d,pow=1;
        int octal[]=new int[100];
        String value= "";
        String number = "";
        while(binary>0){
            rem=binary%10;
            dec=dec+rem*pow;
            pow=pow*2;
            binary=binary/10;
            
        }
            pow=1;
            d=dec;
        while(d>0){
            octal[pow++]= d%8;
            d=d/8;
        }
          
              for(int m=pow-1; m>0; m--)
           {
              number= Integer.toString(octal[m]); 
              value = value+number;
             }
            
        return value;
    }
      public String binary2Hex(int binary){
        int n=0;
        int rem,dec=0,d,pow=1;
        int hex[]=new int[1000];
        String Value="";
        String num;
        //binary=n;
        while(binary>0){
            rem=binary%10;
            dec=dec+rem*pow;
            pow=pow*2;
            binary=binary/10;
        }
          pow=0;
           while(dec>0)
            {
                hex[pow]=dec%16;
                dec=dec/16;
                pow++;
            }
         
            for(int m=pow-1;m>=0;m--){
                if(hex[m]==10)
                {
                    num= "A";
                }
                else if(hex[m]==11)
                {
                   num = "B";
                }
                else if(hex[m]==12)
                {
                 num="C";
                }
                else if(hex[m]==13)
                {
                   num= "D";
                }
                else if(hex[m]==14)
                {
                   num = "E";
                }
                else if(hex[m]==15)
                {
                   num ="F";
                }
                else{
                    num = Integer.toString(hex[m]);
                }
                 Value= Value + num;
         }
                return Value;
    }   
       public String decimal2Binary(int Decimal){
        String number;  
        String value="";
        int i=0;
        int binary[]=new int[10000];
      
            while(Decimal>0){
                binary[i]= Decimal%2;
                Decimal=Decimal/2;
                i++; 
            }
               
                    for(int j=i-1;j>=0;j--){
                        number =Integer.toString(binary[j]);
                        value = value + number; 
                    }         
            return value;        
       }
      public String decimal2Octal(int decimal){
        String number;  
        String value="";
        int a=0;
        int octal[]=new int[1000];
        while(decimal!=0){
            octal[a]= decimal%8;
            decimal=decimal/8;
            a++;
        }
         
                for(int j=a-1;j>=0;j--){
                 number= Integer.toString(octal[j]); 
                 value=value+number;
        }
                return value;
    }
       public String decimal2Hex(int decimal){
        String value = "";
        String number;
        int i=0;
        int Hex[]=new int[100000];
        while(decimal!=0){
            Hex[i]=decimal%16;
            decimal=decimal/16;
            i++;
        }
            
                for(int j=i-1;j>=0;j--){
                    if(Hex[j]==10){
                        number="A";
                    }else if(Hex[j]==11){
                        number= ("B");
                    }else if(Hex[j]==12){
                        number=("C");
                    }else if(Hex[j]==13){
                        number=("D");
                    }else if(Hex[j]==14){
                        number=("E");
                    }else if (Hex[j]==15){
                        number=("F");
                    }else{
                        number=Integer.toString(Hex[j]);
                    }
                   value = value+number;    
                }
              return value; 
    }
        public String Octal2binary(int octal){
        
        int[] octalnum={0,1,10,11,100,101,110,111};
        int oc=octal;
        int binary=0,place=1;
        while(oc!=0){
            int rem=(oc%10);
            binary= octalnum[rem]*place+binary;
            oc/=10;
            place*=1000;
        }
            return Integer.toString(binary);
        }
     public String Octal2decimal(int octal){
        int dec=0;
        int i=0;
        while(octal>=0){
            if(octal==0){
                break;
            }else{
                int rem=(int)octal%10;
                dec+=rem*Math.pow(8,i);
                octal=octal/10;
                i++;           
                 }
            }
        return Integer.toString(dec);
     }
      public String Octal2hex(int octal){
          
        String value="";
        String number;
        int hex[]=new int[1000];
         int dec=0;
        int i=0;
        while(octal>=0){
            if(octal==0){
                break;
            }else{
                int rem=(int)octal%10;
                dec+=rem*Math.pow(8,i);
                octal=octal/10;
                i++;           
                 }
            }
        int x=dec;
         int pow=0;
           while(x!=0)
            {
                hex[pow]=x%16;
                x=x/16;
                pow++;
            }
            
            for(int m=pow-1;m>=0;m--)
            {
                if(hex[m]==10)
                {
                    number= ("A");
                }
                else if(hex[m]==11)
                {
                   number=("B");
                }
                else if(hex[m]==12)
                {
                   number=("C");
                }
                else if(hex[m]==13)
                {
                   number=("D");
                }
                else if(hex[m]==14)
                {
                   number=("E");
                }
                else if(hex[m]==15)
                {
                   number=("F");
                }
                else{
                    number=Integer.toString(hex[m]);
                }
                value=value+number;
            }
           return value;

    }
       public String Hex2decimaL(String hex){
                String digit ;
                int m,num=0;
                char c;
                digit= "0123456789ABCDEF";
                hex= hex.toUpperCase();
                num=0;
                for(int i=0; i<hex.length(); i++){
                     c= hex.charAt(i);
                     m= digit.indexOf(c);
                     num = 16*num+m;
       }  
               return Integer.toString(num);
        }
        public String hex2binary(String hex){
               String value="";
               String number ;
               String digit ;
                int m;
                char c;
                digit= "0123456789ABCDEF";
                hex= hex.toUpperCase();
             
               
                for(int i=0; i<hex.length(); i++){
                     c= hex.charAt(i);
                     m= digit.indexOf(c);
                     if(m==0){
                         number=("0000");
                     }else if(m==1){
                          number=("0001");
                     }else if(m==2){
                          number=("0010");
                      }else if(m==3){
                          number=("0011");
                      }else if(m==4){
                         number=("0100");
                      }else if(m==5){
                          number=("0101");
                      }else if(m==6){
                          number=("0110");
                      }else if(m==7){
                          number=("0111");
                      }else if(m==8){
                          number=("1000");
                      }else if(m==9){
                          number=("1001");   
                      }else if(m==10){
                          number=("1010");
                      }else if(m==11){
                         number=("1011");    
                      }else if(m==12){
                          number=("1100");
                      }else if(m==13){
                         number=("1101");
                      }else if(m==14){
                          number=("1110");
                      }else {
                          number=("1111");
                      }
                     value=value+number;
                }
               return value;
       }
       public String hex2octal(String hex){
                String value="";
                String number;
                String digit ;
                int m,num;
                char c;
                int octal[]= new int[1000];
                int j=0;
                digit= "0123456789ABCDEF";
                hex= hex.toUpperCase();
                num=0;
                for(int i=0; i<hex.length(); i++){
                     c= hex.charAt(i);
                     m= digit.indexOf(c);
                     num = 16*num+m;
                } 
                int decimal=num;
                while(decimal!=0){
                    octal[j]=decimal%8;
                    decimal=decimal/8;
                    j++;
                }
                
                for(int k=j-1;k>=0;k--){
                   number=Integer.toString(octal[k]);
                   value=value+number;
                }
               return value;
     }  
        
}
