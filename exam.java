package UnitTestingExample;

public class exam {
    
}
public int findMax(int[]numbers){
    int max = numbers[0];
    for(int i=1;i<numbers.lenght;i++){
        if(numbers[i]>max){
            max=numbers[i];
        }
    }
    return max;
}