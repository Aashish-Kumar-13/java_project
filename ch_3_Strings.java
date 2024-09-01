import java.util.*;
import java.lang.String;
public class ch_3_Strings {
    public static void main(String[] args) {
//      Strings Basics
//        literals
//        String a="abc";
//        System.out.println(a);
//        String b="abc";
//        System.out.println(b);
////        immutable hai but jan bhujkar humne yaha par ek me do value de di
//        a=a.concat("kumar");
//        System.out.println(a);
// new keyword
//        String a=new String("ankit");
//        System.out.println(a);
//        String b=new String("ankit");
//        System.out.println(b);
//
//        a=a.concat("kumar"); //jabardasti changes
//        System.out.println(a);
//        direct assign me new valu create hogi
//        a="kumar";
//        System.out.println(a);

//  Strings in java
//        char[] str={'H','i','a'};
//        String s=new String(str);  // s is the reference
//        or same
//        String s="hia";    // s is the reference and hia is object
//  two ways of creating string
//      1. using String literal
//        String s1="string literal";
//        String str1="codewithaashish";
//        String str2="codewithaashish";
//        System.out.println(str1 == str2);  //return true

//      2. Using new
//        String s=new String("aashish");
//          String str1 = new String("Keep coding");
//          String str2 = new String("Keep coding");
//          System.out.println(str1 == str2);  //false
//        still false is displayed as output because str1 and str2 are two different string objects created in the heap.


// Method 1
//        String name=new String("aashish");
//        System.out.println("The name is:");
//        System.out.println(name);

// method 2
//        String name;
//        name=new String("aashish");
//        System.out.println("The name is: ");
//        System.out.println(name);


// Input a string from the user
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();  //str se same string ka first word  print ho jayge jo user na type ki h   (.)operator se isko access kiya h
//        String st = sc.nextLine();  //first string ko chood kar sarre line pring ho jayge nextlinese
//        System.out.println(st);


// String method
//        String name="Aashish";
//        System.out.println(name);

// 1.lenth=no of lenght print =7
//        System.out.println(name.length());
// 2.toLowerCase=all are lowercase
//        System.out.println(name.toLowerCase());
// 3.toUpperCase=all are uppercase
//        System.out.println(name.toUpperCase());
// 4.trim=koi bhi space ko remove kar degi
//        System.out.println(name.trim());
//        4.non trimmed strign
// 5.substring(int start)=jo no type kar diya vha se pring ho jayga
//        System.out.println(name.substring(2 ));   //ashish pring hoga
// 6.substring(int start, int end)=start include hoga ,end exclude hoga
//        System.out.println(name.substring(1,3)); //Aa pring hoga
// 7.replace();=kisi bhi word ki jaheg par dusra ko replace karna
//        System.out.println(name.replace('A','h'));
//        System.out.println(name.replace("Aas","hin"));
// 8.startWith()=check karne ke liye true or false return
//        System.out.println(name.startsWith("Aas"));
// 9.endsWith()=end me check karega true or false return
//        System.out.println(name.endsWith("sh"));
// 10.chartAt()=jo index position par hoga vo print ho jayga
//        System.out.println(name.charAt(1)); 1 par a h
// 11.idexof()=jo bhi charecter jis index par hoga vo index pring ho jayga
//        System.out.println(name.indexOf("s")); // jo bhi word jis index par hoga vo print hoga
// 12.lastIndexOf()=jo index last hoga
//        System.out.println(name.lastIndexOf("a")); //1 index value
// 13.equal=check karne ki true h ya false letters bhi check hoga captial nhi h to bhi false hoga
//        System.out.println(name.equals("aashsih"));
// 14.equalslgnoreCase()=true or false no case senstive only check word
//        System.out.println(name.equalsIgnoreCase("Aashish"));


//  some extra methods
//       1.isEmpty()=check in the String
//        System.out.println(name.isEmpty());  //return true or false
//      2.concenate the String
//        String a="ram";
//        String b="kumar";
//        System.out.println(a.concat(b));

// Learn Coding Concepts Immutable and string basic
//        String other concepts
        // different way to print() method  in java
        // println=print lin
        // System.out.println("Hello World");
        // System.out.print("Hello World");
        // System.out.printf("Hello World");
        // System.out.format("Hello World");


        // String literal me jvm pehle check karega ki vo aashish name ka object string constant pool me hai ya nhi hain to new object nhi bnaga (ye same object ko refer kar rhe the)
        // String a="aashish";  //literal
        // System.out.println(a);
        // String b="aashish";  //literal
        // System.out.println(b);

        // immutable
        // lekin jabardasti mutate karte hai to new object bn jayegi
        // a=a.concat("Kumar");  //isme a ka naya object bna
        // dega or b ka vohi purana object hi rahaga
        // System.out.println(a);
        // first wala a destroy ho gya hai new a me name stre hua hai

        // new keywoed
        // isme object ka memory heap memory me bnta hai
//        String a=new String("aashish");
//        System.out.println(a);
//        String b=new String("aashish");
//        System.out.println(b);
        // same concept hoga isme bhi check kareg ki same object hai

// class String bnane par vo change nhi ho sasta hai
        // pehle ke tarah javardasti kar sakta hai
//        a.concat("kumar");
//        System.out.println(a);

    }
}
