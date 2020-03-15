package lesson002.task1;

public class EqualsStringDemo {
    String text;
    String text2;

    public boolean equals(String text, String text2){
        if(this.text.equals(this.text2)){
           return true;
        }

        return false;
    }
    public boolean equalsIsIgnoreCase (String text, String text2){
        if(text.equalsIgnoreCase(text2)) return true;
        else {
            return false; }
    }
    public boolean lenght(){
        int len1 = text.length();
        int len2 = text2.length();

        if(len1 == len2){
          return true;
        }
        return false;
    }
}
