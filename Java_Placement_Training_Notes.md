# Java Placement Training Notes

## Java

-   Python is a structure free language

-   but java is a structure language

-   To print

-   system.out.printlm("Batch A") \[ output -\> Batch A \]

### Sturcture of Java

-   Header File -\> Import

-   Class -\> we write n number of methods

-   Main Method

-   Sub method may increase but atleast 1 main method

-   Breakdown

-   System.out.printlm("Batch A")

-   Header File -\> Import

-   System.out.printlm -\> Class fr this to import ( import java.util.\*
    ) .... util -\> package

-   Class

-   class is a single entity

-   -\> Class Giri

-   {

-   }

-   Main Method

-   {

-   public static void main(string\[\]\_args)

-   }

-   -   public everyone can access\],

-   -   static -\> not to create a oblject \],

-   -   void -\> Returntype - types(int,string,float, Boolean\]

-   -   why void? - returns nothing

-   -   main -\> method name

-   -   args(argument)

-   -string\[\]\_ -\> comment_line arugument

-   In Java program there only be one main method becuse, Main method is
    a starting point of java program

-   Final structure

-   Giri.java (file name must be class name

-   import java.util.\*

-   Class Giri

-   {

-   public static void main(string\[\]\_args)

-   System.out.printlm("Batch A")

-   }

-   When run.... compile java -\> giri.class -\> if no error means
    output will be print

-   Output -\> Batch A

### To get input from user

### Input -\> Scanner class -\> import java.util.scanner

-   How we declare class:-

-   Scanner scanner_name = new Scanner("System.in");

-   Scanner -\> class

-   scanner_name -\> name we declare

-   new -\> it is used for object creation

-   Scanner -\> util class

-   System.in -\> input from user

-   1.  Import Scanner class

-   2.  Declaring scanner class



### Scanner scanner_name = new Scanner("System.in");

-   int variable_name = Sc.nextInt(); \### float

-   system.out.println(s)

-   system.out.println(f)

-   system.out.println(x)

-   sc.next() - only print upto space

-   sc.nextLine - print entire line

------------------------------------------------------------------------

## Java Operators

-   Arthematic Operator ( +, - , \* , % , / )

-   Relational / comparsion (==, \<=, \>=, \<, \>, /= ) Reurns True or
    false

-   Assignment (+=, -=, \*=, %=, /= )

-   Logical (&&, \|\| , ! ) Returns True or fase \[ a = 10, b = 5 \] ,
    a&&b = True, 10\>5 \|\| 5 \< 10 =

-   Unary operator ( ++, -- ) Increament+=, decreament --

-   \[ a = 5;

-   ++a;

-   Sout(a) \] output - 6 { a = 5, Sout(++a) a = a+1 \[o/p -6\]
    Sout(a++) o/p - 6

-   Ternary operator

-   7.  Bit wise and not operator ( \~ , \| , a=

-   (\~5) -\> Bitwise Not , Logical Not ( !5 )

-   5 & 3

-   5 -\> 0101

-   3 -\> 0011

-   0001 -\> 1

-   2.  5 \| 3 ( Bitwise or )

-   5 -\> 0101

-   3 -\> 0011

-   0111 -\> 7 ( added of binary places we get 7 )

-   (\~5) -\> 0101 -\> 1010 -\> 7

-   Left Shift

-   ( 5 \<\< 1) -\> 5- Binary represenatation that is standard Left
    shift (moving left side)

-   Binary format of 5 - 0101

-   1 byte = 8 buts so Binary format of 5 - 00000101

-   ( 5 \<\< 1) 5 -\> binary format, 1 - movement

-   Discarding a bits ( 5 \<\< 1 ) \|0\|0\|0\|0\|0\|1\|0\|1\| -\> \|
    \|0\|0\|0\|0\|1\|0\|1\| -\> \|0\|0\|0\|0\|1\|0\|1\|0\| -\> 10
    numeric value

-   Moving towards if left, it is left side now

-   Filling 0's in empty spaces(bytes)

-   For left shift need to multiple ( x )......

-   5 x 2'1 = 10

-   Right Shift

-   ( 5 \>\> 1 ) we need to take binary value for 5

-   Binary format of 5 - 0101

-   1 byte = 8 buts so Binary format of 5 - 00000101

-   Discarding a bits ( 5 \>\> 1 ) \|0\|0\|0\|0\|0\|1\|0\|1\| -\>
    \|0\|0\|0\|0\|0\|1\|0\| \| -\> \|0\|0\|0\|0\|0\|0\|1\|0\| -\> 2
    numeric value

-   Moving towards if right, it is right side now

-   Filling 0's in empty spaces(bytes)

-   for right shift need to divide / .....

-   5/2'1 = 5/2 = 2.5 = 2 bczz need to take numeric only not as float

-   Question

-   ( 5 \>\> 3) -\> 5 - 00000101 -\> 00000010 -\> 00000001 -\> 00000000
    -\> 5/2'3 = 5 / 8 = 0.625 = 0 bcz float not accepted need to take
    ony integer

-   ( 5 \<\< 3 ) -\> 5 - 00000101 -\> 00001010 -\> 00010100 -\> 00101000
    -\> 5 x 2'3 = 5 x 8 = 40

-   ( 5 & 3 ) -\> 1

-   ( 5 \| 3 ) -\> 7

-   ( \~3 ) -\> 12

------------------------------------------------------------------------

-   \% modulus fetch last digits

-   4725 % 10 -\> 5 print last digits

-   4725 -\> 100 -\> 25 print last two digits bcz two zero

-   4725 -\> 725

-   / Divide

-   Remove Last digits

-   4725 / 10 -\> 472

-   4725/ 100 -\> 47

-   4725 / 1000 -\> 4

------------------------------------------------------------------------

## Conditional Statement

## We Divided Into Three Beanches:

-   Selection Statement
-   -\> if
-   -\> if else
-   -\> else if
-   -\> Nested if
-   -\> switch
-   Looping Statement
-   -\> for
-   -\> while
-   -\> do-while
-   Control Statement
-   -\> break
-   -\> continue
-   -\> return

### Selection Statement

### \*\*Check positive number using if else

-   if( n \> 0){
-   Sout("Positive Number")
-   }
-   else{
-   Sout("Negative Numbers") \### } \*\*else if

### if(condition)

-   {
-   statement;
-   }
-   else if(condition2)
-   {
-   statement2;
-   }
-   else{
-   }

### Example else if

-   int runs = 100;
-   if (runs==100){
-   sout("Century")
-   }
-   elsse if(runs==50){
-   sout("Halsf Century")
-   }else{
-   sout("Normal Score") \### } Nested if

### if(condition){

-   if (condition){
-   }
-   }else{
-   }

### Example

-   String username = "Mukesh"
-   int password = 1234;
-   // input - name = mukesh, password = 1234
-   if ( name == username)
-   {
-   if(pin == password)
-   {
-   Sout("Login Success")
-   }
-   else{
-   sout("Incorrect username or password" \### } \*\*Switch Statement

### Switch(expression)

-   { \### case1
-   statement;
-   break'; \### case2
-   statement;
-   break'; \### case3
-   statement;
-   break';
-   default;
-   statemnt;
-   }

### Looping Statement

### \*\*condition FOR LOOP

-   for(i=1;i\<=10;i++)

-   i=1 -\> initiation or iteration

-   i\<=10 -\> condition

-   i++ -\> increament or decreament While do while

-   Controll statement

-   break -\> exit the program

-   continue -\> skip the current iteration

-   return -\> return the vaue

-   1 to 10

-   for(int i =1; i\<=10; i++)

-   {

-   system.out.println(i)

-   }

## Break:

-   1 to 5
-   for(int i =1; i\<=10; i++)
-   {
-   system.out.println(i)
-   if (i==5){
-   break;
-   }
-   }

## Continue:

-   for(int i =1; i\<=10; i++)
-   {
-   if (i==5){
-   continue;
-   }
-   System.out.println(i);
-   }
-   }
-   skip 5 and print 1234678910

------------------------------------------------------------------------

## Classes And Objects

-   Creating a template or blueprint is called classes. (Name, Color,
    Price, Brand)...

-   Using this we can create n number of cars is called object..... from
    blue pring to physical reality

-   Class :-

-   Class car{

-   String brand; \|

-   String color; \|-\> class members

-   Int price; \|

-   }

-   Object:-

-   for class creating a object

-   ClassName obj_name = new ClaassNAme();

-   car x = new car();

-   Using this x only we can access the Class members in class

-   eg:-

-   car x = new car();

-   x.brand = "Audi";

-   x.color = "Red";

-   x.price = 60,000,00;

-   sout(x.brand) // it print "Audi"

-   with object name only we can get class

-   using . operator it connect with class and object

-   METHOD - Method is a reusable to call at print... declare at outer
    class...call at main class when they need to sout or print

-   VOID returntype - empty creating methods

-   Declaring Method:-

-   void.display(){

-   sout(brand);

-   sout(color);.

-   sout(print);

-   }

-   Display Mesthod (Call):-

-   c.display()

------------------------------------------------------------------------

-   Method with parameter -\> Adding two numbers using method

------------------------------------------------------------------------

## Inheritence

-   inherit

-   Inheritence

-   Single inherit -\> single parent single child / parent -\> child

-   Structure -

-   class parent{

-   }

-   class child extends parent{

-   } using extends we connect parent and child

-   2.  Multilevel inherit -\> Grandparent -\> parent -\> child

-   3.  Multiple inherit -\>

-   4.  Hiererchal Inherit -\>

-   5.  Hybrid -\>

------------------------------------------------------------------------

## Polymorphism

-   Poly -\> Many

-   Morphism -\> forms

-   OVERLOADING -\> same method name but different arguments

-   OVERRIDING -\> same method name same arguments difference is content

------------------------------------------------------------------------

## Abstraction

-   abstraction hides the process or implementation

## Abstaraction :-

-   abstract class - \> No body
-   abstract method

------------------------------------------------------------------------

## Data Structures

-   Linear Array

-   Non - Linear Array

-   Declaration of Array:-

-   Datatype\[\] array_name;

-   int\[\] arr;

-   Initialization:-

-   -\> Static array (We give values is Static), Dynamic array is user
    entered

-   int\[\] arr = { 1,2,3,4.....60 }

-   int\[\] -\> Declaration

-   {1,2,3,4....60 } = Initalization

-   initializing values

-   .........................................................

-   In java there is two memory allocation are \[ Stack and heap \]

-   Stack -\> Local Variables

-   Heap -\> values

-   int\[\] arr = {1,2,3,4,5}

-   int\[\] arr -\> Local varibles that stored in stack

-   {1,2,3,4,5} -\> Stored in heap memory

-   Array is a collection of elements with similar datatype. In java
    array's are may are may not be countinuese

-   Array indext starts with 0 to n-1 or size-1

## Static Array Decleararion:

## To Print Particular Value

-   arr\[indexPosition\]

-   int\[\] arr = {1,2,3,4,5};

-   sout(arr\[2\]) -\> o/p -3

## To Print All Value

-   int\[\] arr = {1,2,3,4,5};
-   for(int i = 0; i\<=4; i++){
-   sout(arr\[i\])
-   }

## Run Time Array Initlization:

-   ArrayList

-   Syntax :-

-   import java.util.ArrayList;

-   ArrayList`<Integer>`{=html} list = new ArrayList\<\>();

-   list.add(10);

-   list.add(20);

-   list.add(30);

-   System.out.println(list.get(0));

-   System.out.println(list.size());
