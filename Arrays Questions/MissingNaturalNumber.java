public class MissingNaturalNumber { 
    public static void main(String[] args) {
        
    
    int arr[] = {1,2,3,4,6,7}; 
    int n = arr.length+1; 

     int sumOfNaturalNumber = (n*(n+1))/2; 

     int sumOfArray = 0; 

     for(int num : arr) {
        sumOfArray += num; 
     } 

     int MissingNum = sumOfNaturalNumber- sumOfArray; 
     System.out.println("The missing number is : " + MissingNum);
}
}