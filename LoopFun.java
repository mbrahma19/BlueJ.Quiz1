
public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int result = 1;
            for(int i = 2; i <= number; i++){
                result = result * i;
            }
        return result;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String[] arr = phrase.split(" ",0);
          String result = "";
            for(String s : arr){
                String s0 = String.valueOf(s.charAt(0));
                result = result + s0.toUpperCase();
            }
          return result;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String[] arr = word.split("",0);
          String result = "";
            for(String s : arr){
                char newChar = s.charAt(0);
                if(newChar == 'x'){
                    result = result + Character.toString('a');
                } else if(newChar == 'y'){
                    result = result + Character.toString('b');

                } else if(newChar == 'z'){
                    result = result + Character.toString('c');
                }else{
                    result = result + Character.toString((char)(newChar + 3));
                }
                
            }
          return result;
      }
}
