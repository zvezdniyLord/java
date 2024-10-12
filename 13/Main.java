import java.util.Scanner;

class Main {
    static int getNumbers() {
    Scanner numbS = new Scanner(System.in);
    int numbers = numbS.nextInt();
    return numbers;
}
public static void main(String [ ] args) {

int numbsers[] = new int[99];
int i = 0;
int max = 0;

while(true) {
    numbsers[i] = getNumbers();
    if(numbsers[i] == 0) {
    break;
}
    else if(numbsers[i] > max) {
    max = numbsers[i];
    }
}
System.out.print(max);
    }
}
