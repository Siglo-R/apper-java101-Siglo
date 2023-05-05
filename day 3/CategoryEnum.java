
class CategoryEnum {

    public static void main(String[] args){

        Category chosenCategory= Category.MEN;

        switch (chosenCategory){
            case MEN: System.out.println(13.57);break;
            case WOMEN: System.out.println(20.45); break;
            case KID: System.out.println(45.6); break;
            case GRANDMA: System.out.println(56.67); break;
            case GRANDPA: System.out.println(3.56); break;
            default: System.out.println("not your family please try again");
    }

    }
    public enum Category{
        MEN, WOMEN, KID, GRANDMA, GRANDPA
    }
}
