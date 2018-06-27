package firstdemo;

public class DecimalToBinary {
	 
    public void printBinaryFormat(int number){
        int binary[] = new int[25];                           // ask doubt,
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);					// ask doubt 
        }
    }
     
    public static void main(String a[]){
        DecimalToBinary dtb = new DecimalToBinary();
        dtb.printBinaryFormat(64);
    }
}

// change made and needs to be reverted

