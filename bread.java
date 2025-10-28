public class bread {
    public static String sandwichFIllings(String input){
        if (input.contains("bread")){
            int a = input.indexOf("bread");
            int b = input.lastIndexOf("bread");
            if (a != b){
                return input.substring(a+5, b);
            }else{
                return "none";
            }
        }else{
            return "none";
        }
    }
    public static void main(String[] args) {
        System.out.println(sandwichFIllings("chipsbreadtunasalad"));
    }
}
