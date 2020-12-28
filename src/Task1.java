import  java.util.ArrayList;
import  java.util.Scanner;

public class Task1{

    public static void main(String[] args) {
        ArrayList<String> fake = new ArrayList<>();
        fake.add("12");
        fake.add("1");
        fake.add("-1");
        fake.add("1242");
        fake.add("aa");
        fake.add("true");
        fake.add(" ");
        fake.add("78");
        fake.add("8");

        System.out.println(sequenceOfNumbers(fake));
    }

    public static ArrayList<Integer> sequenceOfNumbers(ArrayList<String> lNumbers){
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < lNumbers.size(); i++) {
            try{
                int num = Math.abs(Integer.parseInt(lNumbers.get(i)));
                String ch = Integer.toString(num);
                result.add(ch.length());
            }catch (Exception e){
                System.out.println(lNumbers.get(i) + " this parameter was deleted(Type wrong just Int acceptable)");
            }
        }
        return result;
    }




    public static ArrayList<Integer> getFromUser() {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> Numbers = new ArrayList<>();
        System.out.println("Enter Your Numbers: ");
        do {
            try {
                Scanner myObj = new Scanner(System.in);
                String buf = myObj.next();
                if (buf.equals("end") ){
                    if(Numbers.size() == 0){
                        System.out.println("List of your Number has empty enter Number: ");
                    }else{
                        break;
                    }
                }
                else{
                    Numbers.add(Integer.parseInt(buf));
                    System.out.println("Enter Your Next Number or go out with (end): ");
                }
            } catch (Exception e){
                System.out.println("Just enter Number not any thing else!! or go out with (end): ");
            }
        } while (true);

        for (Integer number : Numbers) {
            String ch = Integer.toString(Math.abs(number));
            result.add(ch.length());
        }
        System.out.println("result list: " + result);

        return result;
    }
}
