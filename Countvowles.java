public class Countvowles {
    public static void main(String[] args) {
        String str="hello world";
        int count=0;
        for(char ch: str.toLowerCase().toCharArray()){
            if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
                count++;
            }
        }
        System.out.println("Number pf vowels:"+count);
    }
    
}
