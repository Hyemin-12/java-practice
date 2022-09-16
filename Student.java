public class Student extends Person{
    public void set(){
        age = 18;
        name = "김유진";
        height = 153;
        //weight는 private
        setWeight(66);
    }
}
