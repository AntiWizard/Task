import  java.util.ArrayList;
import  java.util.Scanner;

public class Task2 {
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

        System.out.println(sortNumbers(fake));

    }

    public static ArrayList<ArrayList> sortNumbers(ArrayList<String> lNumbers){
        ArrayList<ArrayList> result = new ArrayList<ArrayList>();
        ArrayList<Integer> listSortNum = new ArrayList<>();
        int tmp,tmp2;

        for (int i = 0; i < lNumbers.size() ; i++){
            try {
                listSortNum.add(Integer.parseInt(lNumbers.get(i)));
            }catch (Exception e){
                System.out.println(lNumbers.get(i) + " this parameter was deleted(Type wrong just Int acceptable)");
            }
        }

        ArrayList<Integer> changNum = new ArrayList<>(listSortNum);
        changNum.set(0,0);


        for (int i = 1 ;i < listSortNum.size() ; i++) {
            tmp = listSortNum.get(i);
            int count = 0;
            for (int j = i - 1 ; j >= 0 ; j--){
                if(tmp < listSortNum.get(j)){
                    tmp2 = listSortNum.get(j);
                    listSortNum.set(j,tmp);
                    listSortNum.set(j + 1,tmp2);
                    ++count;
                }
                else{
                    break;
                }
            }
            changNum.set(i,count);
        }
        result.add(listSortNum);
        result.add(changNum);
        return result;
    }

    public static ArrayList<Integer> getFromUser() {

        int tmp,tmp2 ;
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

        ArrayList<Integer> ChangNum = new ArrayList<>(Numbers);
        System.out.println("list of input numbers: " + Numbers);
        ChangNum.set(0,0);
        for (int i = 1 ;i < Numbers.size() ; i++) {
            tmp = Numbers.get(i);
            int count = 0;
            for (int j = i - 1 ; j >= 0 ; j--){
                if(tmp < Numbers.get(j)){
                    tmp2 = Numbers.get(j);
                    Numbers.set(j,tmp);
                    Numbers.set(j + 1,tmp2);
                    ++count;
                }
                else{
                    break;
                }
            }
            ChangNum.set(i,count);
        }
        System.out.println("list of Changing numbers: " + ChangNum);
        System.out.println("list of sort input numbers: " + Numbers);
        return ChangNum;
    }
}
