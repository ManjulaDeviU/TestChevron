//OOPS - 1996 - A Love Story//

//Solution for question.1//
/*objects = Mr.X , Ms.Y , Mr.Z
sub classes = Friendship, MarriageProposal, Marriage
main class=LoveStory*/

//Solution for question.2//
/*All the accesssor methods used to manipulate the data are public*/


// Solution for question.3 //
class LoveStory                     /*Abstraction*/    // hiding all the details (i.e Mr.X,Mr.Y,Mr.Z ) is encapsulation//
{
     class Friendship
    {
       public void displayDetails1()
    {
       System.out.println("Mr.X is friend of Ms.Y");
     }
     } 
           class MarriageProposal
          {
           public void displayDetails2()
          { 
           System.out.println("Mr.X proposed to marry Ms.Y");
           System.out.println("But Ms.Y didnot respond positively to Mr.X"); 
           }
           }
                      class Marriage
                     {
                       public void displayDetails3()
                       {
                       System.out.println("Ms.Y proposed to marry Mr.Z");
                       System.out.println("Mr.Z accepted Ms.Y proposal");
                       System.out.println("Mr.X recieved a wedding invitation of Mr.Z and Ms.Y"); 
                       System.out.println("----End of story----");
                        }
                       } 
public static void main(String[] a)
{
    Integer n=Integer.parseInt(a[0]); 
    if(n<=3)
    {
    LoveStory.Friendship fs=new LoveStory().new Friendship();
    fs.displayDetails1(); 
    }
    else if(n>3 && n<=6)
    {
     LoveStory.MarriageProposal mp=new LoveStory().new MarriageProposal();
     mp.displayDetails2(); 
     }    
     else
     {
       LoveStory.Marriage m=new LoveStory().new Marriage();
       m.displayDetails3(); 
      }
}
}