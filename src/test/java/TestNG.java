
import org.testng.annotations.Test;

    public class TestNG {

        @Test(priority = 1)
        void dog(){
            System.out.println("I am a dog");
        }

        @Test(priority = 2)
        void cat(){
            System.out.println("I am a cat");
        }
        @Test(priority = 3)
        void red(){
            System.out.println("I am red");
        }
        @Test(priority = 4)
        void reddog(){
            System.out.println("I am a red dog");
        }
        @Test(priority = 5)
        void redcat(){
            System.out.println("I am a red cat");
        }
    }


