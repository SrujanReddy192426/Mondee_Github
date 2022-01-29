interface srujanch{
    void Reddy();
    void Monster();
}
interface chennuri{
    void creator();
    void brother();
}
class SrujanReddy implements srujanch,chennuri{
    public void Reddy(){
        System.out.println(" Reddy is a Developer");
    }
    public void Monster(){
        System.out.println("Mr.King of Monster");
    }
    public void creator(){
        System.out.println("Mr.Creator");
    }
    public void brother(){
        System.out.println("Brother of 3-sisters");
    }
}
class coderintfc{
    public static void main(String []args){
        SrujanReddy sr=new SrujanReddy();
                    sr.Reddy();
                    sr.Monster();
                    sr.creator();
                    sr.brother();
    }
}