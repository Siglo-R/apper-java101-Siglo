
class CategoryEnum {

    public static void main(String[] args){

        Category chosenCategory= Category.MEN;

        switch (chosenCategory){
            case MEN: System.out.println("arf arf");break;
            case WOMEN: System.out.println("meow meow"); break;
            case KID: System.out.println("meeeh"); break;
            case GRANDMA: System.out.println("mooo"); break;
            case GRANDPA: System.out.println("luh"); break;
            default: System.out.println("not your family please try again");
    }

    }
    public enum Category{
        MEN, WOMEN, KID, GRANDMA, GRANDPA
    }
}