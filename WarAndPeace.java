public class WarAndPeace {
    public static boolean torf(String wap){
        int count1 = 0;
        int count2 = 0;
        int start = 0;
        
        while (true){
            if (wap.indexOf("war",start) != -1){
                count1 ++;
                start += 3;
            }else{
                break;
            }
        }
        start = 0;
        while (true){
            if (wap.indexOf("peace",start) != -1){
                count2 ++;
                start += 5;
            }else{
                break;
            }
        }
        if (count1 == count2){
            return true;
        }else{
            return false ;
        }
    }
    public static void main(String[] args){
        String original = "war what is it good for";
        System.out.println(torf(original));
    }

}
