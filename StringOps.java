public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////

    public static void main(String[] args) {
//debugging purpuses
        System.out.println(camelCase("Hello World"));
       
       // int [] appear = allIndexOf("MMMM",'M');
        //for (int i = 0; i < appear.length; i++)
       // {
        //    System.out.print(appear[i]+" "); 
       // }
      
    }
        
    

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String n = "";
        int a = string.length();
        int count = 0;
        int i = 0;
        while (i < a)
        {
            char ch = string.charAt(i);
            if (ch == 'a')
            {
              n += 'A';
              count++;  
            } 
            else if (ch == 'e')
            {
              n += 'E';  
              count++; 
            } 
            else if (ch == 'i')
            {
             n += 'I';   
             count++; 
            } 
            else if ((ch == 'o')||(ch == 'O'))
            {
              n += 'O';
              count++; 
            } 
            else if (ch == 'u')
            {
                n += 'U';
                count++; 
            }
             else if ((ch >= 65) && (ch <= 90) && (count==0))
            {
               n += (char)(ch + 32);
            }
            else if (count == 0) n += ch;
            i++;
            count=0;
        }

        return n;
    }

    public static String camelCase (String string) {
        String n = "";
        int a = string.length();
        int i = 1;
        int count = 0;
        int count2 = 0;
        //first letter check
        if ((string.charAt(0) >= 'A') && (string.charAt(0) <= 'Z') && (string.charAt(0)!= ' '))
        {
            n += (char)(string.charAt(0) + 32); 
        }
        //else 
        //{
          // n += string.charAt(0); 
        //}
        //first word transition
       for (i = 1; i < a ; i++)
        {
            char ch = string.charAt(i);
            if (ch == ' ') 
            {
                count++;
            }
            char last = string.charAt(i-1);
            //if first word comes after space
            //if ((last == ' ') && (ch != ' ') && (count>=1))
           // {
              // if ((ch >= 'A') && (ch <= 'Z'))
              // {
              //   n += (char)(string.charAt(i) + 32);
              // }
              // else 
              // {
               // n += ch;
              // }
              //count2++;
          //  }

            //first letter after space
             if ((last == ' ') && (ch != ' ') && (count>=1))
            {
               if ((ch >= 'a') && (ch <= 'z'))
               {
                 n += (char)(string.charAt(i) - 32);
               }
               else 
               {
                n += ch;
                
               }
            }
            //first word
            else if ((count == 0) && (ch != ' '))
            {
                 if ((ch >= 'A') && (ch <= 'Z'))
               {
                n += (char)(ch + 32); 
               }
                else 
               {
                n += ch;
               }

            }
            else if (ch != ' ')
            {
                if ((ch >= 'A') && (ch <= 'Z'))
               {
                n += (char)(ch + 32); 
               }
                else 
               {
                n += ch;
               }
             
            }
            
        }
           return n;
    }

    public static int[] allIndexOf (String string, char chr) {
        int newlength = 0;
        int j = 0;
        for ( int i = 0; i < string.length(); i++)
        {
            char ch = string.charAt(i);
            if (ch == chr) 
            {
              newlength++;  
            }
        }
        int [] appearence = new int [newlength];
        for ( int i = 0; i < string.length(); i++)
        {
            char ch = string.charAt(i);
            if (ch == chr) 
            {
              appearence[j] = i;
              j++;
            }
        }
        return appearence;

        }
    }

