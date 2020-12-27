import java.util.Scanner;
import java.util.Arrays;

public class TaskTwo {

    public static void main(String[] args) {

        String [] names = {"Renas", "Armagan", "Ridvan", "Mehmet", "Ayhan"};

        Scanner input = new Scanner(System.in);

        System.out.println("What is the name you want to replace? ");
        String user = input.next();

        System.out.println("Enter an index number: ");
        int index = input.nextInt();


        for (int i = 0; i < names.length; i++) {

            if(index==i){
                names[i]=user;
            }
        }
        System.out.println(Arrays.toString(names));






    }

}

//Using Scanner ask user to provide any string value and index number
//from the array.
//Using for loop update value from array.
//Example:
//[ Liam, Emma, Noah, Olivia, William ]
//Please enter String:
//Lucas
//Please enter index number:
//3
//Output:
//[ Liam, Emma, Noah, Lucas, William ]