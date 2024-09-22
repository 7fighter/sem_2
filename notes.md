
# Table of Content
- [Table of Content](#table-of-content)
  - [jdk](#jdk)
      - [jvm](#jvm)
        - [JVE](#jve)
  - [Runing java code after writing it in a simple notebook](#runing-java-code-after-writing-it-in-a-simple-notebook)
    - [Usage of NEW keywoard in Java](#usage-of-new-keywoard-in-java)
  - [Data Types](#data-types)
    - [Primitive](#primitive)
    - [Non Primitie are](#non-primitie-are)
    - [modifiyer](#modifiyer)
      - [1. Access](#1-access)
      - [2. Non Access](#2-non-access)
      - [Static with Method](#static-with-method)
    - [Ternary Operator:](#ternary-operator)
    - [Good Programing Practice](#good-programing-practice)
      - [Syntax tell you which is class, method and variable](#syntax-tell-you-which-is-class-method-and-variable)
        - [Generall Rules](#generall-rules)
        - [**Syout**](#syout)
        - [**Psvm**](#psvm)
  - [Errors](#errors)
  - [NO_POINTER](#no-pointers)
## jdk 
java deveopmen kit conain all neccessay things that are required to make java complete java compilation or runnning , we dont needs to download and run things seperately. it encircles
1. jvm (java virtuall machine )
2. jve (java virtuall enviroment )


#### jvm 
---
subset of jdk it 

load,execute,check,Env 

means it consisit of loader,compiler, sytax check et after mixing all together they provide us a java runtime enviroment  
  ##### JVE
  provide library and extra resources to create the enviroment 
  



## Runing java code after writing it in a simple notebook 
to do this you need to have jdk on your comp,

open cmd 

```cmd
cd (write you file exact location over here)
javac filename.java
java filename.java
```



### Usage of NEW keywoard in Java

**New is not requuired for Primitive data types**

Basically we use new keywoard to create an instance(object) of the class and 

Note: (if their is no static keywoard with the method of a class then to use that we must have to create an instance first)
```java```

## Data Types 
### Primitive
that can'nt be further divided
1. byte  ----> || 1 byte ||----> 8 bits
2. short ---->|| 2 byte ||---->
3. int   ------->|| 4 byte ||---->
4. float  ----->|| 4 byte ||---->
5. double  --->|| 8 byte ||---->
6. long  ------>|| 8 byte ||---->
7. char ------>|| 2 byte ||---->
   
   All of Them except char belongs to the Integer class and the name which we have like int, short, float etc all are the instance(object)(istance variable) of the Integer class, Because their firs letter is small so according to [good programing practice](#syntax-tell-you-which-is-class-method-and-variable) of java they are istance varaible
### Non Primitie are 
can be further divisible like string is made up of char
1. String
2. Array
3. classes
4. interfaces
5. enum
### modifiyer 
#### 1. Access
   
   public, private, protected, default
   1. public: everyone can access           R
   2. private: only the class itself
   3. proctected: class and its sub classes
   4. default:classes within same package       R
#### 2. Non Access
   
   static, sycholoronized or volatile final, abstract
   #### Static with Method
   when static is used with method then there is no need to ceat an instance to access that variable 

   same case with the variable 
   ``` java
   public class Sec {
    
    public static void main(String[] args) {
        int num = 10;
        modifyPrimitive(num);
        System.out.println("After method call: " + num); // Output: 10
    }

    public static int modifyPrimitive(int n) {
       return n = 20;
    } 
    ```   
}  


**Without static we need instance (object) to access it**

``` java
public class Sec {
    
    public static void main(String[] args) {
        int num = 10;
        Sec a = new Sec(); // created an insatace
        a.modifyPrimitive(num);
        System.out.println("After method call: " + num); // Output: 10
    }

    public int modifyPrimitive(int n) {
       return n = 20;
    }
}
```
   

### Ternary Operator:
```java
(a>b)? "True":"False"
```
write the condition inside the bracket after the question write the options, first option will be shown if condtion is true and second option will shown if condtion is false
``` java
public class sec{

    public static void main(String[] args) {
            int a = 10;
            int b = 20;
            System.out.println( (a>b)? "True":"False");
       
    }
}
```
### Good Programing Practice 
#### Syntax tell you which is class, method and variable
  1. class first letter should always be capitall
  2. Methods has bracket in the last and methods first letter is small
  3. varaiables first letter is small

  ##### Name Declaration rules
  general rules are applicable to all (class, methods and variable)
  - If name has two words like batch number then write it like 
  batchNumber   or batch_Number, space between not allowed
  - len of name !> 63
  - 9gpa not allowed 
  - _gpa is allowed
  - 
   
##### **Syout** 
   ``` java
            System.out.println("hello Abbas");
```
- System "S" is capitall means it is a class 

- out is an innstance variable (object) and 

- println() is a method
- . dots(periods) are called linkers they are just ike double click that is used to open a folder or a file 
 
   
##### **Psvm** 
``` java 
    public static void main(String[] args) {
    // compilig starts from here }
```
- **public** = access modifiyer, everyone can access

- **Static** = access modifiyer which say this method can be accessed without creating its instance, and the methods with static keywoard are placed in the top first places for execution
- **void** == return type, currently it is void means it woudn't return anything 
  ```java 
   public int modifyPrimitive(int n) {
       return n = 20;
    }  
    // return type is int over here 
    ```
- **main** is the name of method,
  
  and is also the keywoard or ahint along with static "that start the compilation right from here"
- **(String args[])** = two parameters of a main method
   
   method (main) accepts array of a name args of type Strings

## Errors
1. Runtime 
2. Syntax error

ctrl + s after making changes and then run it again using the commands, because it won't automatically updates the code aafter the one time you have created your .class file

#### Execute Package fom cmd
sem_2
└── Lab
    └── Assi.java
- **Set your path** upto to the big folder that is encircling, her set up to sem_2 using cd (change directory)
  ```
   cd C:\Users\Hp\Desktop\sem_2
   ```
   open Lab folder properties and check location, both set location and path set by us will me same
- javac Lab\Assi.java = **compiling** and making .**class file**
- java Lab\Assi.java = interpreting and showing output
  ``` cmd
  PS C:\Users\Hp\Desktop\sem_2> javac Lab\Assi.java       
  PS C:\Users\Hp\Desktop\sem_2> java Lab\Assi.java 
   ```
## NO pointers 
david j. malan letter box sy dosri tarf bara sy glove sy ashara krta tha or us ka andr sy aik code sa nikalt tha woo cheez
java use value refrencing concept intead of pointer, 

pointer holds the address of a value to which it is refrencing or can variable that holds of an other variable, 

can be manipulated used in c or c++

where 

value refrencing got the actuall value it holds the address of an object 

memory managment is handled by jvm, don't allow manipulation 
``` java
public class Sec {
    
    public static void main(String[] args) {
        int num = 10;
        modifyPrimitive(num);
        System.out.println("After method call: " + num); // Output: 10
    }

    public static int modifyPrimitive(int n) {
       return n = 20;
    }
}

```
why its value doesnot got change because we don't have access the actuall memmory address to make a cahnge as jvm has passed the copy to a mthod 

if we want to overwrite it then we have to do 
``` java
      num = modifyPrimitive(num);