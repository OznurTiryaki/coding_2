package day27_April13;

public class Array3WarmUp {

	public static void main(String[] args) {
		// Optional : Reverse each word in sentence
//		your output should be 
//		ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve 
  
		
		//the logic reverse each word and concatenate to make new String 
		
      
       
            
        	  
            String str = "Cybertek Batch Spartan is most hardworking Batch ever";
            String[] words = str.split(" ");  
            String reversedSentence = "";
            
            for (int j = 0; j < words.length; j++) {
              //System.out.println(words[j]);
            
              String one = words[j] ;  // in each iteration this will be a new word
              char[] wordChars = one.toCharArray(); // this create char array for words
          
              System.out.println(reversedSentence);

            
             int lastIndex = wordChars.length-1 ; 
              
              for (int i = 0; i < wordChars.length/2; i++) {  // yani char array kac karakterden olusuyorsa 
                /// create a temp char variable so we can temp store the value we want to swap
            	  
                 char temp = wordChars[i]; 
                 wordChars[i] =  wordChars[lastIndex-i] ; 
                 wordChars[lastIndex-i] = temp ; 
              }
              // how to change char array to a String 
              String reversed = new String(wordChars);
              
              reversedSentence = reversedSentence + reversed + " " ; 
            
            
            }
            System.out.println(reversedSentence);
              
            
            
//            String str = "Cybertek Batch Spartan is most hardworking Batch ever";
//            String [] arr = str.split(" ");
//            
//            for (int i=0; i<arr.length; i++) { //loop through each element of array
//                String reversedElement ="";//it is here so that each time it will start with empty string
//                
//                for (int j=arr[i].length()-1; j>=0; j--) { //loop inside each element
//                    reversedElement += arr[i].charAt(j)+"";
//                }
//                
//                //arr[i]=reversedElement;
//                System.out.print(reversedElement+"-"); 
            }
            

        }
       
