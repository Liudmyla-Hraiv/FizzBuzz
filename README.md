Iterate on the given number from 1 to 100. 
For every number, if it is divisible by both 3 and 5, print "FizzBuzz".
If the number is divisible by 3, print "Fizz".
If the number is divisible by 5, print "Buzz".
Else, print the number. 

Classic version:
for(int i = 1; i < 101;i++){
if (i%15==0) System.out.println("FizzBuzz");
else if (i%5==0) System.out.println("Buzz");
else if (i%3==0) System.out.println("Fizz");
else System.out.println(i);